package com.gbhAutomation.Pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gbhAutomation.util.ShadowFinder;

public class NotePage {
	
	private WebDriver driver;
	private ShadowFinder finder;

	public NotePage(WebDriver driver) {
		/* This class init the webElements */
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body")
	WebElement firebaseBody;
	
//	This is the method of the testing, i allways rather not to use implicit waits, its something that should not be used, but, i was
//	unable to locate some items that are inside a tree of "Shadow-roots", so ,because of that i cant specify selenium to wait for any condition
//	also, because of that, i had to use the "Action performer" to move trough the page
	
//	This is a simple test that adds a note
	
	public void addNote(String title, String note) throws InterruptedException, AWTException {
		
		finder = new ShadowFinder(driver);
		Actions action = new Actions(driver);
		
		Thread.sleep(7000);
		finder.ByCssAndClick("paper-fab");
		Thread.sleep(4000);
		firebaseBody.sendKeys(Keys.TAB+title);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(note).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.SPACE).perform();
	}
}
