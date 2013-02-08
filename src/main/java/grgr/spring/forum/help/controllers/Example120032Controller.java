/*
 * Copyright 2011 NetLine Group sp. z o.o.
 * Created: 14-12-2011 07:57:53
 */

package grgr.spring.forum.help.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@Controller
@RequestMapping("/example120032/*")
public class Example120032Controller
{
	@RequestMapping(method = RequestMethod.GET, value = "/testResource/{id}")
	public ModelAndView getResource(final HttpServletRequest request, @PathVariable("id") final String id) throws Exception
	{
		return new ModelAndView().addObject("x", "y");
	}
}
