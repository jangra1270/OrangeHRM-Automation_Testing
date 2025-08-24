package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

@SuppressWarnings("unused")
public class AddEmployee extends AbstractComponent {
	
	private WebDriver driver;
	
	public AddEmployee(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(css="[type='submit']")
	private WebElement submitBtn;
	
	public ViewPersonalDetails addEmployee(String fName, String lName) {
		waitForWebElementToAppear(firstName);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		submitBtn.click();
		return new ViewPersonalDetails(driver);
	}

}
