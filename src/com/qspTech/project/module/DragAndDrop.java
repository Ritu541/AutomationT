package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println("Application has been launched");
		
		Thread.sleep(3000);
		
	    driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	    System.out.println("");
		
		WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop= driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
