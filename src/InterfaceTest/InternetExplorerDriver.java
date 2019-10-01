package InterfaceTest;

public class InternetExplorerDriver implements WebDriver {
	
public void get(String URL) {
		
		System.out.println("InternetExplorerDriver:- application has been launched");
	}
	
	public void gettitle() {
		
		System.out.println("InternetExplorerDriver:- getting title of the application page");
	}
	
	public void click() {
		
		System.out.println("InternetExplorerDriver:- button has been clicked");
	}
	
	public void sendkeys(String testData) {
		
		System.out.println("InternetExplorerDriver:- value entered in to input text" + testData);
	}
}