package com.javaprogramms.arrays;

public class DemoDeleteArray {
	public static void main(String[] args) {
		int [] ar1= {1,2,3,4,5,6};
		for(int i=0,j=0;i<ar1.length;i++) {
			if(ar1[i]!=3) {
				ar1[j]=ar1[i];
				System.out.println(ar1[j]);
				j++ ;
			}
		}
	}

}
