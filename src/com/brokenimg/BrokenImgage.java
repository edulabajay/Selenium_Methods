package com.brokenimg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImgage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
	    //driver.get("https://demoqa.com/broken");
		//driver.get("https://raventools.com/site-auditor/");
		driver.get("https://lms.sdbi.in/auth/login");
		//driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());

		for(WebElement image:images) {


			String imagesrc=image.getAttribute("src");
			URL url= new URL (imagesrc);
			HttpURLConnection httpURLConnection1=(HttpURLConnection)url.openConnection();
			httpURLConnection1.setConnectTimeout(5000);
			httpURLConnection1.connect();
			if(httpURLConnection1.getResponseCode() ==200) {
				System.out.println(url+" "+"image is broken");
			}
			else
			{
				System.out.println(url+" "+"image is valid");
			}

		}
	}

}
