package com.aress.SwapnilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myreflinkpage {

	WebDriver driver;
	
	public myreflinkpage(WebDriver driver) {      //constructor
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By reflink = By.xpath("//span[text()='My Referral Links']");
	
	By Cobrandedlink = By.xpath("//b[text()='https://www.nationalbusinesscapital.com/partner/?ref=4583']");
	
	By trackableads = By.xpath("//b[text()='https://www.nationalbusinesscapital.com/apply-now/?ref=4583']");
	
	public void myref() {
		// TODO Auto-generated method stub
		driver.findElement(reflink).click();

	}
	
	public void cobrandedlink() {
		// TODO Auto-generated method stub
		driver.findElement(Cobrandedlink).click();
	}
	
	public void trackable() {
		// TODO Auto-generated method stub
		driver.findElement(trackableads).click();
	}
}
