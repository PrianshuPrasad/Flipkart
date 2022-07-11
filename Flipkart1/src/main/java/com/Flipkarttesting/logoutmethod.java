package com.Flipkarttesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class logoutmethod extends basedriver{

	// method for user logout
	public void logout(WebDriver driver) throws InterruptedException {
		
		logoutobj signout = new logoutobj(driver);
		Actions act = new Actions(driver);
				
		//act.moveToElement(signout.profile()).build().perform();
		//Reporter.log("user logout", true);
		act.moveToElement(signout.profile()).build().perform();
		signout.logout().click();
		//Invokedriver.asser().assertEquals("Sign-In", lgo.logoutassert().getText());
		Reporter.log("user logout", true);
		
	}
	

}
