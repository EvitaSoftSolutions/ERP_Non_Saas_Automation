package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Godownpageform {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='Godown']")private WebElement godowntransaction;
	@FindBy(xpath="//input[@id='txtGodown_Name']")private WebElement godownname;
	@FindBy(xpath="//input[@id='txtGodown_Address']")private WebElement godownaddress;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chekactive;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	
	//initialization
			public Godownpageform(WebDriver driver) {
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
			public void verifyMyerpGeneralMaster() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
				Reporter.log("verifyMyerpgeneralmaster",true);
				generalmaster.click();
				
			}
			public void verifyMyerpPageNavigation() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena.click();
				
			}
			public void verifyMyerpGodownTransaction() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(godowntransaction.isEnabled(),"GodownTransaction is Enable");
				Reporter.log("verifyMyerpgodowntransaction",true);
				godowntransaction.click();
			}
			public void verifyMyerpGodownName() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(godownname.isEnabled(),"GodownName is Enable");
				Reporter.log("verifyMyerpgodownname",true);
				godownname.sendKeys("PangharMumbai");
			}
			public void verifyMyerpGodownAddress() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(godownaddress.isEnabled(),"GodownAddress is Enable");
				Reporter.log("verifyMyerpgodownaddress",true);
				godownaddress.sendKeys("PangharMumbai");
			}
			public void verifyMyerpCheckActive()throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(chekactive.isEnabled(),"CheckActive is Enable");
				Reporter.log("verifyMyerpchekactive",true);
				chekactive.click();
			}
			public void verifyMyerpSubmitBtn()throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(submitbtn.isEnabled(),"SubmitBtn is Enable");
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
		    	  pcsearchbar.sendKeys("PangharMumbai");
		    	  
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
			public void verifyMyerpGodownName1() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(godownname.isEnabled(),"GodownName is Enable");
				Reporter.log("verifyMyerpgodownname",true);
				godownname.click();
				godownname.clear();
				godownname.sendKeys("Nalasophara WEST");
			}
			public void verifyMyerpGodownAddress1() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(godownaddress.isEnabled(),"GodownAddress is Enable");
				Reporter.log("verifyMyerpgodownaddress",true);
				godownaddress.click();
				godownaddress.clear();
				godownaddress.sendKeys("Nalasophara WEST");
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
		    	  pcsearchbar.sendKeys("Nalasophara WEST");
		    	  
		    	  Thread.sleep(500);
		    	  }


	}

