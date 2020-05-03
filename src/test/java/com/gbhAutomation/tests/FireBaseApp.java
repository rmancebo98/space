package com.gbhAutomation.tests;
import java.awt.AWTException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import com.gbhAutomation.Pages.LoginPage;
//import com.gbhAutomation.Pages.NotePage;
//import com.gbhAutomation.configuration.Chrome;
//import com.gbhAutomation.configuration.android;
import com.gbhAutomation.configuration.Ios;


public class FireBaseApp {
	
	//I like to use JUnit because it keep it simple, i know that cucumber is easier to read but in my opinion with JUnit its easier to code, just the Pagefactory and the test
	//Also, with JUnit we can do stuff like specify the method that would be executed at the beginning of every test, we can specify the order by number, and much more
	
	//this class opens calls the configuration class (Chrome class that i create on java/com/gbhAutomation/configuration folder)
	
//	private LoginPage login;
//	private NotePage note;

//	this method runs before every test is going to run
	@Before
	public void startChrome() throws InterruptedException, MalformedURLException {
//		Chrome chrome = new Chrome();
//		chrome.chromePath();
//		android an = new android();
//		an.properties();
		Ios ios = new Ios();
		ios.configuration();
	}
	
	//this is a "New note test" that creates a new note every time it runs
//	Please add your email and password to login into firebaseapp
	@Test
	public void newNoteTest() throws InterruptedException, AWTException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://gbhqatest.firebaseapp.com/");
//		login = new LoginPage(driver);
//		login.loginToFireBase(" "," ");
//		note = new NotePage(driver);
//		note.addNote("Title here","This is a note");
	}
	public void android() {
		
	}
}