package com.daaz.New_Features;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;



	public class Feature_Request {
		@Test
	    public void Feature_Request1()throws Exception {
		// Test case steps
	    DOMConfigurator.configure("log4j.xml");
	    General obj = new General();
	   
	    obj.Feature_Request1();
	   
	    obj.closeApplication();

	    
	    
	}

}
