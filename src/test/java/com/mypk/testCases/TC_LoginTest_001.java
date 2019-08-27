package com.mypk.testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypk.pageObjects.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		System.out.println("In test 1");
//		driver.get("http://google.com");
	//	String expectedPageTitle = "Google"
		Loginpage lp = new Loginpage(driver) ;
	//	lp.setupUserName(uname);
	//	lp.clickButtonLogin();
		if (driver.getTitle().equals("google")) {
			Assert.assertTrue(true);
			
		} else {

		}
		System.out.println("Not correct title");
			Assert.assertFalse(false);
		
		
	}

}
