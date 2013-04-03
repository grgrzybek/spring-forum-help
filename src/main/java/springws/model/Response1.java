/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:47:53
 */

package springws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "method1Response")
public class Response1
{
	@XmlElement(name = "result-value")
	private String result;

	/**
	 * @param value
	 */
	public Response1(String value)
	{
		this.result = value;
	}

	/**
	 * 
	 */
	public Response1()
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
