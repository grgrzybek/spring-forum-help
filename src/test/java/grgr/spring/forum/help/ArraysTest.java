/*
 * Copyright 2012 Grzegorz Grzybek Group sp. z o.o.
 * Created: 28-05-2012 08:49:50
 */

package grgr.spring.forum.help;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class ArraysTest
{
	@Test
	public void test1() throws Exception
	{
		byte[] items = new byte[] { 0x01, 0x02, 0x03 };
		byte[] items2 = new byte[3 + 7];

		System.arraycopy(items, 0, items2, 7, items.length);
		Arrays.fill(items2, 0, 7, (byte)' ');
		
		assertArrayEquals(new byte[] { 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x01, 0x02, 0x03 } , items2);
	}
}
