package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFlipkart {

	WebDriver ldriver;
	
	public HomePageFlipkart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(xpath="//a[text()='Login']")
	@CacheLookup
	WebElement btnLoginFlipkart;
	
	@FindBy(xpath="(//div[@class='_39M2dM JB4AMj']/input)[1]")
	@CacheLookup
	WebElement txtUserName1;
	
	@FindBy(xpath="(//div[@class='_39M2dM JB4AMj']/input)[2]")
	@CacheLookup
	WebElement txtPassword1;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	@CacheLookup
	WebElement btnFlipkartSubmit;	
	
	public void setUserName(String uname)
	{
		txtUserName1.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword1.sendKeys(pwd);
	}
	
	
//	public void clickSubmit()
//	{
//		btnLogin.click();
//	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	public void clickLogin()
	{
		btnLoginFlipkart.click();
	}
	
	public void setUserName1(String uname)
	{
		txtUserName1.sendKeys(uname);
	}
	
	public void setPassword1(String pwd)
	{
		txtPassword1.sendKeys(pwd);
	}
	
	public void clickFlipkartSubmit()
	{
		btnFlipkartSubmit.click();
	}
	
	
}









