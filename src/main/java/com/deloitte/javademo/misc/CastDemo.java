package com.deloitte.javademo.misc;

class Parent {

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}

public class CastDemo {

	public static void main(String[] args) {
//		byte b1 = 10;
//		byte b2 = 20;
////		byte b3 = b1 + b2;
//		int b3 = b1 + b2;
////		byte b3 = (byte) (b1 + b2);
//		System.out.println(b3);
//
//		byte b5 = 10;
//		char ch = 'a';
//		System.out.println(b5 + ch);

//		for (int i = 1; i <= 256; i++) {
//			System.out.println(i + " - " + (char) i);
//		}
		
		int    num  = 10;
		
		Parent obj1 = new Child1();
		obj1 = new Child2();
		
//		Child1 obj2 = new Child1();
//		obj2 = (Child2) new Child2();

	}

}
