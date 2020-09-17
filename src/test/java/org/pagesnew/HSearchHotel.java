package org.pagesnew;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HSearchHotel extends LibGlobal { 
	
public HSearchHotel() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "location")
    private WebElement hLocation;
	
	@FindBy(id = "hotels")
	private WebElement selectHotel;
	
	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id = "room_type")
	private WebElement roomType; 
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id = "Submit")
	private WebElement SearchBtn;

	public WebElement gethLocation() {
		return hLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
