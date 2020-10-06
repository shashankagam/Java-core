package com.assignments_2;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a line to reverse every word : ");
		String line = sc.nextLine();
		String arr[] = line.split(" ");
		
		StringBuffer output = new StringBuffer(line.length());
		for(int i=0; i<arr.length; i++) {
			StringBuffer buff = new StringBuffer(arr[i]);
			buff.reverse();
			//System.out.println(buff);
			if(i != arr.length - 1)
				output.append(buff + " ");
			else
				output.append(buff);
		}
		System.out.println("Output String : "+ output);
		sc.close();
	}

}
