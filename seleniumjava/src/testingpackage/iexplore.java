package testingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iexplore {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.gmail.com");

	}

}
