package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{
     DesiredCapabilities Cap;
     @Parameters("Browser")
     @Test
     public void GD(String BR) throws MalformedURLException, InterruptedException
     {
    	 if (BR.equalsIgnoreCase("firefox")) 
    	 {
    		 Cap=new DesiredCapabilities();
        	 Cap.setBrowserName("firefox");
        	 Cap.setPlatform(Platform.WINDOWS);
        	 	
		}
    	 else if (BR.equalsIgnoreCase("chrome"))
    	 {
    		 Cap=new DesiredCapabilities();
        	 Cap.setBrowserName("chrome");
        	 Cap.setPlatform(Platform.WINDOWS);
        	 	
		}
    	 
    	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.44.1:4444/wd/hub"),Cap);
    	 
    	 driver.manage().window().maximize();
    		driver.get("http://122.175.8.158/ranford2");
    		
    		  RFBhomepage RHP=PageFactory.initElements(driver,RFBhomepage.class);
    		  RHP.login();

    		  AHomepage AHP=PageFactory.initElements(driver,AHomepage.class);
    		  AHP.Rol();
    		  
    		  Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
    		  RD.Nrole();
    		  Thread.sleep(3000);
    		  Rolecreation RC=PageFactory.initElements(driver,Rolecreation.class);
    		  RC.Rcre("Teller","E");
    		  
    		  Thread.sleep(3000);
    		  //Alert
    		  
    		  driver.switchTo().alert().accept();
    		  
    		 
    	 
    	 
     }
  
  
}
