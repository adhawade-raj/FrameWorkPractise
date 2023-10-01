package Framework_Practise.Framework_Practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) {
	  
	  	WebDriverManager.chromedriver().setup();
	  	ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		 driver.manage().window().fullscreen();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
  }
}
