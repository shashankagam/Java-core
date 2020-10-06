package com.assignments_2;

import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line to convert the first letter of each word Capital : ");
		String line = sc.nextLine();
		String arr[] = line.split(" ");
		StringBuffer sb = new StringBuffer(line.length());
		for(int i=0; i<arr.length; i++) {
			if(i != arr.length - 1)
				sb.append(arr[i].toUpperCase().charAt(0) + arr[i].substring(1) + " ");
			else
				sb.append(arr[i].toUpperCase().charAt(0) + arr[i].substring(1));
		}
		System.out.println(sb);
	}

}
