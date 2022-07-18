package com.deloitte.javademo.dp;

public class Single {

	private static Single obj;

	// work here

	private Single() {
		super();
	}

	public static Single getInstance() {

		if (obj == null) {
			obj = new Single();
		}
		return obj;
	}
}
