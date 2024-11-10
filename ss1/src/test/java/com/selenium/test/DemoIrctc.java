package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoIrctc {
	@Test
	public void testIrctclogin() throws InterruptedException {
		String url = "https://www.irctc.co.in/nget/train-search";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
	}
	
}
