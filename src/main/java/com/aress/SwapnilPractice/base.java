package com.aress.SwapnilPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	static String Env = "QA";
	static String Url;

	WebDriver driver;
	
	public void initializedriver() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public String setUrl() {
		// TODO Auto-generated method stub
		if (Env.equals("QA")) {
			Url = "https://stagingpartners.national.biz/login";

		} else if (Env.equals("Live")) {
			Url = "https://partners.nationalbusinesscapital.com/";
			// System.out.println(Url);
		} else if (Env.equals("UAT")) {
			Url = "http://www.newpartnerstaging.nationalbusinesscapital.com/login";
			// System.out.println(Url);
		}

		else {
			System.out.println("error usernot found");

		}
		//	System.out.println(Url);
		return Url;

	}
}
