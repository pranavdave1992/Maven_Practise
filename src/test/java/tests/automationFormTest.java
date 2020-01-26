package tests;

import org.testng.annotations.*;

import pages.automationForm;

public class automationFormTest extends testBase{

	public automationForm pageElements;

	@BeforeTest
	public void before(){
		pageElements = new automationForm(getDriver());
	}

	@Test()
	public void fillingTheForm() throws Exception{
		pageElements.enterName("Pranav","Dave");
		util.takeSnapShot();
	}

}
