package com.fincatto.documentofiscal.utils;

import com.fincatto.documentofiscal.DFConfig;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class DFSocketFactory implements ProtocolSocketFactory {

    public static final int TIMEOUT_PADRAO_EM_MILLIS = 60_000;
    public static final int SO_TIMEOUT_PADRAO_EM_MILLIS = 30_000;

    private final DFConfig config;
    private final SSLContext sslContext;
    
    public DFSocketFactory(final DFConfig config) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        this.config = config;
        this.sslContext = this.createSSLContext(config);
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress localAddress, final int localPort, final HttpConnectionParams params) throws IOException {
        Socket socket = null;		// bug risolto con la versione 4
    	try {
    		socket = this.sslContext.getSocketFactory().createSocket();
        	((SSLSocket) socket).setEnabledProtocols(this.config.getSSLProtocolos());
            socket.bind(new InetSocketAddress(localAddress, localPort));
            
            final int connectTimeout = params.getConnectionTimeout();

            socket.connect(new InetSocketAddress(host, port), connectTimeout);
            return socket;
        }
        finally {
			if (socket != null) {
				socket.close();
			}
		}
    	
    	/*
    	 * or it could be done: try (Socket socket = this.sslContext.getSocketFactory().createSocket()) {...} which closes the socket automatically
    	 */
    }

    @Override
    public Socket createSocket(final String host, final int port, final InetAddress clientHost, final int clientPort) throws IOException {
        return this.sslContext.getSocketFactory().createSocket(host, port, clientHost, clientPort);
    }

    @Override
    public Socket createSocket(final String host, final int port) throws IOException {
        return this.sslContext.getSocketFactory().createSocket(host, port);
    }

    private SSLContext createSSLContext(final DFConfig config) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        final KeyManager[] keyManagers = this.createKeyManagers(config);
        final TrustManager[] trustManagers = this.createTrustManagers(config);
        final SSLContext sslContext2 = SSLContext.getInstance(config.getSSLProtocolos()[0]);
        sslContext2.init(keyManagers, trustManagers, null);
        return sslContext2;
    }

    private KeyManager[] createKeyManagers(final DFConfig config) throws KeyStoreException {
        return new KeyManager[]{new com.fincatto.documentofiscal.utils.DFKeyManager(config)};
    }

    private TrustManager[] createTrustManagers(final DFConfig config) throws KeyStoreException, NoSuchAlgorithmException {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(config.getCadeiaCertificadosKeyStore());
        return trustManagerFactory.getTrustManagers();
    }

}