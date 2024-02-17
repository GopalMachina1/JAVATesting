package com.java.day1;

import java.util.Arrays;

public class DemoArrays {

		public static void main(String[] args) {
	int[] id ;
	id=new int[10];
			System.out.println(Arrays.toString(id));

			System.out.println("Original Array: " + Arrays.toString(id));

			System.out.println("*****************************");

			for (int i = 0; i < id.length; i++) {
				System.out.println(id[i]);
			}
			System.out.println("*****************************");

			for (int i = id.length - 1; i >= 0; i--) {
				System.out.println(id[i]);
			}
			System.out.println("*****************************");

			int[] emp_id = new int[id.length];

			System.out.println("new array size : " + emp_id.length);

			System.out.println(Arrays.toString(emp_id));

			emp_id[5] = 40;

			System.out.println(Arrays.toString(emp_id));

			for (int i = 0; i < emp_id.length; i++) {

				emp_id[i] = id[i];
			}

			System.out.println("new array values : " + Arrays.toString(emp_id));
			System.out.println("old array values : " + Arrays.toString(id));

		}

	}

