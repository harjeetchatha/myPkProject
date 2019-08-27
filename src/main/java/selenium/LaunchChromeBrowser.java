package selenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LaunchChromeBrowser {
	
public 	WebDriver driver;	
	

	public void setUp() {
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
	//	driver = new FirefoxDriver();
	}
	
	@Test
	public void Seleniumtest1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("In test 1");
		driver.get("http://www.google.com");
	//	String expectedPageTitle = "Google";
		
	}
	
	@Test
	public void Seleniumtest2() {
		System.out.println("In test 2");
		WebElement saveButton = driver.findElement(By.id("Save"));
		try{
		if(saveButton.isDisplayed()){
		saveButton.click();
		   }
		}
		catch(NoSuchElementException e){
		e.printStackTrace();
		}
	}
	
	@Test
	public void Seleniumtest3() {
		System.out.println("In test 3");
	String firstword=	driver.findElement(By.id("test")).getText();
		
	}


	}
	
	


