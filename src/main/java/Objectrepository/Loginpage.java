package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name = "user_name")
	private WebElement usernameLink;
	
	@FindBy(name = "user_password")
	private WebElement userpasswordLink;
	
	@FindBy(id="submitButton")
	private WebElement loginLink;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsernameLink() {
		return usernameLink;
	}

	public WebElement getUserpasswordLink() {
		return userpasswordLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	

}
