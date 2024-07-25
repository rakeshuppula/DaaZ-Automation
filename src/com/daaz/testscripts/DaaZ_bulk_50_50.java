package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class DaaZ_bulk_50_50 {
	@Test
    public void daazsecure_BULK_50_50()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.daazsecure_BULK_50_50();
   // obj.logout();
    obj.closeApplication();
}
}