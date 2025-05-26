package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtlity.BaseClass;
import Objectrepository.Homepage;
import Objectrepository.Organisation;

@Listeners
public class TC_VT_004_Test extends BaseClass {
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException {
		ExtentTest test = eReport.createTest("clickOnOrganization");
		
		Homepage hp=new Homepage(driver);
		hp.getOrganizationLink().click();
		
		Organisation og=new Organisation(driver);
		og.getCreateOgranitionIcon().click();
		
		String companyname = eUtil.getStringDataFromExcel("Organizations", 1, 0);
		og.getOrganisationTextField().sendKeys(companyname);
		og.getSaveButton();
		
		String headername = og.getHeaderField().getText();
		
		Assert.assertEquals(headername.contains(companyname), true);
		test.log(Status.PASS, "Organisation is Created");
	}

}
