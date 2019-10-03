package Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	
	public static ExtentReports extent;
	public static ExtentTest test;

	public static ExcelReader reading  = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Master_Sheet.xlsx");

	public static String testCaseName;
	public static Hashtable <String, String> testCaseRunMode = new Hashtable<String, String>();
	
	 @BeforeSuite 
	 public void Launchedbrowser() throws IOException, Exception {
		FileInputStream f1= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
		config.load(f1);
		System.out.println("config has been loaded");
		
		FileInputStream f2= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\or.properties");
		OR.load(f2);
		System.out.println("OR has been loaded");	
			
		String TimeStamp = new SimpleDateFormat("yy.MM.DD.mm.ss").format(new Date());
		extent = new ExtentReports(System.getProperty("user.dir")+ "\\src\\test\\resources\\ExecutionReport\\"+TimeStamp +".html");
		
		loadHashTable(testCaseRunMode, "Test_Cases", "TestCaseName", "Run_Mode");
	 }	
	//@BeforeMethod
	 	public static void Loadingfiles() {
		if (config.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if (config.getProperty("browser").equalsIgnoreCase("firefox"))	{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
			else if(config.getProperty("browser").equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.IEDriverServer.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			test = extent.startTest(testCaseName);
			
			driver.get(config.getProperty("ApplicationURL")); // dynamic
			
			test.log(LogStatus.INFO, "Browser has been launched and user redirected to Application URL :-" + config.getProperty("ApplicationURL"));
			
			}
	//@AfterMethod
		public void closeBrowser() throws InterruptedException {			
	     Thread.sleep(2000);
			driver.quit();	
			}
		
	@AfterSuite (alwaysRun = true)
		public static void writeIntoExtentReport() throws InterruptedException {		
			extent.endTest(test);
			extent.flush();
		}
		
		public static void takeScreenShot() throws IOException {
			
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
						+ "\\src\\test\\resources\\screenShots\\screnshot_"+timeStamp+ ".png";
				
				File destFile = new File(reportDirectory);
				
				FileHandler.copy(scrFile, destFile);
				
				test.log(LogStatus.PASS, test.addScreenCapture(reportDirectory));
		}
		
		public static void loadHashTable(Hashtable<String, String> testCaseRunMode, String SheetName, String KeyCol, String valueCol)
		{
				int row = reading.getRowCount(SheetName);
				
				for(int i= 2; i<=row; i++)
				{
					String key = reading.getCellData(SheetName, KeyCol, i);	
					String val = reading.getCellData(SheetName, valueCol, i);
					testCaseRunMode.put(key, val);		
				}		
				System.out.println(testCaseRunMode);	
			}
			
		public static boolean isExecutable(String TC_name) {
			 testCaseName = TC_name;
				if(testCaseRunMode.get(testCaseName).equalsIgnoreCase("Y")) {
					//skip="No" ;
					return true;	
					} else {
			    	//skip="Yes" ;
				   return false;
			    }	
		} 
	 	 
		 @DataProvider 	
		public static Object[][] Data_Collections() {
				
				//DataCollection dc = new DataCollection(reading, "Test_Data", "TC001_Create_an_Account");
				DataCollection dc = new DataCollection(reading, "Test_Data", testCaseName);
				return dc.dataArray();
		  }
		 
		public static void PasslogStatus (String message) throws IOException 
		{
			test.log(LogStatus.PASS, message);
			takeScreenShot();
		}
		
		public static void FaillogStatus (String message) throws IOException 
		{
			test.log(LogStatus.FAIL, message);
			takeScreenShot();
		}
}
