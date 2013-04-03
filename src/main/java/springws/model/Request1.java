/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:47:48
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
@XmlRootElement(name = "method1Request")
public class Request1
{
	@XmlElement(name = "value")
	private String value;

	/**
	 * @return the value
	 */
	public String getValue()
	{
		return this.value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value)
	{
		this.value = value;
	}
}
