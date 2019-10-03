package com.qspTech.project.module;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
	
	static WebDriver driver;	
		
			public static void main(String[] args) throws InterruptedException, AWTException  {
				
				driver  = new ChromeDriver();
				 
				driver.manage().window().maximize();
				
				driver.get("http://gmail.com");	
			   
			    System.out.println("Browser has been launched and user redirected to Application");
							
			    driver.findElement(By.xpath("//*[@id='yDmH0d']")).click();
			    
				//rb.keyPress(KeyEvent.VK_CONTROL); 
				//rb.keyPress(KeyEvent.VK_A);
				
				Robot rb = new Robot();
				  rb.keyPress(KeyEvent.VK_CONTROL); 
				  rb.keyPress(KeyEvent.VK_SHIFT);
				  rb.keyPress(KeyEvent.VK_I);
				  
				  rb.keyRelease(KeyEvent.VK_CONTROL); 
				  rb.keyRelease(KeyEvent.VK_SHIFT);
				  rb.keyRelease(KeyEvent.VK_I);
				
				// driver.findElement(By.xpath("//input[@id='spinner']")).click();
				 
				  Actions act = new Actions(driver);
				  
				// act.contextClick().perform();
				 
				 act.sendKeys(Keys.chord(Keys.CONTROL +"a")).perform();
				 act.sendKeys(Keys.chord(Keys.CONTROL +"c")).perform();
				 
				// driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
				 
				// driver.findElement(By.xpath("//input[@id='spinner']")).click();
				 
				 driver.findElement(By.xpath("//*[@id='identifierId']")).click();
				 
				 act.sendKeys(Keys.chord(Keys.CONTROL +"v")).perform();
				 
			    Thread.sleep(5000);
			     
			    driver.quit();
			}}
