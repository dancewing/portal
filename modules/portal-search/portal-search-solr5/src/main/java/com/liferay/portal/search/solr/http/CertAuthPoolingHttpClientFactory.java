/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.solr.http;

import com.liferay.portal.kernel.util.Http;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;

/**
 * @author László Csontos
 * @author André de Oliveira
 */
public class CertAuthPoolingHttpClientFactory
        extends BasePoolingHttpClientFactory {

    public void setSslSocketFactoryBuilder(
            SSLSocketFactoryBuilder sslSocketFactoryBuilder) {

        _sslSocketFactoryBuilder = sslSocketFactoryBuilder;
    }

    @Override
    protected void configure(DefaultHttpClient defaultHttpClient) {
    }

    @Override
    protected PoolingClientConnectionManager
    createPoolingClientConnectionManager() throws Exception {

        SSLSocketFactory sslSocketFactory = _sslSocketFactoryBuilder.build();

        SchemeRegistry schemeRegistry = createSchemeRegistry(sslSocketFactory);

        return new PoolingClientConnectionManager(schemeRegistry);
    }

    protected SchemeRegistry createSchemeRegistry(
            SSLSocketFactory sslSocketFactory) {

        SchemeRegistry schemeRegistry = new SchemeRegistry();

        Scheme scheme = new Scheme(
                Http.HTTPS, Http.HTTPS_PORT, sslSocketFactory);

        schemeRegistry.register(scheme);

        return schemeRegistry;
    }

    private SSLSocketFactoryBuilder _sslSocketFactoryBuilder;

}