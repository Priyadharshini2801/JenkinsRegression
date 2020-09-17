package org.manager;

import org.base.LibGlobal;
import org.pagesnew.HBookHotel;
import org.pagesnew.HLoginPage;
import org.pagesnew.HOrderNo;
import org.pagesnew.HSearchHotel;
import org.pagesnew.HSelectHotel;

public class PageObjectManager extends LibGlobal {

	private static PageObjectManager objectManager;
	private HLoginPage loginPage;
	private HSearchHotel searchHotel;
	private HSelectHotel selectHotel;
	private HBookHotel bookHotel;
	private HOrderNo orderNo;
	private PageObjectManager() {
		
 }
	
	public static PageObjectManager getInstance() {
		 return (objectManager==null)?objectManager= new PageObjectManager():objectManager;
	 }
	 
	 public HLoginPage getHLoginPage() {
		 
			 if(loginPage == null) {
				 loginPage = new HLoginPage();
		} 
		 System.out.println(loginPage);
		 return loginPage;
	   
		
	 }
	 public HSearchHotel getHSearchHotel() {
		 return (searchHotel==null)?searchHotel= new HSearchHotel():searchHotel;
	 } 
	 public HSelectHotel getHSelectHotel() {
		 return (selectHotel==null)?selectHotel= new HSelectHotel():selectHotel;
	 }
	 public HBookHotel getHBookHotel() {
		 return (bookHotel==null)?bookHotel= new HBookHotel():bookHotel;
	 } 
	 public HOrderNo getHOrderNo() {
		 return (orderNo==null)?orderNo= new HOrderNo():orderNo;
	 }
	}
	
	



