package com.ABS.ataf.PegaApp.PageObjects;

public interface UnileverPageLoc {
	
	String username = "//input[@id='txtUserID']";
	String password = "//input[@id='txtPassword']";
	String login = "//button[@id='sub']";
	String knowmore = "(//button[text()='Know more'])[2]";
	String caseId ="//a[contains(text(),'VMI-')]";
	String quantity1 = "//div[text()='Confirmed Order Quantity (Cases)']/../../../tr[2]/td[16]/span/input";
	String quantity2 = "//div[text()='Confirmed Order Quantity (Cases)']/../../../tr[3]/td[16]/span/input";
	String quantity3 = "//div[text()='Confirmed Order Quantity (Cases)']/../../../tr[4]/td[16]/span/input";
	
}