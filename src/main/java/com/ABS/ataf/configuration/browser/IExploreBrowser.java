
package com.ABS.ataf.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


import com.ABS.ataf.utility.ResourceHelper;



public class IExploreBrowser {
	//ajay
//	public Capabilities getIExplorerCapabilities() {
//		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//		cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR,
//				ElementScrollBehavior.BOTTOM);
//		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		cap.setCapability(
//				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//				true);
//		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		cap.setJavascriptEnabled(true);
//		return cap;
//	}
//	
//	public WebDriver getIExplorerDriver(Capabilities cap) {
//		System.setProperty("webdriver.ie.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/IEDriverServer.exe"));
//		//WebDriverManager.firefoxdriver().setup();
//		return new InternetExplorerDriver(cap);
//	}
	//ajay
	public InternetExplorerOptions getIExplorerCapabilities() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, ElementScrollBehavior.BOTTOM);
        options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//        options.setJavascriptEnabled(true);
        return options;
    }
 
    public WebDriver getIExplorerDriver(Capabilities cap) {
    	if (System.getProperty("os.name").contains("Windows")) {
System.setProperty("webdriver.ie.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/IEDriverServer.exe"));
        }
        return new InternetExplorerDriver((InternetExplorerOptions) cap);
    }

}
