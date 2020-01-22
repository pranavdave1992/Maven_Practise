package tests;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class testBase {
	public static WebDriver crmDriver;
	private static Properties prop;
	
	@BeforeSuite
	public void tearUP(){
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\utils\\chromedriver.exe");
		crmDriver = new ChromeDriver();
		crmDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		crmDriver.get(prop.getProperty("url"));
	}
	
	@BeforeClass
	public void openingWebPage(){
		crmDriver.get(prop.getProperty("url"));
	}
	
	@AfterSuite
	public void tearDown(){
		crmDriver.close();
	}
}
