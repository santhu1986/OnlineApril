package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelpage
{

	//element properties
		@FindBy(xpath="//select[@name='location']")
		WebElement Location;
		
		@FindBy(xpath="//input[@value='Search']")
		WebElement search;
		
		@FindBy(xpath="//select[@name='hotels']")
		WebElement Hotels;
		@FindBy(xpath="//select[@name='room_type']")
		WebElement RoomType;
		@FindBy(xpath="//select[@name='room_nos']")
		WebElement NumberOfRooms;
		@FindBy(xpath="//input[@name='datepick_in']")
	    WebElement checkindate;
		@FindBy(xpath="//input[@name='datepick_out']")
		WebElement checkoutdate;
		@FindBy(xpath="//select[@name='adult_room']")
		WebElement Adultsperroom;
		@FindBy(xpath="//select[@name='child_room']")
		WebElement childsperroom;
		/*@FindBy(xpath="//input[@value='Search']")
		WebElement search;*/
		@FindBy(xpath="//input[@type='reset']")
		WebElement logout;

		@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[1]/td")
		WebElement Selecthoteltext;
		
	public void searchhotel(String Loc,String Hot,String Rt,String Nrs,String Apr,String Cpr ) 
	{
		String Expval="Select Hotel";
		
		Select Locationdropdown=new Select(Location);
		Locationdropdown.selectByVisibleText(Loc);
		
		Select Hotelsdropdown=new Select( Hotels);
		Hotelsdropdown.selectByVisibleText(Hot);
		
		Select Roomtypedropdown=new Select(RoomType);
		Roomtypedropdown.selectByVisibleText(Rt);	
		
		Select nomdropdown=new Select(NumberOfRooms);
		nomdropdown.selectByVisibleText(Nrs);
		
		checkindate.sendKeys("12/04/2021");
		checkoutdate.sendKeys("13/04/2021");
			
		Select Aprdropdown=new Select(Adultsperroom);
		Aprdropdown.selectByVisibleText(Apr);
		
		Select cprdropdown=new Select(childsperroom);
		cprdropdown.selectByVisibleText(Cpr);
	
		search.click();
		
		String Actval=Selecthoteltext.getText();
		
		if (Expval.equalsIgnoreCase(Actval))
		{
			System.out.println("Select hotel page launch");
		}
		else
		{
			System.out.println("Select hotel failed to launch");
		}
				
			
	   
	 }

}
