package com.aress.SwapnilPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase extends loginpage {

	

	
	@Test
	public void testCase1() {
		
		navigateToWebsite();
		 enterUsername();
		 enterPassword() ;
		 clickLogin();
	}
}
