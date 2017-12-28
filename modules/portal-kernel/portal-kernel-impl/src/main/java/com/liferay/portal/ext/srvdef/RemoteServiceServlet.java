package com.liferay.portal.ext.srvdef;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ContextPathUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.ac.AccessControlThreadLocal;
import com.liferay.portal.servlet.JSONServlet;
import com.liferay.portal.spring.context.PortalContextLoaderListener;
import com.liferay.portal.struts.JSONAction;
import com.liferay.portal.util.PortalUtil;

public class RemoteServiceServlet extends JSONServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		String path = GetterUtil.getString(request.getPathInfo());

		if ((!path.equals(StringPool.BLANK) &&
			 !path.equals(StringPool.SLASH)) ||
			(request.getParameter("discover") != null)) {

			Locale locale = PortalUtil.getLocale(request, response, true);

			LocaleThreadLocal.setThemeDisplayLocale(locale);

			super.service(request, response);

			return;
		}

		if (_log.isDebugEnabled()) {
			_log.debug("Servlet context " + request.getContextPath());
		}

		String apiPath = PortalUtil.getPathMain() + "/portal/api/remote_service";

		HttpSession session = request.getSession();

		ServletContext servletContext = session.getServletContext();

		boolean remoteAccess = AccessControlThreadLocal.isRemoteAccess();

		try {
			AccessControlThreadLocal.setRemoteAccess(true);

			String contextPath =
				PortalContextLoaderListener.getPortalServletContextPath();

			if (contextPath.isEmpty()) {
				contextPath = StringPool.SLASH;
			}

			String proxyPath = PortalUtil.getPathProxy();

			if (servletContext.getContext(contextPath) != null) {
				if (Validator.isNotNull(proxyPath) &&
					apiPath.startsWith(proxyPath)) {

					apiPath = apiPath.substring(proxyPath.length());
				}

				if (!contextPath.equals(StringPool.SLASH) &&
					apiPath.startsWith(contextPath)) {

					apiPath = apiPath.substring(contextPath.length());
				}

				RequestDispatcher requestDispatcher =
					request.getRequestDispatcher(apiPath);

				requestDispatcher.forward(request, response);
			}
			else {
				String servletContextPath = ContextPathUtil.getContextPath(
					servletContext);

				String redirectPath =
					PortalUtil.getPathContext() + "/api/jsonws?contextPath=" +
						HttpUtil.encodeURL(servletContextPath);

				response.sendRedirect(redirectPath);
			}
		}
		finally {
			AccessControlThreadLocal.setRemoteAccess(remoteAccess);
		}
	}	
	
	@Override
	protected JSONAction getJSONAction(ServletContext servletContext) {
		RemoteServiceAction remoteServcieAction = new RemoteServiceAction();
		return remoteServcieAction;
	}

	private static Log _log = LogFactoryUtil.getLog(RemoteServiceServlet.class);	
	
}
