package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.flipkart.com");
		
		driver.get("https://jqueryui.com");

		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click()
		
		WebElement Menu = driver.findElement(By.xpath("//*[@class='_1QZ6fC _3Lgyp8'][Text()='Men']"));
		
		act.moveToElement(Menu).perform();
		
		driver.findElement(By.xpath("//*[@tittle='T-Shirts']"));*/
		
		Actions act= new Actions(driver);

		driver.findElement(By.linkText("//*[@href='https://jqueryui.com/menu/']")).click();
		driver.findElement(By.id("menu")).click();

		Thread.sleep(5000);
		
		driver.quit();
	}

}
