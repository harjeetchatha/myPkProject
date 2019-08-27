package com.mypk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//create local driver 
	WebDriver ldriver;
	
	//constructor instantizaite r driver 
	public  Loginpage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement	txtPassword;
			
	@FindBy(name= "btonlogin")
	WebElement btnlogin;

	public void setupUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setupPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickButtonLogin() {
		btnlogin.click();
	}
																	
}
