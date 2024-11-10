package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFlights {
	@Test
    public void testfligts() throws InterruptedException  {
		String url="https://www.goibibo.com/mysupport/trips/";
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div/a[@href='travelhistory']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='sc-1f95z5i-43 hEalDp']")).click();
    Thread.sleep(3000);
	}
}