package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoIiit {
@Test
public void testIiit(){
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.iiit.ac.in/#");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	WebElement we=driver.findElement(By.xpath("//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-background e--animation-fade']"));
}

}
