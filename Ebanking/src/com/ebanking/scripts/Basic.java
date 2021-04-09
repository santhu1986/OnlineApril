package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\Desktop\\chromedriver.exe");
		//Launch Firefox
		
		WebDriver driver=new ChromeDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Admin Login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		//Branch Creation
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		//Dropdown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		//Role Creation
		//Employee Creation
		
	}

}
