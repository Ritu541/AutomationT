package com.qspTech.project.module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MynewGmailTestNG {
	
	static WebDriver driver;
	Properties config= new Properties();
	Properties OR = new Properties();
	
	@BeforeMethod
		public void launchedbrowser() throws IOException, Exception {
			
			FileInputStream f1= new FileInputStream("C:\\\\Program Files (x86)\\\\NewSelenium\\\\eclipse-java-oxygen-3a-win32-x86_64\\\\eclipse\\\\AutomationTesting\\\\src\\\\com\\\\qspTech\\\\project\\\\module\\\\config.properties");
			config.load(f1);
				
			FileInputStream f2= new FileInputStream("C:\\\\Program Files (x86)\\\\NewSelenium\\\\eclipse-java-oxygen-3a-win32-x86_64\\\\eclipse\\\\AutomationTesting\\\\src\\\\com\\\\qspTech\\\\project\\\\module\\\\or.properties");
			OR.load(f2);
				
			System.out.println("properties has been loaded");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
				
			if (config.getProperty("browser").equalsIgnoreCase("chrome"))	{
				driver = new ChromeDriver();
				}
				else if (config.getProperty("browser").equalsIgnoreCase("firefox"))	{
				driver = new FirefoxDriver();
				}
				else if(config.getProperty("browser").equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
				}
				Thread.sleep(5000);
				driver.get(config.getProperty("ApplicationURL"));
				System.out.println("aapplication has been launched");
	}
				
	@Test
	public void Testlogin1() {
		driver.findElement(By.xpath(OR.getProperty("Expath"))).sendKeys(config.getProperty("Email"));
		System.out.println("enter email add.");
	  }
} 