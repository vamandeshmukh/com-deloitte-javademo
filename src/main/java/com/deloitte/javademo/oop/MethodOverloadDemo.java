
package com.deloitte.javademo.oop;

//class Calc {

//
////	public static void add(int i, int j) {
////		System.out.println(i + j);
////	}
////
////	public static void add(int i, int j, int k) {
////		System.out.println(i + j + k);
////	}
//
//	public void add(int i, int j) {
//		System.out.println(i + j);
//	}
//
//	public void add(int i, int j, int k) {
//		System.out.println(i + j + k);
//	}
//
//}

class Calc {

	public void add(int i, int j) {
		System.out.println(i + j);
	}

}

class Calc2 extends Calc {

	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

}

public class MethodOverloadDemo {

	public static void main(String[] args) {

		Calc2 calc = new Calc2();
		calc.add(10, 20);
		calc.add(10, 20, 30);

	}
}





