package TestLayer;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass{
	protected HomePage homePage;
	
	public void validateHomeUrl()
	{
		homePage = new HomePage();
		String actualURL=homePage.homePageUrl();
		
		Assert.assertEquals(actualURL.contains("ui.cogmento"), true);
	}
	
	public void validateLogo()
	{
		boolean logoStatus =homePage.homeLogo();
		Assert.assertEquals(logoStatus, true);
	}
	

}
