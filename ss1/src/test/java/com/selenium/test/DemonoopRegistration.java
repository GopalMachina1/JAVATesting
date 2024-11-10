package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemonoopRegistration {
	@Test
	public void testNoopReg() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fdigital-downloads");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("venugopal");
		driver.findElement(By.id("LastName")).sendKeys("machina");
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	    driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
	    driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
	    driver.findElement(By.id("Email")).sendKeys("gopalmachina@gmail.com");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jyothi@123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Jyothi@123");
	    driver.findElement(By.name("register-button")).click() ;
	}
	}