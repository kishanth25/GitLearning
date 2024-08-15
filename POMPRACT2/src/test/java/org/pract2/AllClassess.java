package org.pract2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;

public class AllClassess extends BaseClass{

	
	@BeforeClass
	
	public static void openWindow() {
	   BrowserLaunch();
	   getApplicationUrl("https://adactinhotelapp.com/HotelAppBuild2/");
	   maximizeWindow();
	   driver.manage().window().maximize();
	}
    
    @Test
    
    public void test1() {
    	LoginPagePract l= new LoginPagePract();
    	elementSendKeys(l.getTxtusername(),"kishanth251295");
    	elementSendKeys(l.getTxtPassword(),"HPG49D");
    	elementClick(l.getBtnLogin());
    }
   
    @Test
    
    public void test2() {
    	SearchHotel s= new SearchHotel();
    	SelectByIndex(s.getDdnLocation(), 2);
    	SelectByIndex(s.getDdnHotels(), 1);
        SelectByIndex(s.getDdnRooms(), 2);    	
    }
   
}
