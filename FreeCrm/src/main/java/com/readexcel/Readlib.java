package com.readexcel;

import com.library.Readxcellib;

public class Readlib {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Readxcellib  obj = new Readxcellib ("H:\\Selenium 2019\\Excelread.xlsx");
		System.out.println(obj.getData(0, 0, 0));
		System.out.println(obj.getData(0, 0, 1));
		
		for(int i =0;i<obj.getrowcount();i++)
		{
		String s1=obj.getData(0, i, 1);
		System.out.println(s1);
		}
		
		

	}

}
