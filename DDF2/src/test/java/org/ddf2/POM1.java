package org.ddf2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
WebDriver driver;
	
	public POM1(){
		PageFactory.initElements(driver,this);
	}

    @FindBy(id="username")
    
    private WebElement txtUsername;
    
    @FindBy(id="password")
   
    
    private WebElement txtPassword;
    
    @FindBy(id="login")
    
    private WebElement btnLogin;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
    
    










}
