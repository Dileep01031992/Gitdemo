package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelnew {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File fis = new File("H:\\Selenium 2019\\TestData.xlsx");
		
		FileInputStream src = new FileInputStream(fis);
		
		XSSFWorkbook wb = new XSSFWorkbook(src);
		
		XSSFSheet sheet1 =wb.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data1);
		
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		//System.out.println(data2);
		
	       XSSFSheet sheet2 =  wb.getSheetAt(1);
	       
	       String data3 = sheet2.getRow(0).getCell(0).getStringCellValue();
	       String data4 = sheet2.getRow(0).getCell(1).getStringCellValue();
	       String data5 = sheet2.getRow(1).getCell(0).getStringCellValue();
	       String data6 = sheet2.getRow(1).getCell(1).getStringCellValue();
	       //System.out.print(" "+data3 );
	       //System.out.print(" " + data4);
	       //System.out.print(" "+ data5);
	       //System.out.print( " "+data6);
	       
	    int count =   sheet1.getLastRowNum();
	    int count1 = sheet1.getRow(1).getLastCellNum();
	    
	    System.out.println(count);
	    System.out.println(count1);
	    
	    for(int i = 0; i<=count; i++){
	    	for(int k=0;k<count1;k++){
	    	String data7 =sheet1.getRow(i).getCell(k).getStringCellValue();
	    	//String data8 = sheet1.getRow(i).getCell(1).getStringCellValue();
	    	System.out.println(" "+data7);
	    	//System.out.print(" "+data8);
	    	}
	    	
	    }
	    
	       
	       
		//System.out.println(data7);
		
		
		
	
		
		
		
		
		
		
		

	}

}
