/*
 * Copyright 2010 Utilis IT sp. z o.o.
 * Created: 25-10-2010 08:04:03
 *
 * SVN: $Revision$ ($Date$) ($Author$)
 */

package grgr.spring.forum.help.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@Controller
@RequestMapping("index")
public class Example325552Controller
{
   @RequestMapping(method = RequestMethod.GET)
   public String showForm(Map<String, String> model)
   {
       model.put("logonPage", "test");
       return "usageadmin/logonPage";
   }
}
