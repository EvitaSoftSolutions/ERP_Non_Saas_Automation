package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCommercialPartyForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Add Commercial Party']")private WebElement addcommparty;
	@FindBy (xpath="//input[@id='txtConsumerNumber']") private WebElement cpconsumernum;
	@FindBy (xpath="//input[@id='txtBusinessName']") private WebElement cpbusinessname;
	@FindBy (xpath="//select[@id='ddlBussinesType']") private WebElement cpselectbussinesstype;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement cpselectgroup;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement cpaddress1;
	@FindBy (xpath="//select[@id='ddlstate']") private WebElement cpselectstate;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement cpactivechk;
	@FindBy (xpath="//input[@id='txtProduct']") private WebElement cpproduct;
	@FindBy (xpath="//input[@id='txtMDLNoOfCyl']") private WebElement cpquantity;
	@FindBy (xpath="//input[@id='txtMDLOpningCyl']") private WebElement cpopeningcycle;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cpsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement cpmsgsucess;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement cpclearbtn;
	@FindBy (xpath="//button[@id='btnDelete']") private WebElement cpdeletebtn;
	@FindBy (xpath="//button[@id='btnGet']") private WebElement cplistbtn;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement cpeditbtn;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement cpyesupdateitbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cpupdatebtn;
	@FindBy (xpath="//a[text()='Commercial Party']") private WebElement cpupdateokbtn;
	@FindBy (xpath="//a[text()='Commercial Party']") private WebElement  cpexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 
	
	
			public AddCommercialPartyForm(WebDriver driver) {
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
			public void verifyMyerpAddCommparty() {
				Assert.assertTrue(addcommparty.isEnabled(),"AddCommparty is enable");
				Reporter.log("verifyMyerpaddcommparty",true);
				addcommparty.click();
			}
			public void VerifyMyerpConsumerNumber1() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
				 Reporter.log("verifyMyerpcpconsumernum", true);
				 cpconsumernum.click(); 
				 cpconsumernum.sendKeys("4028");
				}
				
			public void VerifyMyerpCPBusinessname1() throws InterruptedException {
				Thread.sleep(0);
				 Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
				 Reporter.log("verifyMyerpcpbusinessname", true);
				 cpbusinessname.click(); 
				 cpbusinessname.sendKeys("TELKO");
				}
				
			public void VerifyMyerpCPSelectBusinessType1() throws InterruptedException {
				 Select cpbt = new Select(cpselectbussinesstype);
					Thread.sleep(1000);
					Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
					Assert.assertFalse(cpselectbussinesstype.isSelected());
					cpbt.selectByVisibleText("Hospitals");
			}
			
			public void VerifyMyerpCPSelectGroup1() throws InterruptedException {
					Select spg = new Select(cpselectgroup);
					Thread.sleep(1000);
					Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
					Assert.assertFalse(cpselectgroup.isSelected());
					spg.selectByVisibleText("SUNDRY DEBTORS");
				}
			public void VerifyMyerpCPAddress11() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
				 Reporter.log("verifyMyerpcpaddress1", true);
				 cpaddress1.click(); 
				 cpaddress1.sendKeys("PUNE");
				}
			public void VerifyMyerpCPSelectState1() throws InterruptedException {
				Select spss = new Select(cpselectstate);
				Thread.sleep(1000);
				Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
				Assert.assertFalse(cpselectstate.isSelected());
				spss.selectByVisibleText("ASSAM");
			}
			public void VerifyMyerpCPActivechk1() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
				 Reporter.log("verifyMyerpcpactivechk", true);
				 cpactivechk.click();
				}
			public void VerifyMyerpCPProduct1() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
				 Reporter.log("verifyMyerpcpproduct", true);
				 cpproduct.click(); 
				 cpproduct.sendKeys("19 KG COM");
				}
			public void VerifyMyerpCPPQantity1() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
				 Reporter.log("verifyMyerpcpquantity", true);
				 cpquantity.click(); 
				 cpquantity.sendKeys("12");
				}
			public void VerifyMyerpCPPOpeningCycle1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
				 Reporter.log("verifyMyerpcpopeningcycle", true);
				 cpopeningcycle.click(); 
				 cpopeningcycle.sendKeys("1");
			}
			public void VerifyMyerpCPClearBtn1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpclearbtn.isEnabled(),"cpclearbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpclearbtn", true);
				 cpclearbtn.click();
				Thread.sleep(500);
				}
			public void VerifyMyerpConsumerNumber() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
				 Reporter.log("verifyMyerpcpconsumernum", true);
				 cpconsumernum.click();
				 cpconsumernum.sendKeys("4027");
				}
				
			public void VerifyMyerpCPBusinessname() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
				 Reporter.log("verifyMyerpcpbusinessname", true);
				 cpbusinessname.click(); 
				 cpbusinessname.sendKeys("Telko");
				}
				
			public void VerifyMyerpCPSelectBusinessType() throws InterruptedException {
				 Select cpbt = new Select(cpselectbussinesstype);
					Thread.sleep(1000);
					Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
					Assert.assertFalse(cpselectbussinesstype.isSelected());
					cpbt.selectByVisibleText("Hospitals");
			}
			
			public void VerifyMyerpCPSelectGroup() throws InterruptedException {
					Select spg = new Select(cpselectgroup);
					Thread.sleep(1000);
					Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
					Assert.assertFalse(cpselectgroup.isSelected());
					spg.selectByVisibleText("SUNDRY DEBTORS");
				}
			public void VerifyMyerpCPAddress1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
				 Reporter.log("verifyMyerpcpaddress1", true);
				 cpaddress1.click(); 
				 cpaddress1.sendKeys("PUNE");
				}
			public void VerifyMyerpCPSelectState() throws InterruptedException {
				Select spss = new Select(cpselectstate);
				Thread.sleep(1000);
				Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
				Assert.assertFalse(cpselectstate.isSelected());
				spss.selectByVisibleText("ASSAM");
			}
			
			public void VerifyMyerpCPActivechk() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
				 Reporter.log("verifyMyerpcpactivechk", true);
				 cpactivechk.click();
				}
			public void VerifyMyerpCPProduct() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
				 Reporter.log("verifyMyerpcpproduct", true);
				 cpproduct.click(); 
				 cpproduct.sendKeys("19 KG COM");
				}
			public void VerifyMyerpCPPQantity() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
				 Reporter.log("verifyMyerpcpquantity", true);
				 cpquantity.click(); 
				 cpquantity.sendKeys("12");
				}
			public void VerifyMyerpCPPOpeningCycle() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
				 Reporter.log("verifyMyerpcpopeningcycle", true);
				 cpopeningcycle.click(); 
				 cpopeningcycle.sendKeys("1");
				}
			public void VerifyMyerpCPDeleteBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpdeletebtn.isEnabled(),"cpdeletebtn field is enabled");		 
				 Reporter.log("verifyMyerpcpdeletebtn", true);
				 cpdeletebtn.click();
				 cpdeletebtn.click();
				}
			public void VerifyandClickonPSearchbar1() throws InterruptedException {
		  	  Thread.sleep(500);
		  	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		  	  Reporter.log(" verifyMyerp pcsearchbar", true);
		  	  pcsearchbar.click(); 
		  	  pcsearchbar.clear();
		  	  pcsearchbar.sendKeys("Telko");
		  	  
		  	  Thread.sleep(500);
		  	  }
			public void VerifyMyerpConsumerNumber2() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
				 Reporter.log("verifyMyerpcpconsumernum", true);
				 cpconsumernum.click(); 
				 cpconsumernum.sendKeys("4028");
				}
				
			public void VerifyMyerpCPBusinessname2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
				 Reporter.log("verifyMyerpcpbusinessname", true);
				 cpbusinessname.click(); 
				 cpbusinessname.sendKeys("SHREYA Restaurant");
				}
				
			public void VerifyMyerpCPSelectBusinessType2() throws InterruptedException {
				 Select cpbt = new Select(cpselectbussinesstype);
					Thread.sleep(1000);
					Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
					Assert.assertFalse(cpselectbussinesstype.isSelected());
					cpbt.selectByVisibleText("Hospitals");
			}
			
			public void VerifyMyerpCPSelectGroup2() throws InterruptedException {
					Select spg = new Select(cpselectgroup);
					Thread.sleep(1000);
					Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
					Assert.assertFalse(cpselectgroup.isSelected());
					spg.selectByVisibleText("SUNDRY DEBTORS");
				}
			public void VerifyMyerpCPAddress12() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
				 Reporter.log("verifyMyerpcpaddress1", true);
				 cpaddress1.click(); 
				 cpaddress1.sendKeys("PUNE");
				}
			public void VerifyMyerpCPSelectState2() throws InterruptedException {
				Select spss = new Select(cpselectstate);
				Thread.sleep(1000);
				Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
				Assert.assertFalse(cpselectstate.isSelected());
				spss.selectByVisibleText("ASSAM");
			}
			public void VerifyMyerpCPActivechk2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
				 Reporter.log("verifyMyerpcpactivechk", true);
				 cpactivechk.click();
				}
			public void VerifyMyerpCPProduct2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
				 Reporter.log("verifyMyerpcpproduct", true);
				 cpproduct.click(); 
				 cpproduct.sendKeys("19 KG COM");
				}
			public void VerifyMyerpCPPQantity2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
				 Reporter.log("verifyMyerpcpquantity", true);
				 cpquantity.click(); 
				 cpquantity.sendKeys("12");
				}
			public void VerifyMyerpCPPOpeningCycle2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
				 Reporter.log("verifyMyerpcpopeningcycle", true);
				 cpopeningcycle.click(); 
				 cpopeningcycle.sendKeys("1");
				}
			public void VerifyMyerpCPSubmitBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpsubmitbtn", true);
				 cpsubmitbtn.click(); 
				}
			public void VerifyMyerpCPGetListBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cplistbtn.isEnabled(),"cplistbtn field is enabled");		 
				 Reporter.log("verifyMyerpcplistbtn", true);
				 cplistbtn.click(); 
				}
			public void VerifyandClickonPSearchbar2() throws InterruptedException {
		  	  Thread.sleep(500);
		  	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		  	  Reporter.log(" verifyMyerp pcsearchbar", true);
		  	  pcsearchbar.click(); 
		  	  pcsearchbar.clear();
		  	  pcsearchbar.sendKeys("SHREYA Restaurant");
		  	  
		  	  Thread.sleep(500);
		  	  }
			public void VerifyMyerpCPEditBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpeditbtn.isEnabled(),"cpeditbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpeditbtn", true);
				 Assert.assertFalse(cpeditbtn.isSelected());
				 cpeditbtn.click(); 
			}
			public void VerifyMyerpCPYesUpdateBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpyesupdateitbtn.isEnabled(),"cpyesupdateitbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpyesupdateitbtn", true);
				 Assert.assertFalse(cpyesupdateitbtn.isSelected());
				 cpyesupdateitbtn.click(); 
			}
			
			
			
			public void VerifyMyerpCPUpdateBtn() throws InterruptedException {
				Thread.sleep(1000);
				 Assert.assertTrue(cpupdatebtn.isEnabled(),"tupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerptupdatebtn", true);
				 Assert.assertFalse(cpupdatebtn.isSelected());
				 cpupdatebtn.click(); 
			}
			public void VerifyMyerpCPUpdateokBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpupdateokbtn.isEnabled(),"cpupdateokbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpupdateokbtn", true);
				 Assert.assertFalse(cpupdateokbtn.isSelected());
				 cpupdateokbtn.click(); 
			}
			public void VerifyMyerpTExportBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(cpexportbtn.isEnabled(),"cpexportbtn field is enabled");		 
				 Reporter.log("verifyMyerpcpexportbtn", true);
				 Assert.assertFalse(cpexportbtn.isSelected());
				 cpexportbtn.click();
			}
			public void VerifyandClickonPSearchbar3() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("SHREYA INDUSTRY");
		    	  
		    	  
			
			
		}
}