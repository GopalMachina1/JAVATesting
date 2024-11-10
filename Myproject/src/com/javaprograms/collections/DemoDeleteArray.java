package com.javaprograms.collections;

import java.util.Arrays;

public class DemoDeleteArray {
	public static void main(String[] args) {
		int [] ar1= {1,2,3,4,5,6,7,8,9,19};
		int[] ar2=new int[ar1.length-1];
		for(int i=0,j=0;i<ar1.length;i++) {
			if(ar1[i]!=4) {
				ar2[j]=ar1[i];
				j++ ;
			}
		}
		System.out.println("values of an array after deleting 4 value");
	 System.out.println(Arrays.toString(ar2));
	}

}
