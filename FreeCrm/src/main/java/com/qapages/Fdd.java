package com.qapages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fdd {
	
	WebDriver driver;
	
	public void setup(){
		System.setProperty("webdriver.chrome.driver","H:\\Selenium 2019\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();// launch chrome driver
		driver.manage().window().maximize(); //miximize the browser
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");	
	}
	
	
	
	

}
