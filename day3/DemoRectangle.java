package com.java.day3;

public class DemoRectangle {
public void test() {
	int i;int j;
		for(i=10;i>0;i-- ){
			
			for(j=0;j<i;j++ ) {
				System.out.println("*");
			}
				
		}
	}

public static void main(String[] args) {
	DemoRectangle dr=new DemoRectangle();
      dr.test();
}
}