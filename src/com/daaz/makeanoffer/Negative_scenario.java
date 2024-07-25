package com.daaz.makeanoffer;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class Negative_scenario {
	
//	Automation Script: 
//
//		Buyer first offer (400) to selected domain.
//		Seller first count offer 300 with message. Here we get error message.
//		Seller 2nd count offer 2000 with message.
//		Again, seller count offer 2100 with message. Here we get error message.
//		Buyer 2nd count offer 300 with message. Here we get error message.
//		Again, Buyer count offer 2100 with message. Here we get error message.
//		Finally, Buyer count offer 500 with message.
	
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
    
    obj.login_seller();
    obj.Negative_Scenario_seller_side3();
    
    obj.login_buyer();
    obj.Negative_Scenario_buyer_side4();
    obj.logout();
    obj.closeApplication();
}
}