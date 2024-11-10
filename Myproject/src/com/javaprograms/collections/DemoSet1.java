package com.javaprograms.collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet1 {
public static void main(String[] args) {
	Set<String> s=new HashSet<String>();
	s.add("venu");
	s.add("venugopal");
	System.out.println(s.size());
	System.out.println(s);
	Set<String> s1=new HashSet<String>();
	s1.add("Ravi");
	s1.add("vishnu");
	//merging two sets into one set
	s.addAll(s1);
	s.remove("venu");
    System.out.println("After merging the set is:"+s);
}
}
