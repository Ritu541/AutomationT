package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/spinner/");
		
		driver.manage().window().maximize();

		System.out.println("Application has been launched");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			
		Actions right= new Actions(driver); // driver can not perform action directly
		
		// we have to pass webelement ref. into right ref of action 
		
		WebElement ele=	driver.findElement(By.xpath("//input[@id='spinner']"));
	
		ele.click();
		Thread.sleep(2000);
		
		right.contextClick(ele).perform();
		
		Thread.sleep(5000);
		//driver.quit();
	}

}
