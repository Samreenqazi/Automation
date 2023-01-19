package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import TestBase.TestBase;
import Utils.Costants;

public class HomePageTest extends TestBase {
	
	@Test
	public void verifyHomePgeTitle() {
		lp.doLogin("sump1", "techfin@12");
		hp=lp.clickOnLoginButton();
		String actual=hp.verifyAddaccountTitle();
		Assert.assertEquals(actual, Costants.VERIFY_HOME_PAGE_TITLE);
		
	}
	
	}


