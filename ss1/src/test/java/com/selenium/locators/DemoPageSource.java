package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoPageSource {

	@Test
	public void testPageSource() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		String str=driver.getPageSource();
		System.out.println(str);
	}
	
}
