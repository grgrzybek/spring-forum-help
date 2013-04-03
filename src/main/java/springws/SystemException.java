/*
 * Copyright 2013 Grzegorz Grzybek SA
 * Created: 8 lut 2013 11:01:10
 */

package springws;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class SystemException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	/**
	 * @return
	 */
	public ExceptionType getExceptionType()
	{
		return new ExceptionType("1");
	}

}
