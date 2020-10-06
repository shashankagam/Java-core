package com.assignments_2;

import java.util.*;


class Student{
    String rollno;
    double percentage;
    
    Student(){
        
    }
    
    Student(String rollno, double percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    
    void show(){
        System.out.println("Roll No : "+this.rollno+", Percentage : "+this.percentage);
    }
}

class CollegeStudent extends Student{
    int semester;
    
    CollegeStudent(){
        
    }
    
    CollegeStudent(String rollno, double percentage, int semester){
        super(rollno, percentage);
        this.semester = semester;
    }
    
    void show(){
        super.show();
        System.out.println("Semester : "+this.semester);
    }
}

class SchoolStudent extends Student{
    int className;
    
    SchoolStudent(){
        
    }
    
    SchoolStudent(String rollno, double percentage, int className){
        super(rollno, percentage);
        this.className = className;
    }
    
    void show(){
        super.show();
        System.out.println("Class Name : "+this.className);
    }
}

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Student sarr[] = {new CollegeStudent("C1", 75.00, 4), new CollegeStudent("C2", 80.00, 5), 
				new SchoolStudent("S1", 60.00, 10), new SchoolStudent("S2", 80.00, 12), new SchoolStudent("S3", 20, 12)}; 
				
				int scount = 0;
				int ccount = 0;
				for(Student item : sarr){
				    if(item.rollno.charAt(0) == 'S'){
				        System.out.println("School Student : ");
				        item.show();
				        if(item.percentage >= 75)
				            scount++;
				        System.out.println();
				    }
				    else if(item.rollno.charAt(0) == 'C'){
				        
				        System.out.println("College Student : ");
				        item.show();
				        if(item.percentage >= 75)
				            ccount++;
				        System.out.println();
				    }
				}
				System.out.println("School Students with grade A+ : "+scount);
				System.out.println("College Students with grade A+ : "+ccount);
	}

}
