package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class BROKER_SINGLE50_50 {
	@Test
    public void BROKER_SINGLE_50_50()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.BROKER_SINGLE_50_50();
    obj.broker_logout();
    obj.closeApplication();
}
}