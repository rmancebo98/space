package com.gbhAutomation.configuration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class android {
	File app = new File("/Users/macbookpro/eclipse-workspace/practica/src/test/java/com/gbhAutomation/util/selendroid-test-app-0.17.0.apk");

	
//	capa.setCapability(MobileCapabilityType.APP, app.getAbsolutePath);
	public  void properties () throws MalformedURLException {
		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capa.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capa.setCapability(MobileCapabilityType.DEVICE_NAME, "ANGROI_DEVAIS");
		capa.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capa.setCapability(MobileCapabilityType.VERSION, "6.0.1");
		capa.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "8.0.1");
		capa.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp.HomeScreenActivity");
		
		AndroidDriver adriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capa);
	}
}
