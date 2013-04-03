/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 10:35:46
 */

package springws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.xml.sax.SAXParseException;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class PayloadValidatingInterceptorWithException extends PayloadValidatingInterceptor
{
	private ServiceFaultExceptionResolver resolver;

	/**
	* Sets the schema resources to use for validation. Setting either this property or schema is required.
	* @param schemas
	*/
	public void setSchemaz(final List<String> schemas)
	{
		List<ClassPathResource> r = new ArrayList<ClassPathResource>();
		if (schemas == null)
		{
			return;
		}
		for (String s: schemas)
		{
			r.add(new ClassPathResource(s));
		}
		super.setSchemas(r.toArray(new Resource[r.size()]));
	}

	/**
	* Template method that is called when the request message contains validation errors.
	* @param arg0
	* @param arg1
	*/
	@Override
	protected boolean handleRequestValidationErrors(final MessageContext arg0, final SAXParseException[] arg1)
				throws TransformerException
	{
		// fault ID will be generated in AOP when any exception occurs after Endpoint. since validation error occurs before reaching the endpoint,
		//we are generating the id on validation failure case

		StringBuffer b = new StringBuffer();

		for (SAXParseException element: arg1)
		{
			this.logger.error("XML validation error on request: " + element.getMessage());
			b.append(element.getMessage());
		}
		throw new RuntimeException("Request validation failed - " + b);
//		return false;
	}

	/**
	* Template method that is called when the response message contains validation errors.
	* @param arg0
	* @param arg1
	*/
	@Override
	protected boolean handleResponseValidationErrors(final MessageContext arg0, final SAXParseException[] arg1)
	{
		StringBuffer b = new StringBuffer();

		for (SAXParseException element: arg1)
		{
			this.logger.error("XML validation error on response: " + element.getMessage());
			b.append(element.getMessage());
		}
		this.resolver.resolveException(arg0, null, new RuntimeException("Response validation failed - " + b));
		return false;
//		throw new RuntimeException("Response validation failed - " + b);
	}

	/* (non-Javadoc)
	 * @see org.springframework.ws.server.endpoint.interceptor.AbstractValidatingInterceptor#afterCompletion(org.springframework.ws.context.MessageContext, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex)
	{
		this.resolver.resolveException(messageContext, endpoint, ex);
	}

	/**
	 * @param resolver the resolver to set
	 */
	public void setResolver(ServiceFaultExceptionResolver resolver)
	{
		this.resolver = resolver;
	}
}
