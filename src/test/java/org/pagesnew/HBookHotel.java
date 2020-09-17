package org.pagesnew;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HBookHotel extends LibGlobal{

	public HBookHotel() {
		  PageFactory.initElements(driver, this);
		} 
		
		@FindBy(id = "first_name")
		 private WebElement fname;
		
		@FindBy(id = "last_name")
		private WebElement lname;
		
		@FindBy(id = "address")
		private WebElement address;
		
		@FindBy(id = "cc_num")
		private WebElement cardNo;
		
		public WebElement getFname() {
			return fname;
		}

		public WebElement getLname() {
			return lname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardNo() {
			return cardNo;
		}

		public WebElement getCardType() {
			return cardType;
		}

		public WebElement getExpMonth() {
			return expMonth;
		}

		public WebElement getExpYear() {
			return expYear;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBook() {
			return Book;
		}

		@FindBy(id = "cc_type")
		private WebElement cardType;
		
		@FindBy(id = "cc_exp_month")
		private WebElement expMonth;
		
		@FindBy(id = "cc_exp_year")
		private WebElement expYear;
		
		@FindBy(id = "cc_cvv")
		private WebElement cvv;
		
		@FindBy(id = "book_now")
		private WebElement Book;
}
