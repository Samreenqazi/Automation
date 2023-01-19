package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateAccount {
   WebDriver driver;
	//Page Element 

	
	By upadateAccountHeader=By.xpath("//h2[text()='Update Balance']");
	By accountNumber=By.name("anumber");
	By accountFund =By.name("afund");
	By clickUpdateBalanceButton =By.xpath("//button[@name='register']");
	
	//Constructor
	public UpdateAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Action
	public  void enterValidCredentials(String number,String fund) {
		driver.findElement(accountNumber).sendKeys(number);
		driver.findElement(accountFund).sendKeys(fund);
		driver.findElement(clickUpdateBalanceButton).click();
	}

	public String verifyUpdateaccountTitle() {
		return driver.findElement(upadateAccountHeader).getText();
		
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
	
	public String alertUpdateAcountPageMessage() {
      
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;
	}

	

}