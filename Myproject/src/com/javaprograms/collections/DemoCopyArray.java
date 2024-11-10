package com.javaprograms.collections;

import java.util.Arrays;

public class DemoCopyArray {

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4, 0, 5, 10, 15, 13, 14 };
		int[] ar2 = new int[ar1.length];
		//copying an array
		ar2 = ar1.clone();
		System.out.println(Arrays.toString(ar2));

	}
}
