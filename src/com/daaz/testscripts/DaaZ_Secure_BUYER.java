package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class DaaZ_Secure_BUYER {
	@Test
    public void single_BUYER()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.daazsecure_single_BUYER();
    obj.closeApplication();
    
}
}
