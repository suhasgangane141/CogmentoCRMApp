package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	public LoginPage loginpage;
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test(priority=1)
	public void validateLoginPage()
	{
		loginpage = new LoginPage();
		loginpage.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
