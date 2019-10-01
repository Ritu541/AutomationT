package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestDropdown {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	driver.get("https://www.wikipedia.org");	
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='family']"));
	
	driver.findElement(By.xpath("//*[@class='sprite svg-search-icon']"));
	
	driver.quit();
	}

}
