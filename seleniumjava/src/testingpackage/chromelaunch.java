package testingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class chromelaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\TESTING VIDEOS\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		
		dri.get("http://bing.com");
		String var=dri.getTitle();
		System.out.println(var);
	//	String var1=dri.getCurrentUrl("http://google.com");
	//	System.out.println(var1);
		
	}

}
