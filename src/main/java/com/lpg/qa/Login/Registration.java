package com.lpg.qa.Login;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	public class Registration {
					
					
				@FindBy (xpath="//input[@id='txtownerfirstname']") private WebElement fname;
				@FindBy (xpath="//input[@id='txtownerlasttname']") private WebElement lname;
				@FindBy (xpath="//input[@id='txtownercontactno']") private WebElement ownercontanctnum;
				@FindBy (xpath="//input[@id='txtowneremail']") private WebElement owneremail;
				@FindBy (xpath="//input[@id='txtdistributorcode']") private WebElement distributercode; 
				@FindBy (xpath="//input[@id='txtdistributorname']") private WebElement dname;
				@FindBy (xpath="//input[@id='txtdistributoraddress1']") private WebElement daddress1;
				@FindBy (xpath="//input[@id='txtdistributoraddress2']") private WebElement daddress2;
				@FindBy (xpath="//select[@id='ddlstate']") private WebElement selectstate;
				@FindBy (xpath="//select[@id='ddldistrict']") private WebElement selectdistinct;
				@FindBy (xpath="//select[@id='ddlTahsil']") private WebElement selecttehshil;
				@FindBy (xpath="//input[@id='txtcity']") private WebElement city;
				@FindBy (xpath="//input[@id='txtSalesArea']") private WebElement salearea;
				@FindBy (xpath="//input[@id='txtpincode']") private WebElement pincode;
				@FindBy (xpath="//input[@id='txtcontactdetail1']") private WebElement contanctdet1;
				@FindBy (xpath="//input[@id='txtcontactdetail2']") private WebElement contanctdet2;
				@FindBy (xpath="//input[@id='txtdistributormail']") private WebElement emailid;
				@FindBy (xpath="//select[@id='ddldistributorof']") private WebElement selectdistrributer;
				@FindBy (xpath="//select[@id='ddlterittory']") private WebElement selectterritory;
				@FindBy (xpath="//select[@id='ddldistributortype']") private WebElement selectdtype;
				@FindBy (xpath="//input[@id='txttransportorcode']") private WebElement transportercode;
				@FindBy (xpath="//input[@id='txtPANnumber']") private WebElement pannumber;
				@FindBy (xpath="//input[@id='txtGSTINnumer']") private WebElement gstinnumber;
				@FindBy (xpath="//input[@id='txtuserid']") private WebElement userid;
				@FindBy (xpath="//input[@id='txtpswd']") private WebElement password;
				@FindBy (xpath="//input[@id='txtrepswd']") private WebElement reconfirmpassword;
				@FindBy (xpath="//*[@id=\"maindv\"]/section/div/section/div/div[7]/div[4]/a") private WebElement textalreadyacc;
				@FindBy (xpath="//button[@id='btnclear']") private WebElement clearbtn;
				@FindBy (xpath="//button[@id='btnsubmit']") private WebElement registerbtn;
				@FindBy (xpath="/html/body") private WebElement body;
				
				
				
				// initialization
				public WebDriver driver;
				public Registration(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				public void VerifyandClickonMyerpRegistrationFname() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(fname.isEnabled(),"fname is enabled");
					 Reporter.log(" verifyMyerpfname",true);
					 fname.sendKeys("swapna ");
				}
				public void VerifyandClickonMyerpRegistrationLname() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(lname.isEnabled(),"lname is enabled");
					 Reporter.log(" verifyMyerplname",true);
					 lname.sendKeys("patil");
				}
				
				public void VerifyandClickonMyerpOwnerContanctnum() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(ownercontanctnum.isEnabled(),"ownercontanctnum is enabled");
					 Reporter.log(" verifyMyerpownercontanctnum",true);
					 ownercontanctnum.sendKeys("9028340461");
				}
				
				public void VerifyandClickonMyerpOwnerEmail() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(owneremail.isEnabled(),"owneremail is enabled");
					 Reporter.log(" verifyMyerpfowneremail",true);
					 owneremail.sendKeys("motemaya1230@gmail.com");
				}
				
				public void VerifyandClickonMyerpDistributercode() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(distributercode.isEnabled(),"distributercode is enabled");
					 Reporter.log(" verifyMyerpdistributercode",true);
					 distributercode.sendKeys("656789");
				}
				
				public void VerifyandClickonMyerpRegistrationDname() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(fname.isEnabled(),"dname is enabled");
					 Reporter.log(" verifyMyerpdname",true);
					 dname.sendKeys("yogesh");
				}
				
				public void VerifyandClickonMyerpDAddress1() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(daddress1.isEnabled(),"daddress1 is enabled");
					 Reporter.log(" verifyMyerpv",true);
					 daddress1.sendKeys("Mumbai");
				}
				
				public void VerifyandClickonMyerpDAAdress2() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(daddress2.isEnabled(),"daddress2 is enabled");
					 Reporter.log(" verifyMyerpdaddress2",true);
					 daddress2.sendKeys("Mumbai,Virar");
				}
				
				public void VerifyandClickonMyerpselectstate() throws InterruptedException {
						Select st = new Select(selectstate);
						Thread.sleep(1000);
						Assert.assertTrue(selectstate.isDisplayed(),"selectstate is displayed");
						Assert.assertFalse(selectstate.isSelected());
						st.selectByVisibleText("MAHARASHTRA");
				}
			public void VerifyandClickonMyerpselectdistinct() throws InterruptedException {
					Select st = new Select(selectdistinct );
					Thread.sleep(1000);
					Assert.assertTrue(selectdistinct .isDisplayed(),"selectdistinct  is displayed");
					Assert.assertFalse(selectdistinct .isSelected());
					st.selectByVisibleText("Mumbai");
				
			}
				
				public void VerifyandClickonMyerpSelectTehshil() throws InterruptedException {
					 Select st = new Select(selecttehshil );
						Thread.sleep(1000);
						Assert.assertTrue(selecttehshil .isDisplayed(),"selecttehshil  is displayed");
						Assert.assertFalse(selecttehshil .isSelected());
						st.selectByVisibleText("Mumbai");
					
				}
				public void VerifyandClickonMyerDCity() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(city.isEnabled(),"city is enabled");
					 Reporter.log(" verifyMyerpcity",true);
					 city.sendKeys("Mumbai,Virar");
				}
				public void VerifyandClickonMyerDSaleArea() {
					 Assert.assertTrue(salearea.isEnabled(),"salearea is enabled");
					 Reporter.log(" verifyMyerpsalearea",true);
					 salearea.sendKeys("Mumbai,Virar");
				}
				
				public void VerifyandClickonMyerpDpincode() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(pincode.isEnabled(),"pincode is enabled");
					 Reporter.log(" verifyMyerppincode",true);
					 pincode.sendKeys("500278");
				}
				public void VerifyandClickonMyerpDcontanctdet1() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(contanctdet1.isEnabled(),"contanctdet1 is enabled");
					 Reporter.log(" verifyMyerpcontanctdet1",true);
					 contanctdet1.sendKeys("9881630461");
				}
				public void VerifyandClickonMyerpDcontanctdet2() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(contanctdet2.isEnabled(),"contanctdet2 is enabled");
					 Reporter.log(" verifyMyerpcontanctdet2e",true);
					 contanctdet2.sendKeys("8600246460");
				}
				
				public void VerifyandClickonMyerpDEmailID() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(emailid.isEnabled(),"emailid is enabled");
					 Reporter.log(" verifyMyerpemailid",true);
					 emailid.sendKeys("motemaya1230@gmail.com");
				}
				
				public void VerifyandClickonMyerpSelectDistributer() throws InterruptedException {
					 Select st = new Select(selectdistrributer );
						Thread.sleep(1000);
						Assert.assertTrue(selectdistrributer .isDisplayed(),"selectdistrributer  is displayed");
						Assert.assertFalse(selectdistrributer .isSelected());
						st.selectByVisibleText("BPCL");
					
				}
				public void VerifyandClickonMyerpSelectTerritory() throws InterruptedException {
					 Select st = new Select(selectterritory );
						Thread.sleep(1000);
						Assert.assertTrue(selectterritory .isDisplayed(),"selectterritory  is displayed");
						Assert.assertFalse(selectterritory .isSelected());
						st.selectByVisibleText("MUMBAI LPG TERRITORY");
					
				}
				public void VerifyandClickonMyerpSelectDType() throws InterruptedException {
					 Select st = new Select(selectdtype );
						Thread.sleep(1000);
						Assert.assertTrue(selectdtype .isDisplayed(),"selectdtype  is displayed");
						Assert.assertFalse(selectdtype .isSelected());
						st.selectByVisibleText("Both");
					
				}
				public void VerifyandClickonMyerptransportercode() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(transportercode.isEnabled(),"transportercode is enabled");
					 Reporter.log(" verifyMyerptransportercode",true);
					 transportercode.sendKeys("600037");
				}
				public void VerifyandClickonMyerpDPanNumber() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(pannumber.isEnabled(),"pannumber is enabled");
					 Reporter.log(" verifyMyerppannumber",true);
					 pannumber.sendKeys("ACSPT8705B");
				}
				public void VerifyandClickonMyerpDGSTINnumbe() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(gstinnumber.isEnabled(),"gstinnumber is enabled");
					 Reporter.log(" verifyMyerpgstinnumber",true);
					 gstinnumber.sendKeys("27 ACSPT8705B1Z8");
				}
				public void VerifyandClickonMyerpDUserid() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(userid.isEnabled(),"userid is enabled");
					 Reporter.log(" verifyMyerpuserid",true);
					 userid.sendKeys("word");
				}
				public void VerifyandClickonMyerpDPassword() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(password.isEnabled(),"password is enabled");
					 Reporter.log(" verifyMyerppassword",true);
					 password.click();
					 password.sendKeys("word@123");
					 
				}
				public void VerifyandClickonMyerpDReconfirmPassword() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(reconfirmpassword.isEnabled(),"reconfirmpassword is enabled");
					 Reporter.log(" verifyMyerpreconfirmpassword",true);
					 reconfirmpassword.sendKeys("word@123");
				}
				public void VerifyandClickonMyerpDtextalreadyacc() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(textalreadyacc.isEnabled(),"textalreadyacc is enabled");
					 Reporter.log(" verifyMyerptextalreadyacc",true);
					 textalreadyacc.click();
					 driver.navigate().back();
					 
				}
				public void VerifyandClickonMyerpDgstinnumberBtn() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(gstinnumber.isEnabled(),"gstinnumber is enabled");
					 Reporter.log(" verifyMyerpgstinnumber",true);
					 gstinnumber.click();
				}
				public void VerifyandClickonMyerpDClearbtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enabled");
					 Reporter.log(" verifyMyerpclearbtn",true);
					 clearbtn.click();
					 
				
				}
				public void VerifyandClickonMyerpDregisterbtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(registerbtn.isEnabled(),"registerbtn is enabled");
					 Reporter.log(" verifyMyerpregisterbtn",true);
					 registerbtn.click();
					 Thread.sleep(800);
					 Alert al=driver.switchTo().alert();
					 Thread.sleep(500);
					 al.accept();
					 
				
				}
				
	}

		



	

