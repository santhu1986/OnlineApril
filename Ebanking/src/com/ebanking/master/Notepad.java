package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		
		Library Lb=new Library();
		
		Lb.OpenApp("http://122.175.8.158/ranford2");
		Lb.AdminLgn("Admin","Testing@");
		
		//To get Test data file path
	
		String Fpath="E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
		//Results File Path
		
		String Rpath="E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		//To get The Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
	    String Sread=BR.readLine();
        System.out.println(Sread);
        
        //Results file
        
        FileWriter FW=new FileWriter(Rpath);
		BufferedWriter Bw=new BufferedWriter(FW);
	    Bw.write(Sread);
        Bw.newLine();
        
        //Multiple Iterations
        
        while ((SD=BR.readLine())!=null) 
        {
		System.out.println(SD);
		
		//Split
		
		String SR[]=SD.split("###");
		
		String Rname=SR[0];
		String Rtyp=SR[1];
		
		String Rval=Lb.Role(Rname,Rtyp);
		System.out.println(Rval);
		
		//Results
		
		Bw.write(SD+"####"+Rval);
		
		Bw.newLine();
		
		}
        
        Bw.close();
        BR.close();
        
        
        
        
	}

}
