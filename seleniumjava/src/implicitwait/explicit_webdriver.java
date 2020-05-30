package implicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_webdriver {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		
		 WebDriverWait wait=new WebDriverWait(driver,60);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Get Pass']")));
		 

		driver.findElement(By.xpath("//a[text()='Get Pass']")).click();
		
		

	}

}
