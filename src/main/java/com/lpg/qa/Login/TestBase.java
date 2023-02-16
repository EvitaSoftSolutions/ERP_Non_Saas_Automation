package com.lpg.qa.Login;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestBase {

		public static WebDriver driver;
		 
		public WebDriver intializeBrowser(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\YOGESH\\Desktop\\Selenium all jar file\\chromedriver.exe");
	     
	     ChromeOptions options=new ChromeOptions();
	     options.addArguments("--disable notifications-");
	     driver=new ChromeDriver(options);
				 
			System.out.println("Chrome driver sucessfully open");
			}
			
			driver.get("http://demo.mygasagency.com/Login/Login");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
			
		    
		}
		@AfterMethod
		public void screenshotCapture(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				Date d=new Date();
				String name = d.toString().replace(" ", "").replace(":", "")+".png";
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
				FileUtils.copyFile(source, new File("C:\\Users\\YOGESH\\Desktop\\Lpg Screenshot\\lpg"+name));
			}
		
		}
}
	
	







