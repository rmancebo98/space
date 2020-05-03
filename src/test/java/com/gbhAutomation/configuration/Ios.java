package com.gbhAutomation.configuration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class Ios {
	
	public void configuration() throws MalformedURLException {
		DesiredCapabilities capa = new DesiredCapabilities(); 
		capa.setCapability("deviceName","iPhone XS");
//		capa.setCapability("platformName", "iOS");
//		capa.setCapability("platformVersion", "13");
		capa.setCapability(CapabilityType.BROWSER_NAME,"safari");
		
		IOSDriver idriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capa);
		idriver.get("https://www.youtube.com");
	}

}
