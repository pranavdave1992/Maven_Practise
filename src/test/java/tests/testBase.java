package tests;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utils.testUtils;

public class testBase {
	public static WebDriver driver;
	private static Properties prop;
	public testUtils util;

	@BeforeSuite
	public void tearUP(){

		prop = new Properties();
		String propFileName = "config.properties";

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		try{
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
		}

		catch(Exception e){
			System.out.println(e);
		}

	}

	@AfterSuite
	public void tearDown(){
		driver.close();
	}

	public WebDriver getDriver (){
		return driver;
	}

	@BeforeTest
	public void openingWebPage(){
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\utils\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Opening the browser: " + browser);
		}
		else {
			System.out.println(browser);
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		loadUtils();		
	}
	
	public void loadUtils() {
		util = new testUtils(getDriver());
	}

}
