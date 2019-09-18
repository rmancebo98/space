package com.gbhAutomation.tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.gbhAutomation.configuration.Chrome;

public class FireBaseApp {
	
	WebDriver driver;
	//I like to use JUnit because it keep it simple, i know that cucumber is easier to read but in my opinion with JUnit its easier to code, just the Pagefactory and the test
	//Also, with JUnit we can do stuff like specify the method that would be executed at the beginning of every test, we can specify the order by number, and much more
	
	@Before
	public void startChrome() throws InterruptedException {
		//this class opens calls the configuration class (Chrome class that i create on java/com/practica/configuration folder)
		String url = "https://gbhqatest.firebaseapp.com/";
		Chrome.startChrome(url);
		
	}
	
	@Test
	public void testExample() {
		//automation should be implemented here, on the "@Test" class (can be more than one)
	}
	
	@After
	public void closeBrowser() {
		//this method will always be implemented after the test
		driver.close();
		driver.quit();
		
	}

}
