package com.ABS.ataf.PegaApp.PageObjects;

public interface CabinetLeasingManagementPageLoc {
	//90mins
	String userName_textbox="//input[@placeholder='User name']";
	String password_textbox="//input[@placeholder='Password']";
	String login_button="//div[@id='submit_row']/button";
	String plus_icon="//span[text()='Create']//ancestor::button";
	String new_cabinet_lease_request ="//span[text()='New Cabinet Lease Request']";
	
	String work_status = "//dt[text()='Work Status']//following-sibling::dd/span/span[@aria-hidden='true']";
	String search_placeholder = "//input[@data-testid=':input:control']";
	String case_Id = "//p[@data-testid=':case-view:subheading']";
	String assignedTo="//span[text()='Assigned to']//button";
	
	String request_ID_textbox = "//input[@data-testid='Request ID:input:control']";
	String request_Date = "";
	String request_date_month = "//legend[text()='Request Date']/following-sibling::div/div/input[@max='12']";
	String request_date_date = "//legend[text()='Request Date']/following-sibling::div/div/input[@max='31']";
	String request_date_year = "//legend[text()='Request Date']/following-sibling::div/div/input[@max='Infinity']";
	String lease_Start_Date = "";
	String lease_Start_Date_month = "//legend[text()='Lease Start Date']/following-sibling::div/div/input[@max='12']";
	String lease_Start_Date_date = "//legend[text()='Lease Start Date']/following-sibling::div/div/input[@max='31']";
	String lease_Start_Date_year = "//legend[text()='Lease Start Date']/following-sibling::div/div/input[@max='Infinity']";
	String lease_End_Date = "";
	String lease_End_Date_month = "//legend[text()='Lease End Date']/following-sibling::div/div/input[@max='12']";
	String lease_End_Date_date = "//legend[text()='Lease End Date']/following-sibling::div/div/input[@max='31']";
	String lease_End_Date_year = "//legend[text()='Lease End Date']/following-sibling::div/div/input[@max='Infinity']";
	String lease_Amount_textbox = "//input[@data-testid='Lease Amount:currency-input:control']";
	String payment_Frequency_dropdown = "//select[@data-testid='Payment Frequency:select:control']";
	String cabinet_Dimensions_textbox = "//input[@data-testid='Cabinet Dimensions:input:control']";
	String cabinet_Type_dropdown = "//select[@data-testid='Cabinet Type:select:control']";
	String additional_Features_textbox = "//textarea[@data-testid='Additional Features:text-area:control']";
	String is_Cabinet_Available_checkbox = "//label[@data-testid=':form-field:label']/div";
	
	String first_name_textbox = "//input[@data-testid='First Name:input:control']";
	String last_name_textbox = "//input[@data-testid='Last Name:input:control']";
	String email_textbox = "//input[@data-testid='Email:input:control']";
	String phone_number_code = "//select[@data-testid='Phone Number:phone-input:country-code']";
	String phone_number_textbox = "//input[@data-testid='Phone Number:phone-input:control']";
	String phone_number_error_message= "//div[@data-testid='Phone Number:phone-input:']/following-sibling::div/span";
	
	String country_dropdown  = "//input[@data-testid='Country:combo-box:control']";
	String usa_dropdown_value = "//span[text()='United States']";
	String address_line_1_textbox  = "//input[@data-testid='Address Line 1:input:control']";
	String address_line_2_textbox  = "//input[@data-testid='Address Line 2:input:control']";
	String city_town_textbox  = "//input[@data-testid='City / Town:input:control']";
	String state_dropdown  = "//select[@data-testid='State:select:control']";
	String postal_code_textbox  = "//input[@data-testid='Postal Code:input:control']";
	
	String go_button="//button[@data-testid=':task-item:open-task']";
	String submit_button = "//button[@name='submit']";
	String approval_comments_textbox = "//textarea[@data-testid='Approval Comments:text-area:control']";
	String approval_status_dropdown = "//select[@data-testid='Approval Status:select:control']";
	String profile_icon="//button[@type='button']/div[@shape='circle']";
}