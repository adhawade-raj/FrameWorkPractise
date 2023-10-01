package Framework_Practise.Framework_Practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver-win64/chromedriver.exe");
		
	  	ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--remote-allow-origins=*");
		
	  	WebDriver driver = new ChromeDriver(options);
		 driver.manage().window().fullscreen();
		 driver.manage().deleteAllCookies();
		 Thread.sleep(5000);
		 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 driver.get("https://naveenautomationlabs.com/opencart/");
		
	}

}
