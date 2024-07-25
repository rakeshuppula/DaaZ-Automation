package com.daazUAT.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class UAT_Broker_Bulk_Seller {
	@Test
    public void BROKER_BULK_UAT_Buyer()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_BULK_UAT_SLLER();
    obj.broker_logout();
    obj.closeApplication();
	}
}
