package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By clickaddAccount=By.xpath("//a[text()='Add Account']");
	By headerAddAcc=By.tagName("h2");
	By updateAccountLink =By.xpath("//a[text()='Update Account']");
	
	 public HomePage(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	public AddAccountPage clickOnAddAccountLink() {
		driver.findElement(clickaddAccount).click();
		 return new AddAccountPage(driver);
	}

	public String verifyAddaccountTitle() {
		return driver.findElement(headerAddAcc).getText();
		
	}
	
	public UpdateAccount clickOnUpdateAccountLink() {
		driver.findElement(updateAccountLink).click();
		 return new UpdateAccount(driver);
	}
}
