package com.day1;

public class DemoIfelseExp {
	//Java Program to demonstrate the use of Nested If Statement.        
	public static void main(String[] args) {      
	    //Creating two variables for age and weight
		int age=18;
	    int weight=51;      
	    //applying condition on age and weight    
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        } else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    }  
	}  }  


