package com.daaz.makeanoffer;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class Revoke_make_an_offer {
	
	//SCRIPT***********************
	
//	Buyer first count offer (400) to selected domain.
//
//	Buyer Revoked it.
//
//	Again, Buyer count offer 500 with message.
//
//	Seller count offer 2000 with message and revoked.
//
//	Seller count offer 2100 with message.
 	
	@Test
    public void login_buyer()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.openApplication();
    //buyer side
    obj.login_buyer();
    obj.Revoke_buyer_side();
    obj.logout();
    obj.login_seller();
    Thread.sleep(1000);
    obj.Revoke_seller_side();
    obj.closeApplication();
    
    
	}
}
