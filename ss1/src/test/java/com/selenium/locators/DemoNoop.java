package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoNoop {
	@Test
	public void testNopCommerce() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		// List<String>expTabNames=new ArrayList<>(Arrays.asList("Computers",
		// "Electronics", "Apparel", "Digitaldownloads", "Books", "Jewelry",
		// "Giftcards"));)
		WebElement listTabNames = driver.findElement(By.xpath("//div[@class='header-menu']"));
		Boolean x = listTabNames.isDisplayed();
		Thread.sleep(3000);
		System.out.println(x);
		String s = listTabNames.getText();
		System.out.println(s);
		Thread.sleep(3000);
		}

}
