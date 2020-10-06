package com.assignments_2;

import java.util.*;

class OneBHK{
    double roomArea;
    double hallArea;
    double price;
    
    
    OneBHK(){
        
    }
    
    OneBHK(double roomArea, double hallArea, double price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    
    public void show(){
        System.out.println("Room Area : "+roomArea+", Hall Area : "+hallArea+", Price : "+price);
    }
}

class TwoBHK extends OneBHK{
    double room2Area;
    
    
    TwoBHK(){
        
    }
    
    TwoBHK(double roomArea, double hallArea, double price, double room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }
    
    public void show(){
        super.show();
        System.out.println("Room2 Area : "+room2Area+" ");
        
        
    }
}


public class Question43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double total = 0.00;
	    TwoBHK arr[] = new TwoBHK[3];
	    for(int i =0; i<3; i++){
	        System.out.println("Enter Room1 area : ");
	        double roomArea = sc.nextDouble();
	        System.out.println("Enter Room2 area : ");
	        double room2Area = sc.nextDouble();
	        System.out.println("Enter Hall area : ");
            double hallArea = sc.nextDouble();
            System.out.println("Enter Price : ");
            double price= sc.nextDouble();
            total += price;
            TwoBHK t = new TwoBHK(roomArea, room2Area, hallArea, price);
            arr[i] = t;
	    }
	    
	    for(int i=0; i<arr.length; i++)
	        arr[i].show();
	   System.out.println("Total Amount of Flats : "+total);
	}
}
