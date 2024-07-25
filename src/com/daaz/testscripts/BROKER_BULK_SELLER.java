package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class BROKER_BULK_SELLER {
	@Test
    public void BROKER_BULK_50_50()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_BULK_SLLER();
    obj.broker_logout();
    obj.closeApplication();
}
}