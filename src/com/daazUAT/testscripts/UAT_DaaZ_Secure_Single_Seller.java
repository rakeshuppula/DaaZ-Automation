package com.daazUAT.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class UAT_DaaZ_Secure_Single_Seller {
	@Test
    public void single50_50()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.daazsecure_single_UAT_SELLER();
    obj.logout();
    obj.closeApplication();
}
}
