package MulitipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mm {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		String s1=driver.getWindowHandle();
		
		System.out.println("first window..............................."+s1);
		driver.findElement(By.linkText("Help")).click();
		
		String s2=driver.getWindowHandle();
		driver.switchTo().window(s2);
		
		System.out.println("second window..............................."+s2);
		driver.findElement(By.linkText("view archived versions")).click();

		
	}

}
