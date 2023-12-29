package com.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDropDown {
	WebDriver driver;
	@Test
	public void Select() throws Exception {

		driver=new ChromeDriver(); 

		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9062237%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4ayUBhA4EiwATWyBrveCaDhDdnnva2oNRW7XJ8SE_ObZBhmEcuDEj7uJ-xUcmNyAxC4ynxoCrPIQAvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement day=driver.findElement(By.id("day"));
		org.openqa.selenium.support.ui.Select select1=new org.openqa.selenium.support.ui.Select(day);
		//  select1.selectByIndex(16);
		//  select1.selectByValue("17");
		select1.selectByVisibleText("17");

		WebElement month= driver.findElement(By.id("month"));
		org.openqa.selenium.support.ui.Select select2=new org.openqa.selenium.support.ui.Select(month);
		// select2.selectByIndex(3);
		// select2.selectByValue("4");
		select2.selectByVisibleText("Apr");

		WebElement year=driver.findElement(By.id("year"));
		org.openqa.selenium.support.ui.Select select3=new org.openqa.selenium.support.ui.Select(year);
		// select3.selectByIndex(23);
		//select3.selectByValue("1999");
		select3.selectByVisibleText("1999");



		//Get selected  options of the dropdown
		WebElement capturefirst=driver.findElement(By.id("month"));
		org.openqa.selenium.support.ui.Select select4=new org.openqa.selenium.support.ui.Select(capturefirst);
		//select4.getFirstSelectedOption();
		List<WebElement> selectedOptions=select4.getOptions();

	}	
}
