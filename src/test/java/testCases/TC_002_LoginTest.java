package testCases;

import java.lang.System.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.myAccount;
import testBase.BasePage;

public class TC_002_LoginTest extends BaseClass {
	
	
	
	@Test
	
	public void vlogin()
	{
		logger.info("started");
		logger.info("homepage");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		logger.info("loginpage");
		loginPage lp=new loginPage(driver);
		lp.emailac("mtm2@gmail.com");
		logger.info("use");
		lp.passac("test@123");
		logger.info("pass");
		lp.lgn();
		
		logger.info("my accpage");
		
		myAccount ma=new myAccount(driver);
		boolean tar=ma.myAcntexist();
		Assert.assertEquals(tar, true,"Login Failed");
		logger.info("finisehd tc002");
	
		
	}
}
