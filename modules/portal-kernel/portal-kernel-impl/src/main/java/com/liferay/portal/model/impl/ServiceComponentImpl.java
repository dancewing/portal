/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ServiceComponentImpl extends ServiceComponentBaseImpl {

	public ServiceComponentImpl() {
	}

	@Override
	public String getIndexesSQL() {
		return _getData("indexes-sql");
	}

	@Override
	public String getSequencesSQL() {
		return _getData("sequences-sql");
	}

	@Override
	public String getTablesSQL() {
		return _getData("tables-sql");
	}

	@Override
	public void setData(String data) {
		super.setData(data);

		_dataEl = null;
	}

	private String _getData(String name) {
		try {
			return _getDataEl().elementText(name);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);

			return StringPool.BLANK;
		}
	}

	private Element _getDataEl() throws DocumentException {
		if (_dataEl == null) {
			Document doc = UnsecureSAXReaderUtil.read(getData());

			_dataEl = doc.getRootElement();
		}

		return _dataEl;
	}

	private static final Logger _log = LoggerFactory.getLogger(ServiceComponentImpl.class);

	private Element _dataEl;

}