package TestBase;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import DriverFactory.Driverfactory;
import Pages.AddAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UpdateAccount;
import Utils.PropConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	 WebDriver driver;
	protected LoginPage lp; 
	protected HomePage hp;
	protected AddAccountPage ap;
	protected Driverfactory df;
	protected UpdateAccount up;
	
	protected Properties prop;
	
	
	
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		// WebDriverManager.chromedriver().setup();
		//    driver =new ChromeDriver();
	    //  driver.get("http://spglobalsolutions.in/tool2/login.php");
		 df=new Driverfactory();
		 
		 prop=PropConfig.getPropValue(); 
		 
		 String browser=prop.get("broswer").toString();
		 String url =prop.get("url").toString();
		
		 driver=df.init_browser(browser);
		 driver.get(url);
		
		 lp=new LoginPage(driver) ;	 
	}
	
	
	@AfterMethod()
	public void afterMethod() {
		driver.quit();
	}

}
