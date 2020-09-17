package org.pagesnew;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOrderNo extends LibGlobal {

	
	public HOrderNo() {
	    PageFactory.initElements(driver, this);	
	}

	@FindBy(id = "order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	} 
	
	
	
	
}
