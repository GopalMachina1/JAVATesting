package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoCheckbox {
	WebDriver driver;

	@Test
	public void testapollo() throws InterruptedException {
		String url = "https://www.apollopharmacy.in/search-medicines/Pediasure ";
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		WebElement category_checkbox = driver
				.findElement(By.xpath("//div[@class='FilterSelectOption_subList__UUmCL']//input[@id='ANTACID']"));
		category_checkbox.click();
		Thread.sleep(2000);
		boolean result = category_checkbox.isSelected();
		Thread.sleep(3000);
		System.out.println(result);
	}
}
