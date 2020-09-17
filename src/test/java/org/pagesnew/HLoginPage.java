package org.pagesnew;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HLoginPage extends LibGlobal {

	
public HLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
    

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


@FindBy(id="username")
private WebElement txtUserName;

@FindBy(id="password")
private WebElement txtPassword;

@FindBy(id="login")
private WebElement btnLogin;


}
