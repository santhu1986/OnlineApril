package com.ebanking.master;

import org.testng.annotations.Test;

public class Bookhotel extends Baseadctin
{
   @Test
	public void hotel() throws InterruptedException
	{
		LB.SearchHotel("Sydney","Hotel Creek","Double");
	}
}
