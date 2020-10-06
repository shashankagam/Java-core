package com.assignments_2;

import java.util.*;


class Faculty{
	int facultyId;
	double salary;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the faculty ID : ");
		this.facultyId = sc.nextInt();
	}
	
	void printSalary() {
		System.out.println("FacultyID : "+this.facultyId);
		System.out.println("Salary : "+this.salary);
	}
}

class FullTimeFaculty extends Faculty{
	double basicSalary;
	double allowance;
	
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary and Allowance : ");
		this.basicSalary = sc.nextDouble();
		this.allowance = sc.nextDouble();
		super.salary = this.basicSalary + this.allowance;
		super.printSalary();
		System.out.println("Basic Salary : "+this.basicSalary+", Allowance : "+this.allowance);
	}
	
}

class PartTimeFaculty extends Faculty{
	double workingHours;
	double ratePerHour;
	
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the working hours and rate per hour : ");
		this.workingHours = sc.nextDouble();
		this.ratePerHour = sc.nextDouble();
		super.salary = this.workingHours * this.ratePerHour;
		printSalary();
		System.out.println("Working Hours : "+this.workingHours+", Rate per Hour : "+this.ratePerHour);
	}
}

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeFaculty p = new PartTimeFaculty();
		p.input();
	}

}
