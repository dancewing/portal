package com.liferay.alloy.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.StringUtil;

import java.text.MessageFormat;


public class MessageUtil {
    private static final Logger _log = LoggerFactory.getLogger(MessageUtil.class);

    public static String substitute(String pattern, Object[] arguments) {
        String value = null;
        try {
            if (arguments != null) {
                pattern = StringUtil.replace(pattern, "'", "''");


                value = MessageFormat.format(pattern, arguments);
            } else {
                value = pattern;
            }
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn(e.getMessage(), e);
            }
        }

        return value;
    }
}
