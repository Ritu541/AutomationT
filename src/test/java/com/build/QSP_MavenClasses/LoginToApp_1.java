package com.build.QSP_MavenClasses;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Testbase.TestBase;

public class LoginToApp_1 extends TestBase {
	
	@Test (dataProvider = "Data_Collections")
	public void login(Hashtable<String, String > testData) {
		
		test= extent.startTest("login");

		driver.findElement(By.xpath(OR.getProperty("signin3"))).click();
		test.log(LogStatus.PASS, "signin3 has been clicked");
			
		driver.findElement(By.xpath(OR.getProperty("Inputbox"))).sendKeys(testData.get("Email_ID"));
		test.log(LogStatus.PASS, "Inputbox has been entered");	
	}
	/*@Test
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("signin3"))).click();
		driver.findElement(By.xpath(OR.getProperty("Inputbox"))).sendKeys(config.getProperty("email3"));
	}*/
}
