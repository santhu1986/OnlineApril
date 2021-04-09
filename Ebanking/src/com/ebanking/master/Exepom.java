package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom
{
    @Test
	public void Exe()
	{
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://122.175.8.158/ranford2");
	
    	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.login();
    
	AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
	AHP.Br();
	
	}
}
