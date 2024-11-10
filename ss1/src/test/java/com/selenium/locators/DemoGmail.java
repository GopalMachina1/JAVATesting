package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoGmail {

	@Test
	public void testgmaillogin() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://accounts.google.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@type='email']")).sendKeys("gopalmachina@gmail.com");
		Thread.sleep(3000);
	}

}
