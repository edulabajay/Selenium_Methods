package com.edulab;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class Edulabetr {
	@Test
	public void etr() throws InterruptedException {

	
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mu.etranscript.in/app/#/auth/login");
		driver.findElement(By.xpath("/html/body/ngx-app/nb-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/nb-login/div[2]/div[1]/form/div[1]/div[2]/div/input")).sendKeys("ajaybalajikadam69@gmail.com");
		driver.findElement(By.xpath("/html/body/ngx-app/nb-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/nb-login/div[2]/div[1]/form/div[2]/div[2]/div/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/ngx-app/nb-auth/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/nb-login/div[2]/div[1]/form/div[4]/div[2]/button")).click();
		//driver.findElement(By.xpath("//button")).click();
		Thread.sleep(6000);	
		
		driver.get("https://mu.etranscript.in/app/#/pages/dashboard/attestation_page");
		driver.findElement(By.xpath("//button")).click();
		//driver.findElement(By.xpath("/html/body/ngx-app/ngx-pages/ngx-sample-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-new-attestation/nb-card/nb-card-body/div[2]/nb-stepper/div[1]/div[1]/div[1]")).click();                                                                                                                                                      

	
	
		
		// Initialize JS object
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		// Enter username
		JS.executeScript("('User').value='Abha_Rathour'");
		// Enter password
		JS.executeScript("('Password').value='password123'");
		
		
	
	}
 
		
		
	}
	

