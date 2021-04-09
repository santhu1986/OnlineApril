package com.ebanking.master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseadctin 
{

	Lib LB=new Lib();
	
	  @BeforeTest
	  public void beforeTest() 
	  {
	  LB.Login("krisk1234","kish1234");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
	  LB.logout();
	  }

	  @BeforeSuite
	  public void beforeSuite() throws IOException 
	  {
	  LB.OpenApp("https://adactinhotelapp.com/");
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
	  LB.Appclose();
	  }


}
