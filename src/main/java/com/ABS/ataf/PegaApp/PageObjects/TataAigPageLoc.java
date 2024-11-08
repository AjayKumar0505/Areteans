package com.ABS.ataf.PegaApp.PageObjects;

public interface TataAigPageLoc {
	
	String plus_icon="//span[text()='Create']//ancestor::button";
	String FNOL_text="//span[text()='FNOL']";
	String phonenumber_textfield="//input[@data-testid='Enter Mobile Number:phone-input:control']";
	//String OTP_textfield="//label[text()='Enter OTP']/following-sibling::div/input";
    String OTP_textfield="//input[@data-testid='Enter OTP:number-input:control']";
	String OTP_message="//input[@data-testid='OTP Message:input:control']";
	
	
	String userName_textbox="//input[@placeholder='User name']";
	String password_textbox="//input[@placeholder='Password']";
	String login_button="//div[@id='submit_row']/button";
	String home_icon="//div[@data-testid=':summary-item:visual']";
	String profile_icon="//button[@type='button']/div[@shape='circle']";
	String notification_icon="//li[@name='Notifications']";
	String case_notification="//button[@data-testid=':summary-item:']";
	String Case_ID="//p[@data-testid=':case-view:subheading']";
	String logoff_text="//span[text()='Log off']";//"//button[contains(@aria-owns,'item-Logoff')]"
	
	String mywork="//span[text()='My Work']//preceding-sibling::div";
	String create_date="//span[@title='Create Date/Time']";
	String damage_details="//a[text()='Damage Details']"; //div[@aria-colindex='2']
	String case_id_number="//div[@aria-colindex='1']";    //div[@aria-colindex='1' and @role='gridcell']
	String search_textbox="//input[@placeholder='Search...']";
	String list_of_search_items="//li[@role='menuitem']";
	
	String summary_lable="//span[text()='Summary']";
	String driver_lable="//span[text()='Driver Details']";
	String garagedetails_lable="//span[text()='Garage Details']";
	String lossdetails_lable="//span[text()='Loss Details']";
	String history_lable="//span[text()='History']";	   //button[@aria-label='History']
	String pulse_lable="//span[text()='Pulse']";
	String fraudCheck_lable="//span[text()='Fraud Check']";
	String feildlevelauditing_label="//span[text()='Field Level Auditing']";
	
	String go_button="//button[@data-testid=':task-item:open-task']";
	String damageDetails_txt="//div[text()='Damage Details']";
	String add_icon="//button[text()='Add']";
	
	String imt_textbox="//input[@data-testid='IMT:input:control']";
	String part_dropdown="//input[@data-testid='Part:combo-box:control']";
	String headlamp_part_dropdown="//li[@data-testid='Headlamp:menu-item:']";
	String repairreplace_dropdown="//select[@data-testid='Repair Replace:select:control']";
	String material_dropdown="//select[@data-testid='Material:select:control']";
	String side_dropdown="//select[@data-testid='Side:select:control']";
	String section_dropdown="//select[@data-testid='Section:select:control']";
	String hsn_textbox="//input[@data-testid='HSN Code:input:control']";
	String partprice_textbox="//input[@data-testid='Part Price:currency-input:control']";
	String dep_percentage_textbox="//input[@data-testid='Dep. Percentage :number-input:control']";
	String taxrate_textbox="//input[@data-testid='Tax Rate:number-input:control']";
	String labourRemoveAndInstall_textbox="//input[@data-testid='Labour Remove and Install:currency-input:control']";
	String labour_repair_textbox="//input[@data-testid='Labour Repair:currency-input:control']";
	String labourGST_textbox="//input[@data-testid='Labour GST:number-input:control']";
	String paintLabour_textbox="//input[@data-testid='Paint Labour:currency-input:control']";
	String paintMaterial_textbox="//input[@data-testid='Paint Material:currency-input:control']";
	String paintGST_textbox="//input[@data-testid='Paint GST:number-input:control']";
	String nameofgarage_dropdown="//input[@data-testid='Name of Garage:combo-box:control']";
	String nameofgarage_SkidRowGarage="//span[text()='Skid Row Garage']";
	String next_button="//button[text()='Next   ']";
	
