package GenericUtlity;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Objectrepository.Homepage;
import Objectrepository.Loginpage;

public class BaseClass {
	
	public static ExtentReports eReport;
	
	public static WebDriver driver;
	
	public JavaUtility jUtil=new JavaUtility();
	public FileUtility fUtil=new FileUtility();
	
	public WebDriverUtility wUtil=new WebDriverUtility();
	
	public ExcelUtility eUtil=new ExcelUtility();
	
	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport_"+jUtil.getSystemTime());
		eReport=new ExtentReports();
		eReport.attachReporter(spark);
		
	}
	@BeforeClass
	public void openBrowser() throws IOException {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(fUtil.getDataFromProperty("Url"));
	
	}
	@BeforeMethod
	public void login() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.getUsernameLink().sendKeys(fUtil.getDataFromProperty("Username"));
		lp.getUserpasswordLink().sendKeys(fUtil.getDataFromProperty("Password"));
		lp.getLoginLink().click();
	}
	@AfterMethod
	public void logout() {
		Homepage hp=new Homepage(driver);
		wUtil.mouseHover(driver, hp.getProfileIcon());
		hp.getSignOutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}

}
