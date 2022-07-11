package com.Flipkarttesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public WebDriver driver;
	
	By addtocartlogin = By.xpath("//a[@class='_1_3w1N']");
	By login = By.xpath("//a[@class='_1_3w1N']");
	By mobilenumber = By.xpath("//input[@class='_2IX_2- _2LYh3d VJZDxU']");
	By password = By.xpath("//input[@type='password']");
	By loginbutton = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	By emailvalidation = By.xpath("//span[text()='Please enter valid Email ID/Mobile number']");
	By loginassert = By.xpath("//div[text()='Prianshu']");


	public WebElement addtocartlogin() {

		return driver.findElement(addtocartlogin);
	}
	
	
	public Login(WebDriver driver) {
		
		this.driver = driver;

	}

	public WebElement loginbutton() {

		return driver.findElement(loginbutton);
	}

		public WebElement mobilenumber() {

		return driver.findElement(mobilenumber);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement login() {

		return driver.findElement(login);
	}

	public WebElement emailvalidation() {

		return driver.findElement(emailvalidation);
	}

	public WebElement loginassert() {

		return driver.findElement(loginassert);
	}

}
