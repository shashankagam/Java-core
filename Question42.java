package com.assignments_2;

import java.util.*;

class Tile{
    double edge;
    double Area;
    
    Tile(){
        
    }
    
    Tile(double edge){
        this.edge = edge;
        this.Area = this.edge * this.edge;
    }
    
}

class Floor{
    double l;
    double w;
    double Area;
    
    Floor(){
        
    }
    
    Floor(double l, double w){
        this.l = l;
        this.w = w;
        this.Area = l * w;
    }
    
    public int totalTiles(Tile t){
        int total = (int) (this.Area/t.Area);
        return total;
    }
}

public class Question42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 
	    Tile t = new Tile(10);
	    Floor f = new Floor(100, 500);
	    System.out.println("Total no of tiles required : "+f.totalTiles(t));
	}
}
