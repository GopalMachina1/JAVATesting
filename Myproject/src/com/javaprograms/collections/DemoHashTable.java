package com.javaprograms.collections;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
		public static void main(String[] args) {

			Hashtable<Integer, String> hs = new Hashtable<>();
			hs.put(4, "Harinath");
			hs.put(2, "Krishna");
			hs.put(3, "vishnu");
			hs.put(1, "gopal");

		
			for (Map.Entry m : hs.entrySet()) {
				System.out.println(m.getKey() + ": " + m.getValue());
			}
		}
	}

