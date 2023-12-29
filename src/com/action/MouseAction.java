package com.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseAction {
	WebDriver driver;
@org.testng.annotations.Test
	public void Test() throws InterruptedException {

		driver=new ChromeDriver(); 
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
		//driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement element=driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']"));

		//Actions action=new Actions(driver);
		//action.moveToElement(element).click().build().perform();;	
	
}
}
