package com.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoApollo {
	@Test(enabled=false)
	public void testApollo() {
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.apollopharmacy.in/");
	List<WebElement> li=driver.findElements(By.xpath("//ul[@class='Header_navRoot__zQKG5']"));
	for(WebElement we:li) {
		System.out.println(we.getSize());
		System.out.println(we.getText());
	}
	}

	@Test
	public void testCheckbox() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/shop-by-category/apollo-personal-care");
	    List<WebElement> li1=driver.findElements(By.xpath("//div[@class='PaginatedCategoryListing_clContent__4_05L\']"));
	    for(WebElement we:li1) {
	    	System.out.println(we.getSize());
	    	System.out.println(we.getText());
	    }
	  }
	
}
