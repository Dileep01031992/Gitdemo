package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrardataprovider {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Excellibrardataprovider(String excelpath){
		try {
			File fis = new File(excelpath);
			
			FileInputStream src = new FileInputStream(fis);
			
			 try {
				wb = new XSSFWorkbook(src);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getData(int Sheetnumber, int row, int col){
		//String data1 = "";
		 sheet1=wb.getSheetAt(Sheetnumber);
		 int count =sheet1.getLastRowNum();
		 
		 String data =sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
	
	public int getrowcount(int sheetindex){
		
		int count=wb.getSheetAt(sheetindex).getLastRowNum();
		
		count =count +1;
		return count;
		
	}
	
	public int getcell(int sheetnum, int row){
		int count2 =wb.getSheetAt(sheetnum).getRow(row).getLastCellNum();
		return count2;
	}
	

}
