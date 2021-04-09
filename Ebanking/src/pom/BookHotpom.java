package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookHotpom
{

	WebDriver driver;
	FileInputStream fis;
	
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
	   public void BookHotel() throws IOException, InterruptedException 
	     {
	    	 fis=new FileInputStream("C:\\Users\\santh\\Desktop\\Book Hotel.xlsx");
	    	 
	    	 
	    	 XSSFWorkbook Wbook=new XSSFWorkbook(fis);
	    	 
	    	 XSSFSheet Wsheet=Wbook.getSheet("Book");
	    	 
	    	 int Bcount=Wsheet.getLastRowNum();
	    	 
	    	 for (int j=1;j<=Bcount;j++) 
		        {
				
		           XSSFRow WR1= Wsheet.getRow(j);
		           String Loca= WR1.getCell(0).getStringCellValue();
		           
		           String Fname= WR1.getCell(1).getStringCellValue();
		           String Lname=WR1.getCell(2).getStringCellValue();
		           String Add=WR1.getCell(3).getStringCellValue();
		           String Ccno=WR1.getCell(4).getStringCellValue();
		           String Cctyp=WR1.getCell(5).getStringCellValue();
		           String Emn=WR1.getCell(6).getStringCellValue();
		           String Eyear=WR1.getCell(7).getStringCellValue();
		           String Cv=WR1.getCell(8).getStringCellValue();
		           
		       	SearchHotelpage SHP=PageFactory.initElements(driver,SearchHotelpage.class);
		        SHP.searchhotel(Loca);	
		        
		        Thread.sleep(3000);
		        
		        AselectHotel ASH=PageFactory.initElements(driver,AselectHotel.class);
		        ASH.sehotel();
		        
		        Thread.sleep(3000);
			
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