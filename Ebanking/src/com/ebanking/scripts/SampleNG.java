package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{

	WebDriver driver;
	@BeforeMethod
	public void Browserlaunch()
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void OpenApp() throws InterruptedException
	{
		driver.get("http://122.175.8.158/ranford2");
		Thread.sleep(3000);
	}
	@Test
	public void GApp() throws InterruptedException
	{
		driver.get("http://www.google.com");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void CloseApp() 
	{
		driver.close();
	}
	
}
