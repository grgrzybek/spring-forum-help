/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:44:12
 */

package springws.model;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@XmlRegistry
public class ObjectFactory
{
	public Request1 createRequest1()
	{
		return new Request1();
	}

	public Response1 createResponse1()
	{
		return new Response1();
	}

	public Request2 createRequest2()
	{
		return new Request2();
	}
	
	public Response2 createResponse2()
	{
		return new Response2();
	}

	/**
	 * @param sf
	 * @return
	 */
	public ServiceFault createServiceFault(ServiceFaultCdo sf)
	{
		return new ServiceFault(sf.getCode(), sf.getDate(), sf.getFaultId(), sf.getFaultMsg());
	}
}
