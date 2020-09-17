package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.LibGlobal;
import org.manager.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.pagesnew.HBookHotel;
import org.pagesnew.HLoginPage;
import org.pagesnew.HOrderNo;
import org.pagesnew.HSearchHotel;
import org.pagesnew.HSelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepLoginH extends LibGlobal{ 
	
	 PageObjectManager objectManager;
     HLoginPage loginPage;
     HSearchHotel searchHotel;
	 HSelectHotel selectHotel;
	 HBookHotel bookHotel;
	 HOrderNo orderNo;
	 WebDriver driver; 
	 
	 @Given("User is on the adactin page")
		public void user_is_on_the_adactin_page() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
	}
	 
	 @When("User should enter")
		public void user_should_enter(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> li = dataTable.asMaps();
	    Map<String, String> mp = li.get(0);
	    objectManager = PageObjectManager.getInstance();
	    loginPage = objectManager.getHLoginPage();
	    String name = mp.get("username");
	    String pass = mp.get("password");
	    type(loginPage.getTxtUserName(), name);
	    type(loginPage.getTxtPassword(), pass);
	    Thread.sleep(2000);
	   	}

	 @When("User should click the login button")
		public void user_should_click_the_login_button() throws InterruptedException {
		btnLogin(loginPage.getBtnLogin());
	   Thread.sleep(2000);
	}

	 @Then("user should select the location as")
		public void user_should_select_the_location_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   List<Map<String, String>> li = dataTable.asMaps();
	   Map<String, String> mp = li.get(1);
	   searchHotel = objectManager.getHSearchHotel();
	   String loc = mp.get("location");
	   String hotel = mp.get("hotels");
	   String room = mp.get("roomType");
	   String noOfRoom = mp.get("numberOfRooms");
	   String adults = mp.get("adultsPerRoom");
	   String child = mp.get("childrenPerRoom");
	   seltxt(searchHotel.gethLocation(), loc);
	   seltxt(searchHotel.getSelectHotel(), hotel);
	   seltxt(searchHotel.getRoomType(), room);
	   seltxt(searchHotel.getNoOfRooms(), noOfRoom);
	   seltxt(searchHotel.getAdultRoom(), adults);
	   seltxt(searchHotel.getChildRoom(), child);
	   Thread.sleep(3000);
	   
	}

		@Then("User should click the search button")
		public void user_should_click_the_search_button() throws InterruptedException { 
		searchHotel = objectManager.getHSearchHotel();
	    btnLogin(searchHotel.getSearchBtn()); 
	    
	    Thread.sleep(3000);
	}

		@Then("User should click  the radio button")
		public void user_should_click_the_radio_button() throws InterruptedException {
	   selectHotel = objectManager.getHSelectHotel();
	   btnLogin(selectHotel.getRadiobtn());
	   
	   Thread.sleep(3000);
	}

		@Then("User should click the continue button")
		public void user_should_click_the_continue_button() throws InterruptedException {
		 selectHotel = objectManager.getHSelectHotel();
	    btnLogin(selectHotel.getContu());
	    
	    Thread.sleep(3000);
	}

		@Then("User should enter the values as")
		public void user_should_enter_the_values_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> li = dataTable.asMaps();
		bookHotel = objectManager.getHBookHotel();
		Map<String, String> mp = li.get(0);
		String fname = mp.get("FirstName");
		String lname = mp.get("LastName");
		String addr = mp.get("Address");
		String cardno = mp.get("CardNo");
		String cardtype = mp.get("CardType");
		String eMon = mp.get("Month");
		String eYear = mp.get("Year");
		String cvv = mp.get("Cvv");
         
		type(bookHotel.getFname(), fname);
		type(bookHotel.getLname(), lname);
		type(bookHotel.getAddress(), addr);
		type(bookHotel.getCardNo(), cardno);
		seltxt(bookHotel.getCardType(), cardtype);
		seltxt(bookHotel.getExpMonth(), eMon);
		seltxt(bookHotel.getExpYear(), eYear);
		type(bookHotel.getCvv(), cvv);
		
		
		Thread.sleep(3000);
	  	}

		@Then("user should click Book Now")
		public void user_should_click_Book_Now() throws InterruptedException {
	   bookHotel = objectManager.getHBookHotel();
	   btnLogin(bookHotel.getBook());
	   
	   Thread.sleep(3000);
	}

		@Then("User should print the order id")
		public void user_should_print_the_order_id() throws InterruptedException {
	   orderNo = objectManager.getHOrderNo();
	   String order =getAttribute(orderNo.getOrderno(), "value");
	   Thread.sleep(5000); 
	   System.out.println(order);
	   
	}
}