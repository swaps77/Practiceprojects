package com.aress.SwapnilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pipelinepage {

	WebDriver driver;
	
	public pipelinepage(WebDriver driver) { 
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	By pipeline = By.linkText("Pipeline");
	
	By activeopss = By.xpath("//a[@id='pills-home-tab-custom']");
	
	public void clickpipline() {
		// TODO Auto-generated method stub
		driver.findElement(pipeline).click();
	}	
	
	public void clickactiveopps() {
		// TODO Auto-generated method stub
		driver.findElement(activeopss).click();
	}
}
