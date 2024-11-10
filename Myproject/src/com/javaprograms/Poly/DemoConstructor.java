package com.javaprograms.Poly;
//constructors in java
	public class DemoConstructor {
		//no parameterised constructor
		 public  DemoConstructor(){
			System.out.println("Good Morning Hyderabad");					
		}
		 //parameterised constructor
		 public  DemoConstructor(int a){
			System.out.println("Good Morning Hyderabad1:" + a);	
		}
		
		public void test(int a) {  
			System.out.println("hello good morning" );
			
			System.out.println("print parameter value : " +a);
		}
		
		public static void main(String[] args) {
			DemoConstructor dc1 = new DemoConstructor();
			DemoConstructor dc = new DemoConstructor(13);
			dc.test(5);
			System.out.println("hello I am main method");
		}
		
		
	}
	  

