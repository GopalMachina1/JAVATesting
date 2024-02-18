package com.java.day3;

public class ForLoopDemo {
	public void test() {
		int i;int j;int k;
	
	for(i=1;i<=10;i++) {
		for(j=1;j<=i;j++)
		for(k=1;k<=j;k--)	
	System.out.print(k);
	System.out.println();
	}
	}
	public static void main(String[] args) {
		ForLoopDemo fd =new ForLoopDemo();
		fd.test();
		
	}
	
	

}
