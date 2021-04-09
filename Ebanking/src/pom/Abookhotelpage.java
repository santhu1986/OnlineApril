package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Abookhotelpage
{

	//element properties
		@FindBy(xpath="//input[@name='first_name']")
		WebElement firstname;
		@FindBy(xpath="//input[@name='last_name']")
		WebElement lastname;
		@FindBy(xpath="//textarea[@name='address']")
		WebElement address;
		@FindBy(xpath="//input[@maxlength='16']")
		WebElement creditcard;
		@FindBy(xpath="//select[@name='cc_type']")
		WebElement credittype;
		@FindBy(xpath="//select[@name='cc_exp_month']")
		WebElement CreditCardmonth;
		@FindBy(xpath="//select[@name='cc_exp_year']")
		WebElement creditcardyear;
		@FindBy(xpath="//input[@name='cc_cvv']")
		WebElement cvv;
		@FindBy(xpath="//input[@name='book_now']")
		WebElement Book;
		@FindBy(id="my_itinerary")
		WebElement itinerary;
		
		@FindBy(xpath="//a[contains(.,'Search Hotel')]")
		WebElement SearchHot;
		
		@FindBy(xpath="//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")
		WebElement Booktext;
		
		//element methods
		public void Book(String Fname,String Lname,String Add,String Ccard,String Ctype,String Cmth,String Cyear,String Cv) 
		{
			
			String Expval="Book A Hotel";
			
			String Actval=Booktext.getText();
					
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Book Page Navigated");
		}
			else
			{
				System.out.println("Booking Paage failed to navigate");
			}
		firstname.sendKeys(Fname);
		lastname.sendKeys(Lname);
		address.sendKeys(Add);
		creditcard.sendKeys(Ccard);
		Select creditdropdown=new Select(credittype);
		creditdropdown.selectByVisibleText(Ctype);	
		Select credimothdropdown=new Select( CreditCardmonth);
		credimothdropdown.selectByVisibleText(Cmth);
		Select cardyeardropdown=new Select(creditcardyear);
		cardyeardropdown.selectByValue(Cyear);
		cvv.sendKeys(Cv);
		Book.click();
		
		
		}
		public void book1()
		{
			itinerary.click();
				
		}
		
		public void Shotel()
		{
		SearchHot.click();
		}
}
