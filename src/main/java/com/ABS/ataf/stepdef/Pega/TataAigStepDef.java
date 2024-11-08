package com.ABS.ataf.stepdef.Pega;

import java.util.List;

import java.util.Map;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.testng.Assert;
//
//import com.ABS.ataf.GeneralHelperSel.SeleniumFunNonPega;
import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;
import com.ABS.ataf.PegaApp.PageObjects.HomePage;
import com.ABS.ataf.PegaApp.PageObjects.LoginPage;
import com.ABS.ataf.PegaApp.PageObjects.TataAigPage;
import com.ABS.ataf.TestBase.TestBase;
import com.ABS.ataf.configreader.ObjectRepo;
import com.ABS.ataf.helper.Logger.LoggerHelper;
import com.ABS.ataf.stepdef.common.LoginTest;
//import com.ABS.ataf.GeneralHelperSel.SeleniumFunNonPega;
import com.ABS.ataf.PegaApp.PageObjects.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TataAigStepDef {
	 private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	 public static PropertiesConfiguration config ;
	 TataAigPage tataaigpage;
	 
		//SeleniumFunNonPega seleniumFunNonPega;
		LoginPage loginpage;			
		
	 @When("I send Object details")
		public void i_send_object() throws Throwable {
		 tataaigpage=new TataAigPage(TestBase.getDriver());
		 tataaigpage.sendTataAigPage(tataaigpage);	
		 log.info("Sucessfully created object for TATA AIG class");
		}
	 @Then("I set the test data as {string}")
		public void setTestData(String testdata) throws Throwable {		
			config = new PropertiesConfiguration("src/main/resources/configfile/config.properties");
			config.setProperty("testdata",testdata+".json");		
		}
//	 @Then("I open new window and luanch the URL")
//	 public void i_open_new_window_and_luanch_the_URL(){
//		 tataaigpage.lunchTheNewWindow();
//		}
	 @When("I enter login username and password")
		public void i_enter_Username_and_i_enter_password(DataTable dataTable) throws Exception {		 
		 String username = dataTable.asList().get(0);		 
		 String password = dataTable.asList().get(1);			
		 
			try 
			{
				String usernamefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),username);
				String passwordfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),password);
				tataaigpage.enterUsername(usernamefromJson);
				log.info("Successfully username entered");
				tataaigpage.enterPassword(passwordfromJson);
				 log.info("Successfully password entered");
			} catch (Exception e) {
				 log.error("Unable to enter username or password");
			}		 
		}
	 @And("I click on login button")
		public void i_click_on_login_button() throws Exception {
		 tataaigpage.clickOnLoginbutton();	
		 log.info("Successfully clicked on login button");
		}
	 @And("I click on Create FNOL")
		public void i_click_on_Create_FNOL() throws Exception {
		 Thread.sleep(10000);
		 tataaigpage.clickOnPlus();
		 log.info("Successfully clicked on Plus icon");
		 tataaigpage.clickOnFNOL();	
		 log.info("Successfully clicked on FNOL");
		}
	 @And("I Initiate Claim")
		public void i_initiate_Claim(DataTable dataTable) throws Exception {
		 String phonenumber = dataTable.asList().get(0);
		 String otp = dataTable.asList().get(1);
		 try {
				String phonenumberfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),phonenumber);
				String otpfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),otp);
				tataaigpage.enterPhoneNumber(phonenumberfromJson);	
				log.info("Successfully entered mobile number");			
				tataaigpage.enterOTP(otpfromJson);
				log.info("Successfully entered OTP");
			} catch (Exception e) {
				log.error("Unable to enter Mobile Number or OTP");
			}		 
		}
	 @And("I Identify Policy")
		public void i_identify_policy(DataTable dataTable) throws Exception {
		 String policynumber = dataTable.asList().get(0);
//		 String otp = dataTable.asList().get(1);
		 try {
				String policynumberfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),policynumber);
//				String otpfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),otp);
				tataaigpage.enterPolicyNumber(policynumberfromJson);
				tataaigpage.enterdate();
				Thread.sleep(1000);
				tataaigpage.selectPolicy();
				log.info("Successfully Identified Policy");
