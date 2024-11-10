package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoRadioCheckBox {

	@Test
	public void testRadioCheckBox() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[@data-type='radio']"));
	}
}
