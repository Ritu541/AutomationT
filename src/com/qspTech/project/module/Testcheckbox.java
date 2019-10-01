package com.qspTech.project.module;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		System.out.println("URL :- http://www.tizag.com/htmlT/htmlcheckboxes.php has been launched");
		
		driver.findElement(By.xpath("//input[@name='sports']")).click();
		
	//WebElement sports= driver.findElement(By.xpath("//input[@name='sports']"));
		
		/*List<WebElement> sports = driver.findElements(By.xpath("//input[@name='sports']"));
		System.out.println("Total sports Avilable are :-" +sports.size());
		
		for (WebElement spt: sports)
		{	
		spt.click();
		}*/
		
		WebElement block= driver.findElement(By.xpath("//*[@class='display'][1]"));
		
		List<WebElement> pageLink= block.findElements(By.tagName("input"));
		
		//System.out.println("Total number of elements in dropdowns are :-" + pageLink.size());
		
		for (WebElement list:pageLink){
			list.click();
		System.out.println("**************************************");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
