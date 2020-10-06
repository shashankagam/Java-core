package com.assignments_2;

import java.util.*;
class Emp{
	String empid;
	String name;
	double salary;
	
	Emp(){
		
	}
	
	Emp(String empid, String name, double salary){
		this.empid = new String(empid);
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}


public class Question50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e[] = new Emp[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5 ; i++) {
			int flag = 0;
			System.out.println("Enter the Emp"+(i+1)+" name : ");
			String name = sc.next();
			System.out.println("Enter Emp ID :");
			String id = sc.next();
			for(int j = 0; j<i; j++) {
				if(e[j].empid.equals(id)) {
					System.out.println("Emp ID already exist!");
					i--;
					flag = 1;
					break;
				}
			}
			if(flag == 1)
				continue;
			System.out.println("Enter the Salary : ");
			double salary = sc.nextDouble();
			Emp temp = new Emp(id, name, salary);
			e[i]=temp;
		}
		for(Emp emp : e) {
			System.out.println(emp);
		}
		
	}

}
