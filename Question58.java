package com.assignments_2;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[] {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("Enter a index from 0 to 6 to print the day : ");
		int index = sc.nextInt();
		try {
			System.out.println(arr[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound : ");
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
