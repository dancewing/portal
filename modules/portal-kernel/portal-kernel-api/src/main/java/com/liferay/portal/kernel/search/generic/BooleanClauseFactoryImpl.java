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

package com.liferay.portal.kernel.search.generic;

import com.liferay.portal.kernel.search.*;

/**
 * @author Bruno Farache
 */
public class BooleanClauseFactoryImpl implements BooleanClauseFactory {

	@Override
	public BooleanClause create(
		SearchContext searchContext, Query query, String occur) {

		BooleanClauseOccur booleanClauseOccur = new BooleanClauseOccurImpl(
			occur);

		return new BooleanClauseImpl(query, booleanClauseOccur);
	}

	@Override
	public BooleanClause create(
		SearchContext searchContext, String field, String value, String occur) {

		String searchEngineId = searchContext.getSearchEngineId();

		SearchEngine searchEngine = SearchEngineUtil.getSearchEngine(
			searchEngineId);

		TermQueryFactory termQueryFactory = searchEngine.getTermQueryFactory();

		Query query = termQueryFactory.create(field, value);

		BooleanClauseOccur booleanClauseOccur = new BooleanClauseOccurImpl(
			occur);

		return new BooleanClauseImpl(query, booleanClauseOccur);
	}

}