package DWSFinalMock;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.FileUtility.PropertyUtility;
import com.crm.POM.HomePage;
@Listeners(com.crm.Listners.demoListners.class)

public class DWS_Task3 extends BaseClass{
PropertyUtility p = new PropertyUtility();
	
	@Test
	public void testCases() throws IOException
	{
		HomePage h = new HomePage(driver);	
		h.getDigitaldownloads().click();
		h.sortByDropDown();
		h.sortByDropDown();
		h.displayDropDown();
		h.viewDropDown();
	}


}
