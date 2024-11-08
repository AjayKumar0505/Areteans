
package com.ABS.ataf.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ABS.ataf.utility.ResourceHelper;



public class FirefoxBrowser {
	//ajay
//	public Capabilities getFirefoxCapabilities() {
//		DesiredCapabilities firefox = DesiredCapabilities.firefox();
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setAcceptUntrustedCertificates(true);
//		profile.setAssumeUntrustedCertificateIssuer(true);
//		firefox.setCapability(FirefoxDriver.PROFILE, profile);
//		firefox.setCapability("marionette", true);
//		return firefox;
//	}
//	
//	public WebDriver getFirefoxDriver(Capabilities cap) {
//		
//		if (System.getProperty("os.name").contains("Mac")){
//			System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/geckodriver"));
//			//WebDriverManager.firefoxdriver().setup();
//			return new ChromeDriver(cap);
//		}
//		else if(System.getProperty("os.name").contains("Window")){
//			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/geckodriver.exe"));
//			//WebDriverManager.firefoxdriver().setup();
//			return new ChromeDriver(cap);
//		}
//		return null;
//	}
	//ajay
	public FirefoxOptions getFirefoxCapabilities() {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        options.setProfile(profile);
        options.setCapability("marionette", true);
        return options;
    }
 
    public WebDriver getFirefoxDriver(Capabilities cap) {
    	if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/geckodriver"));
    	} 
    	else if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/geckodriver.exe"));
        }
        return new FirefoxDriver((FirefoxOptions) cap);
    }

}
