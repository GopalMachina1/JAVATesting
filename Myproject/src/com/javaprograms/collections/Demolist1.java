package com.javaprograms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demolist1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();

		li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    

		System.out.println(li.isEmpty());

		System.out.println("size of the list:" +li.size());

		for(Integer i:li) {
			System.out.println(i);
		}
	}
}
