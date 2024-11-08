package com.ABS.ataf.PegaApp.PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import com.areteans.ataf.CS.CustomerServ;
import com.ABS.ataf.GeneralHelperSel.SeleniumFunc;
import com.ABS.ataf.helper.Logger.LoggerHelper;

public class TataAigPage extends CustomerInfoPage implements TataAigPageLoc {
	//private final Logger log = LoggerHelper.getLogger(TataAigPage.class);
	TataAigPage tataaigpage;
	String CaseID;

	public TataAigPage(WebDriver driver) {
		super(driver);
	}		
	public void sendTataAigPage(TataAigPage tataaigpage) {
		this.tataaigpage = tataaigpage;
	}

//	public void enterDateandTimeofLoss() throws Exception {
//		String date=SeleniumFunc.getCurrentDateTime();
//		SeleniumFunc.shadowRoot_SelectDate(date);		
//	}
//	public void lunchTheNewWindow() {
//		SeleniumFunc.navigateToNewWindow("https://areteanstechnologyltd01.pegalabs.io/prweb/");
//	}
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
	public void verifyLogin() {
		SeleniumFunc.verifyElementPresent(home_icon);
	}
	public void clickOnNotification() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(notification_icon);
	}
	public void clickOnFirstNotification() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(case_notification);
		CaseID = SeleniumFunc.getElementText(Case_ID);
		System.out.println(CaseID);
   }
	public void clickOnGoButton() throws Exception {
		try{	
			SeleniumFunc.xpath_GenericMethod_Click(go_button);
			Assert.assertTrue(true, "Go button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Go button");
		}	
	}
	public void clickOnAddIcon() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(add_icon);
			Assert.assertTrue(true, "Add icon is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Add icon");
		}
	}
	public void enterIMTValue(String text) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(imt_textbox, text);
	}
	public void enterSelectPart() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(part_dropdown);	
			SeleniumFunc.xpath_GenericMethod_Click(headlamp_part_dropdown);
			Assert.assertTrue(true, "Part dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Part dropdown");
		}
	}
	public void selectRepairOrReplace(String text) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(repairreplace_dropdown, text);
			Assert.assertTrue(true, "Repair or Replace dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Repair or Replace dropdown");
		}
	}
	public void enterTypeOfMaterial(String material) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(material_dropdown, material);
			Assert.assertTrue(true, "Material dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Material dropdown");
		}
	}
	public void selectSide(String side) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(side_dropdown, side);
			Assert.assertTrue(true, "Side dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select side dropdown");
		}
	}
	public void selectSection(String section) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(section_dropdown, section);
			Assert.assertTrue(true, "Section dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Section dropdown");
		}
	}
	public void enterHSNCode(String hsn) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(hsn_textbox);	
		SeleniumFunc.xpath_GenericMethod_Sendkeys(hsn_textbox, hsn);
	}
	public void enterPartPrice(String partprice) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(partprice_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(partprice_textbox, partprice);
	}
	public void enterDEPPercentage(String depprice) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(dep_percentage_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(dep_percentage_textbox, depprice);
	}
	public void enterTaxRate(String tax) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(taxrate_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(taxrate_textbox, tax);
	}
	public void enterLabourRemoveandInstall(String install) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(labourRemoveAndInstall_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(labourRemoveAndInstall_textbox, install);
	}
	public void enterLabourRepair(String labourRepair) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(labour_repair_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(labour_repair_textbox, labourRepair);
	}
	public void enterGST(String GST) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(labourGST_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(labourGST_textbox, GST);
	}
	public void enterPaintLabour(String paintLabour) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(paintLabour_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(paintLabour_textbox, paintLabour);
	}
	public void enterPaintGST(String paintGST) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(paintGST_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(paintGST_textbox, paintGST);
	}
	public void enterPaintMaterial(String paintMaterial) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(paintMaterial_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(paintMaterial_textbox, paintMaterial);
	}
	public void clickOnEdit() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(editFlutter_icon);
			SeleniumFunc.xpath_GenericMethod_Click(edit_icon);
			Assert.assertTrue(true, "Edit icon clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Edit icon ");
		}
	}
	public void reEnterPaintGST(String UpdateGST) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Clear(paintGST_textbox);
		SeleniumFunc.xpath_GenericMethod_Sendkeys(paintGST_textbox, UpdateGST);
	}
	public void clickOnSubmitButton() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(submit_button);
			Assert.assertTrue(true, "Submit button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Submit button");
		}	
	}
	public void clickOnSubmit() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(submit_button_on_records);
			Assert.assertTrue(true, "Submit button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Submit button");
		}	
	}
	public void selectOutcome(String outcome) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(outcome_dropdown, outcome);
			Assert.assertTrue(true, "Outcome dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Outcome dropdown");
		}
	}
	public void selectRouteTo() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(routeTo_dropdown);
			SeleniumFunc.xpath_GenericMethod_Click(listof_routeto_dropdown);
			Assert.assertTrue(true, "Route to dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Route to dropdown");
		}
	}
	public void clickOnProfile() throws Exception {
//		SeleniumFunc.xpath_GenericMethod_Click(profile_icon);
	}
	public void clickOnLogoff() throws Exception {
		SeleniumFunc.xpath_MoveToElement(profile_icon);
	}
	public void selectDecision(String decision) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(decision_dropdown, decision);
			Assert.assertTrue(true, "Decision dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Decision dropdown");
		}
	}
	public void selectRecommendTo(String Username) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(recommendedTo_dropdown, Username);
			Assert.assertTrue(true, "Recommended to dropdown selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select Recommended to dropdown");
		}
	}
	public void enterComments() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(ZCM_Comments_textbox, "Verified");
	}
	public void clickOnSearch() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(search_textbox, CaseID);
		SeleniumFunc.robotEnter();
		
	}
	public void enterDocumentCategory(String DocumentType) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(document_category_textbox, DocumentType);
	}
	public void selectDocuments() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(death_certificate_checkbox);
			SeleniumFunc.xpath_GenericMethod_Click(discharge_certificate_checkbox);
			Assert.assertTrue(true, "Required documents selected");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to select required documents");
		}
	}
	public void selectInvestigator() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(investigator_1_checkbox);
	}
	public void clickOnVechileDetails() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(vehicle_details_lable);
	}
	public void clickOnLossMitigation() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(loss_mitigation_lable);
	}
	public void clickOnInvestigationDetails() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(investigation_details_lable);
	}
	public void clickOnClaimDetails() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(od_claim_details_lable);
	}
	public void clickOnInvoiceDetails() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(invoice_details_lable);
	}
	public void clickOnDocumentDetails() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(document_details_lable);
	}
	public void selectReportQuality(String ReportQuality) {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(report_quality_dropdown, ReportQuality);
	}
	public void selectInvestigationOutcome() {
		SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(investigation_outcome_dropdown, "Potential LM");
	}
	public void enterFinalObservation() {
		
	}
	public void enterRemarks() {
		
	}
	public void selectSendBack() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(no_radio_button);
			Assert.assertTrue(true, "Radio button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Radio button");
		}	
	}
	public void verifyLoginPage() throws Exception {
		boolean result =SeleniumFunc.xpath_Genericmethod_verifyElementPresent(userName_textbox);
		if(result)
		{
			System.out.println("Login Page Opened Sceccesfully");
		}
		else
		{
			System.out.println("Login Page Not Opened");
		}
	}
	public void verifyDocuments() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(deathcertificate_yes_radiobutton);
			SeleniumFunc.xpath_GenericMethod_Click(dischargecertificate_yes_radiobutton);
			Assert.assertTrue(true, "Radio button is clicked");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to click on Radio button");
		}	
	}
	public void EnterRemarksOnDocuments() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Sendkeys(deathcertificate_remarks_text, "Verified");
			SeleniumFunc.xpath_GenericMethod_Sendkeys(dischargecertificate_remarks_text, "Verified");
		Assert.assertTrue(true, "Search button is clicked");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to click on Search button");
	}
	}
	public void clickOnSearchButton()  {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(search_button);
		Assert.assertTrue(true, "Search button is clicked");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to click on Search button");
	}
}

	public String verifyCaseStatus() throws Exception{
		return SeleniumFunc.xpath_Genericmethod_getElementText(workstatus);			
	}
	public String verifyCaseStatusEnd() throws Exception{
		return SeleniumFunc.xpath_Genericmethod_getElementText(workstatus);			
	}
	public String verifyCaseAssignedTO() throws Exception{
		return SeleniumFunc.xpath_Genericmethod_getElementText(assignedTo);			
	}
	public void enterComments_NU() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(commentsByNU_textbox, "Verified");
	}
	public void clickOnPlus() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(plus_icon);
	}
	public void clickOnFNOL() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(FNOL_text);
	}
