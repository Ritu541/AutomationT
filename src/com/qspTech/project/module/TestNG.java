package com.qspTech.project.module;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	
	public static void openURl()
	
	{
		System.out.println("Application has been opened");
	}
	

	@Test
	
	public static void logintogmail() 
	
	{
		System.out.println("code to login into application");
	}
	
	@Test
	
	public static void draftmail()
	{
		System.out.println("code has been drafted");
	}

	@Test
	
	public static void sendingmail()
	{
		System.out.println("Massge has been sent");
	}

	@AfterTest
	
	public static void CloseBrowser()
	{
		
		System.out.println("Application has been closed");
	}
	
}
