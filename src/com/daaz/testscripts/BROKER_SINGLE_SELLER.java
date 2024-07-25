package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class BROKER_SINGLE_SELLER {
	@Test
    public void Broker_seller()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_single_SELLER();
    obj.broker_logout();
    obj.closeApplication();
}
}
