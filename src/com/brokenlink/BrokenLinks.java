package com.brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		driver.get("https://raventools.com/site-auditor/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.tagName("a")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+links.size());
		
		
		for(int i=0;i<links.size();i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			linksstory(url);
		}

	}

	public static void linksstory(String linkurl) {
		// TODO Auto-generated method stub

		try
		{
			URL url=new URL(linkurl);
			HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();

			if(httpURLConnection.getResponseCode()>=400)
			{
				System.out.println(httpURLConnection.getResponseMessage()+"is a broken link");;

			}

			else
			
			{		

				System.out.println(httpURLConnection.getResponseMessage());
			}

		}

		catch(Exception e) {

		}

	}

}
