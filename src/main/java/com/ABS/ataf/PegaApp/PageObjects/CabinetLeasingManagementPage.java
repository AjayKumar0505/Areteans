package com.ABS.ataf.PegaApp.PageObjects;
import com.ABS.ataf.configreader.ObjectRepo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;


public class CabinetLeasingManagementPage extends CustomerInfoPage implements CabinetLeasingManagementPageLoc{
	
	CabinetLeasingManagementPage clmpage;
	static String CaseID;

	public CabinetLeasingManagementPage(WebDriver driver) {
		super(driver);
	}		
	public void sendCabinetLeasingManagementPage(CabinetLeasingManagementPage clmpage) {
		this.clmpage = clmpage;
	}
	public void enterUsername(String Username) throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Sendkeys(userName_textbox, Username);
			Assert.assertTrue(true, "Username entered sucessfully");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to enter Username");
		}
	}
	public void enterPassword(String password) throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Sendkeys(password_textbox, password);
			Assert.assertTrue(true, "Password entered sucessfully");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to enter Password");
		}
	}
	public void clickOnLoginbutton() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(login_button);
			Assert.assertTrue(true, "Login button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Login button");
		}
	}
	public void clickOnLoginbutton1() throws Exception {
		Robot r = new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickOnPlus() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(plus_icon);
	}
	public void clickOnCabinetLeaseRequest() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(new_cabinet_lease_request);		
	}
	public void clickOnLogoff() throws Exception {
		SeleniumFunc.xpath_MoveToElement(profile_icon);
	}
	public String verifyCaseStatus() throws Exception {
		CaseID = SeleniumFunc.getElementText(case_Id);
		return SeleniumFunc.xpath_Genericmethod_getElementText(work_status);
	}
	public void enterRequestID(String requestIDfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(request_ID_textbox, requestIDfromJson);
	}
	public void enterRequestDate(String requestDatefromJson) throws Exception {
		String[] date = new String[3];
		for(int i=0;i<3;i++)
		{
			if(i==0) {
				date[i] = requestDatefromJson.substring(0, 2);
				System.out.println(date[i]);
			}
			if(i==1) {
				date[i] = requestDatefromJson.substring(2, 4);
				System.out.println(date[i]);
			}
			if(i==2) {
				date[i] = requestDatefromJson.substring(4);
				System.out.println(date[i]);
			}
		}
		SeleniumFunc.xpath_GenericMethod_Sendkeys(request_date_month, date[0]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(request_date_date, date[1]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(request_date_year, date[2]);
	}
	public void enterLeaseStartDate(String leaseStartDatefromJson) throws Exception {
		String[] date = new String[3];
		for(int i=0;i<3;i++)
		{
			if(i==0) {
				date[i] = leaseStartDatefromJson.substring(0, 2);
				System.out.println(date[i]);
			}
			if(i==1) {
				date[i] = leaseStartDatefromJson.substring(2, 4);
				System.out.println(date[i]);
			}
			if(i==2) {
				date[i] = leaseStartDatefromJson.substring(4);
				System.out.println(date[i]);
			}
		}
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_Start_Date_month, date[0]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_Start_Date_date, date[1]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_Start_Date_year, date[2]);
	}
	public void enterLeaseEndDate(String leaseEndDatefromJson) throws Exception {
		String[] date = new String[3];
		for(int i=0;i<3;i++)
		{
			if(i==0) {
				date[i] = leaseEndDatefromJson.substring(0, 2);
				System.out.println(date[i]);
			}
			if(i==1) {
				date[i] = leaseEndDatefromJson.substring(2, 4);
				System.out.println(date[i]);
			}
			if(i==2) {
				date[i] = leaseEndDatefromJson.substring(4);
				System.out.println(date[i]);
			}
		}
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_End_Date_month, date[0]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_End_Date_date, date[1]);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_End_Date_year, date[2]);
	}
	public void enterLeaseAmount(String leaseAmountfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(lease_Amount_textbox, leaseAmountfromJson);
	}
	public void enterCabinetDimensions(String cabinetDimensionsfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(cabinet_Dimensions_textbox, cabinetDimensionsfromJson);
	}
	public void enterAdditionalFeatures(String additionalFeaturesfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(additional_Features_textbox, additionalFeaturesfromJson);
	}
	public void selectPaymentFrequency(String paymentFrequencyfromJson) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(payment_Frequency_dropdown, paymentFrequencyfromJson);
	}
	public void selectCabinetType(String cabinetTypefromJson) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(cabinet_Type_dropdown, cabinetTypefromJson);
	}
	public void selectIsCabinetAvailable() {
		SeleniumFunc.clickUsingActionXpath(is_Cabinet_Available_checkbox);
	}
	public void enterPhoneNumber(String phoneNumberfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(phone_number_textbox, phoneNumberfromJson);
		SeleniumFunc.xpath_GenericMethod_Click(email_textbox);
	}
	public void selectCountryCode(String countryCodefromJson) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(phone_number_code, countryCodefromJson);
	}
	public void enterEmail(String emailfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(email_textbox, emailfromJson);
	}
	public void enterLastName(String lastNamefromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(last_name_textbox, lastNamefromJson);
	}
	public void enterFirstName(String firstNamefromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(first_name_textbox, firstNamefromJson);
	}
	public void selectCountry() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(country_dropdown);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(country_dropdown, "United States");
		SeleniumFunc.xpath_GenericMethod_Click(usa_dropdown_value);
	}
	public void enterAddressLine1(String addressLine1fromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(address_line_1_textbox, addressLine1fromJson);
	}
	public void enterAddressLine2(String addressLine2fromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(address_line_2_textbox, addressLine2fromJson);
	}
	public void enterCityOrTown(String cityTownfromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(city_town_textbox, cityTownfromJson);
	}
	public void selectState(String statefromJson) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(state_dropdown, statefromJson);
	}
	public void enterPostalCode(String postalCodefromJson) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(postal_code_textbox, postalCodefromJson);
	}
	public void clickOnSubmitButton() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(submit_button);
			Assert.assertTrue(true, "Submit button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Submit button");
		}	
	}
	public void clickOnGoButton() throws Exception {
		try{	
			SeleniumFunc.xpath_GenericMethod_Click(go_button);
			Assert.assertTrue(true, "Go button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Go button");
		}	
	}
	public String verifyCaseAssignedTO() throws Exception{
		return SeleniumFunc.xpath_Genericmethod_getElementText(assignedTo);			
	}
	public void searchForPreviousCase() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(search_placeholder, CaseID);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void changeApprovalStatus(String ApprovalStatus) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(approval_status_dropdown, ApprovalStatus);
	}
	public void fetchErrorMessage() {
		SeleniumFunc.getElementText(phone_number_error_message);
	}
	public void reenterPhoneNumber(String phoneNumber) throws Exception {
		Thread.sleep(2000);
		SeleniumFunc.xpath_GenericMethod_Clear(phone_number_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(phone_number_textbox, phoneNumber);
	}
	public void cliccOnNoThanks() {
		
	}
	public void GetCaseId(String xpath,String VariableText) throws Exception {
		try {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
			xpath=work_status;
		String actualText = SeleniumFunc.getElementText(xpath);
		PropertiesConfiguration config = new PropertiesConfiguration("src/main/resources/configfile/config.properties");
		config.setProperty(VariableText,actualText);
		config.save();
		Assert.assertTrue(true,"Saved case id sucessfully");
		}
		catch(Exception e)
		{
			Assert.assertTrue(false,"Unable to save case id");
		}
	}
	public void searchCase(String xpath, String VariableText) throws Exception {
		try {
			
//			caseId = ObjectRepo.reader.getText();
//			System.out.println("caseId:: " +caseId);
			 FileInputStream fis = new FileInputStream("src/main/resources/configfile/config.properties");
			 Properties prop = new Properties();
			 prop.load(fis);
			 String TextfromProperties = prop.getProperty(VariableText);
		     System.out.println("username: "+ prop.getProperty(VariableText));
		     xpath =request_ID_textbox;
			driver.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpath)).sendKeys(TextfromProperties);
			//SeleniumFunc.id_GenericMethod_Sendkeys(search_case_id_xpath, caseId);
			driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
		}
			
			catch(Exception e)
			{
				Assert.assertTrue(false,"Unable to open case");
			}
		}
		
	

	
}
