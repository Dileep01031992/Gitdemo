package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File src = new File("H:\\Selenium 2019\\Excelread.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wa = new HSSFWorkbook(fis);
		
		  XSSFSheet sheet1= wb.getSheetAt(0);
		 int count = sheet1.getLastRowNum();
		 System.out.println("Total row is "+count);
		 
		 for (int i=0;i<count;i++)
		 {
			String s1 =sheet1.getRow(i) .getCell(0).getStringCellValue();
			System.out.println(" Test data from excel is "+s1);
			String s2 =sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(" Test data from excel is "+s2);
			
		 }
		 
		  

	}

}
