package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import tests.testBase;

public class testUtils extends testBase{
	
	public static WebDriver driver;
	
	public testUtils() {
        this.driver = super.crmDriver;
    }
	
	public static void takeSnapShot() throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("failedTestCaseScreens/"+timestamp()+".png");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
	
}
