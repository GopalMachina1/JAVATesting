package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoNoopCommerce {
	// number of links and list of links in a web page
	@Test
	public void testNoopCommerce() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/computers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li"));
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));
		System.out.println(li.size());
		for (WebElement we : li) {
			System.out.println(we.getText());
			// finding all available links on the web page
			//List<WebElement> links = driver.findElements(By.tagName("a"));
			//int count = links.size();
			//System.out.println("number of links:" + count);

			//for (WebElement Link : links) {
				//String link = Link.getAttribute("href");
			//	System.out.println(link);
			}
		
	
	}
 @Test
 public void testNooptest() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/electronics");
		Thread.sleep(3000);
 }
}
