package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class UploadSapConsumerDetails {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[8]/td[2]/a")private WebElement uploadsapconsumerdetails;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div/div/div/input[1]")private WebElement choosefile;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div/div/div/input[2]")private WebElement importbtn;
	@FindBy(xpath="//*[@id=\"test\"]")private WebElement sampleexel;


	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public UploadSapConsumerDetails(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//usage

	public void verifyMyerpagancycode() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
		Reporter.log("verifyMyerpagancycode",true);
		agancycode.sendKeys("ERP_00001");

	}
	public void verifyMyerpusrname() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(userid.isEnabled(),"username find is enable");
		Reporter.log("verifyMyerpUserid",true);
		userid.sendKeys("admin");
	}
	public void verifyMyerppassword() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(password.isEnabled(),"password find is enable");
		Reporter.log("verifyMyerppassword",true);
		password.sendKeys("admin@123");
	}
	public void verifyMyerploginbtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
		Reporter.log("verifyMyerplogin",true);
		login.click();
	}
	public void verifyMyerpMasterModule() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
		Reporter.log("verifyMyerpmastermodule",true);
		master.click();
	}
	public void verifyMyerpGeneralMaster() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
		Reporter.log("verifyMyerpgeneralmaster",true);
		generalmaster.click();

	}
	public void verifyMyerpPageNavigation() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();

	}
	public void verifyMyerpUploadSapConsumerDetails() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(uploadsapconsumerdetails.isEnabled(),"uploadsapconsumerdetails is Enable");
		Reporter.log("verifyMyerpuploadsapconsumerdetails",true);
		uploadsapconsumerdetails.click();

	}
	public void VerifyMyerpNLChooseFILE() {
		Assert.assertTrue(choosefile.isEnabled(),"choosefile Module field is enabled");		 
		Reporter.log("verifyMyerpchoosefile", true);
		choosefile.sendKeys("C:\\Users\\YOGESH\\Desktop\\Consumers Details.xlsx");
	}
	public void VerifyMyerpImportBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(importbtn.isEnabled(),"importbtn Module field is enabled");		 
		Reporter.log("verifyMyerpimportbtn", true);
		importbtn.click();
	}
	public void VerifyMyerpsampleexelBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(sampleexel.isEnabled(),"sampleexel Module field is enabled");		 
		Reporter.log("verifyMyerpsampleexel", true);
		sampleexel.click();
	}


}
