package com.edulab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edulabsdbi {
	WebDriver driver;
@org.testng.annotations.Test
	public void Test() throws InterruptedException {

		driver=new ChromeDriver(); 
		System.setProperty("WebDriver.chrome.driver","C:DRIVER\\\\chromedriver.exe");
		driver.get("https://dev.sdbi.in/pages/calendar");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/ngx-login/div/div[1]/input")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/ngx-login/div/div[2]/input")).sendKeys("bestbook52");
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/ngx-login/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
	    driver.get("https://dev.sdbi.in/pages/dashboard");
       
        driver.findElement(By.xpath("/html/body/ngx-app/ngx-pages/ngx-one-column-layout/nb-layout/div/div/div/nb-sidebar/div/div/nb-menu/ul/li[2]/ul/li[1]/a/span")).click();
        
        
	}
}

