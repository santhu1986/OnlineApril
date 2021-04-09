package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AdactinHP 
{

	//element properties
	
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		@FindBy(xpath="//input[@name='password']")
		WebElement passwd;
		@FindBy(xpath="//input[@name='login']")
		WebElement login;
		
		
		@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]")
		WebElement Welcometext;
		
		//element methods
		
		public void login(String un,String pwd) {
			
			String Expval="Welcome to Adactin Group of Hotels";
			
			username.sendKeys(un);
			passwd.sendKeys(pwd);
			login.click();
			
			String Actval=Welcometext.getText();
			
		
			
		
			if (Expval.equalsIgnoreCase(Actval))
			{
			System.out.println("Hotel Home Page Launch");	
			}
			else
           {
				System.out.println("Failed to Launch");
			}

		}


}
