package VTiger;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.VT_BaseClass;
import com.crm.FileUtility.VT_Fileutility;
import com.crm.POM.VT_Organazation;
@Listeners(com.crm.Listners.Listners.class)



public class CreateOrganizationWithIndustries extends VT_BaseClass {
	@Test
	public void testCase() throws EncryptedDocumentException, IOException {
		String organizationName = VT_Fileutility.getData("TC_02", 1, 2);
		String industry = VT_Fileutility.getData("TC_02", 1, 3);
		VT_Organazation org= new VT_Organazation(driver);
		org.createOrganizationWithIndustries(organizationName, industry);
		String name1 = org.verifyText();
		assertEquals(name1.contains(organizationName), true);
		
		String name2 = org.verifyTextIndustries();
		assertEquals(name2.contains(industry),true);
	}
}
