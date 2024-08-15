package org.pract2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	
	public SearchHotel() {
		PageFactory.initElements(driver,this);
	}

  
	@FindBy(id="location")
	
	private WebElement ddnLocation;
	
	
	@FindBy(id="hotels")
	
	private WebElement ddnHotels;
	
	
	@FindBy(id="room_type")
	
	private WebElement ddnRoomtype;
	
	@FindBy(id="room_nos")
	
	private WebElement ddnRooms;

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotels() {
		return ddnHotels;
	}

	public WebElement getDdnRoomtype() {
		return ddnRoomtype;
	}

	public WebElement getDdnRooms() {
		return ddnRooms;
	}
	
	







}
