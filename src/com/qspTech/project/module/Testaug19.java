package com.qspTech.project.module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Testaug19 {
	static WebDriver driver;
	Properties config= new Properties();
	Properties OR = new Properties();

  @Test (priority = 1)
  public void Registration () throws InterruptedException {
	  
	  Thread.sleep(3000);
		driver.findElement(By.xpath(config.getProperty("newuserclick"))).click();
		System.out.println("hit newuser button");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(OR.getProperty("windowok"))).click();
		Thread.sleep(5000);
		
		Set<String>  next= driver.getWindowHandles();
		
		Iterator<String> itr= next.iterator();
		itr.next();
		
		String secondwindow= itr.next();
		driver.switchTo().window(secondwindow);
		System.out.println("window switch to defalut window");
				
		driver.findElement(By.xpath(config.getProperty("nextbutton"))).click();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
  }
		@Test (priority = 2)
		public void FormFill () throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("accountno."))).sendKeys(config.getProperty("accountno.1"));
		driver.findElement(By.xpath(OR.getProperty("CIFno."))).sendKeys(config.getProperty("CIFnumber1"));
		driver.findElement(By.xpath(OR.getProperty("branchcode"))).sendKeys(config.getProperty("branchcode1"));

	   Thread.sleep(3000);
	   driver.findElement(By.xpath(OR.getProperty("mobilenumber"))).sendKeys(config.getProperty("mobilenumber1"));
	   
	   Thread.sleep(2000);
	   WebElement dropdown1 = driver.findElement(By.xpath(config.getProperty("FacilityRequired1")));
	   Select slt1 = new Select (dropdown1);
	   slt1.selectByValue("Full Transection rights");
	   
	   driver.findElement(By.xpath(OR.getProperty("textenter"))).sendKeys(config.getProperty("textenter1"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(OR.getProperty("submit"))).click();
	   System.out.println("submit the form");
  }
  @BeforeMethod
  
  public void Lanuchedbrowser() throws IOException, InterruptedException {
	  Thread.sleep(2000);
	  driver = new ChromeDriver();
		
	  Properties fi= new Properties();
	  FileInputStream config= new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\config.properties");
	  fi.load(config);
		
	  Properties f2= new Properties();
	  FileInputStream or= new FileInputStream("C:\\Program Files (x86)\\NewSelenium\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\AutomationTesting\\src\\com\\qspTech\\project\\module\\or.properties");
	  f2.load(or);
		
	  System.out.println("properties has been loaded");
	  Thread.sleep(2000);
		
		if (fi.getProperty("browser").equalsIgnoreCase("chrome"))	{
			driver = new ChromeDriver();
			}
			else if (fi.getProperty("browser").equalsIgnoreCase("firefox"))	{
			driver = new FirefoxDriver();
			}
			else if(fi.getProperty("browser").equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
			}
			driver.get(fi.getProperty("applicationURL"));
			System.out.println("Aapplication has been launched");
  }
  @AfterMethod
  public void closeApplication() {
	  driver.close();
  }
}