//	public void enterPhoneNumber(String phonenumber) throws Exception {
//		SeleniumFunc.xpath_GenericMethod_Sendkeys(phonenumber_textfield, phonenumber);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//  
//	}
//	public void enterOTP(String OTP) throws Exception {
//		try {
//			SeleniumFunc.xpath_GenericMethod_Click(OTP_textfield);
//			SeleniumFunc.xpath_GenericMethod_Sendkeys(OTP_textfield, OTP);
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_TAB);
//			
//		} catch (Exception e) {
//			SeleniumFunc.xpath_GenericMethod_Click(OTP_textfield);
//			SeleniumFunc.xpath_GenericMethod_Sendkeys(OTP_textfield, OTP);
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_TAB);
//			
//		}
		
		public void enterPhoneNumber(String phonenumber) throws Exception {
			//Robot r = new Robot();
			SeleniumFunc.xpath_GenericMethod_Sendkeys(phonenumber_textfield, phonenumber);
			WebElement webElement = driver.findElement(By.xpath(phonenumber_textfield));
			webElement.sendKeys(Keys.TAB);
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
		}
		public void enterOTP(String OTP) throws Exception {
			//Robot r = new Robot();
			SeleniumFunc.xpath_GenericMethod_Sendkeys(OTP_textfield, OTP);
			WebElement webElement = driver.findElement(By.xpath(OTP_textfield));
			webElement.sendKeys(Keys.TAB);
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
		}
		
