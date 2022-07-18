package com.deloitte.javademo.fun;

public class FunInDemo {

	public static void main(String[] args) {

//		SampleClass obj = new SampleClass();
//		obj.funMethod();

//		FunInt obj = new FunInt();

		FunInt obj = () -> {
			System.out.println("funMethod implemented");
		};
		obj.funMethod();

	}

}
