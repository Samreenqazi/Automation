package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;
import Utils.Costants;
import Utils.Utils;

public class AddAccountTest extends TestBase {
	@Test
	public void verifyAddAccHeader() {
		lp.doLogin("sump1", "techfin@12");
		hp = lp.clickOnLoginButton();
		ap = hp.clickOnAddAccountLink();
		String actual = hp.verifyAddaccountTitle();
		Assert.assertEquals(actual, Costants.VERIFY_ADD_ACCOUNT_TITLE);
	}

	@Test
	public void verifyTheValidAccount() {
		lp.doLogin("sump1", "techfin@12");
		hp = lp.clickOnLoginButton();
		ap = hp.clickOnAddAccountLink();
		ap.enterAddAccount(String.valueOf(Utils.getRandomNumber()), String.valueOf(Utils.getRandomNumber()), "5000");
		boolean actual = ap.isAlertPresent();
		Assert.assertEquals(actual, true);
		String successfulmsg = ap.alertAddAcountPageMessage();
		Assert.assertEquals(successfulmsg, Costants.VERIFY_ADD_ACCOUNT_SUCCESS_MESSAGE);
	}

	@Test
	public void verify_With_Name_FieldEmpty() {
		lp.doLogin("sump1", "techfin@12");
		hp = lp.clickOnLoginButton();
		ap = hp.clickOnAddAccountLink();
		ap.enterAddAccount("", String.valueOf(Utils.getRandomNumber()), String.valueOf(Utils.getRandomNumber()));
		Assert.assertEquals(ap.getAccountNameValidationMsg(), Costants.VERIFY_ADD_ACCOUNTNAME_EMPTYFIELD_MESSAGE);
	}

	@Test
	public void verify_With_Number_FieldEmpty() {
		lp.doLogin("sump1", "techfin@12");
		hp = lp.clickOnLoginButton();
		ap = hp.clickOnAddAccountLink();
		ap.enterAddAccount(String.valueOf(Utils.getRandomNumber()), "", String.valueOf(Utils.getRandomNumber()));
		Assert.assertEquals(ap.getAccountNumberValidationMsg(), Costants.VERIFY_ADD_ACCOUNTNUMBER_EMPTYFIELD_MESSAGE);
	}

	@Test
	public void verify_with_Fund_FieldEmpty() {
		lp.doLogin("sump1", "techfin@12");
		hp = lp.clickOnLoginButton();
		ap = hp.clickOnAddAccountLink();
		ap.enterAddAccount(String.valueOf(Utils.getRandomNumber()), String.valueOf(Utils.getRandomNumber()), "");
		Assert.assertEquals(ap.getAccountFundValidationMsg(), Costants.VERIFY_ADD_ACCOUNTFUND_EMPTYFIELD_MESSAGE);
	}

}
