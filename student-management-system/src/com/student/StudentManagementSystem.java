package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

	static ArrayList<Student> st=new ArrayList<Student>();
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("********Welcome to Student Management System********");
			
			System.out.println("1. Add Student");
			System.out.println("2. view Student");
			System.out.println("3. search Student");
			System.out.println("4. update Student");
			System.out.println("5. delete Student");
			System.out.println("6. exit");
			System.out.println("Enter your choice");
			
			int choice=s.nextInt();
			
			switch (choice) {
			case 1: addStudent();
				break;
			case 2: viewStudent();
			break;
			case 3: searchStudent();
			break;
			case 4:updateStudent();
			break;
			case 5:deleteStudent();
			break;
			default:System.exit(0);
				break;
			}
			
			
		}

	}


	

	static void addStudent() {
		System.out.println("Enter student id");
		int id=s.nextInt();
		
		System.out.println("Enter student name");
		String name=s.next();
		s.nextLine();
		
		System.out.println("Enter student age");
		int age=s.nextInt();
		
		System.out.println("Enter course");
		String course=s.next();
		s.nextLine();
		
		Student s=new Student(id, name, age, course);
		st.add(s);
		
		System.out.println("Added successfully");
		
		
	}
	

	private static void viewStudent() {
		if (st.isEmpty()) {
			System.out.println("no records found");
		    return;
		}
		System.out.println("--Student List---");
		for (Student student : st) {
			student.display();
			System.out.println("----------------");
		}
		
	}
     

	private static void searchStudent() {
		System.out.println("Enter student id to search");
		int id=s.nextInt();
		
		for (Student student : st) {
			if (student.sid==id) {
				System.out.println("Employee iss");
				student.display();
			return;
			}
		}
		System.out.println("Not found");
		
	}
	
	private static void updateStudent() {
		System.out.println("Enter id to update ");
		int id=s.nextInt();
		
		for (Student student : st) {
			if (student.sid==id) {
				System.out.println("Foudn enter new details");
			    System.out.println("Enter new name:");
			    String name=s.next();
			    s.nextLine();
			    System.out.println("Enter a new age");
			    int age=s.nextInt();
			    System.out.println("Enter the course");
			    String course=s.next();
			    s.nextLine();
			    
			   
			    student.name=name;
			    student.age=age;
			    student.course=course;
			    
			    System.out.println("Student Succussfully updated ");
			    return;
			
			}
		}
		System.out.println("Student ID not found");
		
	}

	private static void deleteStudent() {
		
		System.out.println("Enter id ");
		int id=s.nextInt();
		
		for (Student student : st) {
			if (student.sid==id) {
				st.remove(student);
				System.out.println("Student removed");
			return;
			}
		}	
		System.out.println("No records found");
	}


}
