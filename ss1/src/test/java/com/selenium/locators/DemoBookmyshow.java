package com.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoBookmyshow {
	@Test(enabled=false)
	public void testbookmyshow(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/c/stream");
		List<WebElement> li= driver.findElements(By.xpath("//div[@class='bwc__sc-1shzs91-1 ehingX']/a"));
	    System.out.println(li.size());
	
	for(WebElement we:li) {
		System.out.println(we.getText());
	}
	}
	
	@Test
	public void testmovies() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/movies-hyderabad");
	WebElement we=driver.findElement(By.xpath("//a[@class='bwc__sc-1shzs91-0 jRepsH']"));

	we.click();
}
	}
}