//		WebElement ele=driver.findElement(By.xpath(OTP_textfield));
//		int width = ele.getSize().getWidth();
//	    Actions act = new Actions(driver);
//	    act.moveToElement(ele).moveByOffset((width+10), 0).click().perform();   
	
	public void enterPolicyNumber(String policynumber) throws Exception {
		
		SeleniumFunc.xpath_GenericMethod_Sendkeys(policynumber_textfield, policynumber);  
	}
	public void enterdate() throws Exception {
//		WebElement parentelement= driver.findElement(By.xpath(dateandtimeofloss));
//		WebElement element = (WebElement)((JavascriptExecutor)driver).executeAsyncScript("arguments[0].style.setProperty();", parentelement);
//		element.click();
		Robot r = new Robot();
		for(int i=1;i<=7;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			if(i==7)
			{
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		}
		SeleniumFunc.xpath_GenericMethod_Click(currenttime);
	}
	public void selectPolicy() throws Exception {
		Thread.sleep(2000);
		WebElement l = driver.findElement(By.xpath(policy_select_checkbox));
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
//		SeleniumFunc.xpath_GenericMethod_Click(policy_select_checkbox);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_SPACE);
//		r.keyRelease(KeyEvent.VK_SPACE);
	}
	public void selectCallerIdentification(String calleridentification) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(calleridentification_dropdown, calleridentification);
		Assert.assertTrue(true, "Caller identification dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select caller identification dropdown");
	}
	}
	public void selectClaimFor(String claimfor) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(claimfor_dropdown, "Vehicle Damage");
		Assert.assertTrue(true, "Claim for dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select claim for dropdown");
	}
	}
	public void clickOnNext() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(next_button);
		Assert.assertTrue(true, "Next button is clicked");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to click on Next button");
	}
	}
	public void clickonIsInsuredtheClaimant() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(isinsuredtheclaimant_checkbox);
	}
	public void selectPincode() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(pincode_dropdown);
			SeleniumFunc.xpath_GenericMethod_Click(pincode_40012);
		Assert.assertTrue(true, "Pincode dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select pincode dropdown");
	}
	}
	public void selectCity() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(city_dropdown);
			SeleniumFunc.xpath_GenericMethod_Click(city_mumbai);
		Assert.assertTrue(true, "City dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select city dropdown");
	}
	}
	public void selectCityofRepair() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(cityofrepair_dropdown);
			SeleniumFunc.xpath_GenericMethod_Click(cityofrepair_mumbai);
		Assert.assertTrue(true, "City of repair dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select city of repair dropdown");
	}
	}
	public void selectLossDescription(String LossDescription) throws Exception {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(lossdescription_dropdown, LossDescription);
		Assert.assertTrue(true, "Loss description dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select Loss description dropdown");
	}
	}
	public void selectDivertedtoKPG(String DivertedtoKPG) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(divertedtoKPG_dropdown, DivertedtoKPG);
		Assert.assertTrue(true, "Diverted to KPG dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select Diverted to KPG dropdown");
	}
	}
	public void selectAnyBITPPDInvolvement() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(anyBITPPDinvolvement_no_radiobutton);
	}
	public void selectDamagetotheVehicle(String damage) throws Exception {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(damagetothevehicle_textbox, damage);
	}
	public void selectIseventcatastrophe(String Iseventcatastrophe) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(iseventcatastrophe_dropdown, Iseventcatastrophe);
		Assert.assertTrue(true, "Is event catastrophe dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select Is event catastrophe dropdown");
	}
	}
	public void selectVehicleatworkshop(String Vehicleatworkshop) {
		try{
			SeleniumFunc.xpath_SelectFromDropdownUsingVisibleText(vehicleatworkshop_dropdown, Vehicleatworkshop);
		Assert.assertTrue(true, "Vehicle at workshop dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select Vehicle at workshop dropdown");
	}
	}
	public void selectWasVehicleParked() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(wasvehicleparked_no_checkbox);
	}
	public void enterDriverDetails() throws Exception {
//		SeleniumFunc.xpath_GenericMethod_Click(extractdriverdetails_Checkbox);
//		WebElement ele = driver.findElement(By.xpath(driver_license_number));
		SeleniumFunc.xpath_GenericMethod_Sendkeys(driver_license_number, "AL56 2019999");
		SeleniumFunc.xpath_GenericMethod_Sendkeys(driver_name, "Vikram Rathod");
	}
	public void enterGarageDetails() throws Exception {
		try{
			SeleniumFunc.xpath_GenericMethod_Click(nameofgarage_dropdown);
			SeleniumFunc.xpath_GenericMethod_Click(nameofgarage_SkidRowGarage);
		Assert.assertTrue(true, "Name of garage dropdown selected");
	} catch (Exception e) {
		Assert.assertTrue(false, "Unable to select Name of garage dropdown");
	}
	}
	
}
