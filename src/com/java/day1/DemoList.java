package com.java.day1;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("java");
		li.add("python");
		System.out.println(li.isEmpty());
	
	for(String s:li) {
		System.out.println(li.size());
	}
}
}