package com.lpg.qa.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class DirectLoginWithoutAUP {
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement signinbtn;



	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public DirectLoginWithoutAUP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// usage

	public void VerifyandClickonMyerpLoginwithoutBtn1() throws InterruptedException {
		Assert.assertTrue(signinbtn.isEnabled(),"signin btn is enabled");
		signinbtn.click();
		Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
		Reporter.log(" verifyMyerpsigninbtn",true);


	}
}
