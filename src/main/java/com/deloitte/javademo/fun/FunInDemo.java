package com.deloitte.javademo.fun;

public class FunInDemo {

	public static void main(String[] args) {

//		SampleClass obj = new SampleClass();
//		obj.funMethod();

//		FunInt obj = new FunInt();

//		FunInt obj = () -> {
//			System.out.println("funMethod implemented");
//		};
//		obj.funMethod();

//		FunInt obj = () -> System.out.println("funMethod implemented");
//		obj.funMethod();

//		FunInt obj = (num) -> System.out.println("funMethod " + num);
//		obj.funMethod(10);

		FunInt obj = (num) -> {return num + 1;};
		FunInt obj2 = (num) -> num + 1;
		FunInt obj3 = num -> num + 1;
		int output = obj.funMethod(10);
		System.out.println(output);
	}

}












