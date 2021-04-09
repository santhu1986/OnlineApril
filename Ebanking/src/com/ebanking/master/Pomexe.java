package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pomexe 
{
	
	WebDriver driver;
	
    @BeforeTest
	public void login() throws InterruptedException 
	{
		
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://122.175.8.158/ranford2");
	
  RFBhomepage RHP=PageFactory.initElements(driver,RFBhomepage.class);
  RHP.login();
  
	}
    @Test
    public void Rc() throws InterruptedException, IOException
    {
    	
    	
    	//To get Test Data Excel File
		
    			FileInputStream FIS=new FileInputStream("E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
    			
    			//Workbook
    			
    			XSSFWorkbook WB=new XSSFWorkbook(FIS);
    			
    			//Sheet
    			
    			XSSFSheet WS=WB.getSheet("Roledata");
    			
    			//Rowcount
    			
    			int Rcount=WS.getLastRowNum();
    			System.out.println(Rcount);
    			
    	  // Multiple iterations ---- For loop
    			
    			for (int i =1; i<=Rcount;i++) 
    			{
    			
    				//Row
    				
    				XSSFRow WR=WS.getRow(i);
    				
    				//Cell
    				
    				XSSFCell WC=WR.getCell(0);
    				XSSFCell WC1=WR.getCell(1);
    				
    				//XSSFCell WC2=WR.createCell(2);
    				
    				//Cell Values
    				
    				String Rname=WC.getStringCellValue();
    				String Rtyp=WC1.getStringCellValue();
    			
  AHomepage AHP=PageFactory.initElements(driver,AHomepage.class);
  AHP.Rol();
  
  Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
  RD.Nrole();
  Thread.sleep(3000);
  Rolecreation RC=PageFactory.initElements(driver,Rolecreation.class);
  RC.Rcre(Rname,Rtyp);
  
  Thread.sleep(3000);
  //Alert
  
  driver.switchTo().alert().accept();
  
  Thread.sleep(3000);
  RD.Hom();
  
	}
    }
}
