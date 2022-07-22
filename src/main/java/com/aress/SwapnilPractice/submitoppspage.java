package com.aress.SwapnilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class submitoppspage {

	WebDriver driver;
	
	public submitoppspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		}
		
	//locators
	
	By submitopps = By.xpath("//*[contains(text(),'Submit Opportunities')]");
	
	By firstname = By.id("first_name");
	
	By lastname = By.id("last_name");
	
	By company = By.id("company");
	
	By emailadd = By.id("email");

	By phone = By.id("phone");
	
	By mobilephone = By.id("mobile_phone");
	
	By amount = By.id("capital");

	By avgamount = By.name("gross");
	
	By selectAverageRevenue = By.id("gross");
	
	By industry = By.id("industry-type");

	By timeinbusiness = By.id("yearsin"); 
	
	By notesclick = By.name("notes");
	
	By clicksubmit = By.xpath("//button[@id='btnsubmit']");
	
	
	public void clickSubmitopps() {   //submitopps submenuclick
		// TODO Auto-generated method stub
		driver.findElement(submitopps).click();
		}
	
    public void enterFirstname(String fname ) {
			// TODO Auto-generated method stub
		driver.findElement(firstname).sendKeys(fname);
		}

	public void enterLastname(String lname) {
		// TODO Auto-generated method stub
		driver.findElement(lastname).sendKeys(lname);
	    }
		
	public void enterCompany(String compny) {
		// TODO Auto-generated method stub
		driver.findElement(company).sendKeys(compny);
	}
	
	public void enterEmail(String email) {
		// TODO Auto-generated method stub
		driver.findElement(emailadd).sendKeys(email);
	}
	
	public void enterPhone(String phn) {
		// TODO Auto-generated method stub
		driver.findElement(phone).sendKeys(phn);
	}
		
	public void enterMobilephone(String mphn) {
		// TODO Auto-generated method stub
        driver.findElement(mobilephone).sendKeys(mphn);
	}
	
	public void enterAmount(String capital) {
		// TODO Auto-generated method stub
        driver.findElement(amount).sendKeys(capital);
    }
	
	public void selectAverageRevenue(String averageRevenue)
	{
		Select select = new Select(driver.findElement(selectAverageRevenue));
	
		select.selectByVisibleText(averageRevenue);
		
	}
	
	public void selectIndustry(String industryName)
	{
		Select select = new Select(driver.findElement(industry));
	
		select.selectByVisibleText(industryName);
		
	}
	
	public void selectYear(String industryYear)
	{
		Select select = new Select(driver.findElement(timeinbusiness));
	
		select.selectByVisibleText(industryYear);
		
	}
	
	public void btnsubmit() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      //  js.executeScript("javascript:window.scrollBy(500,800)");

		driver.findElement(clicksubmit).submit();
	}
	
	public void notesclicks(String notes) {
		// TODO Auto-generated method stub
		driver.findElement(notesclick).sendKeys(notes);

	}
//	public void messgaevalidation(	) {
//		// TODO Auto-generated method stub
//		String successMsg=driver.findElement(By.xpath("//div[.='Your opportunity has been submitted successfully!']")).getText();
//		Assert.assertEquals(successMsg, "Your opportunity has been submitted successfully!");

}


	
