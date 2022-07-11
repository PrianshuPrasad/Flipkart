package com.Flipkarttesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Loginmethod extends basedriver {

	public WebDriver driver;

//		Login method for login user
		public void login(WebDriver driver) throws IOException, InterruptedException {
		Login lg = new Login(driver);
		lg.addtocartlogin().click();
		lg.loginbutton().click();
		asser().assertEquals("Please enter valid Email ID/Mobile number", lg.emailvalidation().getText());
		Reporter.log("Validation message displayed as Please enter valid Email ID/Mobile number", true);
		loadProperty();
		lg.mobilenumber().sendKeys(prop.getProperty("mobilenumber"));
		lg.password().sendKeys(prop.getProperty("password"));
		lg.loginbutton().click();
		
		asser().assertEquals("Prianshu", lg.loginassert().getText());
		
	}

	
}
