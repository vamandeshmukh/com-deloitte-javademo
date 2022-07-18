package com.deloitte.javademo.str;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 80000));
		empList.add(new Employee(102, "Monu", 90000));
		empList.add(new Employee(103, "Tonu", 70000));
		empList.add(new Employee(104, "Ponu", 85000));
		empList.add(new Employee(105, "Gonu", 95000));

		System.out.println(empList);

		System.out.println("Print all employees using for each loop");
		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Print employees with salary > 80000 using for each loop");
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
	}

}
