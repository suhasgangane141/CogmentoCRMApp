package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass{
	
	@FindBy(name="email")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement logIn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String UserName, String Pass)
	{
		Wait.sendKeys(userName, UserName);
		Wait.sendKeys(password, Pass);
		Wait.click(logIn);
	}

}
