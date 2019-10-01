package com.qspTech.project.module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_gmail {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties fi= new Properties();
		FileInputStream config= new FileInputStream("C:\\EclipseData\\AutomationTesting\\src\\com\\qspTech\\project\\module\\config.properties");
		fi.load(config);
		
		Properties f2= new Properties();
		FileInputStream or= new FileInputStream("C:\\EclipseData\\AutomationTesting\\src\\com\\qspTech\\project\\module\\or.properties");
		f2.load(or);
		
		System.out.println("properties has been loaded");
		
		if (fi.getProperty("browser").equalsIgnoreCase("chrome"))	{
		driver = new ChromeDriver();
		}
		else if (fi.getProperty("browser").equalsIgnoreCase("firefox"))	{
		driver = new FirefoxDriver();
		}
		else if(fi.getProperty("browser").equalsIgnoreCase("IE")) {
		driver = new InternetExplorerDriver();
		}
		driver.get(fi.getProperty("ApplicationURL"));
		System.out.println("happlication has been launched");
		
		driver.findElement(By.xpath(f2.getProperty("Expath"))).sendKeys(fi.getProperty("Email"));
		System.out.println("enter email add.");
		
		driver.findElement(By.xpath(f2.getProperty("nxtbutton"))).click();
		System.out.println("hit the next button");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(f2.getProperty("Pwxpath"))).sendKeys(fi.getProperty("Password"));
		System.out.println("it should be enter password");
		
		driver.findElement(By.xpath(f2.getProperty("nxtbutton1"))).click();
		System.out.println("it has been loged in");
	}
}
