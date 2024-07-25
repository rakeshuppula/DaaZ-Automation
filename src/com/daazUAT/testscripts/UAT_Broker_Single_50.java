package com.daazUAT.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class UAT_Broker_Single_50 {
	@Test
    public void Brokerbuyer()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_SINGLE_UAT_50_50();
    obj.broker_logout();
    obj.closeApplication();
}
}
