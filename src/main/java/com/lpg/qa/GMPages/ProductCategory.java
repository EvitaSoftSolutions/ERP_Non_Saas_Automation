package com.lpg.qa.GMPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.Assert;
	import org.testng.Reporter;

	public class ProductCategory {
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster; 
		@FindBy (xpath="//a[text()='Product Category']") private WebElement productcategoryform; 
		@FindBy (xpath="//input[@id='txtProductCatName']") private WebElement productcatname; 
		@FindBy (xpath="//input[@id='txtDescription']") private WebElement productdesc;
		@FindBy (xpath="//input[@id='txtCategory_Code_Short']") private WebElement productcatcode;
		@FindBy (xpath="//select[@id='ddlParent_Category']") private WebElement selectproductpcategory1;
		@FindBy (xpath="//select[@id='ddlParent_Category']") private WebElement selectproductpcategory;
		@FindBy (xpath="//input[@id='chkActive']") private WebElement productactive;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement psubmitbtn;
		@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement psubmitbtnok;
		@FindBy (xpath="//button[@id='btnclear']") private WebElement pclearbtn;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement peditbtn;
		@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement pyesupdateitbtn;
		@FindBy (xpath="//button[text()='Update']") private WebElement pupdatebtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement pupdateokbtn;
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement pexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
		
		
		// initialization
				public ProductCategory(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				// usage
				
				public void verifyMyerpagancycode() {
					 Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
					 Reporter.log("verifyMyerpagancycode", true);
					 agancycode.sendKeys("ERP_00001");
				}
				public void verifyMyerpUserid() {
					 Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
					 Reporter.log("verifyMyerpUserid", true);
					 userid.sendKeys("admin");
				}
				public void verifyMyerpPassword() {
					 Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
					 Reporter.log(" verifyMyerpPassword", true);
					 password.sendKeys("admin@123");
				}
				
				public void VerifyandClickonMyerpLoginBtn() {
					 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
					 Reporter.log(" verifyMyerplogin", true);
					 login.click();
				}
				
				public void VerifyMyerpMasterModule() {
					 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
					 Reporter.log("verifyMyerpMasterModule", true);
					 master.click(); 
				}
				public void VerifyMyerpGenralMasterModule() {
					 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
					 Reporter.log("verifyMyerpGenralMasterModule", true);
					 genralmaster.click(); 
				}
				public void VerifyMyerpProductCategoryForm() {
					 Assert.assertTrue(productcategoryform.isEnabled(),"productcategory form  is enabled");		 
					 Reporter.log("verifyMyerpproductcategoryform", true);
					 productcategoryform.click(); 
				}

				public void VerifyMyerpProductCatName1() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productcatname.isEnabled(),"productcatname  is enabled");		 
					 Reporter.log("verifyMyerpproductcatname", true);
					 productcatname.click(); 
					 productcatname.sendKeys("ROW LPG");
				}
				public void VerifyMyerpProductDesc1() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productdesc.isEnabled(),"productdesc is enabled");		 
					 Reporter.log("verifyMyerpproductdesc", true);
					 productdesc.click();
					 productdesc.sendKeys("ROW LPG");
				}
				public void VerifyMyerpProductShortCode1() throws InterruptedException {
					Thread.sleep(600);
						 Assert.assertTrue(productcatcode.isEnabled(),"productcatcode is enabled");		 
						 Reporter.log("verifyMyerpproductcatcode", true);
						 productcatcode.click(); 
						 productcatcode.sendKeys("FULL");
				}
				public void VerifyMyerpProductParentCategory1() throws InterruptedException {
					
					 Select pc = new Select(selectproductpcategory1);
						Thread.sleep(1000);
						Assert.assertFalse(selectproductpcategory1.isDisplayed(),"selectproductpcategory is displayed");
						Assert.assertFalse(selectproductpcategory1.isSelected());
						pc.selectByVisibleText("BEYOND");
				}
					
				public void VerifyMyerpProductActiveCHK1() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productactive.isEnabled(),"productactive is enabled");		 
					 Reporter.log("verifyMyerpproductactive", true);
					 productactive.click();
				}
				
				public void VerifyMyerpProductClearBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(pclearbtn.isEnabled(),"pclearbtn is enabled");		 
					 Reporter.log("verifyMyerppclearbtn", true);
					 pclearbtn.click();
				}
				
				public void VerifyMyerpProductCatName() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productcatname.isEnabled(),"productcatname  is enabled");		 
					 Reporter.log("verifyMyerpproductcatname", true);
					 productcatname.click(); 
					 productcatname.sendKeys("ROW LPG");
				}
				public void VerifyMyerpProductDesc() {
					 Assert.assertTrue(productdesc.isEnabled(),"productdesc is enabled");		 
					 Reporter.log("verifyMyerpproductdesc", true);
					 productdesc.click();
					 productdesc.sendKeys("ROW LPG");
				}
				public void VerifyMyerpProductShortCode() {
						 Assert.assertTrue(productcatcode.isEnabled(),"productcatcode is enabled");		 
						 Reporter.log("verifyMyerpproductcatcode", true);
						 productcatcode.click(); 
						 productcatcode.sendKeys("FULL");
				}
				public void VerifyMyerpProductParentCategory() throws InterruptedException {
	   				 Select pc = new Select(selectproductpcategory);
						Thread.sleep(1000);
						Assert.assertFalse(selectproductpcategory.isDisplayed(),"selectproductpcategory is  displayed");
						Assert.assertFalse(selectproductpcategory.isSelected());
						pc.selectByVisibleText("OIL COMPANYS");
			   }
				public void VerifyMyerpProductActiveCHK() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productactive.isEnabled(),"productactive is enabled");		 
					 Reporter.log("verifyMyerpproductactive", true);
					 productactive.click();
				}
				public void VerifyMyerpProductSubmitBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn is enabled");		 
					 Reporter.log("verifyMyerppsubmitbtn", true);
					 psubmitbtn.click();
				}
				public void VerifyMyerpProductSubmitOKBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok is enabled");		 
					 Reporter.log("verifyMyerppsubmitbtnok", true);
							 psubmitbtnok.click();
				}
				
				 public void VerifyandClickonPSearchbar1() throws InterruptedException {
			    	  Thread.sleep(800);
			    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
			    	  Reporter.log(" verifyMyerp pcsearchbar", true);
			    	  pcsearchbar.click(); 
			    	  pcsearchbar.clear();
			    	  pcsearchbar.sendKeys("ROW LPG");
			    	  }
				public void VerifyMyerpProductCatEditBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(peditbtn.isEnabled(),"peditbtn is enabled");		 
					 Reporter.log("verifyMyerp peditbtn", true);
					 peditbtn.click();
				}
				public void VerifyMyerpProductCatYesUpdateItBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(pyesupdateitbtn.isEnabled(),"pyesupdateitbtn is enabled");		 
					 Reporter.log("verifyMyerp pyesupdateitbtn", true);
					 pyesupdateitbtn.click();
				}
				public void VerifyMyerpProductShortCode2() throws InterruptedException 
		
				{
					Thread.sleep(600);
					 Assert.assertTrue(productcatcode.isEnabled(),"productcatcode is enabled");		 
					 Reporter.log("verifyMyerpproductcatcode", true);
					 productcatcode.click(); 
					 productcatcode.clear();
					 productcatcode.sendKeys("DOMMM1");
			     }
				public void VerifyMyerpProductDesc2() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(productdesc.isEnabled(),"productdesc is enabled");		 
					 Reporter.log("verifyMyerpproductdesc", true);
					 productdesc.click();
					 productdesc.clear();
					 productdesc.sendKeys("DOMMM");
				}
				public void VerifyMyerpProductCatUpdateBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(pupdatebtn.isEnabled(),"pupdatebtn is enabled");		 
					 Reporter.log("verifyMyerp pupdatebtn", true);
					 pupdatebtn.click();
				}
				public void VerifyMyerpProductCatUpdateOkBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(pupdateokbtn.isEnabled(),"pupdateokbtnis enabled");		 
					 Reporter.log("verifyMyerp pupdateokbtn", true);
					 pupdateokbtn.click();
				}
				public void VerifyMyerpProductCatExportBtn() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(pexportbtn.isEnabled(),"pexportbtn is enabled");		 
					 Reporter.log("verifyMyerp pexportbtn", true);
					 pexportbtn.click();
				}
				public void VerifyandClickonPSearchbar2() throws InterruptedException {
			    	  Thread.sleep(500);
			    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
			    	  Reporter.log(" verifyMyerp pcsearchbar", true);
			    	  pcsearchbar.click(); 
			    	  pcsearchbar.clear();
			    	  pcsearchbar.sendKeys("DOMMM");
			    	  Thread.sleep(500);
			    	  }
				
				
	}
