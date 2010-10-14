/*
 * Copyright 2010 Utilis IT sp. z o.o.
 * Created: 14-10-2010 07:21:02
 *
 * SVN: $Revision$ ($Date$) ($Author$)
 */

package grgr.spring.forum.help.controllers;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@Controller
public class Example324084Controller
{
	@RequestMapping(method = RequestMethod.GET, value = "/example324084/{componentId}/graph/Customchart")
	public ModelAndView getCustomGraph(
				@PathVariable("componentId") int componentId,
				@RequestParam("startDate") @DateTimeFormat(pattern = "yyyyMMddHHmm") Date startDate,
				@RequestParam("endDate") @DateTimeFormat(pattern = "yyyyMMddHHmm") Date endDate)
	{
		return new ModelAndView("example324084/ok").addObject("sd", startDate).addObject("ed", endDate);
	}
}
