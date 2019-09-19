package com.gbhAutomation.tests;
import org.junit.Before;
import org.junit.Test;

import com.gbhAutomation.configuration.Chrome;

public class FireBaseApp {
	
	//I like to use JUnit because it keep it simple, i know that cucumber is easier to read but in my opinion with JUnit its easier to code, just the Pagefactory and the test
	//Also, with JUnit we can do stuff like specify the method that would be executed at the beginning of every test, we can specify the order by number, and much more
	
	//this class opens calls the configuration class (Chrome class that i create on java/com/gbhAutomation/configuration folder)
	@Before
	public void startChrome() throws InterruptedException {
		Chrome chrome = new Chrome();
		String url = "https://gbhqatest.firebaseapp.com/";
		chrome.startChrome(url);
	}
	
	//automation should be implemented here, on the "@Test" class (can be more than one)
	@Test
	public void testExample() {
	}
}