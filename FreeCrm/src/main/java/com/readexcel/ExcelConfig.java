package com.readexcel;

public class ExcelConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Excellibrary abc = new Excellibrary("H:\\Selenium 2019\\dataread.xlsx");
		String data4 = abc.getData(0, 0);
		System.out.print(data4);
		String data5 =abc.getData(0, 1);
		System.out.print(" "+data5);
		

	}

}
