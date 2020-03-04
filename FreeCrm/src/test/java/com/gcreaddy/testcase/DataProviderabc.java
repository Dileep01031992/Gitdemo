package com.gcreaddy.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.readexcel.Excellibrardataprovider;

public class DataProviderabc {
	
	WebDriver driver;
	@Test(dataProvider ="CRM")
	public void login(String username,String password){
		System.setProperty("webdriver.chrome.driver","H:\\Selenium 2019\\Chrome\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://classic.freecrm.com/index.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		 
		 WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		 user.sendKeys(username);
		 WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		 pass.sendKeys(password);
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 String abc =driver.getTitle();
		 System.out.println(abc);
		 driver.close();
		 	
	}
	
	//data provider working fine;
	/*@DataProvider(name ="CRM")
	public Object [][] passdata(){
		Excellibrardataprovider exc = new Excellibrardataprovider("H:\\Selenium 2019\\workspace\\FreeCrm\\target\\testdata\\TestData.xlsx");
		
		int rows =exc.getrowcount(2);
		
		//exc.getData(2, i, col)
		
		Object[][] data = new Object[rows][2];
		for(int i =0; i<rows; i++){
			data[i][0]=exc.getData(2, i, 0);
			data[i][1]=exc.getData(2, i, 1);
		}
		
		return data;
		
		
	}
	*/
//	//trying to new code
	@DataProvider(name ="CRM")
	public Object [][] passdata(){
		Excellibrardataprovider exc = new Excellibrardataprovider("H:\\Selenium 2019\\workspace\\FreeCrm\\target\\testdata\\TestData.xlsx");
		
		int rows =exc.getrowcount(2);
		
		//int col =exc.getData(2, i, col)
		
		int col = exc.getcell(2, 1);
		
		Object[][] data = new Object[rows][col];
		for(int i =0; i<rows; i++){
			for(int k=0;k<col; k++){
				data[i][k]=exc.getData(2, i, k);	
			}
			
			
		}
		
		return data;
		
		
	}
	

	
	
	
	
	
	
	
	

}
