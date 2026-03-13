package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass
	public void setup() {
		
		logger=LogManager.getLogger(this.getClass());
		
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
	
	public String randomString() {
		String Generated=RandomStringUtils.randomAlphabetic(5);
		return Generated;
	}
	
	public String randomnum() {
		String Generated1=RandomStringUtils.randomNumeric(10);
		return Generated1;
	}
	public String randomAlphaNum() {
		String Generated2=RandomStringUtils.randomAlphabetic(5);
		String Generated3=RandomStringUtils.randomNumeric(3);
		return (Generated2+Generated3);
	}


}
