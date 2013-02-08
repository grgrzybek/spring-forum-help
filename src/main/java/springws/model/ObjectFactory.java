/*
 * Copyright 2013 Exence SA
 * Created: 8 lut 2013 10:44:12
 */

package springws.model;

import javax.xml.bind.annotation.XmlRegistry;

import springws.model.ServiceFaultCdo;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@XmlRegistry
public class ObjectFactory
{
	public Request createRequest()
	{
		return new Request();
	}

	public Response createResponse()
	{
		return new Response();
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
