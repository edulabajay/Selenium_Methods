package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Practice {

@Test
public void teat() throws IOException {
		
		System.setProperty("wedriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://edulablms.com/login");
		//driver.manage().window().maximize();
		
		TakesScreenshot src=(TakesScreenshot) driver;
		
		File filesrc = src.getScreenshotAs(OutputType.FILE);
		
	   // Files.copy(filesrc, new File("C:EDULAB"));
		
		
		
	}


}