package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lib
{
   public static WebDriver driver;
  
	public void OpenApp(String Url) 
	{
		 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Url);

	}
	
	public void Login(String Un,String Pwd)
	{
			//Login
			
			driver.findElement(By.id("username")).sendKeys(Un);
			driver.findElement(By.id("password")).sendKeys(Pwd);
			driver.findElement(By.id("login")).click();
	
	}
	
	
	
	//Search
	public void SearchHotel(String Loc,String Hotel,String Rtyp) throws InterruptedException
	{
		
			new Select(driver.findElement(By.xpath("//*[@id=\"location\"]"))).selectByVisibleText(Loc);
			new Select(driver.findElement(By.xpath("//*[@id=\"hotels\"]"))).selectByVisibleText(Hotel);
			new Select(driver.findElement(By.id("room_type"))).selectByVisibleText(Rtyp);
			new Select(driver.findElement(By.xpath("//*[@id=\"room_nos\"]"))).selectByIndex(2);
			
			new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
			new Select(driver.findElement(By.id("child_room"))).selectByIndex(1);
			driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
			
			
			Thread.sleep(3000);
			
	}
	
	public void Selecthotel()
	{
		
			driver.findElement(By.id("radiobutton_0")).click();
			driver.findElement(By.id("continue")).click();
	}
	
	public void Bookhotel() throws InterruptedException
	{
		
	
			driver.findElement(By.id("first_name")).sendKeys("Sanjay");
			driver.findElement(By.id("last_name")).sendKeys("Kumar");
			driver.findElement(By.id("address")).sendKeys("Sydney");
			
			driver.findElement(By.id("cc_num")).sendKeys("1234123412341234");
			new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
			new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("March");
			new Select(driver.findElement(By.name("cc_exp_year"))).selectByVisibleText("2022");
			driver.findElement(By.id("cc_cvv")).sendKeys("123");
			
			driver.findElement(By.id("book_now")).click();
			
			Thread.sleep(3000);
	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(5000);
			driver.findElement(By.id("my_itinerary")).click();
             
			
	}
	
	public void ChangePwd() 
	{
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click();
	driver.findElement(By.xpath("//*[@id=\"current_pass\"]")).sendKeys("Kumar@");
	driver.findElement(By.id("new_password")).sendKeys("Kum@r@");
	driver.findElement(By.id("re_password")).sendKeys("Kum@r@");
	driver.findElement(By.id("Submit")).click();
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
	}
	
	public void Appclose() 
	{
	driver.close();	
	}
}
