package com.learning;

import java.util.Arrays;

/**
 * 
 * PEN object 
 * 
 * 
 * atributes -> colour, size,length 
 * actions ->   writing
 * access specifiers -> public,package,protected,private
 * 
 * name convention -> start with  $,characher,_ (class name we are following start with Capital letter whereas method name in smallcase camelcase)
 * 
 * 
 * static and instance
 */ 
public class Pen {

	// attributes
	public String colour;
	
	public static int height=10;

	public Pen(String colour) {
		this.colour = colour;
	}
	
    
	
    public void whichPen() {
    	System.out.println(" I'm "+this.colour+ "Pen ");
    }
	
	
	public static void main(String[] args) {

		Pen redPen = new Pen("Red");
		Pen bluePen = new Pen("Blue");
		
		
		System.out.println(redPen.height);
		redPen.whichPen();
		bluePen.whichPen();
	}

}






