package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Library Lb=new Library();
		
		Lb.OpenApp("http://122.175.8.158/ranford2");
		Lb.AdminLgn("Admin","Testing@");
		
		//To get Test Data Excel File
		
		FileInputStream FIS=new FileInputStream("E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Roledata");
		
		//Rowcount
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
  // Multiple iterations ---- For loop
		
		for (int i =1; i<=Rcount;i++) 
		{
		
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rtyp=WC1.getStringCellValue();
			
			String Rval=Lb.Role(Rname,Rtyp);
			System.out.println(Rval);
			
			WC2.setCellValue(Rval);
			
			
	}
		
  // Creating Excel for Results
		
		FileOutputStream Fos=new FileOutputStream("E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(Fos);
		WB.close();
		
		
		
	}

}
