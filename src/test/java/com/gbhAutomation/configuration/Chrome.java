package com.gbhAutomation.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	//this driver method opens a Chrome WebBrowser with the url specified by parameter (Version 76 due the chrome driver version), also, the driver used is for Mac
	//NOTE: For some reason the version of Chrome + the version of ChromeDriver that i used is malfunctioning and is opening 2 browsers
	public void startChrome(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/test/java/com/gbhAutomation/util/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
}