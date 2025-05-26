package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	@FindBy(xpath  ="//img[@alt='Create Contact...']")
	private WebElement createIcon;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headNameFiled;
	
	public Contactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCreateIcon() {
		return createIcon;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeadNameFiled() {
		return headNameFiled;
	}
	
}
