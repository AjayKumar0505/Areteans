package com.ABS.ataf.PegaApp.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;
import com.github.dockerjava.api.model.Driver;

public class UnileverPage extends CustomerInfoPage implements UnileverPageLoc {
	
	UnileverPage unipage;
	static String CaseID;

	public UnileverPage(WebDriver driver) {
		super(driver);
	}		
	public void sendEndeavourEnergyPage(UnileverPage unipage) {
		this.unipage = unipage;
	}
	public void enterUsername(String usernamefromJson) {
		try{
			SeleniumFunc.xpath_GenericMethod_Sendkeys(username, usernamefromJson);
			Assert.assertTrue(true, "Username entered Successfully");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to enter the username");
		}
	}
	public void enterPassword(String passwordfromJson) {
		try{
			SeleniumFunc.xpath_GenericMethod_Sendkeys(password, passwordfromJson);
			Assert.assertTrue(true, "Password entered Successfully");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to enter the password");
		}
	}
	public void clickOnLogin() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(login);
			Assert.assertTrue(true, "Login button clicked Successfully");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on login button");
		}
	}
	public void verifyThePageTitle(String Expected_title) {
		try{
			Thread.sleep(8000);
			String pageTitle = driver.getTitle();
			Assert.assertEquals(pageTitle,Expected_title);
			Assert.assertTrue(true, "Successfully verify the page title");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to verify the page title");
		}
	}
	public void clickKnowmore() {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(knowmore);
			Assert.assertTrue(true, "Successfully clicked on knowmore");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on knowmore");
		}
	}
	public void clickcaseId() {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(caseId);
			Assert.assertTrue(true, "Successfully clicked on caseId");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on caseId");
		}
	}
	
}
