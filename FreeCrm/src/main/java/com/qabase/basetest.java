package com.qabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.testutil;

public class basetest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public basetest() throws IOException{
		
			prop =new Properties();
			try {
				FileInputStream ip = new FileInputStream("H:/Selenium 2019/workspace/FreeCrm/src/main/java/com/env/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","H:\\Selenium 2019\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver","H:/Selenium 2019/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
	}
	
	

}
