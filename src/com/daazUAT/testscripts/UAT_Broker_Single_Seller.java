package com.daazUAT.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class UAT_Broker_Single_Seller {
	@Test
    public void Brokerbuyer()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_single_UAT_SELLER();
    obj.broker_logout();
    obj.closeApplication();
}
}
