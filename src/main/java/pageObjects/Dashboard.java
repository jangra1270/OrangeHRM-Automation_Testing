package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class Dashboard extends AbstractComponent {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public Dashboard(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
