package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;
import Utils.Costants;

public class UpadateAccountTest extends TestBase{
	
	@Test
	public void verifyUpdateAccountHeader() {
		lp.doLogin("sump1", "techfin@12");
		hp=lp.clickOnLoginButton();
		up=hp.clickOnUpdateAccountLink();
		String actual = up.verifyUpdateaccountTitle();
		Assert.assertEquals(actual, Costants.VERIFY_UPDATE_ACCOUNT_TITLE);
	}
	
	@Test
	public void verifyUpdateAccountValidCredentials() {
		lp.doLogin("sump1", "techfin@12");
		hp=lp.clickOnLoginButton();
		up=hp.clickOnUpdateAccountLink();
		up.enterValidCredentials("657463", "2000");
		boolean actual = up.isAlertPresent();
		Assert.assertEquals(actual, true);
		String successfulmsg = up.alertUpdateAcountPageMessage();
		Assert.assertEquals(successfulmsg, Costants.VERIFY_UPDATEACCOUNT_SUCCESSFUL_MSG);
	   }
	
	
	
	
}