package com.javaprogramms.friday;

public class DemoIfElseExp {
public static void main(String[] args) {
	int marks=32;
	if (marks<35) {
		System.out.println("fail");
	}
	else if(marks>35& marks<60){
		System.out.println("average");
		
	}
    
   else if(marks>60& marks<75){
	    System.out.println("first class");
	
    }
    
    else if(marks>=75){
	System.out.println("distinction");
}
}
}
