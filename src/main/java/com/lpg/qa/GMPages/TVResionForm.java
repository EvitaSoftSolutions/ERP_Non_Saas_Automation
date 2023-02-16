package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TVResionForm {
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='TV Reason']")private WebElement tvreason;
	@FindBy(xpath="//input[@id='txtTVReasonName']")private WebElement tvreasionname;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chkactivebtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//input[@id='txtTVReasonName']")private WebElement txttvresionname;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chkactivebtn1;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	//initialization
			public TVResionForm(WebDriver driver) {
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
			public void verifyMyerpPageNavigation2() {
				Assert.assertTrue(pagena2.isEnabled(),"PageNavigation2 is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena2.click();
				
			}
			public void verifyMyerpTvreason() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(tvreason.isEnabled(),"Tvreason is Enable");
				Reporter.log("verifyMyerptvreason",true);
				tvreason.click();
				
			}
			public void verifyMyerpTvReasionName() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(tvreasionname.isEnabled(),"TvReasionName is Enable");
				Reporter.log("verifyMyerptvreasionname",true);
				tvreasionname.sendKeys("for chenge orgnization");
				
			}
			public void verifyMyerpChkactivebtn() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(chkactivebtn.isEnabled(),"Chkactivebtn is Enable");
				Reporter.log("verifyMyerpchkactivebtn",true);
				chkactivebtn.click();
				
			}
			public void verifyMyerpClearbtn() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is Enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
				
			}
			public void verifyMyerpTvreasionname() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(tvreasionname.isEnabled(),"Tvreasionname is Enable");
				Reporter.log("verifyMyerptvreasionname",true);
				tvreasionname.sendKeys("for chenge orgnization");
				
			}
			public void verifyMyerpChkActivebtn() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(chkactivebtn.isEnabled(),"ChkActivebtn is Enable");
				Reporter.log("verifyMyerpchkactivebtn",true);
				chkactivebtn.click();
				
			}
			public void verifyMyerpSubmitbtn() throws InterruptedException {
		    	  Thread.sleep(500);
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
		    	  pcsearchbar.sendKeys("for chenge orgnization");
		    	  
		    	  Thread.sleep(500);
		    	  }

			public void verifyMyerpEditbtn() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(editbtn.isEnabled(),"Editbtn is Enable");
				Reporter.log("verifyMyerpeditbtn",true);
				editbtn.click();
			}
			public void verifyMyerpConfirmbtn() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbtn is Enable");
				Reporter.log("verifyMyerpconfirmbtn",true);
				confirmbtn.click();
			}
			public void verifyMyerpTxtTvresionname1() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(txttvresionname.isEnabled(),"TxtTvresionname is Enable");
				Reporter.log("verifyMyerptxttvresionname",true);
				txttvresionname.click();
				txttvresionname.clear();
				txttvresionname.sendKeys("for chenge job Reason");
			}
			public void verifyMyerpChkactivebtn1() throws InterruptedException {
		    	  Thread.sleep(500);
				Assert.assertTrue(chkactivebtn1.isEnabled(),"Chkactivebtn1 is Enable");
				Reporter.log("verifyMyerpchkactivebtn1",true);
				chkactivebtn1.click();
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
		    	  pcsearchbar.sendKeys("for chenge job Reason");
		    	  
		    	  Thread.sleep(500);
		    	  }

			

}
