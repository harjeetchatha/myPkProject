package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hchatha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	System.out.println("driver.getTitle()");	
		
		
		

	}
	
	 public static WebDriver getDriver() {
         WebDriverManager.chromedriver().setup();
         return new ChromeDriver();
    }


}
