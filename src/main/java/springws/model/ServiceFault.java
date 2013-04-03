/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:52:21
 */

package springws.model;

import java.util.Date;

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
@XmlType(name = "ServiceFaultType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "my-fault")
public class ServiceFault
{
	@XmlElement(name = "fault-info")
	private String faultInfo;
	@XmlElement
	private int code;
	@XmlElement
	private Date date;
	@XmlElement
	private String faultId;

	/**
	 * 
	 */
	public ServiceFault()
	{
	}

	/**
	 * @param faultInfo
	 * @param code
	 * @param date
	 * @param faultId
	 */
	public ServiceFault(String faultInfo, int code, Date date, String faultId)
	{
		super();
		this.faultInfo = faultInfo;
		this.code = code;
		this.date = date;
		this.faultId = faultId;
	}

	/**
	 * @param code
	 * @param date
	 * @param faultId
	 * @param faultMsg
	 */
	public ServiceFault(int code, Date date, String faultId, String faultMsg)
	{
		this.code = code;
		this.date = date;
		this.faultId = faultId;
		this.faultInfo = faultMsg;
	}

	/**
	 * @return the faultInfo
	 */
	public String getFaultInfo()
	{
		return this.faultInfo;
	}

	/**
	 * @param faultInfo the faultInfo to set
	 */
	public void setFaultInfo(String faultInfo)
	{
		this.faultInfo = faultInfo;
	}

	/**
	 * @return the code
	 */
	public int getCode()
	{
		return this.code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code)
	{
		this.code = code;
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
}
