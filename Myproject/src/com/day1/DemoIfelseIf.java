package com.day1;

public class DemoIfelseIf { 
		public static void main(String[] args) {  
		    int marks=100;  
		      
		    if(marks<35){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=35 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<=100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
		}  
		}  

