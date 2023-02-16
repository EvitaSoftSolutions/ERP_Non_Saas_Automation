package com.lpg.qa.commercialcylsale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class CommCreCylListForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Commercial Credit Cylinder List']")private WebElement listcomcret;
	@FindBy(xpath="//select[@id='ddlParty']")private WebElement ddlparty;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement getdata;
	
	//initialization
	public CommCreCylListForm(WebDriver driver) {
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
	public void verifyMyerpCommercialcylsale() {
		Assert.assertTrue(commercialcylsale.isEnabled(),"Commercialcylsale is enable");
		Reporter.log("verifyMyerpcommercialcylsale",true);
		commercialcylsale.click();
	}
	public void verifyMyerpListcomcret() {
		Assert.assertTrue(listcomcret.isEnabled(),"Listcomcret is enable");
		Reporter.log("verifyMyerplistcomcret",true);
		listcomcret.click();
	}
	public void Ddlparty() throws InterruptedException {
		Select sc = new Select(ddlparty);
		Thread.sleep(1000);
		Assert.assertFalse(ddlparty.isDisplayed(),"Ddlparty is  displayed");
		Assert.assertFalse(ddlparty.isSelected());
		sc.selectByVisibleText("MUMBAI FRESH");
	}
	public void verifyMyerpGetData() {
		Assert.assertTrue(getdata.isEnabled(),"GetData is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}

}
