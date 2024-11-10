package com.javaprogramms.friday;

public class DemoPolyOverridingChild extends DemoPolyOverriding {
	public void testpoly(int id,String name,String Cname) {
		System.out.println("my name is"  +name);

		System.out.println("my College name is" +Cname);

		System.out.println("my identification number is "+id);
	}
public static void main(String[] args) {
	DemoPolyOverridingChild doc=new DemoPolyOverridingChild();
	doc.testpoly(1234, "vishnupriya","velankanni");
	
	DemoPolyOverriding doc1=new DemoPolyOverriding();
	doc1.testpoly(567,"Jyothi", "sri sai");	
	DemoPolyOverriding doc2=new DemoPolyOverridingChild();
	doc2.testpoly(7890, "venugopal", "Sri sai degree");

			
}
}
