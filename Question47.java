package com.assignments_2;

class A{
	int a;
	A(){
		this(10);
	}
	
	A(int a){
		this.a = a;
	}
	
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	
	B(){
	}
	
	B(int a, int b){
		super(a);
		this.b = b;
	}
	
	void display() {
		super.display();
		System.out.println(b);
	}
}

public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		B obj1 = new B(20, 30);
		
		obj.display();
		System.out.println("------------------------");
		obj1.display();
	}	

}