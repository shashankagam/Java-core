package com.assignments_2;

import java.util.Scanner;

abstract class Processor{
	int data;
	
	public Processor() {
		data = 1;
	}
	
	public Processor(int data) {
		super();
		this.data = data;
	}

	abstract void process();
	
	void showData() {
		System.out.println("Data : "+data);
	}
}

public class Question48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. Find Area of Circle \n2. Find Factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Processor p = new Processor() {
			void process() {
				super.data *= n;
			}
		};
	}
	
}
