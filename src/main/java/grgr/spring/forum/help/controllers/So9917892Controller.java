/*
 * Copyright 2012 NetLine Group sp. z o.o.
 * Created: 30-03-2012 11:12:50
 */

package grgr.spring.forum.help.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@Controller
public class So9917892Controller
{
	@RequestMapping(value="/*", method = RequestMethod.POST)
	public void processRequest(@RequestBody String request, HttpServletResponse res) throws IOException
	{
		res.getWriter().println("[" + request + "]");
		res.getWriter().flush();
		res.getWriter().close();
	}
}
