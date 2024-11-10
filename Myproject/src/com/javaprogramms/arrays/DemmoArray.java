package com.javaprogramms.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DemmoArray {
public static void main(String[] args) {
	int [] ar1=new int[10];
	Scanner s=new Scanner(System.in);
	System.out.println(" enter array values:");
	for( int i=0;i<10;i++) {
		ar1[i]=s.nextInt();
	}
	System.out.println(Arrays.toString(ar1));
}
}
