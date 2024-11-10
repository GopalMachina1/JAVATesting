package com.selenium.test;

import org.testng.annotations.Test;

public class DemoGroups {
@Test(groups="smoke")
public void testCflow() {
System.out.println("create user");
}
@Test
public void testEditflow() {
	System.out.println("edit user flow");
}
@Test(groups="smoke")
public void testDflow() {
	System.out.println("delete user flow");
}
public void testCreate_leave() {
	System.out.println("create leave flow");
}
@Test
public void testRejectflow() {
	System.out.println("Reject leave flow");
}
}
