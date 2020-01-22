package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import tests.testBase;

public class automationForm extends testBase{
	
	 @FindBy(xpath=".//*[@name='firstname']") 
	 public WebElement fName;
	 
	 @FindBy(partialLinkText="Partial Link")
	 public WebElement partialLink;
	 
	 @FindBy(linkText="Link Test")
	 public WebElement link;
	 
	 @FindBy(id="lastname")
	 public WebElement lName;
	 
	 @FindBy(className="btn")
	 public WebElement btn;
	 
	 @FindBy(xpath=".//*[@value='Male']")
	 public WebElement sex_Male;
	 
	 @FindBy(xpath=".//*[@value='Female']")
	 public WebElement sex_Female;
	 
	 @FindBy(xpath=".//*[@name='exp']")
	 public WebElement yearExp;
	 
	 @FindBy(id="datepicker")
	 public WebElement date;
	 
	 @FindBy(xpath=".//*[@name='profession']")
	 public WebElement skill;
	 
	 @FindBy(xpath=".//*[@value='Selenium Webdriver' && @id='tool-2']")
	 public WebElement tool;
	
	 Select sel_region = new Select(crmDriver.findElement(By.xpath(".//*[@id='continents']")));
	 
	 public void enterFirstName(String fname, String lname){
		 fName.sendKeys(fname);
		 lName.sendKeys(lname);
	 }
	 
	 public void select_region(){
		 sel_region.selectByVisibleText("Asia");
		 sel_region.selectByVisibleText("North America");
	 }
	 
}
