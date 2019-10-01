package com.qspTech.project.module;

import org.testng.annotations.Test;

//import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadingData {
	
//	ExcelReader read1 = new ExcelReader("C:\\Program Files (x86)\\NewSelenium\\eclipse1\\eclipse\\QSP_Maven\\src\\test\\resources\\testData\\Master_Sheet.xlsx");

	@Test (dataProvider = "Data_New")
	public void dataread(Hashtable<String, String > testdata) {
//	read1.addColumn("Test_Data1", "Address");
  }
}
