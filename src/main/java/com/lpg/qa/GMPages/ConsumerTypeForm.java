 package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ConsumerTypeForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='Consumer Type']")private WebElement consumertype;
	@FindBy(xpath="//input[@id='txtConsumerTypeName']")private WebElement consutyname;
	@FindBy(xpath="//input[@id='txtConsumerTypeShortName']")private WebElement consutyshorname;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chkactbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//input[@id='txtConsumerTypeName']")private WebElement chengename;
	@FindBy(xpath="//input[@id='txtConsumerTypeShortName']")private WebElement sotname;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checActivebtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	//initialization
	public ConsumerTypeForm(WebDriver driver) {
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
	public void verifyMyerpMasterModule() {
		Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
		Reporter.log("verifyMyerpmastermodule",true);
		master.click();
	}
	public void verifyMyerpGeneralMaster() {
		Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
		Reporter.log("verifyMyerpgeneralmaster",true);
		generalmaster.click();
		
	}
	public void verifyMyerpPageNavigation1() {
		Assert.assertTrue(pagena1.isEnabled(),"PageNavigation1 is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena1.click();
		
	}
	public void verifyMyerpPageNavigation2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pagena2.isEnabled(),"PageNavigation2 is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena2.click();
		
	}
	public void verifyMyerpConsumertype() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumertype.isEnabled(),"Consumertype is Enable");
		Reporter.log("verifyMyerpconsumertype",true);
		consumertype.click();
		
	}
	public void verifyMyerpConsuTyname() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consutyname.isEnabled(),"ConsuTyname is Enable");
		Reporter.log("verifyMyerpconsutyname",true);
		consutyname.sendKeys("HPCL");
		
	}
	public void verifyMyerpConsumerTypeshortname() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consutyshorname.isEnabled(),"ConsumerTypeshortname is Enable");
		Reporter.log("verifyMyerpconsutyshorname",true);
		consutyshorname.sendKeys("HP");
		
	}
	public void verifyMyerpCheckbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(chkactbtn.isEnabled(),"Checkbutton is Enable");
		Reporter.log("verifyMyerpchkactbtn",true);
		chkactbtn.click();
		
	}
	public void verifyMyerpClearbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbutton is Enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
		
	}
	public void verifyMyerpSubmitButton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"SubmitButton is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		
	}
	public void verifyMyerpOKButton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"OKButton is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();
		
	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
  	  Thread.sleep(500);
  	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
  	  Reporter.log(" verifyMyerp pcsearchbar", true);
  	  pcsearchbar.click(); 
  	  pcsearchbar.clear();
  	  pcsearchbar.sendKeys("HP");
  	  
  	  Thread.sleep(500);
  	  }
	public void verifyMyerpEditButton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(editbtn.isEnabled(),"EditButton is Enable");
		Reporter.log("verifyMyerpeditbtn",true);
		editbtn.click();
		
	}
	public void verifyMyerpConfirmbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbutton is Enable");
		Reporter.log("verifyMyerpconfirmbtn",true);
		confirmbtn.click();
		
	}
	public void verifyMyerpChengeName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(chengename.isEnabled(),"ChengeName is Enable");
		Reporter.log("verifyMyerpchengename",true);
		chengename.click();
		chengename.clear();
		chengename.sendKeys("BPCL AGENCY");
		
	}
	
	public void verifyMyerpSotname() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updatebtn.isEnabled(),"Sotname is Enable");
		Reporter.log("verifyMyerpsotname",true);
		sotname.click();
		sotname.clear();
		sotname.sendKeys("BPCL AGENCY");
		
	}
	
	public void verifyMyerpUpdatebtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updatebtn.isEnabled(),"Updatebtn is Enable");
		Reporter.log("verifyMyerpupdatebtn",true);
		updatebtn.click();
		
	}
	public void verifyMyerpupdateokbtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(updateokbtn.isEnabled(),"updateokbtn is Enable");
		Reporter.log("verifyMyerpupdateokbtn",true);
		updateokbtn.click();
		
	}
	public void verifyMyerpexportbtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(exportbtn.isEnabled(),"exportbtn is Enable");
		Reporter.log("verifyMyerpexportbtn",true);
		exportbtn.click();
		
	}
	public void VerifyandClickonPSearchbar2() throws InterruptedException {
    	  Thread.sleep(500);
    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
    	  Reporter.log(" verifyMyerp pcsearchbar", true);
    	  pcsearchbar.click(); 
    	  pcsearchbar.clear();
    	  pcsearchbar.sendKeys("BPCL AGENCY");
    	  
    	  Thread.sleep(500);
    	  }

}
