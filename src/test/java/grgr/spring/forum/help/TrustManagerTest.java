/*
 * Copyright 2012 NetLine Group sp. z o.o.
 * Created: 25-05-2012 08:49:35
 */

package grgr.spring.forum.help;

import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.junit.Test;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class TrustManagerTest
{
   @Test
   public void testTrust() throws Exception
   {
      TrustManagerFactory factory = TrustManagerFactory.getInstance("X509");
      KeyStore ks = KeyStore.getInstance("JKS");
      ks.load(getClass().getResourceAsStream("ca.keystore"), "123456".toCharArray());
      factory.init(ks);
      
      Certificate cert = CertificateFactory.getInstance("X509").generateCertificate(getClass().getResourceAsStream("localhost.cer"));
      for (TrustManager tm: factory.getTrustManagers())
         ((X509TrustManager)tm).checkClientTrusted(new X509Certificate[] { (X509Certificate)cert }, "RSA");
   }

   @Test(expected = CertificateException.class)
   public void testDontTrust() throws Exception
   {
      TrustManagerFactory factory = TrustManagerFactory.getInstance("X509");
      factory.init((KeyStore)null);
      
      Certificate cert = CertificateFactory.getInstance("X509").generateCertificate(getClass().getResourceAsStream("localhost.cer"));
      for (TrustManager tm: factory.getTrustManagers())
         ((X509TrustManager)tm).checkClientTrusted(new X509Certificate[] { (X509Certificate)cert }, "RSA");
   }
}
