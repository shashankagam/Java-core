package com.assignments_2;

public class Question53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "67, 89, 23, 67, 12, 55, 66";
		String temp[] = str.split(", ");
		int sum = 0;
		for(String i : temp) {
			sum += Integer.parseInt(i);
		}
		System.out.println("Sum of all the numbers in ["+str+"] = "+sum);
	}

}
