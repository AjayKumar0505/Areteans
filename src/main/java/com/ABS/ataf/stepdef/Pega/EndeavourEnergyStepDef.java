package com.ABS.ataf.stepdef.Pega;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;
import com.ABS.ataf.PegaApp.PageObjects.UnileverPage;
import com.ABS.ataf.PegaApp.PageObjects.LoginPage;
import com.ABS.ataf.TestBase.TestBase;
import com.ABS.ataf.helper.Logger.LoggerHelper;
import com.ABS.ataf.stepdef.common.LoginTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EndeavourEnergyStepDef {
	
	 private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	 public static PropertiesConfiguration config ;
	 UnileverPage unipage;
	 
	 
	 LoginPage loginpage;
	 
	 @When("I create object")
		public void i_send_object() throws Throwable {
		 unipage=new UnileverPage(TestBase.getDriver());
		 unipage.sendEndeavourEnergyPage(unipage);	
		 log.info("Successfully created object for Endeavour Energy page class");
		}
	 
	 @Then("I set the Test data As {string}")
		public void setTestData(String testdata) throws Throwable {		
			config = new PropertiesConfiguration("src/main/resources/configfile/config.properties");
			config.setProperty("testdata",testdata+".json");		
		}
	 
	 @When("I Enter login Username and Password")
		public void i_enter_Username_and_i_enter_password(DataTable dataTable) {		 
		 String username = dataTable.asList().get(0);		//username= Debtorusername
		 String password = dataTable.asList().get(1);		//password=Debtorpassword
			try 
			{
				String usernamefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),username);
				String passwordfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),password);
				unipage.enterUsername(usernamefromJson);
				log.info("Successfully username entered");
				unipage.enterPassword(passwordfromJson);
				log.info("Successfully password entered");
			} catch (Exception e) 
			{
				 log.error("Unable to enter username or password");
			}		 
		}
	 
	 @And("I click on login")
		public void i_click_on_login() {
		 try 
			{
			unipage.clickOnLogin();
			log.info("Successfully clicked on login button");
		} catch (Exception e) 
		{
			 log.error("Unable to click on login button");
		}	
		}
	 
	 @Then("I Verify that {string} of the screen")
		public void  i_Verify_that_pagetitle_of_the_screen(String nametitle) {		
		 try 
			{
			 String titlefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),nametitle);
			unipage.verifyThePageTitle(titlefromJson);
			log.info("Successfully i verified the page title");
		} catch (Exception e) 
		{
			 log.error("Unable to verify the page title");
		}
		}
	 @Then("I click on knowmore")
		public void i_click_on_knowmore(){		
		 try 
			{
			unipage.clickKnowmore();
			log.info("Successfully clicked on knowmore");
		} catch (Exception e) 
		{
			 log.error("Unable to click on knowmore");
		}
		}
	 @Then("I click on caseId")
		public void i_click_on_caseId(){		
		 try 
			{
			unipage.clickKnowmore();
			log.info("Successfully clicked on caseId");
		} catch (Exception e) 
		{
			 log.error("Unable to click on caseId");
		}
		}

}
