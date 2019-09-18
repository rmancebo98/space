package com.gbhAutomation.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void startChrome(String url) throws InterruptedException {
		//this driver method opens a Chrome WebBrowser with the url specified by parameter (Version 76 due the chrome driver version), also, the driver used is for Mac
		
		System.setProperty("webdriver.chrome.driver","./src/test/java/com/practica/util/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
}