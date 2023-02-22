package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class BlockedandUnblokedconsumer {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//*[@id=\"menuCounterSales\"]/ul/li[8]/a")private WebElement blockeunblockedconsumer;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement submitbtn;

	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public BlockedandUnblokedconsumer(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//usage

	public void verifyMyerpagancycode() {
		Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
		Reporter.log("verifyMyerpagancycode",true);
		agancycode.sendKeys("ERP_00001");

	}
	public void verifyMyerpusrname() {
		Assert.assertTrue(userid.isEnabled(),"username find is enable");
		Reporter.log("verifyMyerpUserid",true);
		userid.sendKeys("admin");
	}
	public void verifyMyerppassword() {
		Assert.assertTrue(password.isEnabled(),"password find is enable");
		Reporter.log("verifyMyerppassword",true);
		password.sendKeys("admin@123");
	}
	public void verifyMyerploginbtn() {
		Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
		Reporter.log("verifyMyerplogin",true);
		login.click();
	}
	public void verifyMyerpCounterSales() {
		Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
		Reporter.log("verifyMyerpcountersales",true);
		countersales.click();
	}
	public void verifyMyerpBlockeUnblockedConsumer() {
		Assert.assertTrue(blockeunblockedconsumer.isEnabled(),"blockeunblockedconsumer is enable");
		Reporter.log("verifyMyerpblockeunblockedconsumer",true);
		blockeunblockedconsumer.click();
	}
	public void verifyMyerpCounsumerno() {
		Assert.assertTrue(consumerno.isEnabled(),"consumerno is enable");
		Reporter.log("verifyMyerpcconsumerno",true);
		consumerno.sendKeys("5656");
	}
	public void verifyMyerpSubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
}
