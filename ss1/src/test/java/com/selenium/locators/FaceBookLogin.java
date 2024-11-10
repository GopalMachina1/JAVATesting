package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FaceBookLogin {

	@Test
	public void testFbLoginpage() throws InterruptedException {
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Venugopal Machina");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Jyothi@123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

}
