package com.daaz.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class DaaZ_bulk_SELLER {
	@Test
    public void daazsecure_BULK_SELLER()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
    obj.daazsecure_BULK_SELLER();
    obj.closeApplication();
	}
}
