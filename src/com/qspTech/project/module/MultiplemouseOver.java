package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiplemouseOver {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com");

		driver.manage().window().maximize();
	
		System.out.println("Application has been Launched");
		
		Thread.sleep(3000);		
		driver.findElement(By.linkText("Menu")).click();
				
		driver.switchTo().frame(0);
	
		Actions act= new Actions(driver);
		
		WebElement music= driver.findElement(By.xpath("//*[@id='ui-id-9']"));
		act.moveToElement(music).perform();

		Thread.sleep(5000);
		
		WebElement jazz= driver.findElement(By.xpath("//*[@id='ui-id-13']"));	
		act.moveToElement(jazz).perform();
		Thread.sleep(5000);
		
		WebElement bigband= driver.findElement(By.xpath("//*[@id='ui-id-15']"));
		act.moveToElement(bigband).perform();
		Thread.sleep(5000);
		
		//driver.quit();
	}
}
