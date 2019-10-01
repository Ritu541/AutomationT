package com.qspTech.project.module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class AssignmentTest {
	
	static WebDriver driver;
	Properties config= new Properties();
	Properties OR = new Properties();
	
  @Test (priority = 1)
  public void TestGmailLogin () throws InterruptedException {
	  
	  driver.get(config.getProperty("ApplicationURL"));
	  System.out.println("aapplication has been launched");
	  
	  driver.findElement(By.xpath(OR.getProperty("Expath"))).sendKeys(config.getProperty("Email"));
	  driver.findElement(By.xpath(OR.getProperty("nxtbutton"))).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(OR.getProperty("Pwxpath"))).sendKeys(config.getProperty("Password"));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(OR.getProperty("nxtbutton1"))).click();
  }
  
  @Test (priority = 2)
  public void TestFreeCRM () throws InterruptedException {
	  
	  driver.get(config.getProperty("ApplicationURL1"));
	  System.out.println("application has been launched");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(OR.getProperty("loginbutton"))).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(OR.getProperty("expath"))).sendKeys(config.getProperty("email1"));
	  driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(config.getProperty("password2"));
	  driver.findElement(By.xpath(OR.getProperty("login2"))).click();
  }
  
  @Test (priority = 3)
  public void TestAutomationPractice () throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.get(config.getProperty("AppliationURL3"));
	  System.out.println("application has been launched");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(OR.getProperty("login3"))).click();
	  driver.findElement(By.xpath(OR.getProperty("expath3"))).sendKeys(config.getProperty("email3"));
	  driver.findElement(By.xpath(OR.getProperty("pwxpath3"))).sendKeys(config.getProperty("password3"));
	  driver.findElement(By.xpath(OR.getProperty("login3"))).click();
  }
  
  @BeforeMethod
  public void ApplicationLanched() throws IOException {
	  driver = new ChromeDriver();
		
		FileInputStream file1= new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\config.properties");
		config.load(file1);
		
		FileInputStream file2= new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\or.properties");
		OR.load(file2);
		
		System.out.println("properties has been loaded");
		
		if (config.getProperty("browser").equalsIgnoreCase("chrome"))	{
			driver = new ChromeDriver();
			}
			else if (config.getProperty("browser").equalsIgnoreCase("firefox"))	{
			driver = new FirefoxDriver();
			}
			else if(config.getProperty("browser").equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
			}
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
