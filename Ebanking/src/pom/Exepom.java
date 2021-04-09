package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exepom 
{

	WebDriver driver;
	
	@BeforeTest
	public void OpenApp()
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
	
			
			
	AdactinHP AHP=PageFactory.initElements(driver,AdactinHP.class);
	AHP.login("krisk1234","kish1234");
	}
     @Test
	public void Hotelbooking() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\santh\\Desktop\\SearchHotel excel.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("search");
		XSSFSheet WS1=WB.getSheet("book");
		
		//Row count
		
		int Scount=WS.getLastRowNum();
	    int Bcount=WS1.getLastRowNum();
	    
	    for (int i = 1; i<=Scount;i++) 
	    {
		   //Row
	    	
	    	XSSFRow WR=WS.getRow(i);
	    	
	    	//cell
	    	
	    	String Loc=WR.getCell(0).getStringCellValue();
	    	String Hot=WR.getCell(1).getStringCellValue();
	    	String RoomTy=WR.getCell(2).getStringCellValue();
	    	String Noofrms=WR.getCell(3).getStringCellValue();
	    	String Adrms=WR.getCell(4).getStringCellValue();
	    	String Chrms=WR.getCell(5).getStringCellValue();
	    	
	    	SearchHotelpage SHP=PageFactory.initElements(driver,SearchHotelpage.class);
	        SHP.searchhotel(Loc,Hot,RoomTy,Noofrms,Adrms,Chrms);	
	        
	        Thread.sleep(3000);
	        
	        AselectHotel ASH=PageFactory.initElements(driver,AselectHotel.class);
	        ASH.sehotel();
	        
	        Thread.sleep(3000);
		     
	       // for (int i=1;i<=Bcount;j++) 
	       
	           XSSFRow WR1= WS1.getRow(i);
	           
	           String Fname= WR1.getCell(0).getStringCellValue();
	           String Lname=WR1.getCell(1).getStringCellValue();
	           String Add=WR1.getCell(2).getStringCellValue();
	           String Ccno=WR1.getCell(3).getStringCellValue();
	           String Cctyp=WR1.getCell(4).getStringCellValue();
	           String Emn=WR1.getCell(5).getStringCellValue();
	           String Eyear=WR1.getCell(6).getStringCellValue();
	           String Cv=WR1.getCell(7).getStringCellValue();
	           
	           
	           Abookhotelpage ABP=PageFactory.initElements(driver,Abookhotelpage.class);
	           ABP.Book(Fname, Lname, Add, Ccno, Cctyp,Emn,Eyear,Cv);
	           
	           Thread.sleep(3000);
	           
	           JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)");
				
				Thread.sleep(3000);
				
	           ABP.book1();
	           
	           Thread.sleep(3000);
	           
	           ABP.Shotel();
			}
	        
	    }
	    
	 
	}
