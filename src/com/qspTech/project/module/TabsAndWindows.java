package com.qspTech.project.module;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver= new ChromeDriver();
		
		driver.get("https://www.online.citibank.co.in");
		System.out.println("APPLICATION HAS BEEN lAUNCED");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.id("vizury-notification-template")));
		System.out.println("driver has been swithced to frame");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='div-close']")).click();
		System.out.println("driver has been closed");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.className("txtSign")).click();
		
		Set<String>  windows= driver.getWindowHandles();
		Iterator<String> itr= windows.iterator();
		
		String firstwindow= itr.next();
		System.out.println("Id of my first window :- " + firstwindow );
		
		String secondwindow= itr.next();
		System.out.println("Id of second window" + secondwindow);
		
		driver.switchTo().window(secondwindow);
		driver.findElement(By.id("User_Id")).sendKeys("ritu12345567"); // to enter input
		
		//driver.close();
		driver.switchTo().window(firstwindow);
		System.out.println("window switch to defalut window");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@tittle='NRI Banking']")).click();		
		
		windows= driver.getWindowHandles();
		itr= windows.iterator();
		itr.next(); //0th window
		itr.next(); // 1st window
		String thiredwindow = itr.next(); // 2nd window
		
		System.out.println("Id of my third window :- " + thiredwindow);
		
		driver.switchTo().window(thiredwindow);
		
		driver.findElement(By.xpath("//*[@tittle='Login'][1]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("driver has been closed");
	}

}
