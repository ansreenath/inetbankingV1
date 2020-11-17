package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFlipkart {

	WebDriver ldriver;
	
	public LoginPageFlipkart(WebDriver rdriver)
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
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	@CacheLookup
	WebElement txtUserName1;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	@CacheLookup
	WebElement txtPassword1;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	@CacheLookup
	WebElement btnFlipkartSubmit;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBar;
	
	@FindBy(xpath="//search button button[@class='vh79eN']")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@title='2 GB']")
	WebElement select2GBOption;
	
	@FindBy(xpath="//div[@title='3 GB']")
	WebElement select3GBOption;
	
	@FindBy(xpath="//input[@placeholder='Search Brand']")
	WebElement brandSearchbar;
	
	@FindBy(xpath="//div[text()='Gionee']")
	WebElement selectGioneeOption;
	
	@FindBy(xpath="//li[text()='2 GB RAM | 32 GB ROM | Expandable Upto 256 GB']")
	WebElement result2GB;
	
	@FindBy(xpath="//li[text()='3 GB RAM | 32 GB ROM | Expandable Upto 256 GB']")
	WebElement result3GB;
	
	@FindBy(xpath="//div[@class='_3clSXm']//div[text()='Gionee']")
	WebElement clearGioneeFilter;
	
	@FindBy(xpath="//div[text()='My Account']")
	WebElement buttonMyAccount;
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement buttonLogout;
	
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









