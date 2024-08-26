package Only_UI_DEV;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class B4_Feature_Request {
	
	@Test
    public void Feature_Request1()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
   
    obj.Feature_Request1();
   
    obj.closeApplication();
}
}