package com.nous.sanpdeal.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nous.snapdeal.base.BaseClass;
import com.nous.snapdeal.pageobjects.Login_Page;



public class LoginPageTest extends BaseClass {
	
	
	
	private  Login_Page loginpage;
	
	
	@Parameters("browser")
	@BeforeMethod//(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	
/*	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}*/
	
	
	@Test()
	public void login_Test() {
		
		loginpage.login();
		
	}
	
	
	

}
