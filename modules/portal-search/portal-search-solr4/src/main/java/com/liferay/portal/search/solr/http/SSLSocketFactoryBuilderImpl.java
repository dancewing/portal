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

import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyStore;

/**
 * @author László Csontos
 * @author André de Oliveira
 */
public class SSLSocketFactoryBuilderImpl implements SSLSocketFactoryBuilder {

    @Override
    public SSLSocketFactory build() throws Exception {
        KeyStore keyStore = _keyStoreLoader.load(
                _keyStoreType, _keyStorePath, _keyStorePassword);

        if (keyStore == null) {
            if (_log.isDebugEnabled()) {
                _log.debug(
                        "Use system defaults because there is no custom key store");
            }

            return SSLSocketFactory.getSystemSocketFactory();
        }

        KeyStore trustKeyStore = null;

        TrustStrategy trustStrategy = null;

        if (_verifyServerCertificate) {
            trustKeyStore = _keyStoreLoader.load(
                    _trustStoreType, _trustStorePath, _trustStorePassword);

            if (trustKeyStore == null) {
                if (_log.isDebugEnabled()) {
                    _log.debug(
                            "Use system defaults because there is no custom " +
                                    "trust store");
                }

                return SSLSocketFactory.getSystemSocketFactory();
            }
        } else {
            trustStrategy = new TrustSelfSignedStrategy();
        }

        X509HostnameVerifier x509HostnameVerifier =
                SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;

        if (!_verifyServerHostname) {
            x509HostnameVerifier = SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
        }

        try {
            return new SSLSocketFactory(
                    SSLSocketFactory.TLS, keyStore,
                    String.valueOf(_keyStorePassword), trustKeyStore, null,
                    trustStrategy, x509HostnameVerifier);
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn(
                        "Use system defaults because the custom SSL socket " +
                                "factory was not able to initialize",
                        e);
            }

            return SSLSocketFactory.getSystemSocketFactory();
        }
    }

    public void setKeyStoreLoader(KeyStoreLoader keyStoreLoader) {
        _keyStoreLoader = keyStoreLoader;
    }

    public void setKeyStorePassword(char[] keyStorePassword) {
        _keyStorePassword = keyStorePassword;
    }

    public void setKeyStorePath(String keyStorePath) {
        _keyStorePath = keyStorePath;
    }

    public void setKeyStoreType(String keyStoreType) {
        _keyStoreType = keyStoreType;
    }

    public void setTrustStorePassword(char[] trustStorePassword) {
        _trustStorePassword = trustStorePassword;
    }

    public void setTrustStorePath(String trustStorePath) {
        _trustStorePath = trustStorePath;
    }

    public void setTrustStoreType(String trustStoreType) {
        _trustStoreType = trustStoreType;
    }

    public void setVerifyServerCertificate(boolean verifyServerCertificate) {
        _verifyServerCertificate = verifyServerCertificate;
    }

    public void setVerifyServerHostname(boolean verifyServerHostname) {
        _verifyServerHostname = verifyServerHostname;
    }

    private static Logger _log = LoggerFactory.getLogger(
            SSLSocketFactoryBuilderImpl.class);

    private KeyStoreLoader _keyStoreLoader;
    private char[] _keyStorePassword;
    private String _keyStorePath;
    private String _keyStoreType = KeyStore.getDefaultType();
    private char[] _trustStorePassword;
    private String _trustStorePath;
    private String _trustStoreType = KeyStore.getDefaultType();
    private boolean _verifyServerCertificate = true;
    private boolean _verifyServerHostname = true;

}