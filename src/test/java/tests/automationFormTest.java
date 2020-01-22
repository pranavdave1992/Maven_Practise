package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.automationForm;
import utils.testUtils;

public class automationFormTest extends testBase{
	
	testUtils formTest = new testUtils();
	automationForm pageElements = new automationForm();
	
	@Test()
	public void test1() throws Exception{
		PageFactory.initElements(crmDriver, pageElements);
		
		pageElements.enterName("Pranav","Dave");
		testUtils.takeSnapShot();
		testUtils.timestamp();
	}
	
}
