package com.inetbanking.testCases;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.LoginPageFlipkart;
import com.inetbanking.pageObjects.HomePageFlipkart;
import com.inetbanking.pageObjects.LoginPageFlipkart;

public class TC_LoginTestFlipkart extends BaseClass {

	@Test
	public void loginTest() throws Exception {

		logger.info("URL is opened");
		LoginPageFlipkart lp = new LoginPageFlipkart(driver);
		
		

		 //lp.clickLogin();
//		WebElement element = driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
		
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		  
//		for(String handle : allWindowHandles) {
//		  System.out.println("Window handle - > " + handle); 
//		}
//		 
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		 lp.setUserName1(username);
		  
		  

//		WebElement element = driver.findElement(By.xpath("(//input)[7]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		
		//jsClick(element,10);
		
//		element.sendKeys("9972039383");
		logger.info("Entered username");

//		element = driver.findElement(By.xpath("(//input)[8]"));
//		actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		//jsClick(element,10);
//		element.sendKeys("Sree2702!");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		lp.setPassword1(password);
		logger.info("Entered password");

		lp.clickFlipkartSubmit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		element = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
//		actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		//jsClick(element,10);

		logger.info("Clicked Submit button flipkart");

		Thread.sleep(3000);

		if (driver.getTitle().equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}
	
	/**
	 * This method will check whether the given element is clickable or not
	 * 
	 * @param element
	 *            id or xpath of the element
	 * @param timeOut
	 *            amount of time to wait till the element's existence
	 * @return true or false based on the element's availability
	 * @throws Exception
	 *             error
	 */
	public static boolean isElementClickable(final WebElement element, final long timeOut) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			if (wait.until(ExpectedConditions.elementToBeClickable(element)) != null) {
				return true;
			} else {
				Assert.fail("Element is not clickable" + element);
				return false;
			}

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}

	}
	/**
	 * This method will click on the given element using javascript executor
	 * 
	 * @param element
	 *            id or xpath of the element
	 * @param timeOut
	 *            amount of time to wait till the element turns to exist
	 * @throws Exception
	 *             error
	 */
	public static boolean jsClick(final WebElement element, final long timeOut) throws Exception {
		try {
			if (isElementClickable(element, timeOut)) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
				return true;
			} else {
				return false;

			}

		} catch (final Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}
	}
}
