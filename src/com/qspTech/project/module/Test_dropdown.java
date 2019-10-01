package com.qspTech.project.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_dropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	driver= new ChromeDriver();
	
//	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.get("https://www.facebook.com");
	
//	driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']")).click();
//	Select sel =new Select(driver.findElement(By.xpath("//a[contains(text(), 'Accra')]")));
//	sel.selectByIndex(0);
	
	Select selecetDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
	Select slelectYear= new Select(driver.findElement(By.xpath("//select[@id='year']")));
	
	selecetDay.selectByVisibleText("6");
	selectMonth.selectByValue("9");
	slelectYear.selectByIndex(28);
	
	System.out.println("enter my birthday date time and year");
	
	Thread.sleep(4000);
	
	driver.quit();
	}

}
