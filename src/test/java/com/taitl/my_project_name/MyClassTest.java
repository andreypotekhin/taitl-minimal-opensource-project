package com.taitl.my_project_name;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.taitl.commons.CommonTest;

public class MyClassTest extends CommonTest
{
	MyClass o;

	@Before
	public void setUp() throws Exception
	{
		super.setUp();
		o = new MyClass(42);
	}

	@After
	public void tearDown() throws Exception
	{
		o = null;
		super.tearDown();
	}

	@Test
	public void testMyClassConstructor()
	{
		try
		{
			new MyClass(null);
			fail(EXCEPTION_MUST_BE_THROWN);
		}
		catch (IllegalArgumentException e)
		{
		}

		assertEquals(Integer.valueOf(0), new MyClass(0).seed);
		assertEquals(Integer.valueOf(-1), new MyClass(-1).seed);
		assertEquals(1000, (int) new MyClass(1000).seed);
	}

	@Test
	public void testMyMethod()
	{
		try
		{
			o.myMethod(null);
			fail(EXCEPTION_MUST_BE_THROWN);
		}
		catch (IllegalArgumentException e)
		{
		}

		assertEquals(42, o.myMethod(0));
		assertEquals(142, o.myMethod(100));
		assertEquals(1042, o.myMethod(1000));
	}
}
