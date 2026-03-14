package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class loginPage extends  BasePage {
	

	public loginPage (WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailsec;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement emailpas;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	
	public void emailac(String email) {
		emailsec.sendKeys(email);
	}
	public void passac(String pass) {
		emailpas.sendKeys(pass);
	}
	public void lgn() {
		login.click();
	}
}
