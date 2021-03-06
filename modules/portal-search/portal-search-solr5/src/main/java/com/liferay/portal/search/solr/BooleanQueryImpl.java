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

package com.liferay.portal.search.solr;

import com.liferay.portal.kernel.search.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 * @author Hugo Huijser
 */
public class BooleanQueryImpl extends BaseBooleanQueryImpl {

	public BooleanQueryImpl() {
		_booleanQuery = new org.apache.lucene.search.BooleanQuery();
	}

	@Override
	public void add(Query query, BooleanClauseOccur booleanClauseOccur)
		throws ParseException {

		_booleanQuery.add(
			(org.apache.lucene.search.Query)QueryTranslatorUtil.translate(query), BooleanClauseOccurTranslator.translate(booleanClauseOccur));
	}

	@Override
	public void add(Query query, String occur) throws ParseException {
		BooleanClauseOccur booleanClauseOccur = new BooleanClauseOccurImpl(occur);
		add(query, booleanClauseOccur);
	}

	@Override
	public void addExactTerm(String field, boolean value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, Boolean value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, double value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, Double value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, int value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, Integer value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, long value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, Long value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, short value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, Short value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addExactTerm(String field, String value) {
		SolrHelperUtil.addExactTerm(_booleanQuery, field, value);
	}

	@Override
	public void addNumericRangeTerm(
		String field, int startValue, int endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addNumericRangeTerm(
		String field, Integer startValue, Integer endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addNumericRangeTerm(
		String field, long startValue, long endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addNumericRangeTerm(
		String field, Long startValue, Long endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addNumericRangeTerm(
		String field, short startValue, short endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addNumericRangeTerm(
		String field, Short startValue, Short endValue) {

		SolrHelperUtil.addNumericRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, int startValue, int endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(
		String field, Integer startValue, Integer endValue) {

		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, long startValue, long endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, Long startValue, Long endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, short startValue, short endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, Short startValue, Short endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRangeTerm(String field, String startValue, String endValue) {
		SolrHelperUtil.addRangeTerm(
			_booleanQuery, field, startValue, endValue);
	}

	@Override
	public void addRequiredTerm(String field, boolean value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, Boolean value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, double value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, Double value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, int value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, Integer value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, long value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, Long value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, short value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, Short value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, String value) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value);
	}

	@Override
	public void addRequiredTerm(String field, String value, boolean like) {
		SolrHelperUtil.addRequiredTerm(_booleanQuery, field, value, like);
	}

	@Override
	public void addTerm(String field, long value) {
		SolrHelperUtil.addTerm(_booleanQuery, field, value);
	}

	@Override
	public void addTerm(String field, String value) {
		SolrHelperUtil.addTerm(_booleanQuery, field, value);
	}

	@Override
	public void addTerm(String field, String value, boolean like) {
		SolrHelperUtil.addTerm(_booleanQuery, field, value, like);
	}

	@Override
	public void addTerm(
		String field, String value, boolean like,
		BooleanClauseOccur booleanClauseOccur) {

		SolrHelperUtil.addTerm(
			_booleanQuery, field, value, like, booleanClauseOccur);
	}

	@Override
	public List<BooleanClause> clauses() {
		List<org.apache.lucene.search.BooleanClause> luceneBooleanClauses =
			_booleanQuery.clauses();

		List<BooleanClause> booleanClauses = new ArrayList<BooleanClause>(
			luceneBooleanClauses.size());

		for (int i = 0; i < luceneBooleanClauses.size(); i++) {
			BooleanClause booleanClause = new BooleanClauseImpl(
				luceneBooleanClauses.get(i));

			booleanClauses.add(booleanClause);
		}

		return booleanClauses;
	}

	public org.apache.lucene.search.BooleanQuery getBooleanQuery() {
		return _booleanQuery;
	}

	@Override
	public Object getWrappedQuery() {
		return getBooleanQuery();
	}

	@Override
	public boolean hasClauses() {
		return !clauses().isEmpty();
	}

	@Override
	public String toString() {
		return _booleanQuery.toString("");
	}

	private org.apache.lucene.search.BooleanQuery _booleanQuery;
}