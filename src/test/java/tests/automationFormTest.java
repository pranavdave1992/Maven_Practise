package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import pages.automationForm;
import utils.testUtils;

public class automationFormTest extends testBase{
	
	testUtils formTest;
	automationForm pageElements;
	
	@BeforeTest
	public void before(){
		pageElements = new automationForm(super.getDriver());
		pageElements = PageFactory.initElements(crmDriver, automationForm.class);
		
		formTest = new testUtils(super.getDriver());
	}
	
	@Test()
	public void test1() throws Exception{
		pageElements.enterName("Pranav","Dave");
		formTest.takeSnapShot();
	}
	
}
