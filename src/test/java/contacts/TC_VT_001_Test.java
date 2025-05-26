package contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtlity.BaseClass;
import GenericUtlity.ListenerUtility;
import Objectrepository.Homepage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {
	@Test
	public void clickOnContacts() {
		ExtentTest test=eReport.createTest("clickOnContacts");
		Homepage hp=new Homepage(driver);
		hp.getContectsLink().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM");
		test.log(Status.PASS, "Contacts page is displayed");
		
	}

}
