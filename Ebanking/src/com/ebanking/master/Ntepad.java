package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ntepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
	Library LB=new Library();
	
	LB.OpenApp("http://122.175.8.158/ranford2");
	LB.AdminLgn("Admin","Testing@");
	
	//To Get Test Data File Path
	
	String Fpath="E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Roledata.txt";
	
	//Results file path
	
	String Rpath="E:\\kishoreworkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_rolenotepad.txt";
	String SD;
	
	//To get Test data File
	
     FileReader FR=new FileReader(Fpath);
     BufferedReader BR=new BufferedReader(FR);
     String SRead=BR.readLine();
     System.out.println(SRead);
     
     
     //Writing Header to Results File
     
     FileWriter FW=new FileWriter(Rpath);
     BufferedWriter BW=new BufferedWriter(FW);
     BW.write(SRead); 
     BW.newLine();
     
     //Multiple Iterations ----- Loop
     
     while ((SD=BR.readLine())!=null)
     {
		
    	 System.out.println(SD);
    	 
    	 //Split
    	 
    	String SR[]=SD.split("###");
    	
    	String Rname=SR[0];
    	String Rty=SR[1];
    	
    	String Res=LB.Role(Rname,Rty);
    	
    	//Results 
    	
    	BW.write(SD+"&&&&&"+Res);
    	BW.newLine();
	}
     
     BW.close();
     BR.close();
     
     

	}

}
