package com.qspTech.project.module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_noOfLinks_button_inputs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
	List<WebElement> links= driver.findElements(By.tagName("a"));
//	List<WebElement> inputs = driver.findElements(By.tagName("input"));
//	List<WebElement> button = driver.findElements(By.tagName("button"));
	
	System.out.println("number of links avilable on page :-" +links.size());
//	System.out.println("number of input text available on page :-" +inputs.size());
//	System.out.println("Number of buttons available on the page :-" +button.size());
	
	for (int i=0; i<links.size(); i++ ) {
	String linktext	= links.get(i).getText();
	System.out.println(linktext);
	}
	
	}
}
