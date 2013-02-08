/*
 * Copyright 2012 NetLine Group sp. z o.o.
 * Created: 28-06-2012 10:23:19
 */

package grgr.spring.forum.help;

import java.io.StringReader;

import generated.ObjectFactory;
import generated.People;

import javax.xml.bind.JAXBContext;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class JaxbTest
{
	@Test
	public void unmarshall() throws Exception
	{
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"       <people xmlns:p1=\"http://www.w3.org/namespace/\">\n" + 
				"           <employee>\n" + 
				"              <name>John</name>            \n" + 
				"              <country><p1:a>India</p1:a></country>\n" + 
				"           </employee>\n" + 
				"           <customer>\n" + 
				"              <cname>steve</cname>            \n" + 
				"           </customer>\n" + 
				"       </people>\n" + 
				"";
		JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
		People people = (People)jc.createUnmarshaller().unmarshal(new StreamSource(new StringReader(xml)));
		System.out.println(people);
	}
}
