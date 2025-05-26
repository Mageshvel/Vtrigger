package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOgranitionIcon;
	
	@FindBy(name="accountname")
	private WebElement organisationTextField;
	
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath ="//span[@class='dvHeaderText']")
	private WebElement headerField;
	
	public Organisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		


	}

	public WebElement getCreateOgranitionIcon() {
		return createOgranitionIcon;
	}

	public WebElement getOrganisationTextField() {
		return organisationTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeaderField() {
		return headerField;
	}
	

}
