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

public class TC_001_AccountRegistrationTest {
	public WebDriver driver;

	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
		
	}
	@Test
	void verify_account_registration() {
		
		HomePage hp =new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

		regpage.setFirstName("mahesh");
		regpage.setLastName("thampu");
		regpage.setEmail(randomeString().toUpperCase()+"@gmail.com");// randomly generated the email
		regpage.setTelephone("1234567890");
		
		//String password=randomAlphaNumeric();
		
		regpage.setPassword("mym125135");
		regpage.setConfirmPassword("mym125135");
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");

		
	}
	public String randomeString() {
		String Generated=RandomStringUtils.randomAlphabetic(5);
		return Generated;
	}

	

}
