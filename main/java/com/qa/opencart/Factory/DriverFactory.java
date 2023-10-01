package com.qa.opencart.Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	WebDriver driver;
	
	public WebDriver initDriver() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver-win64/chromedriver.exe");
		
	  	ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--remote-allow-origins=*");
		
	  	WebDriver driver = new ChromeDriver(options);
		 //driver.manage().window().fullscreen();
		 driver.manage().deleteAllCookies();
		 Thread.sleep(2000);
		 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.titleContains("Your Store"));
		 //wait.until(ExpectedConditions.urlContains("https://naveenautomationlabs.com/opencart/"));
		 driver.get("https://naveenautomationlabs.com/opencart/");
		
		return driver;
	}

}
