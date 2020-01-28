package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class automationForm{

	private WebDriver formDriver;

	public automationForm(WebDriver Driver2) {
		this.formDriver = Driver2;
		PageFactory.initElements(formDriver, this);
	}

	@FindBy(name="firstname") 
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

	@FindBy(xpath=".//*[@id='continents']")
	public Select sel_region;

	public void enterName(String fname, String lname){
		fName.clear();
		lName.clear();
		fName.sendKeys(fname);
		lName.sendKeys(lname);
	}

	public void select_region(){
		sel_region.selectByVisibleText("Asia");
		sel_region.selectByVisibleText("North America");
	}
	
	public void selectSex(String sex){
		if(sex.equalsIgnoreCase("Male"))
			sex_Male.click();
		else
			sex_Female.click();
	}

}
