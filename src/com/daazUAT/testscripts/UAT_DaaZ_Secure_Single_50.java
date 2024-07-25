package com.daazUAT.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class UAT_DaaZ_Secure_Single_50 {
	@Test
    public void single50_50()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.daazsecure_UAT_single50();
    obj.logout();
    obj.closeApplication();
}
}
