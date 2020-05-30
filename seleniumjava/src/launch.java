import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launch {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("veerati.monika@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("monika@12345");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		

	}

}
