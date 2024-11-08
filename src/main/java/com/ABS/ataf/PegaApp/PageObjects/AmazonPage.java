package com.ABS.ataf.PegaApp.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;

public class AmazonPage extends CustomerInfoPage implements AmazonPageLoc {
	
	AmazonPage amazonpage;
	
	public AmazonPage(WebDriver driver) {
		super(driver);
	}		
	public void sendAmazonPage(AmazonPage amazonpage) {
		this.amazonpage = amazonpage;
	}
	public void clickonContinueShooping() {
		try{
			 SeleniumFunc.xpath_GenericMethod_Click(continue_shopping);
		 }catch (Exception e) {
			
		}
	}
	public void searchfortheproduct() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(search_feild, "TV");
		SeleniumFunc.xpath_GenericMethod_Click(search_BUTTON);
	}
	public void selectsfortheproducts() throws Exception {
		for(int next=1;next<20; next++)
		{
		List<WebElement> addtocart = driver.findElements(By.xpath(addTocart));
//		WebElement pre = driver.findElement(By.xpath(privious));
//		System.out.println(pre.isEnabled());
//		System.out.println(pre.isDisplayed());
//		System.out.println(pre.isSelected());
	    List<WebElement> prices = driver.findElements(By.xpath(price));
	    for(int i=0;i<prices.size();i++)
	    {
	    	String message =SeleniumFunc.getElementText(prices.get(i));
//			System.out.println(message);
			message = message.replaceAll(" ", "");
			message = message.replaceAll(",", "");
			int num = Integer.parseInt(message);
//			System.out.println(num);
			if (num<30000) {
				System.out.println(num);
				addtocart.get(i).click();
				}
			Thread.sleep(2000);
	    }
	    SeleniumFunc.xpath_GenericMethod_Click(next_button);
	    Thread.sleep(4000);
		}
	}
}
