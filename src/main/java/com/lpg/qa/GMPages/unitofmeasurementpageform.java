package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class unitofmeasurementpageform {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='Unit Of Measurement']")private WebElement unitofmeasurment;
	@FindBy(xpath="//input[@id='txtUnit_Name']")private WebElement unitname;
	@FindBy(xpath="//input[@id='txtShort_Name']")private WebElement unitshortname;
	@FindBy(xpath="//input[@id='txtDescription']")private WebElement unitdescription;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement unitactivebtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//input[@id='txtConnectionCategory']")private WebElement updatecategory; 
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	//initialization
			public unitofmeasurementpageform(WebDriver driver) {
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
			public void verifyMyerpPageNavigation() {
				Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena.click();
				
			}
			public void verifyMyerpUnitofMeasurment() {
				Assert.assertTrue(unitofmeasurment.isEnabled(),"UnitofMeasurment is Enable");
				Reporter.log("verifyMyerpunitmaserment",true);
				unitofmeasurment.click();
				
			}
			public void verifyMyerpUnitName() {
				Assert.assertTrue(unitname.isEnabled(),"UnitName is Enable");
				Reporter.log("verifyMyerpunitname",true);
				unitname.sendKeys("Liter");
				
			}
			public void verifyMyerpUnitShortName() {
				Assert.assertTrue(unitshortname.isEnabled(),"UnitShortName is Enable");
				Reporter.log("verifyMyerpunitshortname",true);
				unitshortname.sendKeys("lt");
				
			}
			public void verifyMyerpUnitDescription() {
				Assert.assertTrue(unitdescription.isEnabled(),"UnitDescription is Enable");
				Reporter.log("verifyMyerpunitdescription",true);
				unitdescription.sendKeys("Liter");
				
			}
			public void verifyMyerpUnitActivbtn() {
				Assert.assertTrue(unitactivebtn.isEnabled(),"UnitActivebtn is Enable");
				Reporter.log("verifyMyerpunitactivebtn",true);
				unitactivebtn.click();
				
			}
			public void verifyMyerpClearbutton() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbutton is Enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
				
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is Enable");
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
		    	  pcsearchbar.sendKeys("Liter");
		    	  
		    	  Thread.sleep(500);
		    	  }
			public void verifyMyerpEditbutton() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(editbtn.isEnabled(),"Editbutton is Enable");
				Reporter.log("verifyMyerpeditbtn",true);
				editbtn.click();
				
			}
			public void verifyMyerpConfirmbutton() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbutton is Enable");
				Reporter.log("verifyMyerpconfirmbtn",true);
				confirmbtn.click();
			
			}
			public void verifyMyerpUnitName1() {
				Assert.assertTrue(unitname.isEnabled(),"UnitName is Enable");
				Reporter.log("verifyMyerpunitname",true);
				unitname.click();
				unitname.click();
				unitname.sendKeys("KGG");
				
			}
			public void verifyMyerpUnitDescription1() {
				Assert.assertTrue(unitdescription.isEnabled(),"UnitDescription is Enable");
				Reporter.log("verifyMyerpunitdescription",true);
				unitdescription.click();
				unitdescription.clear();
				unitdescription.sendKeys("KGG");
				
			}
			public void verifyMyerpUnitShortName1() {
				Assert.assertTrue(unitshortname.isEnabled(),"UnitShortName is Enable");
				Reporter.log("verifyMyerpunitshortname",true);
				unitshortname.click();
				unitshortname.clear();
				unitshortname.sendKeys("Kilo");
				
			}
			
			public void verifyMyerpUpdatebtn() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(updatebtn.isEnabled(),"updatebtn is Enable");
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
		    	  pcsearchbar.sendKeys("KGG");
		    	  
		    	  Thread.sleep(500);
		    	  }


		}



	
	

