package com.deloitte.javademo.dp;

public class Single {

	private static Single obj = new Single();

	// work here

	private Single() {
		super();
	}

	public static Single getInstance() {

		return obj;

	}

}
