package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_mouseover_action {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	driver= new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	Thread.sleep(3000);
	/*System.out.println("driver has been launched");
	
	driver.findElement(By.id("email")).sendKeys("ritutiwari917.rt@gmail.com");
	Thread.sleep(2000);
	System.out.println("email has been entered");
	
	driver.findElement(By.id("passwd")).sendKeys("Ritu1");
	Thread.sleep(3000);
	System.out.println("password has been entered");
	
	driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
	System.out.println("login button has been clicked");*/
	
	Actions act = new Actions(driver);
	
	Thread.sleep(3000);
	act.moveToElement(driver.findElement(By.linkText("Dresses"))).build().perform();
	
	Thread.sleep(2000);
	}
}