//				tataaigpage.enterOTP(otpfromJson);
			} catch (Exception e) {
				log.error("Unable to enter Policy Number");
			}		 
		}
	 @And("I enter Basic Details")
		public void i_enter_Basic_Details(DataTable dataTable) throws Exception {
		 String calleridentification = dataTable.asList().get(0);
		 String claimfor = dataTable.asList().get(1);
		 try {
				String calleridentificationfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),calleridentification);
				String claimforfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),claimfor);
				tataaigpage.selectCallerIdentification(calleridentificationfromJson);
				Thread.sleep(1000);
				tataaigpage.selectClaimFor(claimforfromJson);
				tataaigpage.clickOnNext();
				log.info("Successfully entered basic details");
		 	}catch (Exception e) {
		 		log.error("Unable to Select caller identification or claim for");
			}
		}
	 @And("I enter Insured Contact Details")
		public void i_enter_Insured_Contact_Details() throws Exception {
//		 String calleridentification = dataTable.asList().get(0);
//		 String claimfor = dataTable.asList().get(1);
//		 try {
//				String calleridentificationfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),calleridentification);
//				String claimforfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),claimfor);
//				tataaigpage.selectCallerIdentification(calleridentificationfromJson);
//				tataaigpage.selectClaimFor(claimforfromJson);
//		 	}catch (Exception e) {
//		 		System.out.println("Unable to Select caller identification or claim for");
//			}
		}
	 @And("I enter Claimant Details")
	 public void i_enter_Claimant_Details() throws Throwable {	
		 tataaigpage.clickonIsInsuredtheClaimant();
		 log.info("Successfully entered Claimant Details");
		}
	 @And("I enter Loss Details")
		public void i_enter_Loss_Details(DataTable dataTable) throws Exception {
		 String LossDescription = dataTable.asList().get(0);
		 String DamagetotheVehicle = dataTable.asList().get(1);
		 String DivertedtoKPG = dataTable.asList().get(2);
		 String Iseventcatastrophe = dataTable.asList().get(3);
		 String Vehicleatworkshop = dataTable.asList().get(4);
		 try {
			 	Thread.sleep(1000);
				String LossDescriptionfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),LossDescription);
				String DamagetotheVehiclefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),DamagetotheVehicle);
				String DivertedtoKPGfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),DivertedtoKPG);
				String IseventcatastrophefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),Iseventcatastrophe);
				String VehicleatworkshopfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),Vehicleatworkshop);
				tataaigpage.selectPincode();
				tataaigpage.selectCity();
				tataaigpage.selectCityofRepair();
				tataaigpage.selectLossDescription(LossDescriptionfromJson);
				tataaigpage.selectAnyBITPPDInvolvement();
				tataaigpage.selectDamagetotheVehicle(DamagetotheVehiclefromJson);
				tataaigpage.selectDivertedtoKPG(DivertedtoKPGfromJson);
				tataaigpage.selectIseventcatastrophe(IseventcatastrophefromJson);
				tataaigpage.selectVehicleatworkshop(VehicleatworkshopfromJson);
				tataaigpage.selectWasVehicleParked();
				log.info("Successfully entered Loss Details");
		 	}catch (Exception e) {
		 		log.error("Unable to Select caller identification or claim for");
			}
		}
	 @And("I enter Driver Details")
	 public void i_enter_Driver_Details() throws Throwable {	
		 tataaigpage.enterDriverDetails();
			log.info("Successfully entered Driver Details");
		}
	 @And("I enter Garage Details")
	 public void i_enter_Garage_Details() throws Throwable {	
		 tataaigpage.enterGarageDetails();
			log.info("Successfully entered Garage Details");
		}
	 @Then("I verify account should be login")
	 public void i_verify_account_should_be_login() throws Throwable {	
		 tataaigpage.verifyLogin();
		 log.info("Account login done Successfully");
		}
	 @When("I click ok Notifications")
		public void i_click_ok_Notifications() throws Exception {
		 tataaigpage.clickOnNotification();	
		 log.info("Successfully clicked on Notification");		 
		}
	 @And("I click on first Notification")
		public void i_click_on_first_Notification() throws Exception {
		 tataaigpage.clickOnFirstNotification();	
		 log.info("Successfully clicked on first notification");	 
		}
	 @And("I click on Go button")
		public void i_click_on_Go_button() throws Exception {
		 tataaigpage.clickOnGoButton();		
		 log.info("Successfully clicked on Go button");  
		}
	 @And("I click ok Add icon")
		public void i_click_ok_Add_icon() throws Exception {
		 tataaigpage.clickOnAddIcon();		 
		 log.info("Successfully clicked on Add icon");	
		}
		@Then("I enter the details")
		public void i_Enter_below_details(DataTable dataTable) throws Exception {				   
			 String imt = dataTable.asList().get(0);
			 String repair = dataTable.asList().get(1);
			 String material = dataTable.asList().get(2);
			 String side = dataTable.asList().get(3);
			 String section = dataTable.asList().get(4);
			 String hsn = dataTable.asList().get(5);
			 String partprice = dataTable.asList().get(6);
			 String depprice = dataTable.asList().get(7);
			 String tax = dataTable.asList().get(8);
			 String install = dataTable.asList().get(9);
			 String labourRepair = dataTable.asList().get(10);
			 String GST = dataTable.asList().get(11);
			 String paintLabour = dataTable.asList().get(12);
			 String paintMaterial = dataTable.asList().get(13);
			 String paintGST = dataTable.asList().get(14);
			 String UpdateGST = dataTable.asList().get(15);
				try
				{
					String imtfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),imt);
					String repairfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),repair);
					String materialfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),material);
					String sidefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),side);
					String sectionfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),section);
					String hsnfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),hsn);
					String partpricefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),partprice);
					String deppricefromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),depprice);
					String taxfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),tax);
					String installfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),install);
					String GSTfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),GST);
					String paintLabourfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),paintLabour);
					String paintGSTfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),paintGST);
					String paintMaterialfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),paintMaterial);
					String labourRepairfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),labourRepair);
					String UpdateGSTfromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),UpdateGST);
				
			 tataaigpage.enterIMTValue(imtfromJson);
			 tataaigpage.enterSelectPart();
			 tataaigpage.selectRepairOrReplace(repairfromJson);	
			 tataaigpage.enterTypeOfMaterial(materialfromJson);
			 tataaigpage.selectSide(sidefromJson);	
			 tataaigpage.selectSection(sectionfromJson);
			 tataaigpage.enterHSNCode(hsnfromJson);
			 tataaigpage.enterPartPrice(partpricefromJson);
			 tataaigpage.enterDEPPercentage(deppricefromJson);
			 tataaigpage.enterTaxRate(taxfromJson);
			 tataaigpage.enterLabourRemoveandInstall(installfromJson);
			 tataaigpage.enterLabourRepair(labourRepairfromJson);
			 tataaigpage.enterGST(GSTfromJson);
			 tataaigpage.enterPaintLabour(paintLabourfromJson);
			 tataaigpage.enterPaintMaterial(paintMaterialfromJson);
			 tataaigpage.enterPaintGST(paintGSTfromJson);	
			 tataaigpage.clickOnSubmit();
			 tataaigpage.clickOnEdit();	
			 tataaigpage.reEnterPaintGST(UpdateGSTfromJson);	
			 tataaigpage.clickOnSubmit();
			 log.info("Successfully entered basic details");
				}
				catch (Exception e) {
					log.error("Unable to enter the basic details");
				}
		}
	 @And("I click On Submit button")
		public void i_click_On_Submit_button() throws Exception {
		 tataaigpage.clickOnSubmitButton();	
		 log.info("Successfully clicked on submit button");	
		}
	 @And("I click on Next")
		public void i_click_On_Next() throws Exception {
		 tataaigpage.clickOnNext();	
		 log.info("Successfully clicked on Next button");	
		}
	 @And("I click On Submit")
		public void i_click_On_Submit() throws Exception {
		 tataaigpage.clickOnSubmit();	
		 log.info("Successfully clicked on submit button");	
		}
	 @And("I enter Fraud information")
		public void i_enter_Fraud_information(DataTable dataTable) throws Exception {
		 String outcome = dataTable.asList().get(0);
		 String outcomeFromJson = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),outcome);
		 System.out.println("******************"+outcomeFromJson);
		 tataaigpage.selectOutcome(outcomeFromJson);		
		 tataaigpage.selectRouteTo();
		 log.info("Successfully entered the fraud information");
		}	
	 @And("I click on Log off")
		public void i_click_on_Log_off() throws Exception {
		 tataaigpage.clickOnLogoff();
		 Thread.sleep(4000);
		 log.info("Successfully clicked on Logoff button"); 
		}
	 @And("I select Decision {string}")
		public void i_select_Decision(String decision) throws Exception {
		 tataaigpage.selectDecision(decision);
		 log.info("Successfully selected Decision");	 
		}
	 @And("I select Recommend To {string}")
		public void i_select_Recommend_To(String Username) throws Exception {
		 tataaigpage.selectRecommendTo(Username);
		 log.info("Successfully selected Recommend To");		 
		}
	 @And("I enter in Comments by ZCU")
		public void i_enter_in_Comments_by_ZCU() throws Exception {
		 tataaigpage.enterComments();		
		 log.info("Successfully entered Comments by ZCU"); 
		}
	 @And("I enter in Comments by NU")
		public void i_enter_in_Comments_by_NU() throws Exception {
		 tataaigpage.enterComments_NU();	
		 log.info("Successfully entered Comments by NU");	 
		}
	 @And("I click on Search and enter Case ID and click on Enter")
		public void i_click_on_Search_and_enter_Case_ID_and_click_on_Enter() throws Exception {
		 tataaigpage.clickOnSearch(); 	
		 log.info("Successfully Searched for case with Case I'd then clicked on enter");	 
		}
	 @And("I upload Refference Documents {string}")
		public void i_upload_Refference_Documents(String DocumentType) throws Exception {
		 tataaigpage.enterDocumentCategory(DocumentType);
		 tataaigpage.clickOnSearchButton();	
		 tataaigpage.selectDocuments();	
		 log.info("Successfully uploaded Refference Documents");	
		}
	 @And("I select Investigator")
		public void i_select_Investigator() throws Exception {
		 try {
		 tataaigpage.selectInvestigator();
		 tataaigpage.clickOnSubmitButton();
		 log.info("Successfully selected Investigator");
		 }
		 catch (Exception e) {
			
		}
		}
	 @And("I verify Investigator Response and Providing Performance Rating {string}")
		public void i_verify_Investigator_Response_and_Providing_Performance_Rating(String ReportQuality) throws Exception {
		 try {
		 tataaigpage.clickOnVechileDetails();	
		 tataaigpage.clickOnLossMitigation();
		 tataaigpage.clickOnInvestigationDetails();	
		 tataaigpage.clickOnClaimDetails();	
		 tataaigpage.clickOnInvoiceDetails();
		 tataaigpage.clickOnDocumentDetails();
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
		 tataaigpage.selectReportQuality(ReportQuality);
		 tataaigpage.selectInvestigationOutcome();	
		 tataaigpage.enterFinalObservation();
		 tataaigpage.enterRemarks();
		 tataaigpage.selectSendBack();
		 log.info("Successfully verified Investigator Response and Providing Performance Rating");
		}
	 @Then("I verify the Login Page")
	 public void i_verify_the_Login_Page() throws Throwable {	
		 tataaigpage.verifyLoginPage();
		 log.info("Successfully verified the Login page");
		}
	 @And("I click on Verified and Accepted documents by Examiner")
		public void i_click_on_Verified_and_Accepted_documents_by_Examiner() throws Exception {
		 tataaigpage.verifyDocuments();		
		 log.info("Successfully i clicked on Verified and Accepted documents by Examiner"); 
		}
	 @And("I enter remarks for documents")
		public void i_enter_remarks_for_documents() throws Exception {
		 tataaigpage.EnterRemarksOnDocuments();
		 tataaigpage.selectSendBack();
		 log.info("Successfully entered Remarks for Documents");
		}
	 @Then("I verify Work Status")
		public void i_verify_work_status_as(DataTable dataTable) throws Throwable 
		{
			String status = dataTable.asList().get(0);
			try 
			{
				Thread.sleep(4000);
				String statusfromJSON = SeleniumFunc.getValueFromJSON(config.getProperty("testdata").toString(),status);
				String actual=tataaigpage.verifyCaseStatus().toLowerCase();
				String Exp=statusfromJSON.toLowerCase();
				System.out.println("Actual :"+actual);
				System.out.println("Expected :"+Exp);
				Assert.assertEquals(actual, Exp);
				log.info("Successfully verified work status");
			} catch (Exception e) {
				log.error("Unable to verify status");
			}
		}
	 @Then("I verify case Assigned To {string}")
		public void i_verify_case_Assigned_To(String assign) throws Throwable 
		{
		 Thread.sleep(500);
			try 
			{
				Assert.assertTrue(tataaigpage.verifyCaseAssignedTO().equalsIgnoreCase(assign),"actual :"+tataaigpage.verifyCaseAssignedTO()+" expected :"+assign);
				log.info("Successfully verified Case Assigined To");
			} catch (Exception e) {
				log.error("Unable to verify Case Assigned");
			}
		}
}
