
package com.ABS.ataf.configuration.browser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ABS.ataf.utility.ResourceHelper;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ChromeBrowser {

	public ChromeOptions getChromeCapabilities() {
		//ajay
//		DesiredCapabilities chrome = DesiredCapabilities.chrome();
//		chrome.setJavascriptEnabled(true);
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		//options.addArguments("--headless");
//		options.addArguments("--window-size=1920,1080");
//		options.addArguments("disable-infobars");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-gpu");
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//		prefs.put("autofill.profile_enabled", false);
//		options.setExperimentalOption("prefs", prefs);
//		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
////		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("credentials_enable_service", false);
//		prefs.put("profile.password_manager_enabled", false);
//		options.setExperimentalOption("prefs", prefs);
//		options.merge(chrome);
//		//chrome.setCapability(ChromeOptions.CAPABILITY, options);
		
		//ajay
		ChromeOptions options = new ChromeOptions();
		options.setCapability("goog:chromeOptions", getChromeOptions());
		return options;
	}
	//ajay
	private Map<String, Object> getChromeOptions() {
        Map<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_setting_values.notifications", 2);
        chromePrefs.put("autofill.profile_enabled", false);
 
        Map<String, Object> chromeOptions = new HashMap<>();
        chromeOptions.put("prefs", chromePrefs);
        chromeOptions.put("args", Arrays.asList("start-maximized", "disable-infobars", "--disable-notifications", "--disable-gpu"));
        return chromeOptions;
    }
 
    public WebDriver getChromeDriver(ChromeOptions options) {
    	//ajay
//    		if (System.getProperty("os.name").contains("Mac")) {
//    				System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver"));
//    		} 
//    		else if (System.getProperty("os.name").contains("Windows")) {
//    				System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
//        }
    	WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }
//ajay
//	public WebDriver getChromeDriver(ChromeOptions cap) {
//		if (System.getProperty("os.name").contains("Mac")){
//			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver"));
//			//WebDriverManager.chromedriver().setup();
//			return new ChromeDriver(cap);
//		}
//		else if(System.getProperty("os.name").contains("Window")){
//			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
//			//WebDriverManager.chromedriver().setup();
//			return new ChromeDriver(cap);
//		}
//		return null;
//	}
}
