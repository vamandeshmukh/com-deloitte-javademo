package com.deloitte.javademo;

import com.deloitte.javademo.entity.Student;

/**
 * 
 * @author Vaman Deshmukh
 *         {@link} https://github.com/vamandeshmukh/com-deloitte-javademo
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");
		
		Student mohan = new Student();
		mohan.marks = 99; // 92 
		System.out.println(mohan.marks);
		
	
	}
}
