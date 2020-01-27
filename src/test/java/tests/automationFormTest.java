package tests;

import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

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
		test.log(LogStatus.PASS, "Entered Name");
	}
	
	@Test()
	public void fillingTheForm2() throws Exception{
		pageElements.enterName("Pranav","Dave");
		util.takeSnapShot();
		test.log(LogStatus.PASS, "Entered Name");
	}

}
