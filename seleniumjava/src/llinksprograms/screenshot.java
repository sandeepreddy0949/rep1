package llinksprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cisco.com");
		
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("D:\\seleliumjava\\seleniumjava\\src\\screenshot\\ops.png"));
		

	}

}
