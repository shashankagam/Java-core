package com.assignments_2;

import java.util.*;

class Persons{
	String name;
	int age;
	
	
	Persons(){
		
	}
	
	Persons(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : "+this.name+"\t Age : "+this.age);
	}
	
	void otherFun() {
		System.out.println(1);
	}
}

class Employee extends Persons{
	int eid;
	
	Employee(){
		
	}
	
	Employee(int eid, String name, int age){
		super(name, age);
		this.eid = eid;
	}
	
	void display() {
		super.display();
		System.out.println("EmployeeID : "+this.eid);
	}
	
	void temp() {
		System.out.println(2);
	}
}

class NewStudent extends Persons{
	int sid;
	
	NewStudent(){
		
	}
	
	NewStudent(int sid, String name, int age){
		super(name, age);
		this.sid = sid;
	}
	
	void display() {
		super.display();
		System.out.println("StudentID : "+this.sid);
	}
	
}


public class Question46 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons arr[] = { new Employee(1, "Pratik", 24), 
				new Persons("Pranay", 23), new NewStudent(10, "Ritesh", 24)};
		
		
		for(Persons p : arr) {
			if(p instanceof Employee) {
				p.display();
			}
		}
	}

}
