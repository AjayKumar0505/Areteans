
package com.ABS.ataf.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//ajay
//import org.openqa.selenium.htmlunit.HtmlUnitOptions;

public class HtmlUnitBrowser {
	
	public Capabilities getHtmlUnitDriverCapabilities() {
//		DesiredCapabilities unit = DesiredCapabilities.htmlUnit();
//		
//		return unit;
		//ajay
		DesiredCapabilities unit = new DesiredCapabilities();
		return unit;

	}
	
	public WebDriver getHtmlUnitDriver(Capabilities cap) {
		return new HtmlUnitDriver(cap);
	}

}
