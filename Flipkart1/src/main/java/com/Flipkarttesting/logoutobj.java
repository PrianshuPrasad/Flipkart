package com.Flipkarttesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutobj {

	public WebDriver driver;

	public logoutobj(WebDriver driver) {
		

		this.driver = driver;

	}

	By profile = By.xpath("//div[@class='_28p97w']");
	By logout = By.xpath("//div[@class='_3vhnxf'][text()='Logout']"); 
	By signoutassert = By.xpath("//div[text()='Logout']");
	By validationlogin=By.xpath("//span[text()='Please enter valid Email ID/Mobile number']");
	
	// methods for calling webElements
	public WebElement logout() {

		return driver.findElement(logout);

	}

	public WebElement profile() {

		return driver.findElement(profile);
	}

	public WebElement signoutassert() {

		return driver.findElement(signoutassert);
	}
	

}
