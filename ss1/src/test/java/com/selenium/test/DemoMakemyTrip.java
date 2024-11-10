package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMakemyTrip {
	String url="https://www.makemytrip.com/";
   WebDriver driver=new ChromeDriver();
   @Test
   public void testMytrip() throws InterruptedException {
	   driver.get(url);
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//a[@class='headerIcons makeFlex hrtlCenter column active']")).click();
	   Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("mumbai");
   }
}
