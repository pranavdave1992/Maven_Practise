package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.automationForm;
import utils.testUtils;

public class automationFormTest{
	
	testUtils formTest = new testUtils();
	automationForm pageElements = new automationForm();
	
	@Test()
	public void test1() throws Exception{
		PageFactory.initElements(formTest.crmDriver, pageElements);
		
		pageElements.enterFirstName("Pranav");
		testUtils.takeSnapShot();
		testUtils.timestamp();
	}
	
}
