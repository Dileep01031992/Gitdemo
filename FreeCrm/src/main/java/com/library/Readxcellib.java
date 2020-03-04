package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxcellib {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Readxcellib(String excelpath) throws Exception
	{
		try {
			File src = new File (excelpath);
			
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
			
		
	}
	
	
	public String getData(int Sheetnumber, int rownum,int col){
		 sheet1 =wb.getSheetAt(Sheetnumber);
		String data =sheet1.getRow(0).getCell(0).getStringCellValue();
		return data;
		
	}
	
public int getrowcount(){
	int a =sheet1.getLastRowNum();
	return a;
}
}
