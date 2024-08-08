package VTiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.VT_BaseClass;
import com.crm.POM.ContactPOM;
@Listeners(com.crm.Listners.Listners.class)

public class NewContact extends VT_BaseClass {
	@Test
	public void testCase() throws EncryptedDocumentException, IOException {
		ContactPOM con= new ContactPOM(driver);
		con.getContactButton();
		con.getNewcontact();
		con.getContactName();
		con.getStartdate();
		con.getEnddate();
		con.getSaveButton();
		
	}

}
