package com.qspTech.project.module;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testgettitle {

static	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {

		Assert.assertEquals("ritu", "ritu");
		
		String actual = "ritu";
		String expected = "ritu";
//		Set<String> //  set is a collection which has no duplicates
//		Iterator<String> // to repeat a process or a multiple windows we use it to pic one by one 
		System.out.println("both are eqals");
		
	int	actual1=5+6;
			
	int expected1= 11;
		Assert.assertEquals(actual1, expected1);
		
		System.out.println("11 has been printed");
		
		
//		driver.get("https://mail.google.com/mail/");
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String verify =driver.getTitle();
		
//		String expected3 = "Gmail";
		String expected4= "Home page timeanddate.com";
		
		Assert.assertEquals(verify, expected4);
		
		System.out.println("application has been launched");
				
				
	}

	
	
}
