package com.qspTech.project.module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BillPay2019 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.onlinesbi.com/");
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='sm-1567574702319332-22']"))).perform();

	}

}
