package org.pagesnew;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HSelectHotel extends LibGlobal {
	
	
	public HSelectHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "radiobutton_0")
		private WebElement radiobtn;
	
	@FindBy(id = "continue")
	private WebElement contu;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContu() {
		return contu;
	}


}
