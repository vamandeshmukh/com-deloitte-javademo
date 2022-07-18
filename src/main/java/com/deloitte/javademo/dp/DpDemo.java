package com.deloitte.javademo.dp;

public class DpDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		Single obj = Single.getInstance();
		System.out.println(obj.hashCode());
		Single obj2 = Single.getInstance();
		System.out.println(obj2.hashCode());
		Single obj3 = Single.getInstance();

		System.out.println(obj3.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(obj3));
		System.out.println(obj2.equals(obj3));
		System.out.println("End");

	}

}
