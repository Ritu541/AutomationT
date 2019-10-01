package com.qspTech.project.module;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// If We do have frame Id then use only for loop 
	public class Frams {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
				
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_validation_number");
		
		driver.manage().window().maximize();
		
		System.out.println("https://www.w3schools.com/js/tryit.asp?filename=tryjs_validation_number has been launched");
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
	
		List<WebElement> listframe = driver.findElements(By.tagName("iframe"));
		
		for (WebElement frm : listframe ){
			
			System.out.println("List of frames :-" + listframe.size());
		}
		}
}
