package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTcs {
	@Test
	public void testTcs() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ibegin.tcs.com/iBegin/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@data-ng-click='openSavedJobs()']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebElement Jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
	    Jobtitle.sendKeys("java");    	
	   WebElement JobLocation=driver.findElement(By.xpath("//input[@data-ng-model='JobFilterInput.location']"));
	   JobLocation.sendKeys("Bangalore");
	   WebElement FunctionKey=driver.findElement(By.xpath("//button[@id='single-button-1']"));
	  FunctionKey.click();
	  driver.findElement(By.xpath("//span[@data-ng-bind='Experience.expName']")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-primary-mine']")).click() ; 
	}

}
