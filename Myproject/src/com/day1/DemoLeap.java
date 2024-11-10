package com.day1;

public class DemoLeap {
    
		public static void main(String[] args) {    
		    int year=2025;    
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println(" The year is a LEAP YEAR");  
		    }  
		    else{  
		        System.out.println(" The year is a COMMON YEAR");  
		    }  
		}    
		} 
