package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass{
	
	@FindBy(name="//div[@Class='header item']")
	private WebElement logo;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String homePageUrl()
	{
		String homeURL=driver.getCurrentUrl();
		return homeURL;
	}
	
	public boolean homeLogo()
	{
		return Wait.isDisplayed(logo);
		
	}

}
