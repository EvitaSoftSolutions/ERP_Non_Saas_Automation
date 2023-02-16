package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TaoutForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Transfer Advise (TA) Out']")private WebElement taout;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement serchbtn;
	
	//initialization
		public TaoutForm(WebDriver driver) {
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
		public void verifyMyerpTaout() {
			Assert.assertTrue(taout.isEnabled(),"Taout is enable");
			Reporter.log("verifyMyerptaout",true);
			taout.click();
		}
		public void verifyMyerpConsumerno() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("12345");
		}
		public void verifyMyerpSerchbtn() {
			Assert.assertTrue(serchbtn.isEnabled(),"Serchbtn is enable");
			Reporter.log("verifyMyerpserchbtn",true);
			serchbtn.click();
		}

}
