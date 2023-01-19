package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	WebDriver driver;
	
	public WebDriver init_browser(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
		    driver =new EdgeDriver();
		}
		else {
			System.out.println("Pass correct browser :[chrome ,edge]");
			System.out.println("Terminate program.........");
			System.exit(0);
		}
		return driver;
		
	}

}
