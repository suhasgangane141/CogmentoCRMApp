package UtilityLayer;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{
	protected static WebDriverWait wait;
	
	public static WebElement visibilityOfElement(WebElement wb)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		return wb1;
	}
	
	public static void click(WebElement wb)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		Wait.visibilityOfElement(wb).sendKeys(value);
	}
	
	public static boolean isDisplayed(WebElement wb)
	{
		return Wait.visibilityOfElement(wb).isDisplayed();
	}

}
