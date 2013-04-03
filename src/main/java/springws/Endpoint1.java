/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:47:13
 */

package springws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import springws.model.Request1;
import springws.model.Response2;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@org.springframework.ws.server.endpoint.annotation.Endpoint
@RequestMapping("/ws/SpmlReadOnly")
public class Endpoint1
{
	@ResponsePayload
	@PayloadRoot(namespace = "urn:test", localPart = "method1Request")
	public Response2 method(@RequestPayload Request1 request) throws Exception
	{
		return new Response2("e1 m1");
	}
}
