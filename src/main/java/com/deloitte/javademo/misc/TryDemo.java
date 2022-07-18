package com.deloitte.javademo.misc;

import java.util.Scanner;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		System.out.println("Please enter your name:");

		try (Scanner sc = new Scanner(System.in);) {

			String name = sc.next();
			System.out.println("Hi " + name + "!");
		}

		System.out.println("End");

	}

}
