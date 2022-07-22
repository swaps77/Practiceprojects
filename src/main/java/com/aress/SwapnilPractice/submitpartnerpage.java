package com.aress.SwapnilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class submitpartnerpage {

	WebDriver driver;
	
	public submitpartnerpage(WebDriver driver) {   //constructor
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//locators
	By submitpartner = By.xpath("//span[text()='Submit Partner']");
	
	By firstname = By.id("first_name");
	
	By lastname = By.id("last_name");
	
	By company = By.id("company");
	
	By emailadd = By.id("email");

	By phone = By.id("phone");
	
	By mobilephone = By.id("mobile_phone"); 
	
	By website = By.id("website");
	
	By industry = By.id("industry_type");
	
	By notesclick = By.name("notes");
	
	By clicksubmit = By.xpath("//button[@id='btnsubmit']");
	
	public void clickSubmitpartner() {
		// TODO Auto-generated method stub
		driver.findElement(submitpartner).click();
		}
	
	public void submitpartners() {
		// TODO Auto-generated method stub
		driver.findElement(submitpartner).click();
	}
	
	public void Firstname(String name) {
		// TODO Auto-generated method stub
		driver.findElement(firstname).sendKeys(name);
	}
	
	public void Lastname(String last) {
		// TODO Auto-generated method stub
		driver.findElement(lastname).sendKeys(last);
	}
	
	public void Company(String cmpy) {
		// TODO Auto-generated method stub
		driver.findElement(company).sendKeys(cmpy);
	}
	
	public void emailid(String email) {
		// TODO Auto-generated method stub
		driver.findElement(emailadd).sendKeys(email);
	}
	public void phoneno(String phnno) {
		// TODO Auto-generated method stub
		driver.findElement(phone).sendKeys(phnno);
	}
	public void mobileno(String mbno) {
		// TODO Auto-generated method stub
		driver.findElement(mobilephone).sendKeys(mbno);
	}
	public void website(String web) {
		// TODO Auto-generated method stub
		driver.findElement(website).sendKeys(web);
	}
	

	public void selectIndustrytype(String industryName) {
		// TODO Auto-generated method stub
		Select select = new Select(driver.findElement(industry));
		
		select.selectByVisibleText(industryName);
	}
	public void notesclicks(String notes) {
		// TODO Auto-generated method stub
		driver.findElement(notesclick).sendKeys(notes);

	}
	
	public void btnsubmit() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      //  js.executeScript("javascript:window.scrollBy(500,800)");

		driver.findElement(clicksubmit).submit();
	}
}
