package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCommercialDiscountPackageForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Add Commercial Discount Package']")private WebElement addcomdispack;
	@FindBy(xpath="//input[@id='txtDiscountPackageName']")private WebElement dispackname;
	@FindBy(xpath="//input[@id='txtDiscription']")private WebElement discription;
	@FindBy(xpath="//input[@id='txtDiscountAmt']")private WebElement discountamt;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement cdpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement cdpbtnexport;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	


	//initialization
		public AddCommercialDiscountPackageForm(WebDriver driver) {
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
		public void verifyMyerpMaster() {
			Assert.assertTrue(master.isEnabled(),"Master is enable");
			Reporter.log("verifyMyerpmaster",true);
			master.click();
		}
		public void verifyMyerpAccountMaster() {
			Assert.assertTrue(accountmaster.isEnabled(),"AccountMaster is enable");
			Reporter.log("verifyMyerpaccountmaster",true);
			accountmaster.click();
		}
		public void verifyMyerpAddComDispack() {
			Assert.assertTrue(addcomdispack.isEnabled(),"AddComDispack is enable");
			Reporter.log("verifyMyerpaddcomdispack",true);
			addcomdispack.click();
		}
		public void verifyMyerpDispackname() {
			Assert.assertTrue(dispackname.isEnabled(),"Dispackname is enable");
			Reporter.log("verifyMyerpdispackname",true);
			dispackname.sendKeys("SANKRANTI BONUS");
		}
		public void verifyMyerpDiscription() {
			Assert.assertTrue(discription.isEnabled(),"Discription is enable");
			Reporter.log("verifyMyerpdiscription",true);
			discription.sendKeys("SANKRANTI BONUS");
		}
		public void verifyMyerpDiscountamt() {
			Assert.assertTrue(discountamt.isEnabled(),"Discountamt is enable");
			Reporter.log("verifyMyerpdiscountamt",true);
			discountamt.sendKeys("100");
		}
		public void verifyMyerpClearbtn() {
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		public void verifyMyerpDispackname1() {
			Assert.assertTrue(dispackname.isEnabled(),"Dispackname is enable");
			Reporter.log("verifyMyerpdispackname",true);
			dispackname.sendKeys("SANKRANTI BONUS");
		}
		public void verifyMyerpDiscription1() {
			Assert.assertTrue(discription.isEnabled(),"Discription is enable");
			Reporter.log("verifyMyerpdiscription",true);
			discription.sendKeys("SANKRANTI BONUS");
		}
		public void verifyMyerpDiscountamt1() {
			Assert.assertTrue(discountamt.isEnabled(),"Discountamt is enable");
			Reporter.log("verifyMyerpdiscountamt",true);
			discountamt.sendKeys("100");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
		public void verifyMyerpOkbutton() {
			Assert.assertTrue(okbtn.isEnabled(),"Okbutton is enable");
			Reporter.log("verifyMyerpokbtn",true);
			okbtn.click();
		}
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("SANKRANTI BONUS");
	    	  
	    	  Thread.sleep(500);
	    	  }
		public void verifyMyerpEditbtn() {
			Assert.assertTrue(editbtn.isEnabled(),"Editbtn is enable");
			Reporter.log("verifyMyerpeditbtn",true);
			editbtn.click();
		}
		public void verifyMyerpConfirmbtn() {
			Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbtn is enable");
			Reporter.log("verifyMyerpconfirmbtn",true);
			confirmbtn.click();
		}
		public void verifyMyerpDispackname2() {
			Assert.assertTrue(dispackname.isEnabled(),"Dispackname is enable");
			Reporter.log("verifyMyerpdispackname",true);
			dispackname.clear();
			dispackname.sendKeys("SANK OFFER");
		}
		public void verifyMyerpDiscription2() {
			Assert.assertTrue(discription.isEnabled(),"Discription is enable");
			Reporter.log("verifyMyerpdiscription",true);
			discription.clear();
			discription.sendKeys("SANK OFFER");
		}
		public void verifyMyerpUpdatebtn() {
			Assert.assertTrue(updatebtn.isEnabled(),"Updatebtn is enable");
			Reporter.log("verifyMyerpupdatebtn",true);
			updatebtn.click();
		}
		
		public void VerifyCDPUpdateOKBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(cdpupdateokbtn.isEnabled(),"cdpupdateokbtnis enabled");
	        Reporter.log(" verifyMyerpcdpupdateokbtn", true);
	        	cdpupdateokbtn.click();
        }
		public void VerifyExportBtn() throws InterruptedException {
			Thread.sleep(1000);
	        Assert.assertTrue(cdpbtnexport.isEnabled(),"cdpbtnexport is enabled");
	        Reporter.log(" verifyMyerpcdpbtnexport", true);
	        cdpbtnexport.click();
        }
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("SANK OFFER");
	    	  
	    	  Thread.sleep(500);
	    	  }
		
	}
		


