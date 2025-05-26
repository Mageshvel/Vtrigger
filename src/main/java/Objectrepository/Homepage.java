package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText="Contacts")
	private WebElement contectsLink;
	
	@FindBy(linkText ="Organizations")
	private WebElement organizationLink;
	
	@FindBy(xpath ="//td[@style='padding-right:0px;padding-left:10px;']")
	private WebElement profileIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		


	}
	

	public WebElement getContectsLink() {
		return contectsLink;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}
	public WebElement getSignOutLink() {
		return contectsLink;
		
	}

}
