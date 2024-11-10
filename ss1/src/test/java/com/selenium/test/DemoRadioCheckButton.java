package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoRadioCheckButton {
	@Test
	public void testradiocheckbox() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// create new account button
		driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_0')]")).click();
		Thread.sleep(3000);
		// create female radio button
		boolean result = driver.findElement(By.xpath("//input[starts-with(@id, 'u_2_4')]")).isSelected();
		Thread.sleep(3000);

		System.out.println(result);
	}

}
