package com.gcreaddy.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qabase.basetest;
import com.qapages.Homepage;
import com.qapages.login;

public class logintestcases extends basetest {
	login log;
	Homepage Homepage;
	
	public logintestcases() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException{
		initialization();
		
		 log = new login();
		
	}
	
	@Test(priority =1)
	public void validateloginpagetitleTest(){
		String abc =log.validateloginpagetitle();
		Assert.assertEquals(abc, "Amazon Sign In");
		
	}
	
	
	
	@Test(priority =2)
	public void   loginaTest(){
		Homepage =log.logina(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	

}
