package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AselectHotel 
{
	//element properties
	
		@FindBy(xpath="//input[@id='radiobutton_0']")
		WebElement select;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement clic;
		
		//element method
		public void sehotel()
		{
			select.click();
			clic.click();
			
		}
		

}
