package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFacebook {

	@Test
	public void testfb() throws InterruptedException {
		WebDriver driver= new ChromeDriver() ;
		driver.get("https://www.facebook.com/reg/");
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		 fname.sendKeys("venugopal");
		 WebElement Sname=driver.findElement(By.xpath( "//input[@name='lastname']"));
	     Sname.sendKeys("machina");	
	     WebElement Birthday=driver.findElement(By.xpath("//select[@id='day']"));
	     Thread.sleep(3000);
	     Birthday.sendKeys("8");
	     WebElement BirthMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	     BirthMonth.sendKeys("Nov");
	     WebElement BirthYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	     BirthYear.sendKeys("1981");
	     Thread.sleep(2000);
	     WebElement FemaleRadioBtn=driver.findElement(By.xpath("//span[@data-type='radio']//input[@value='1']"));
	     Thread.sleep(2000);
	     FemaleRadioBtn.click();
	     WebElement MaleRadioBtn=driver.findElement(By.xpath("//span[@data-type='radio']//input[@value='2']"));
	     MaleRadioBtn.click();
	     WebElement CustomRadioBtn=driver.findElement(By.xpath("//span[@data-type='radio']//input[@value='-1']"));
	     CustomRadioBtn.click();
	     WebElement MobileNo=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	     MobileNo.sendKeys("9652887734");
	     WebElement PassWord=driver.findElement(By.xpath("//input[@data-type='password']"));
	     PassWord.sendKeys("Jyothi@123");
	     driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	     Thread.sleep(2000);
	     
	}
	
}
