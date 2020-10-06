package com.assignments_2;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String username = sc.nextLine();
		String name = username.toLowerCase();
		int count = 0;
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("There are total of "+count+" vowels in "+username+".");
	}

}
