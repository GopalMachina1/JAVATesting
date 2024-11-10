package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBookmyshow {
	@Test
    public void testmyshow() throws InterruptedException {
    String url="https://in.bookmyshow.com/explore/home/hyderabad";
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div/a[@href='/explore/movies-hyderabad']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div/a[@href='/explore/c/stream']")).click();
    driver.findElement(By.xpath("//div/a[@href='/explore/events-hyderabad']")).click();
    Thread.sleep(3000);
	driver.findElement(By.xpath("//div/a[@href='/explore/plays-hyderabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div/a[@href='/explore/sports-hyderabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div/a[@href='/explore/activities-hyderabad']")).click();
	}
}