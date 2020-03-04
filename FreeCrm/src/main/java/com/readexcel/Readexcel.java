package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("H:\\Selenium 2019\\Excelread.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wa = new HSSFWorkbook(fis);
		
		  XSSFSheet sheet1= wb.getSheetAt(0);
		  String s1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		  System.out.println("Data from excel is "+s1);
		  String s2 =sheet1.getRow(1).getCell(1).getStringCellValue();
		  System.out.println(s2);
		  
		  
		
		

	}

}
