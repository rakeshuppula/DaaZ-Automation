package Only_UI_DEV;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.daaz.lib.General;

public class B5_Feature_Request_Reject {
	@Test
    public void Feature_Request_Reject()throws Exception {
	// Test case steps
    DOMConfigurator.configure("log4j.xml");
    General obj = new General();
   
    obj.Feature_Request_Reject();
   
    obj.closeApplication();
	}
}
