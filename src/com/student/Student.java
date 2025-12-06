package com.student;

public class Student {

	int sid;
	String name;
	int age;
	String course;
	public Student(int sid, String name, int age, String course) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	void display()
	{
		System.out.println("Student id :"+sid);
		System.out.println("Student name :"+name);
		System.out.println("Student age :"+age);
		System.out.println("Student course :"+course);
	}
	
}
