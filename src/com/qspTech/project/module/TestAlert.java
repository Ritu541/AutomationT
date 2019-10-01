package com.qspTech.project.module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qspTech.project.module.*;

public class TestAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	driver = new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8l, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	System.out.println("enter go and blink alert mssg :-" + driver.switchTo().alert().getText());
	
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	Alert alt= driver.switchTo().alert();
	
	Thread.sleep(5000);
	driver.quit();
		
	
	}

}
