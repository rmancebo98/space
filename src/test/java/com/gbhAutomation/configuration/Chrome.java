package com.gbhAutomation.configuration;

public class Chrome {

	//in this method, i specify the relative path to the chromeDriver
	public void chromePath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/test/java/com/gbhAutomation/util/chromedriver");
	}
}