	String cancel_button_on_records="//footer[@class='sc-jIRcFI hzHcLh sc-bcXHqe kZNZnt']/button";
	String cancel_button="//button[text()='Cancel']";
	String saveForLater_button="//button[text()='Save for later']";
	String submit_button="(//button[text()='Submit'])[1]";
	String submit_button_on_records="//footer[@class='sc-cjibBx jhbLNY sc-gswNZR fcXpjJ']/div/button";
	String policynumber_textfield="//input[@data-testid='Policy Number:input:control']";
	String dateandtimeofloss="//button[@data-testid=':date-time-input:open-close-picker']";
	String dateandtimeofloss1="//button[@data-testid=':date-time-input:open-close-picker']//..";
	String currenttime="//button[@data-testid=':date-time-input:set-current-date-and-time']";
	String policy_select_checkbox="//input[@data-testid='Insured name:input:control']//..//..//..//..//..//preceding-sibling::div//span//span//span//fieldset//div//div//input";
	String driver_license_number = "//input[@data-testid='Driver License Number:input:control']";
	String driver_name = "//input[@data-testid='Driver Name:input:control']";
	String calleridentification_dropdown="//select[@data-testid='Caller Identification:select:control']";
	String claimfor_dropdown="//select[@data-testid='Claim For:select:control']";
	String isinsuredtheclaimant_checkbox="//label[text()='Is Insured the Claimant']//div";
	String pincode_dropdown="//input[@data-testid='Pincode:combo-box:control']";
	String pincode_40012="//span[text()='400012']";
	String city_dropdown="//input[@data-testid='City:combo-box:control']";
	String city_mumbai="//span[text()='Mumbai']";
	String cityofrepair_dropdown="//input[@data-testid='City of Repair:combo-box:control']";
	String cityofrepair_mumbai="//span[text()='Mumbai']";
	String lossdescription_dropdown="//select[@data-testid='Loss Description:select:control']";
	String anyBITPPDinvolvement_no_radiobutton="//legend[text()='Any BI/TPPD Involvement']//following-sibling::div//div[2]//label//div";
	String damagetothevehicle_textbox="//input[@data-testid='Damage to the Vehicle:input:control']";
	String divertedtoKPG_dropdown="//select[@data-testid='Diverted to KPG:select:control']";
	String iseventcatastrophe_dropdown="//select[@data-testid='Is event catastrophe:select:control']";
	String vehicleatworkshop_dropdown="//select[@data-testid='Vehicle at workshop:select:control']";
	String wasvehicleparked_no_checkbox="//legend[text()='Was Vehicle Parked']//following-sibling::div//div[2]//label//div";
	String extractdriverdetails_Checkbox="//label[text()='Extract Driver Details']//div";
	
	String risk_score_textbot="//input[@data-testid='Risk Score:input:control']";
	String riskSegment_textbox="//input[@data-testid='Risk Segment:input:control']";
	String isFraudDetected_checkbox="//label[text()='Is Fraud detected?']";
	String outcome_dropdown="//select[@data-testid='Outcome:select:control']";
	String routeTo_dropdown="//input[@data-testid='Route to:combo-box:control']";
	String listof_routeto_dropdown="//span[text()='Nominated User 4']";
	
	String assignedTo_text="//span[text()='Assigned to']/button";
	
	String editFlutter_icon="//button[@data-testid=':menu-button:' and @tabindex='-1']";
	String edit_icon="//span[text()='Edit']";
	String delete_icon="//span[text()='Delete']";
	String decision_dropdown="//select[@data-testid='Decision:select:control']";
	String commentsByNU_textbox="//textarea[@data-testid='Comments by NU:text-area:control']";
	String ZCM_Comments_textbox="//textarea[@data-testid='ZCM Comments:text-area:control']";
	String recommendedTo_dropdown="//select[@data-testid='Recommend to:select:control']";
	
	String document_category_textbox="//input[@data-testid='Document Category:input:control']";
	String document_type_textbox="//input[@data-testid='Document Type:input:control']";
	String document_name_textbox="//textarea[@data-testid='Document Name:text-area:control']";
	String search_button="//button[text()='Search']";
	String death_certificate_checkbox="//span[text()='Death Certificate (Death Claim only)']/../../div/span/div/div/label/div";
	String discharge_certificate_checkbox="//span[text()='Discharge Certificate']/../../div/span/div/div/label/div";
	String investigator_1_checkbox="//span[text()='Investigator 1']/../../div/span/div/div/label/div";
	String vehicle_details_lable="//span[text()='Vehicle Details']";
	String loss_mitigation_lable="//span[text()='Loss Mitigation']";
	String investigation_details_lable="//span[text()='Investigation Details']";
	String od_claim_details_lable="//span[text()='OD Claim Details']";
	String invoice_details_lable="//span[text()='Invoice Details']";
	String document_details_lable="//span[text()='Document Details']";
	String policy_details_lable="//span[text()='Policy Details']";
	String investigator_details_lable="//span[text()='Investigator Details']";
	String report_quality_dropdown="//select[@data-testid='Report Quality:select:control']";
	String investigation_outcome_dropdown="//select[@data-testid='Investigation Outcome:select:control']";
	String finalobservation_textbox="";
	String no_radio_button="(//legend[text()='Do you want to Send Back?']/following-sibling::div/div/label/div)[2]";
	String yes_radio_button="(//legend[text()='Do you want to Send Back?']/following-sibling::div/div/label/div)[1]";
	String deathcertificate_yes_radiobutton="//textarea[text()='Death Certificate (Death Claim only)']/../../../../../../following-sibling::div[4]/span/span/span/fieldset/div/div/label[text()='Yes']";
	String deathcertificate_no_radiobutton="//textarea[text()='Death Certificate (Death Claim only)']/../../../../../../following-sibling::div[4]/span/span/span/fieldset/div/div/label[text()='No']";
	String deathcertificate_remarks_text="//textarea[text()='Death Certificate (Death Claim only)']/../../../../../../following-sibling::div[6]/span/span/span/div/div/textarea";
	String dischargecertificate_yes_radiobutton="//textarea[text()='Discharge Certificate']/../../../../../../following-sibling::div[4]/span/span/span/fieldset/div/div/label[text()='Yes']";
	String dischargecertificate_no_radiobutton="//textarea[text()='Discharge Certificate']/../../../../../../following-sibling::div[4]/span/span/span/fieldset/div/div/label[text()='No']";
	String dischargecertificate_remarks_text="//textarea[text()='Discharge Certificate']/../../../../../../following-sibling::div[6]/span/span/span/div/div/textarea";
	String workstatus="(//dt[text()='Work Status']/following-sibling::dd/span)[1]/span";
	String assignedTo="//span[text()='Assigned to']//button";
}
