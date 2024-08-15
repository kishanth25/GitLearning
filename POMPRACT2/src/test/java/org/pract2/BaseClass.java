package org.pract2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
  static WebDriver driver;
 Select select;
 Actions action;
 
	public void elementSendKeys(WebElement element,String data) {
         element.sendKeys(data);
		
	}

   public WebElement  findLocatorByid(String data) {

   WebElement element = driver.findElement(By.id(data));
   return element;
}
   
   
   
   public WebElement findLocatorByname(String data) {
	   WebElement element = driver.findElement(By.name(data));
	   return element;
   }



    public WebElement findLocatorByxpath(String data) {
    	WebElement element= driver.findElement(By.xpath(data));
    	return element;
    }
     
    public void elementClick(WebElement element) {
    	element.click();
    }
  
    public void implicitllyWait() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
  
    

    public void clickUsingJS(String data,WebElement element) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value',data)",element);
    	
    }
    
    public void SelectByIndex(WebElement element, int i) {
    	select= new Select(element);
    	select.selectByIndex(i);
    }

   public void SelectByValue(WebElement element,String data) {
	   select= new Select(element);
	   select.selectByValue(data);
   }


   public void SelectByVisibleText(WebElement element, String data) {
	   select= new Select(element);
	   select.selectByVisibleText(data);
   }
   
   public static void BrowserLaunch() {
	   driver= new ChromeDriver();
	   
   }
   
   public static void getApplicationUrl(String data) {
	   driver.get(data);
   }
   
  public  static void maximizeWindow() {
	  driver.manage().window().maximize();
  }

 
  
}