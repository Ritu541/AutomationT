package com.build.QSP_MavenClasses;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class TestHashTable {
	
	public static ExcelReader read = new ExcelReader ("C:\\Users\\pc\\Desktop\\Master_Sheet.xlsx");
	
  @Test
  public void Datafromexcel() {
	  
	  Hashtable<String, String> Hash = new Hashtable<String, String> () ;
	  
	  Hash.put("First_Name", "Rahul");
	  Hash.put("Last_Name", "Ganjare");
	  Hash.put("Address", "pune");
	  Hash.put("Phone_Numer", "'9850658748");
	  Hash.put("Email_ID", "test.test1234@gmail.com");
	  
	  System.out.println("print all hashtable :- **********" + Hash);
	  
	  // to take out data from excel
	 System.out.println(Hash.get("First_Name"));
	 System.out.println(Hash.get("Last_Name"));
	 System.out.println(Hash.get("Address"));
	 System.out.println(Hash.get("Phone_Numer"));
	 System.out.println(Hash.get("Email_ID"));
  }
}
