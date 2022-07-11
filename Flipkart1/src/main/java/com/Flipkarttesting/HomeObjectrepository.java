package com.Flipkarttesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.*;

public class HomeObjectrepository {

	WebDriver driver;

	public HomeObjectrepository(WebDriver driver) {
		
		this.driver = driver;

	}
	
	//xpath for element
	By Searchitem =  By.xpath("//input[@name='q']");
	By Searchbutton = By.xpath("//button[@class='L0Z3Pu']");
	By productlist= By.xpath("//a[@class='s1Q9rs']");
	By addtocart = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	By itemdbuy = By.xpath("//input[@name='proceedToRetailCheckout']");
	By addtocartassert = By.xpath("//span[text()='Price details']");
	By closebutton = By.xpath("//button[@class='_2KpZ6l _2doB4z']");



	public WebElement Searchitem() {

		return driver.findElement(Searchitem);
	}

	public WebElement closebutton() {

		return driver.findElement(closebutton);
	}

	public List<WebElement> productlist() {

		return driver.findElements(productlist);
	}
	

	public WebElement Searchbutton() {

		return driver.findElement(Searchbutton);
	}

	public WebElement itemdbuy() {

		return driver.findElement(itemdbuy);
	}

	public WebElement addtocart() {

		return driver.findElement(addtocart);
	}


	public WebElement addtocartassert() {

		return driver.findElement(addtocartassert);
	}


}
