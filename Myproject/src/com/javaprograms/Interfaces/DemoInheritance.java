package com.javaprograms.Interfaces;

import com.javaprograms.inheritance.Child;
import com.javaprograms.inheritance.GrandChild;
import com.javaprograms.inheritance.Parent;

public class DemoInheritance {
	public static void main(String[] args) {
		Parent pp=new Parent();
		pp.test(43,"venu");
		Child cc=new Child();
		
		cc.test2("Vishnu",3);
		GrandChild gc=new GrandChild();
		gc.test1("Jyothi",5000.45);
	}

}
