package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	By emailAdd = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");

	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	

}
