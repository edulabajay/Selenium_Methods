package com.windowhandle;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
 

public class Windowhandle {



	   public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://secure.indeed.com/account/login");

	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	      //window handle of parent window
	      String m = driver.getWindowHandle();
	      driver.findElement(By.id("login-google-button")).click();

	      // store window handles in Set
	      Set<String> w = driver.getWindowHandles();

	      // iterate window handles
	      for (String h: w)
	      {
	         // switching to each window
	         driver.switchTo().window(h);
	         String s= driver.getTitle();

	         // checking specific window title
	         if(s.equalsIgnoreCase("Sign in - Google Accounts"))
	         {
	            System.out.println("Window title to be closed: "+ driver.getTitle());
	            driver.close();
	         }
	      }
	   }
}
