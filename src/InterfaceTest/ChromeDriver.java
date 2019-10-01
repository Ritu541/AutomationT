package InterfaceTest;

public class ChromeDriver implements WebDriver {
		
	// methods and body of structure 
	public void get(String URL) {
		
		System.out.println("chromeDriver:- application has been launched" + URL);
	}
	
	public void gettitle() {
		
		System.out.println("chromeDriver:- application has been launched");
	}
	
	public void click() {
		
		System.out.println("chromeDriver:- button has been clicked");
	}
	
	public void sendkeys(String testData) {
		
		System.out.println("chromeDriver:- value entered in to input text" + testData);
		
	}
}
