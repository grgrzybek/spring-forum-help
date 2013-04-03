/*
 * Copyright 2012 Grzegorz Grzybek Group sp. z o.o.
 * Created: 11-04-2012 10:59:41
 */

package grgr.spring.forum.help;

import java.io.StringReader;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.junit.Test;
import org.xml.sax.InputSource;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class So10102758XPathTest
{
  @Test
  public void test() throws Exception
  {
    String xml =
        "<FileIndex>\n" + 
        "<Document SEQUENCE=\"0\" FILENAME=\"A.xml\"  />\n" + 
        "<Document SEQUENCE=\"1\" FILENAME=\"B.htm\"  />\n" + 
        "<Document SEQUENCE=\"2\" FILENAME=\"C.htm\"  />\n" + 
        "<Document SEQUENCE=\"3\" FILENAME=\"D.htm\"  />\n" + 
        "</FileIndex>";
    XPath xp = XPathFactory.newInstance().newXPath();
    System.out.println(xp.evaluate("/FileIndex/Document[@SEQUENCE='1']/@FILENAME", new InputSource(new StringReader(xml)), XPathConstants.STRING));
  }
}
