package com.assignments_2;

import java.util.Scanner;

public class Question55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line to count the number of words : ");
		String line = sc.nextLine();
		String arr[] = line.split(" ");
		System.out.println("No of words in the given input : "+arr.length);
	}

}
