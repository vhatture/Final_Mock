package DWSFinalMock;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.POM.Login;
import com.crm.POM.Twitter;
@Listeners(com.crm.Listners.demoListners.class)

public class DWS_Task04 extends BaseClass {
	Login l =new Login(driver);
	@Test 
	public void taskNo4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String pID= driver.getWindowHandle();
		Twitter twi = new Twitter(driver);
		twi.scroll(driver);
		
		twi.getTwitterLink().click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		for(String str:ids)
		{
			driver.switchTo().window(str).getCurrentUrl();
		}
		
		driver.switchTo().window(pID);
	}


}
