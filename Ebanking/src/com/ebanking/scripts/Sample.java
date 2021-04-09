package com.ebanking.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample 
{
     @BeforeTest
	public void xyz() 
	{
		Assert.assertEquals("Selenium","Selenium");
	}
	@Test
	public void abc() 
	{
		Assert.assertEquals("TestNg","TestNg");
	}
	@Test
	public void abc() 
	{
		Assert.assertEquals("TestNg","TestNg");
	}
	@AfterTest
	public void pqr() 
	{
		Assert.assertEquals("Automation","Automation");
	}
	
}
