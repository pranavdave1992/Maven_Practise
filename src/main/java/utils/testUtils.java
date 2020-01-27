package utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class testUtils{

	private WebDriver driver;

	public testUtils(WebDriver crmDriver) {
		this.driver = crmDriver;
	}

	public void takeSnapShot() throws Exception{
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("failedTestCaseScreens/"+timestamp()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
