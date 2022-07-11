package testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import java.util.Set;
import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Flipkarttesting.HomeObjectrepository;
import com.Flipkarttesting.basedriver;
import com.Flipkarttesting.Loginmethod;
import com.Flipkarttesting.logoutmethod;



public class HomeTest extends basedriver {

	public WebDriver driver;

	@Test
	public void Homepage() throws InterruptedException, IOException {

		// Invoking driver
		driver = initdriver();
		

		// creating object of Homeobject class
		

		loadProperty();
		String producttype = prop.getProperty("itemtype");
		String itemselected = prop.getProperty("productname");

		HomeObjectrepository hr = new HomeObjectrepository(driver);
		// Searching the product
		hr.closebutton().click();
		hr.Searchitem().sendKeys(producttype);
		hr.Searchbutton().click();
		
		Reporter.log("searching product", true);
	
		

		// selecting the product
		productsearch(itemselected);
		Reporter.log("product searched", true);

		// moving driver from parent to child window
		Windowhandle();

		hr.addtocart().click();
		
		Reporter.log("Item added to cart", true);
		
		Loginmethod lg = new Loginmethod();
		
		lg.login(driver);

		Reporter.log("logged in successfully", true);

		// user logout 
		logoutmethod logoutobj = new logoutmethod();
		logoutobj.logout(driver);
		Reporter.log("Logged out successfully", true);
	//	driver.quit();
		Reporter.log("Browser closed", true);

	}

	// method for searching the product
	public void productsearch(String prodname)  {

		HomeObjectrepository lst = new HomeObjectrepository(driver);
		List<WebElement> produccts = lst.productlist();

		System.out.println("Total number of products on page:" + produccts.size());

		for (int i = 0; i < produccts.size(); i++) {
			String name = produccts.get(i).getText();
			if (name.equalsIgnoreCase(prodname)) {
				System.out.println(produccts.get(i).getText());
				driver.findElements(By.xpath("//a[@class='s1Q9rs']")).get(i).click();
				Reporter.log("selected the product", true);
			}

		}

	}

// method for handling the window 
	public void Windowhandle() {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
	}

}
