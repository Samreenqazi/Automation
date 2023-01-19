package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;

public class AddAccountPage {
	
	
	WebDriver driver;
	
	By accountName=By.name("aname");
	By accountNumber=By.name("anumber");
	By accountFund=By.name("afund");
	By registerButton=By.tagName("button");
	
	public AddAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterAddAccount(String accName,String accNum,String accFund) {
		 driver.findElement(accountName).sendKeys(accName);
		 driver.findElement(accountNumber).sendKeys(accNum);
		 driver.findElement(accountFund).sendKeys(accFund);
		 driver.findElement(registerButton).click();
	 }
	
	
	public String getAccountNameValidationMsg()
	{
		return driver.findElement(accountName).getAttribute("validationMessage");
	}
	
	public String getAccountNumberValidationMsg() {
		return driver.findElement(accountNumber).getAttribute("validationMessage");
	}
	
	public String getAccountFundValidationMsg() {
		return driver.findElement(accountFund).getAttribute("validationMessage");
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
	
	public String alertAddAcountPageMessage() {
      
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;
	}
	
}

	
	

