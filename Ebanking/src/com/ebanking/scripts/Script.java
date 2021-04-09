package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

	
		//Login
		
		driver.findElement(By.id("username")).sendKeys("sanjay2021");
		driver.findElement(By.id("password")).sendKeys("Kumar@");
		driver.findElement(By.id("login")).click();
		
		//Search
		
		new Select(driver.findElement(By.xpath("//*[@id=\"location\"]"))).selectByVisibleText("Sydney");
		new Select(driver.findElement(By.xpath("//*[@id=\"hotels\"]"))).selectByVisibleText("Hotel Creek");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Double");
		new Select(driver.findElement(By.xpath("//*[@id=\"room_nos\"]"))).selectByIndex(2);
		
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
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
		driver.findElement(By.id("my_itinerary")).click();
		
	}

}
