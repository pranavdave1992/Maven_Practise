package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import pages.automationForm;

public class automationFormTest extends testBase{

	automationForm pageElements;
	
	@BeforeTest
	public void before(){
		pageElements = new automationForm(super.getDriver());
		pageElements = PageFactory.initElements(crmDriver, automationForm.class);
	}
	
	@Test()
	public void test1() throws Exception{
		pageElements.enterName("Pranav","Dave");
		formTest.takeSnapShot();
	}
	
}
