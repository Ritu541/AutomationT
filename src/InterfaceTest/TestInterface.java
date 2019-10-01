package InterfaceTest;

public class TestInterface  { 
	
	static WebDriver driver, driver1, driver2;
	public static void main(String[] args) {
		
	 driver = new ChromeDriver();
	 driver1 = new FirefoxDriver();
	 driver2 = new InternetExplorerDriver();
	
	 // calling directly all defined signature of method in webdriver
		driver1.get("www.gmail.com");
		driver.gettitle();
		driver.click();
		driver.sendkeys("Rahul");
	}
}
