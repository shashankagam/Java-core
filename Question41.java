package com.assignments_2;

import java.util.*;

class Person{
    String name;
    int age;
    
    Person(){
        this("Pratik", 24);
        System.out.println("Inside Default constructor");
    }
    
    Person(String name, int age){
        System.out.println("Inside Param constructor");
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name : "+this.name+", Age : "+this.age);
    }
}

public class Question41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person();
	   	p.display();
	}
}
