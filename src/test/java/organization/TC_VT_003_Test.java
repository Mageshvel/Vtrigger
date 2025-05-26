package organization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtlity.BaseClass;
import GenericUtlity.ListenerUtility;
import Objectrepository.Homepage;

@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass {
	@Test
	public void clickOnOrganization()
	{
		
		ExtentTest test = eReport.createTest("clickOnOrganization");
		
		Homepage hp=new Homepage(driver);
		hp.getOrganizationLink().click();
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		test.log(Status.PASS, "Organization page is Created");

	}

}
