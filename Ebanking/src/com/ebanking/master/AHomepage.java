package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AHomepage 
{

	//Element Properties
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	
	@FindBy(xpath="//img[@src='images/Roles_but.jpg']")
     WebElement Role;
	
	//Employee
	
	//Log out
	
	//Element Methods
	
	public void Br()
	{
		Branch.click();
	}
	
	public void Rol()
	{
		Role.click();
	}


}
