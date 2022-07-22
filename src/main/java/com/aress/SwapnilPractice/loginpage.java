package com.aress.SwapnilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginpage extends base{
	
	String Username;
	String Password;
	By uName = By.name("user_email");     //locators	
	By pswd = By.name("user_password");
	By loginBtn = By.xpath("//*[contains(text(),'LOGIN')]");
	WebDriver driver;
	
	public loginpage(){
		initializedriver();
		this.driver = super.driver;
	}
	
	
	public String setUsername() 
	{
		
		// TODO Auto-generated method stub
		if (Env.equals("QA")) 
		{
			Username = "sara@trufinco.com";
			//System.out.println(Username);
			
		} else if (Env.equals("Live")) 
		{
			Username = "bworksman@national.biz";
			//System.out.println(Username);
		}
		else if (Env.equals("UAT")) 
		{
			Username = "will@thecreditelect.com";
			//System.out.println(Username);
		}
		
		
		else {
			System.out.println("error usernot found");
		}
		
		
		return Username;
	
	}
	
	public String setPassword() 
	{
		// TODO Auto-generated method stub
		if (Env.equals("QA")) 
		{
			Password = "National18grow18";
			//System.out.println(Password);
			
		} else if (Env.equals("Live")) 
		{
			Password = "National18grow18";
			//System.out.println(Password);
		}
		else if (Env.equals("UAT")) 
		{
			Password = "National18grow18";
			//System.out.println(Password);
		}
		
		
		else {
			System.out.println("error usernot found");
		}
		return Password;
	
	}
	
	

		public void navigateToWebsite(){
			System.out.println(setUrl());
			System.out.println("printing driver value" + driver);
			driver.get(setUrl());
		}
		

		public  void enterUsername() {    
			 driver.findElement(uName).sendKeys(setUsername());          
		}

		public void enterPassword() {  
			driver.findElement(pswd).sendKeys(setPassword() );
		}
		
	
		public void clickLogin() {     
			driver.findElement(loginBtn).click();
		}
}
