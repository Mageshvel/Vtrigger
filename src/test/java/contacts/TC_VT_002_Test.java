package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtlity.BaseClass;
import Objectrepository.Contactpage;
import Objectrepository.Homepage;
@Listeners
public class TC_VT_002_Test extends BaseClass{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		ExtentTest test=eReport.createTest("createContact");
		
		Homepage hp=new Homepage(driver);
		hp.getContectsLink().click();
		
		Contactpage cp=new Contactpage(driver);
		cp.getCreateIcon().click();
		
		String lastname = eUtil.getStringDataFromExcel("Contacts", 1, 0);
		cp.getLastnameTextfield().sendKeys(lastname);
		cp.getSaveButton().click();
		
		String actLastname = cp.getHeadNameFiled().getText();
		
		Assert.assertEquals(actLastname.contains(lastname), true);
		test.log(Status.PASS, "contact is created");
		
	}

}
