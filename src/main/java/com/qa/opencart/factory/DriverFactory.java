package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



//this class will be handling all the browser related work
public class DriverFactory {
	
	public WebDriver driver; 
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is "+ browserName);
		
		
		
		if (browserName.trim().equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(); 
		}
		else if (browserName.trim().equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(); 
		}
		else if (browserName.trim().equalsIgnoreCase("safari")) {
			driver=new SafariDriver(); 
		}
		else if (browserName.trim().equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(); 
		}
		else {
			System.out.println("please pass the right driver");
		}
		//below steps are   
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		return driver; 
		
		
		
	}
	
	

}
