/*
 * Copyright 2013 Exence SA
 * Created: 8 lut 2013 10:47:53
 */

package springws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@XmlType(name = "ResponseType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "methodResponse")
public class Response
{
	@XmlElement(name = "result-value")
	private String result;

	/**
	 * @param value
	 */
	public Response(String value)
	{
		this.result = value;
	}

	/**
	 * 
	 */
	public Response()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the result
	 */
	public String getResult()
	{
		return this.result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result)
	{
		this.result = result;
	}
}
