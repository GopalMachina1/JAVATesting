package com.javaprograms.collections;
import java.util.HashMap;
import java.util.Map;

	public class DemoMap {
		public static void main(String[] args) {
			
			Map<Integer, String> m = new HashMap<>();
			
			m.put(1, "apple");
			m.put(2, "apple");
			m.put(3, "apple2");
		System.out.println(m.size());
			
			for (Map.Entry m1 : m.entrySet() ){
				System.out.println(m1.getKey() + " - "+ m1.getValue());

		}
	}
	}

