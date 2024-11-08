package com.ABS.ataf.stepdef.Pega;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.ABS.ataf.PegaApp.PageObjects.AmazonPage;
import com.ABS.ataf.PegaApp.PageObjects.LoginPage;
import com.ABS.ataf.PegaApp.PageObjects.TataAigPage;
import com.ABS.ataf.TestBase.TestBase;
import com.ABS.ataf.helper.Logger.LoggerHelper;
import com.ABS.ataf.stepdef.common.LoginTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class AmazonStepDef {
	private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	 public static PropertiesConfiguration config ;
	 AmazonPage amazonPage;
	 
		//SeleniumFunNonPega seleniumFunNonPega;
		LoginPage loginpage;			
		
	 @When("I send Object Details")
		public void i_send_object() throws Throwable {
		 amazonPage=new AmazonPage(TestBase.getDriver());
		 amazonPage.sendAmazonPage(amazonPage);	
		 log.info("Sucessfully created object for TATA AIG class");
	 }
	 
	 @And("I wait for enter the security code")
		public void i_wait_for_enter_the_security_code() throws Throwable {
		 Thread.sleep(5000);
		 amazonPage.clickonContinueShooping();
	 }
	 
	 @And("I search for the product")
		public void i_search_for_the_product() throws Throwable {
		 amazonPage.searchfortheproduct();
	 }
	 
	 @And("I select the products")
		public void i_select_the_products() throws Throwable {
		 amazonPage.selectsfortheproducts();
	 }

}
