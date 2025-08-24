package tests;

import org.testng.annotations.Test;

import org.testng.Assert;
import testComponents.BaseTest;

public class ErrorValidationsTest extends BaseTest {

	@Test
	public void incorrectLogin() {
		landingPage.login("Rahul", "Jangra");
		Assert.assertEquals("Invalid credentials", landingPage.getErrorMessage());
	}
}
