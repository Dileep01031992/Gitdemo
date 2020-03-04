package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Excellibrary(String excelpath){
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
	
	public String getData(int Sheetnumber,  int col){
		String data1 = "";
		 sheet1=wb.getSheetAt(Sheetnumber);
		 int count =sheet1.getLastRowNum();
		 int count2 =sheet1.getRow(Sheetnumber).getLastCellNum();
		 //String data =sheet1.getRow(row).getCell(col).getStringCellValue();
		 
		 for(int i = 0; i<count; i++){
			 for(int k=0;k<count2;k++){
				 data1 =sheet1.getRow(i).getCell(k).getStringCellValue(); 
			 }
			// data1 =sheet1.getRow(i).getCell(col).getStringCellValue();
			 
			 
		 }
		 
		return data1;
		
	}
	
	
	
	
	
	

}
