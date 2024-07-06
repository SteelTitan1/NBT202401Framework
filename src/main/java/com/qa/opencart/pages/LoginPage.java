package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver; 
	
	
	//Page object model design pattern: 
	//1. private By locators:
	private By emailID=By.id("input-email"); 
	private By pass=By.id("input-password"); 
	private By loginBtn=By.xpath("//*[@id=\"form-login\"]/button"); 
	private By forgotPassLink=By.linkText("Forgotten Password"); 
	
	
	
	//how can you pass the driver into this class? 
	//create a param const...
	
	public LoginPage(WebDriver driver) {
		this.driver= driver; 
	}
	
	
	public String getloginPageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title; 
		
	}
	public String getloginPageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url; 
		
	}
	public boolean isForgotPwdLinkDisplayed() {
		return driver.findElement(forgotPassLink).isDisplayed();
		
	}
	
	public void doLogin(String userName, String pwd) {
		driver.findElement(emailID).sendKeys(userName);
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		//this below step is TDD approach where previous page methods are 
		//returning next page object
	
		
		
	}
	
	
	
	

}
