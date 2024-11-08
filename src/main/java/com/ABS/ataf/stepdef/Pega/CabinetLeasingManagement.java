package com.ABS.ataf.stepdef.Pega;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;
import com.ABS.ataf.PegaApp.PageObjects.CabinetLeasingManagementPage;
import com.ABS.ataf.PegaApp.PageObjects.LoginPage;
import com.ABS.ataf.PegaApp.PageObjects.TataAigPage;
import com.ABS.ataf.TestBase.TestBase;
import com.ABS.ataf.helper.Logger.LoggerHelper;
import com.ABS.ataf.stepdef.common.LoginTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CabinetLeasingManagement {
	 private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	 public static PropertiesConfiguration config ;
	 CabinetLeasingManagementPage clmpage;
	 
	 LoginPage loginpage;
	 
	 @When("I send object details")
		public void i_send_object() throws Throwable {
		 clmpage=new CabinetLeasingManagementPage(TestBase.getDriver());
		 clmpage.sendCabinetLeasingManagementPage(clmpage);	
		 log.info("Successfully created object for CLM page class");
		}
	 @Then("I set the Test data as {string}")
		public void setTestData(String testdata) throws Throwable {		
			config = new PropertiesConfiguration("src/main/resources/configfile/config.properties");
			config.setProperty("testdata",testdata+".json");		
		}
	 @When("I Enter login username and password")
		public void i_enter_Username_and_i_enter_password(DataTable dataTable) throws Exception {		 
		 String username = dataTable.asList().get(0);		 
		 String password = dataTable.asList().get(1);			
			try 
			{
				String usernamefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),username);
				String passwordfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),password);
				clmpage.enterUsername(usernamefromJson);
				log.info("Successfully username entered");
				clmpage.enterPassword(passwordfromJson);
				log.info("Successfully password entered");
			} catch (Exception e) 
			{
				 log.error("Unable to enter username or password");
			}		 
		}
	 @And("I Click on login button")
		public void i_click_on_login_button() throws Exception {
		 clmpage.clickOnLoginbutton();	
		 log.info("Successfully clicked on login button");
		 Thread.sleep(3000);
		}
	 @And("I Click on login button.")
		public void i_click_on_login_button1() throws Exception {
		 clmpage.clickOnLoginbutton();
		 Thread.sleep(3000);
		 clmpage.clickOnLoginbutton1();	
		 log.info("Successfully clicked on login button");
		 Thread.sleep(3000);
		}
	 @And("I validate the case work status")
		public void i_validate_the_case_work_status(DataTable dataTable) throws Exception {
		 String status = dataTable.asList().get(0);
			try 
			{
				Thread.sleep(4000);
				String statusfromJSON = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),status);
				String actual=clmpage.verifyCaseStatus().toLowerCase();
				String Exp=statusfromJSON.toLowerCase();
				System.out.println("Actual :"+actual);
				System.out.println("Expected :"+Exp);
				Assert.assertEquals(actual, Exp);
				log.info("Successfully verified work status");
			} catch (Exception e) {
				log.error("Unable to verify status");
			}
		}
	 @And("I Click on new cabinet lease request")
		public void i_click_on_new_cabinet_lease_request() throws Exception {
		 clmpage.clickOnPlus();
		 log.info("Successfully clicked on Plus icon");
		 clmpage.clickOnCabinetLeaseRequest();	
		 log.info("Successfully clicked on FNOL");
		}
	 @And("I Validate request")
		public void i_validate_request(DataTable dataTable) throws Exception {
		 String RequestID = dataTable.asList().get(0);		 
		 String RequestDate = dataTable.asList().get(1);
		 String LeaseStartDate = dataTable.asList().get(2);		 
		 String LeaseEndDate = dataTable.asList().get(3);
		 String LeaseAmount = dataTable.asList().get(4);		 
		 String CabinetDimensions = dataTable.asList().get(5);
		 String AdditionalFeatures = dataTable.asList().get(6);		
		 String PaymentFrequency = dataTable.asList().get(7);
		 String CabinetType = dataTable.asList().get(8);	
		 String RequestIDfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),RequestID);
		 String RequestDatefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),RequestDate);
		 String LeaseStartDatefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),LeaseStartDate);
		 String LeaseEndDatefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),LeaseEndDate);
		 String LeaseAmountfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),LeaseAmount);
		 String CabinetDimensionsfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),CabinetDimensions);
		 String AdditionalFeaturesfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),AdditionalFeatures);
		 String PaymentFrequencyfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),PaymentFrequency);
		 String CabinetTypefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),CabinetType);
		 clmpage.enterRequestID(RequestIDfromJson);
		 clmpage.enterRequestDate(RequestDatefromJson);
		 clmpage.enterLeaseStartDate(LeaseStartDatefromJson);
		 clmpage.enterLeaseEndDate(LeaseEndDatefromJson);
		 clmpage.enterLeaseAmount(LeaseAmountfromJson);
		 clmpage.selectPaymentFrequency(PaymentFrequencyfromJson);
		 clmpage.selectCabinetType(CabinetTypefromJson);
		 clmpage.enterCabinetDimensions(CabinetDimensionsfromJson);
		 clmpage.enterAdditionalFeatures(AdditionalFeaturesfromJson);
		 clmpage.selectIsCabinetAvailable();
		 log.info("Successfully validated the request");
		}
	 @And("I Enter wrong contact details")
		public void i_enter_contact_details(DataTable dataTable) throws Exception {
		 String FirstName = dataTable.asList().get(0);		 
		 String LastName = dataTable.asList().get(1);
		 String Email = dataTable.asList().get(2);		 
		 String CountryCode = dataTable.asList().get(3);
		 String WrongPhoneNumber = dataTable.asList().get(4);
		 String FirstNamefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),FirstName);
		 String LastNamefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),LastName);
		 String EmailfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),Email);
		 String CountryCodefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),CountryCode);
		 String PhoneNumberfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),WrongPhoneNumber);
		 clmpage.enterFirstName(FirstNamefromJson);
		 clmpage.enterLastName(LastNamefromJson);
		 clmpage.enterEmail(EmailfromJson);
		 clmpage.selectCountryCode(CountryCodefromJson);
		 clmpage.enterPhoneNumber(PhoneNumberfromJson);	
		 log.info("Wrong phone number entered");
		}
	 @Then ("I validate error message")
		public void i_validate_error_message() throws Exception {
		 clmpage.fetchErrorMessage();	
		 log.info("Successfully i fetch the wrong mobile error message");
		}
	 @When ("I Re enter correct contact details")
		public void i_Re_enter_correct_contact_details(DataTable dataTable) throws Exception {
		 String PhoneNumber = dataTable.asList().get(0);
		 String PhoneNumberfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),PhoneNumber);
		 clmpage.reenterPhoneNumber(PhoneNumberfromJson);	
		 log.info("Successfully i re-entered the correct mobile number");
		}
	 @And("I Enter Location details")
		public void i_enter_location_details(DataTable dataTable) throws Exception {
		 String AddressLine1 = dataTable.asList().get(0);		 
		 String AddressLine2 = dataTable.asList().get(1);
		 String CityTown = dataTable.asList().get(2);		 
		 String State = dataTable.asList().get(3);
		 String PostalCode = dataTable.asList().get(4);
		 String AddressLine1fromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),AddressLine1);
		 String AddressLine2fromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),AddressLine2);
		 String CityTownfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),CityTown);
		 String StatefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),State);
		 String PostalCodefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),PostalCode);
		 clmpage.selectCountry();
		 clmpage.enterAddressLine1(AddressLine1fromJson);
		 clmpage.enterAddressLine2(AddressLine2fromJson);
		 clmpage.enterCityOrTown(CityTownfromJson);
		 clmpage.selectState(StatefromJson);
		 clmpage.enterPostalCode(PostalCodefromJson);
		 log.info("I entered location details successfully");
		}
	 @And("I click on submit button")
		public void i_click_On_Submit_button() throws Exception {
		 clmpage.clickOnSubmitButton();	
		 log.info("Successfully clicked on submit button");	
		}
	 @And("I close save address popup")
		public void i_close_save_address_popup() throws Exception {
		 clmpage.cliccOnNoThanks();	
		 log.info("Successfully clicked on submit button");	
		}
	 @And("I Click on Log off")
		public void i_click_on_Log_off() throws Exception {
		 clmpage.clickOnLogoff();
		 Thread.sleep(4000);
		 log.info("Successfully clicked on Logoff button"); 
		}
	 @And("I Search for the previous case")
		public void i_search_for_the_previous_case() throws Exception {
		 clmpage.searchForPreviousCase(); 
		}
	 @And("I Click on Go button")
		public void i_click_on_Go_button() throws Exception {
		 clmpage.clickOnGoButton();		
		 log.info("Successfully clicked on Go button");  
		}
	 @Then("I Verify case Assigned To {string}")
		public void i_verify_case_Assigned_To(String assign) throws Throwable 
		{
		 Thread.sleep(500);
			try 
			{
				Assert.assertTrue(clmpage.verifyCaseAssignedTO().equalsIgnoreCase(assign),"actual :"+clmpage.verifyCaseAssignedTO()+" expected :"+assign);
				log.info("Successfully verified Case Assigined To");
			} catch (Exception e) {
				log.error("Unable to verify Case Assigned");
			}
		}
	 @When("I Change approval status {string}")
		public void i_change_approval_status(String ApprovalStatus) throws Exception {
		 clmpage.changeApprovalStatus(ApprovalStatus);
		 log.info("I successfully i selected Approve or Reject");
		}
	 @When("I copy the element text by {string} and assign to the variable {string}")
		public void I_copy_element_text(String xpath,String VariableText) throws Exception
		{
		 clmpage.GetCaseId(xpath, VariableText);
		}
	 @Then("I enter element by {string} with data {string}")
		public void I_search_for_the_created_case(String xpath,String VariableText) throws Throwable {
		 clmpage.searchCase(xpath, VariableText);		
		}

}
