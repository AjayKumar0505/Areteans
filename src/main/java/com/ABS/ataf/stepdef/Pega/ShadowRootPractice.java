package com.ABS.ataf.stepdef.Pega;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ABS.ataf.utility.ResourceHelper;

public class ShadowRootPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		String CSS="document.querySelector("div[class='jackPart']").shadowRoot.querySelector("a[traget='_blank']")";
//		String CSS1= "a[traget='_blank']";
//		String script = "return arguments[0].shadowRoot.querySelector('"+CSS1+"');";
//		WebElement parent = driver.findElement(By.xpath("//div[@class='jackPart']"));
//		WebElement shadowRootElement =(WebElement) ((JavascriptExecutor)driver)
//				.executeScript(script, parent);
//		System.out.println(shadowRootElement.getLocation());
//		shadowRootElement.click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement shadowHost = driver.findElement(By.xpath("//div[@class='jackPart']"));
//		WebElement shadowRoot = (WebElement) js.executeScript("return argument[0].shadowRoot", shadowHost);
//		WebElement elementInShadowDOM = (WebElement) js.executeScript("return argument[0].querySelector()", args)
//				shadowRoot.findElement(By.xpath("//a[@class='learningHub']"));
//		js.executeScript("arguments[0].click();",elementInShadowDOM);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
        // Locate the shadow host element
//        WebElement shadowHost = driver.findElement(By.cssSelector("div.jackPart"));
 
        // Access the shadow root of the shadow host
//        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
 
        // Locate the element within the shadow root
//        WebElement elementInShadowDOM = (WebElement) js.executeScript(
//            "return arguments[0].querySelector(\"a[target='_blank']\")", shadowRoot);
 
        // Scroll to the element within the shadow DOM
//        js.executeScript("arguments[0].scrollIntoView(true);", elementInShadowDOM);
 
        // Perform click operation
//        js.executeScript("arguments[0].click();", elementInShadowDOM);
		
		
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        
//        WebElement shadowHost = driver.findElement(By.cssSelector("div.jackPart")); //parentg tag
// 
//        WebElement elementInShadowDOM = (WebElement) js.executeScript(
//                "return arguments[0].querySelector(\"a[target='_blank']\")", shadowHost);
// 
//        js.executeScript("arguments[0].scrollIntoView(true);", elementInShadowDOM);
//        js.executeScript("arguments[0].focus();", elementInShadowDOM);
//        Thread.sleep(2000);
//        js.executeScript("arguments[0].click();", elementInShadowDOM);
//        System.out.println(elementInShadowDOM.getText());
//		-------------------------------------------------------------------------------
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 
//	       
//	        WebElement shadowHost = driver.findElement(By.cssSelector("div.jackPart"));
//	 
//	        WebElement elementInShadowDOM = (WebElement) js.executeScript(
//	            "return arguments[0].shadowRoot.querySelector(\"a[target='_blank']\")", shadowHost);
//	 
//	        System.out.println(elementInShadowDOM.getText());
//	        
//	        
//	        WebElement elementInShadowSend = (WebElement) js.executeScript(
//		            "return arguments[0].shadowRoot.querySelector(\"input[id='kils']\")", shadowHost);
//	        js.executeScript("arguments[0].scrollIntoView(true);", elementInShadowSend);
//	        js.executeScript("arguments[0].value = 'AJAY';", elementInShadowSend);
//	        
//	        
//	        
//	        WebElement firstShadowHost = (WebElement) js.executeScript("return document.querySelector(\"div.jackPart\").shadowRoot");
//	        
//	        WebElement secondShadowRoot = (WebElement) js.executeScript("return arguments[0].querySelector(\"div[qaid='country']\").shadowRoot", firstShadowHost);
//	 
//	        WebElement Element = (WebElement) js.executeScript("return arguments[0].querySelector(\"input[id='pizza']\")", secondShadowRoot);
//	 
//	        Element.sendKeys("Pizza");
	 
//		js.executeScript("document.querySelector(\"div.jackPart\").shadowRoot.querySelector(\"a[target='_blank']\").innerText = 'Ajay';");
//		 js.executeScript("document.querySelector(\"div.jackPart\").shadowRoot.querySelector(\"div[qaid='country']\").shadowRoot.querySelector(\"input[id='pizza']\").value = 'PIZZA';");
 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 j.executeScript("document.querySelector(\"div[id='userName']\").shadowRoot.querySelector(\"div[id='app2']\").shadowRoot.querySelector(\"input[id='pizza']\").value='test123'");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
