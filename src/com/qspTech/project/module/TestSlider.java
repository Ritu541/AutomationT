package com.qspTech.project.module;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.trivago.in/?aDateRange%5Barr%5D=2019-08-30&aDateRange%5Bdep%5D=2019-08-31&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=7497&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=84040%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0&ra=");
		
		System.out.println("Application has been launched");
				
		WebElement slider= driver.findElement(By.xpath("//*[@role='slider'][1]"));
		System.out.println("slider has been moved");

		Actions act= new Actions(driver);
		
		act.dragAndDropBy(slider, 400, 00).perform();
		
		Thread.sleep(5000);
//		driver.quit();
	}
}
