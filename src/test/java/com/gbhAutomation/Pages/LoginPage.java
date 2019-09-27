package com.gbhAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gbhAutomation.util.ShadowFinder;
import com.gbhAutomation.util.Wait;

public class LoginPage {

	private WebDriver driver;
	private Wait wait;
	private ShadowFinder finder;

	public LoginPage(WebDriver driver) {
		/* This class init the webElements */
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body")
	WebElement firebaseBody;
	@FindBy(xpath = "//input[@type='email']")
	WebElement mailTxt;
	@FindBy(xpath = "(//span[@class='RveJvd snByac'])[1]")
	WebElement siguienteBtn;
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordTxt;
	
//	This method log the user in with the mail and password specified by parameters

	public void loginToFireBase(String mail, String password) {
		
		finder = new ShadowFinder(driver);
		wait = new Wait(driver);
		
		wait.toBeClickable(firebaseBody);
		finder.ByCssAndClick("na-login");
		wait.toBeClickable(mailTxt);
		mailTxt.click();
		mailTxt.sendKeys(mail);
		siguienteBtn.click();
		wait.toBeClickable(passwordTxt);
		passwordTxt.sendKeys(password);
		siguienteBtn.click();
	}

}
