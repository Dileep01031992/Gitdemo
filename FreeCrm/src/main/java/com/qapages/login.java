package com.qapages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qabase.basetest;

public class login extends basetest {

	
	


	// Page factory
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement cont;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement sign;
	
	
	//initializing the Page Objects
	public login() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//ACTIONS
	
	public String validateloginpagetitle(){
		return driver.getTitle();
	
	}
	public Homepage logina(String us,String pwd){
		
		email.sendKeys(us);
		cont.click();
		pass.sendKeys(pwd);
		sign.click();
		return new Homepage();
		
		
	}
	

}
