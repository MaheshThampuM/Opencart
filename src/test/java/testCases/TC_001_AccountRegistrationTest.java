package testCases;

import java.time.Duration;
import org.testng.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BasePage;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test
	void verify_account_registration() {
		
		HomePage hp =new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

		regpage.setFirstName("mahesh");
		regpage.setLastName("thampu");
		regpage.setEmail(randomString().toUpperCase()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomnum());
		
		String password=randomAlphaNum();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");

		
	}

	

}
