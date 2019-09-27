package com.gbhAutomation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	private WebDriver driver;
	
	public Wait(WebDriver driver) {
		/* This class init the webElements */
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	i allways likes to make a separate class for the wait, so the code looks cleaners on the Page Class (This is my draft of a wait class)
	
	public void toBeClickable (WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
