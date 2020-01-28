package tests;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.annotations.*;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.relevantcodes.extentreports.LogStatus;

import pages.automationForm;
import testData.customer;

public class automationFormTest extends testBase{

	public automationForm pageElements;
	public customer cx;
	
	@BeforeTest
	public void before(){
		pageElements = new automationForm(getDriver());
		
		try{
			Yaml yaml = new Yaml(new Constructor(customer.class));
			String customerYaml = "customer.yaml";
			InputStream inputStreamYaml = this.getClass().getClassLoader().getResourceAsStream(customerYaml);

			if (inputStreamYaml != null)
				cx = yaml.load(inputStreamYaml);
			else
				throw new FileNotFoundException("Yaml file '" + customerYaml + " not found in the resource");
		}

		catch(Exception e){
			System.out.println("Caught: " + e);
		}
	}
	
	@Test()
	public void fillingTheForm() throws Exception{
		pageElements.enterName(cx.getFirstName(), cx.getLastName());
		test.log(LogStatus.PASS, "Entered Name");
	}
	
	@Test()
	public void fillingTheForm2() throws Exception{
		pageElements.selectSex(cx.getSex());
		
		util.takeSnapShot();
		test.log(LogStatus.PASS, "Sex Selected");
	}
	

}
