package InterfaceTest;

public class FirefoxDriver implements WebDriver {
		
	public void get(String URL) {
		
		System.out.println("FirefoxDriver:- application has been launched");
		
	}
	
	public void gettitle() {
		
		System.out.println("FirefoxDriver:- application has been launched");
		
	}
	
	public void click() {
		
		System.out.println("FirefoxDriver:- button has been clicked");
		
	}
	
	public void sendkeys(String testData) {
		
		System.out.println("FirefoxDriver:- value entered in to input text" + testData);
	}
}
