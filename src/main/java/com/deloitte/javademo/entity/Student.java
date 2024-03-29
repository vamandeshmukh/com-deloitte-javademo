package com.deloitte.javademo.entity;

public class Student {

	private int rollNo;
	private String studentName;
	private int marks;

	// POJO classes - constructors, getters, setters, toString,
//	( and hashCode, equals)

	public Student() {
		super();
	}

	public Student(int rollNo, String studentName, int marks) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", marks=" + marks + "]";
//	}

}
