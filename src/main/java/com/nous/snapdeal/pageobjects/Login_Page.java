package com.nous.snapdeal.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nous.snapdeal.actiondriver.Action;
import com.nous.snapdeal.base.BaseClass;

public class Login_Page  extends BaseClass{
	
	
	
	Action action = new Action();
	
	
	// page objects 
	
	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
	
	private WebElement hover;
	
	
	// constructor 
	
	public Login_Page() {
		
		//Initialize the page element using webdriver instance .
		PageFactory.initElements(getDriver(), this);
	}
	
	public void login() {
		
		action.moveToElement(getDriver(), hover);
		
		
	}
	

}
