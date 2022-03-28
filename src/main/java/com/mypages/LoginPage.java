package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By mailid = By.id("username");
	private By password = By.id("password");
	private By Loginbtn = By.id("Login");
	
	
	
	//Genarate getter 
	public WebElement getMailid() {
		return getElement(mailid);
		
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLogin() {
		return getElement(Loginbtn);
	}

	public void getLoginPageTitle()
	{
		//return getPageTitle();
	}
	
   
	
	
	
}
