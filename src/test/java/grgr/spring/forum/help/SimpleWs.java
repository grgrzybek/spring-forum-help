/*
 * Copyright 2012 NetLine Group sp. z o.o.
 * Created: 28-05-2012 10:08:00
 */

package grgr.spring.forum.help;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@WebService
public class SimpleWs
{
	@WebMethod
	public String upload(String textfield, byte[] filefield) {
		// ...
		return "OK";
	}
}
