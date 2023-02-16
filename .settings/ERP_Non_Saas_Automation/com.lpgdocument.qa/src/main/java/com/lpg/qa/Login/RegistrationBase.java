package com.lpg.qa.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationBase {
	public static  WebDriver driver;


	public WebDriver intializeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver (1).exe");
			driver=new ChromeDriver();
			System.out.println("Chrome driver sucessfully open");
		}
		driver.get("http://pankaj.mygasagency.com/registration/registration");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
}
