package com.ebanking.master;

public class Exehotel {

	public static void main(String[] args) throws InterruptedException 
	{
	
		Lib LB=new Lib();
		
		LB.OpenApp("http://adactinhotelapp.com/");
		LB.Login("sanjay2021","Kumar@");
		LB.SearchHotel("Sydney","Hotel Creek","Double");
		LB.Selecthotel();
		LB.Bookhotel();
		Thread.sleep(4000);
		LB.ChangePwd();
	}

}
