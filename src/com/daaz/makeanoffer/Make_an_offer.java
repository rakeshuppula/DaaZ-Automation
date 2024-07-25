package com.daaz.makeanoffer;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class Make_an_offer {
	
//	Automation Script:
//
//		Buyer first count offer (400) to selected domain.
//
//		Seller first count offer (2000) with message.
//
//		Again, Buyer count offer 500 with message.
//
//		Again, Seller Count offer 1500 with message.
//
//		Finally, Buyer accepted seller offer.
	
	@Test
    public void login_buyer()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.openApplication();
    //buyer side
    obj.login_buyer();
    obj.Make_an_offer_buyer_side(); 
    obj.logout();
    
    // seller side ########################################        
    obj.login_seller();
    obj.Make_an_offer_seller_side();    
      
    // buyer side2 #########################################     
    obj.login_buyer();
    obj.Make_an_offer_buyer_side2();
    obj.logout();
    
    // seller side2 #######################################    
    obj.login_seller();
    obj. Make_an_offer_seller_side2();
      
    // buyer side3 #########################################         
    obj.login_buyer();
    obj.Make_an_offer_buyer_side3();
    obj.logout();
}
}
