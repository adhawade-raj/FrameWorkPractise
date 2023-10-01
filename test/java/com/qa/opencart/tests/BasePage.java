package com.qa.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.Factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BasePage {
	
	DriverFactory df;
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeTest()
	public void setup() throws InterruptedException {
		df = new DriverFactory();
		driver = df.initDriver();
		loginpage = new LoginPage(driver);
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
