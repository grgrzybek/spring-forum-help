/*
 * Copyright 2013 Exence SA
 * Created: 8 lut 2013 10:47:13
 */

package springws;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import springws.model.Request;
import springws.model.Response;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint
{
	@PayloadRoot(namespace = "urn:test", localPart = "methodRequest")
	@ResponsePayload
	public Response method(@RequestPayload Request request) throws Exception
	{
		return new Response(request.getValue());
	}
}
