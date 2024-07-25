package com.daaz.New_Features;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class Admin_All_Options {
	@Test
    public void All_Options()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();   
    obj.All_Options();   
    obj.closeApplication();
   
}
	
	
	
	
	
	
	
	
}
