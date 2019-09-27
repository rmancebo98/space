package com.gbhAutomation.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShadowFinder {
	
	private WebDriver driver;
	
	public ShadowFinder(WebDriver driver) {
		/* This class init the webElements */
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	Because of the page characteristic i had to create this method in order to find the elements i wanted to inside the "Shadow-root", all this
//	is new to me, i did my best to create this method and work with elements inside "Shadow-root's" but still needs some work
	
//	This method finds all the elements that can be find by cssSelector, then it executes the shadowRoot and finds the element with the
//	css that is specified by parameter
	
	public void ByCssAndClick(String css) {
		List<WebElement> w = driver.findElements(By.cssSelector("*"));
		WebElement x = null;
		for (WebElement webElement : w) {
	
			if (webElement.getTagName().equals("note-app")) {
				x = webElement;
				WebElement tag = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", x);
				tag = tag.findElement(By.cssSelector(css));
				tag.click();
				break;
			}
		}
	}

}
