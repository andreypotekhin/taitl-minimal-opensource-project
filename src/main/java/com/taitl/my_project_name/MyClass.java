package com.taitl.my_project_name;

import static org.valid4j.Assertive.*;

import java.util.*;

/**
 * Class description goes here.
 * 
 * @author Your Name
 *
 */
public class MyClass
{
	/** Stores seed integer. */
	Integer seed;

	/**
	 * Constructs an instance of MyClass.
	 * 
	 * @param seed The seed
	 */
	public MyClass(Integer seed)
	{
		require(seed != null, "Argument 'seed' must not be null.");
		this.seed = seed;
	}

	/**
	 * Implements a method.
	 * 
	 * @param arg Any integer
	 * @return Sum of integer and seed
	 */
	public int myMethod(Integer arg)
	{
		require(arg != null, "Argument 'arg' must not be null.");
		List<Integer> list = new ArrayList<>();
		list.add(arg);
		return arg + seed;
	}
}
