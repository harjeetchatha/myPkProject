package com.mypk.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.mypk.utilities.readConfig;

public class BaseClass {
	
	readConfig rc = new readConfig();
	public String baseUrl= rc.getApplicationURL();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
	if(br.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", rc.getChromeURL());
	driver = new ChromeDriver();
	}
	}
	@AfterClass
	public void teardown() {
		driver.quit();
		
	}

	}

