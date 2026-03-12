package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span") 
WebElement lnkMyaccount;

@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a") 
WebElement lnkRegister;



public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

}
