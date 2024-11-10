package com.interfaces.day5;

public class NABSChild extends ABS1 {
//non-abstract child class
	public void dashboardpage() {
	System.out.println("this is from abstract child method");
	}
	public static void main(String[] args) {
		
	NABSChild nc=new NABSChild();
	nc.dashboardpage();
	}
	

}
