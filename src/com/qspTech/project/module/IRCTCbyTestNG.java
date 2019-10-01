package com.qspTech.project.module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class IRCTCbyTestNG {
	
	static WebDriver driver;
	Properties config = new Properties();
	Properties or = new Properties();
	
  @Test
  public void DynamicXpath () {
	  
	  driver.get(config.getProperty("ApplicationURl4")); 
	  System.out.println("application has been launched");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	 // List<WebElement> suggestion = driver.findElements(By.xpath(or.getProperty(key)))
	  
	  driver.findElement(By.xpath(or.getProperty("from"))).sendKeys(config.getProperty("from4"));
	  driver.findElement(By.xpath(or.getProperty("to"))).sendKeys(config.getProperty("to4"));
	  
	  driver.findElement(By.xpath(or.getProperty("findtrians"))).click();

	 // driver.findElement(By.xpath(OR.getProperty("expath3"))).sendKeys(config.getProperty("email3"));
	 // driver.findElement(By.xpath(OR.getProperty("pwxpath3"))).sendKeys(config.getProperty("password3"));
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  FileInputStream fil1 = new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\config.properties");
	  config.load(fil1);
	  
	  FileInputStream fil2= new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\or.properties");
	  or.load(fil2);
	  
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
