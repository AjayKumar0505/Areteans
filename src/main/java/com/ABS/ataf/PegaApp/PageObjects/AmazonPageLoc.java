package com.ABS.ataf.PegaApp.PageObjects;


public interface AmazonPageLoc {
	
	String search_feild = "//input[@id='twotabsearchtextbox']";
	String search_BUTTON= "//input[@id='nav-search-submit-button']";
	String continue_shopping = "//button[@type='submit']";
	String price = "//button[@type='button']/../../../../../../../../preceding-sibling::div/div/div/a/span/span/span[2]";
	String addTocart = "//button[@type='button']";
	String privious = "//span[contains(@class,'s-pagination-item s-pagination-prev')]";
	String next_button = "//a[contains(@aria-label,'Go to next')]";

}
