package com.assignments_2;

import java.util.Scanner;

public class Question54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		String rev = "";
		for(int i=str.length() - 1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse of String "+str+" is "+rev);
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Reverse of String using String Buffer "+str+" is "+sb);
	}

}
