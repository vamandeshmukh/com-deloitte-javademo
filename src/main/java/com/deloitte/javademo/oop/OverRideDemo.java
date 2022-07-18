package com.deloitte.javademo.oop;

class Phone {

	public void call() {
		System.out.println("calling...");
	}

}

class SmartPhone extends Phone {

	@Override
	public void call() {
		System.out.println("calling with truecaller...");
	}

}

public class OverRideDemo {

	public static void main(String[] args) {

		Phone obj = new Phone();
		obj.call();

		SmartPhone obj2 = new SmartPhone();
		obj2.call();
	}

}
