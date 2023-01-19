package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	By userName =By.name("username");
	By passWord =By.name("password");
	By loginButton =By.tagName("button");
	By headderLoginPage=By.tagName("h1");
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void doLogin(String user,String pass) {
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	public HomePage clickOnLoginButton() {
		driver.findElement(loginButton).click();
		return new HomePage(driver);
	}
	
			
	
	public String verifyTitle() {
		String actual=driver.findElement(headderLoginPage).getText();
	
		return actual;
	
	}
	
	public boolean isAlertPresent() {
		WebDriverWait wait=new WebDriverWait(driver,5);
		try {
		  wait.until(ExpectedConditions.alertIsPresent());
		  return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String alertLoginPageMessage() {
      
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;
	}
	
}
