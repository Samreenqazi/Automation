package TestPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.TestBase;
import Utils.Costants;
import Utils.PropConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends TestBase {
	

  
	@Test
	public void verifyTheLoginPageHeader() throws IOException {
		
		String actual = lp.verifyTitle();
		Assert.assertEquals(actual, Costants.VERIFY_LOGIN_PAGE_TITLE);
		lp.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		hp = lp.clickOnLoginButton();
	}

	@Test
	public void verifyIncorrectCredentials() {
		// invalid credentials
		lp.doLogin("test", "test");
		hp = lp.clickOnLoginButton();
		// verify alert is displayed
		boolean actual = lp.isAlertPresent();
		Assert.assertEquals(actual, true);
		// verify the message displayed on popup
		String alertmsg = lp.alertLoginPageMessage();
		Assert.assertEquals(alertmsg, Costants.VERIFY_INCORRECT_CREDENTIALS);

	}

}
