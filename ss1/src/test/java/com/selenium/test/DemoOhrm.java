package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoOhrm {
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void testOrangeHrm() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		Thread.sleep(3000);
}
}