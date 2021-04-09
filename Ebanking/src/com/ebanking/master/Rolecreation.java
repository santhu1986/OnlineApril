package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rty;
	
	@FindBy(id="btninsert")
	WebElement Rsub;
	
	public void Rcre(String Rn,String Rtype) 
	{
	Rname.sendKeys(Rn);
	Select Rt=new Select(Rty);
	Rt.selectByVisibleText(Rtype);
	Rsub.click();
	}
}

