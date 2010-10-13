/*
 * Copyright 2010 Utilis IT sp. z o.o.
 * Created: 13-10-2010 06:56:02
 *
 * SVN: $Revision$ ($Date$) ($Author$)
 */

package grgr.test.p323942.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
@Controller
@RequestMapping("/example323942/*")
@SessionAttributes({ "table" })
public class Example323942Controller
{
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public ModelMap get()
	{
		ModelMap mm = new ModelMap();
		@SuppressWarnings("unchecked")
		List<Column> columns = LazyList.decorate(new ArrayList<Column>(), FactoryUtils.instantiateFactory(Column.class));
		columns.add(new Column("np", "name"));
		Table table = new Table();
		table.setColumns(columns);
		mm.addAttribute("table", table);
		return mm;
	}

	@RequestMapping(value = "post", method = RequestMethod.POST)
	public String post(@ModelAttribute("table") Table table, ModelMap model)
	{
		return "example323942/ok";
	}

	public static class Table
	{
		private List<Column> columns = null;

		/**
		 * @return the columns
		 */
		public List<Column> getColumns()
		{
			return this.columns;
		}

		/**
		 * @param columns the columns to set
		 */
		public void setColumns(List<Column> columns)
		{
			this.columns = columns;
		}
	}

	public static class Column
	{
		private String nodePath;
		private String name;

		/**
		 * 
		 */
		public Column()
		{
		}

		/**
		 * @param nodePath
		 * @param name
		 */
		public Column(String nodePath, String name)
		{
			this.nodePath = nodePath;
			this.name = name;
		}

		/**
		 * @return the nodePath
		 */
		public String getNodePath()
		{
			return this.nodePath;
		}

		/**
		 * @param nodePath the nodePath to set
		 */
		public void setNodePath(String nodePath)
		{
			this.nodePath = nodePath;
		}

		/**
		 * @return the name
		 */
		public String getName()
		{
			return this.name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name)
		{
			this.name = name;
		}
	}
}
