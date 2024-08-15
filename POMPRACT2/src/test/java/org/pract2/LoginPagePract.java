package org.pract2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePract {
	
	WebDriver driver;
	public LoginPagePract() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(id="username")
    private WebElement txtusername;
	
	@FindBy(id="password")
	
	private WebElement txtPassword;
	
	
	@FindBy(id="login")
	
	private WebElement btnLogin;
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
	
}
     
   
