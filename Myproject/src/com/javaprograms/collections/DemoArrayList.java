package com.javaprograms.collections;

import java.util.ArrayList;

public class DemoArrayList {
		public static void main(String[] args) {			
			ArrayList<String> al = new ArrayList<>();
			al.add("Mounika");
			al.add("laxmi");
			al.add("laxmi1");
			System.out.println("size of the list is:" +al.size());
			
		for (String string : al) {
				System.out.println(string);		}

}
}