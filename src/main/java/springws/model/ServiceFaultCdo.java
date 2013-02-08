/*
 * Copyright 2013 Exence SA
 * Created: 8 lut 2013 10:55:52
 */

package springws.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@XmlType(name = "ServiceFaultCdoType")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceFaultCdo
{
	@XmlElement
	private String faultMsg;
	@XmlElement
	private Date date;
	@XmlElement
	private String faultId;
	@XmlElement
	private int code;

	/**
	 * @param faultMsg
	 */
	public void setMessage(String faultMsg)
	{
		this.faultMsg = faultMsg;
	}

	/**
	 * @param date
	 */
	public void setDateTime(Date date)
	{
		this.date = date;
	}

	/**
	 * @param faultId
	 */
	public void setReferenceId(String faultId)
	{
		this.faultId = faultId;
	}

	/**
	 * @param code
	 */
	public void setCode(int code)
	{
		this.code = code;
	}

	/**
	 * @return the faultMsg
	 */
	public String getFaultMsg()
	{
		return this.faultMsg;
	}

	/**
	 * @param faultMsg the faultMsg to set
	 */
	public void setFaultMsg(String faultMsg)
	{
		this.faultMsg = faultMsg;
	}

	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return this.date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * @return the faultId
	 */
	public String getFaultId()
	{
		return this.faultId;
	}

	/**
	 * @param faultId the faultId to set
	 */
	public void setFaultId(String faultId)
	{
		this.faultId = faultId;
	}

	/**
	 * @return the code
	 */
	public int getCode()
	{
		return this.code;
	}
}
