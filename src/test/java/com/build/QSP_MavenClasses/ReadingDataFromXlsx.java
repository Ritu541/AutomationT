package com.build.QSP_MavenClasses;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class ReadingDataFromXlsx {
	
public static ExcelReader reading  = new ExcelReader("C:\\Users\\pc\\Desktop\\Master_Sheet.xlsx");
	
	@Test (dataProvider = "Data_Collections")
	public void readingDatafromXlsFile(Hashtable <String, String> htdata) {
		
		//reading.addSheet("TestSheet1234");
		
		//excel.removeSheet("TestSheet1234");
		
		//excel.addColumn("Test_Cases", "Comments");
		
		//System.out.println(excel.isSheetExist("Test_Cases"));
		
		//System.out.println(reading.getCellData("Test_Cases", 1, 4));
		
		//System.out.println(excel.getCellData("Test_Cases", 2, 6));
		
		//excel.setCellData("Test_Cases", "Comments", 4, "Good Work");
		
		//excel.setCellData("Test_Cases", "Comments", 3, "Good Job");
		
		//excel.getCellData(sheetName, colNum, rowNum)
		
		System.out.println("Getting data from xlsx using DataProvider" + htdata.get("First_Name"));
	}
	
	 @DataProvider 	
		public static Object[][] Data_Collections() {
			
			//DataCollection dc = new DataCollection(reading, "Test_Data", "TC001_Create_an_Account");
			DataCollection dc = new DataCollection(reading, "Test_Data", "TC001_Create_an_Account2222");

			return dc.dataArray();
			// Hash Table		
		}	
	
	@Test
	public void hashTable() {
		Hashtable<String, String > htdata = new Hashtable<String, String>();
		htdata.put("FirstName", "Rahul");
		htdata.put("FirstName1", "Dhanshree");
		htdata.put("FirstName2", "Rabiya");
		htdata.put("FirstName3", "Praveen");
		htdata.put("FirstName4", "Prashant");
		htdata.put("FirstName5", "Man-singh");
		htdata.put("FirstName6", "Nehesh");
		
		System.out.println(htdata.get("FirstName3"));
		System.out.println(htdata.get("FirstName2"));
		System.out.println(htdata.get("FirstName4"));
		System.out.println(htdata.get("FirstName1"));
		System.out.println(htdata.get("FirstName5"));
   }
}
