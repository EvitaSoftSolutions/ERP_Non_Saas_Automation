package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class DomesticDelievery {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[5]/a") private WebElement domesticdeliveryform; 
			@FindBy (xpath="//select[@id='ddlProductID']") private WebElement ddselectproduct; 
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement ddgetdtabtn; 
			@FindBy (xpath="//*[@id=\"tblmain_filter\"]/label/input") private WebElement ddsearchdtabtn;
			@FindBy (xpath="//select[@id='ddlGodown']") private WebElement ddselectgodown; 
			@FindBy (xpath="//input[@id='txtFullcyl']") private WebElement ddfullcyl;
			@FindBy (xpath="//input[@id='txtDel']") private WebElement ddemptycyl;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ddsubmitbtn;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[2]/a") private WebElement dailycomplaintreport;
		    @FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
			@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement selectgodowen;
			@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;
			
			
			// initialization
			 WebDriver driver;
			 public void setup(WebDriver driver) 
			 {
				 this.driver=driver;
			 }
						public DomesticDelievery(WebDriver driver) {
							PageFactory.initElements(driver, this);
						}

							// usage
							public void VerifyandClickonMyerpLoginwithoutBtn1() {
								 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
								 Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
								 Reporter.log(" verifyMyerplogin",true);
								login.click();
							}
							
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
							public void VerifyandClickonMyerpGodownTransactionModule () {
								 Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
								 Reporter.log(" verifyMyerpgtmodule", true);
								 gtmodule.click();
							}
							public void VerifyandClickonMyerpGTDomesticDeliveryForm () { 
								 Assert.assertTrue(domesticdeliveryform.isEnabled(),"domesticdeliveryform is enabled");
								 Reporter.log(" verifyMyerpdomesticdeliveryform", true);
								 domesticdeliveryform.click();

                             }
							public void VerifyMyerpTVSelectProduct()  throws InterruptedException {
								Thread.sleep(2000);
								Select ddsp = new Select(ddselectproduct);
								Thread.sleep(500);
								Assert.assertTrue(ddselectproduct.isDisplayed(),"ddselectproduct is displayed");
								Assert.assertFalse(ddselectproduct.isSelected());
								ddsp.selectByVisibleText("14.2 KG");
							}
							public void VerifyandClickonMyerpGTDDGetDataBtn() throws InterruptedException { 
								Thread.sleep(1000);
								 Assert.assertTrue(ddgetdtabtn.isEnabled(),"ddgetdtabtn is enabled");
								 Reporter.log(" verifyMyerpddgetdtabtn", true);
								 ddgetdtabtn.click();

                            }
							public void VerifyandClickonMyerpGTDDSearchBtn() { 
								 Assert.assertTrue(ddsearchdtabtn.isEnabled(),"ddsearchdtabtn is enabled");
								 Reporter.log(" verifyMyerpddsearchdtabtn", true);
								 ddsearchdtabtn.click();
								 ddsearchdtabtn.sendKeys("RAMESH SACHAN");

                           }
							public void VerifyMyerpTVSelectGodown()  throws InterruptedException {
								Thread.sleep(500);
								Select ddsp = new Select(ddselectgodown);
								Thread.sleep(500);
								Assert.assertTrue(ddselectgodown.isDisplayed(),"ddselectgodown is displayed");
								Assert.assertFalse(ddselectgodown.isSelected());
								ddsp.selectByVisibleText("VIRAR EAST");
							}
							public void VerifyandClickonMyerpGTDDFullCyl() { 
								 Assert.assertTrue(ddfullcyl.isEnabled(),"ddfullcyl is enabled");
								 Reporter.log(" verifyMyerpddfullcyl", true);
								 ddfullcyl.click();
								 ddfullcyl.sendKeys("20");
							}

							 public void VerifyandClickonMyerpGTDDEmptyCyl() {
								 Assert.assertTrue(ddemptycyl.isEnabled(),"ddemptycyl is enabled");
								 Reporter.log(" verifyMyerpddemptycyl", true);
								 ddemptycyl.click();
								 ddemptycyl.sendKeys("5");
								
						    }
							 public void VerifyandClickonMyerpGTDDESubmitBtn() throws InterruptedException { 
								 
								 Assert.assertTrue(ddsubmitbtn.isEnabled(),"ddsubmitbtn is enabled");
								 Reporter.log(" verifyMyerpddsubmitbtn", true);
								 ddsubmitbtn.click();
								 Thread.sleep(3000);
								 if (isAlertPresent(driver)) { System.out.println("alert is present");
								  
								  }else { System.out.println("alert is not present"); }
								  
								  } 
							public static boolean isAlertPresent(WebDriver driver) throws
							InterruptedException { 
								try {
									Thread.sleep(2000);
									Alert al=driver.switchTo().alert();
									Thread.sleep(2000); 
									 al.accept(); 
								return true; }
								catch (UnhandledAlertException u)
								{ // TODO Auto-generated catch block
									u.printStackTrace(); } return false;

								}
							
							public void VerifyMyerpTVSelectProduct1()  throws InterruptedException {
								Thread.sleep(2000);
								Select ddsp = new Select(ddselectproduct);
								Thread.sleep(500);
								Assert.assertTrue(ddselectproduct.isDisplayed(),"ddselectproduct is displayed");
								Assert.assertFalse(ddselectproduct.isSelected());
								ddsp.selectByVisibleText("14.2 KG");
							}
							public void VerifyandClickonMyerpGTDDGetDataBtn1() throws InterruptedException { 
								Thread.sleep(1000);
								 Assert.assertTrue(ddgetdtabtn.isEnabled(),"ddgetdtabtn is enabled");
								 Reporter.log(" verifyMyerpddgetdtabtn", true);
								 ddgetdtabtn.click();

                            }
							public void VerifyandClickonMyerpGTDDSearchBtn1() { 
								 Assert.assertTrue(ddsearchdtabtn.isEnabled(),"ddsearchdtabtn is enabled");
								 Reporter.log(" verifyMyerpddsearchdtabtn", true);
								 ddsearchdtabtn.click();
								 ddsearchdtabtn.sendKeys("RAMESH SACHAN");

                           }
							public void VerifyMyerpTVSelectGodown1()  throws InterruptedException {
								Thread.sleep(2000);
								Select ddsp = new Select(ddselectgodown);
								Thread.sleep(500);
								Assert.assertTrue(ddselectgodown.isDisplayed(),"ddselectgodown is displayed");
								Assert.assertFalse(ddselectgodown.isSelected());
								ddsp.selectByVisibleText("VIRAR EAST");
							}
							public void VerifyandClickonMyerpGTDDFullCyl1() { 
								 Assert.assertTrue(ddfullcyl.isEnabled(),"ddfullcyl is enabled");
								 Reporter.log(" verifyMyerpddfullcyl", true);
								 ddfullcyl.click();
								 ddfullcyl.clear();
								 ddfullcyl.sendKeys("20");
							}

							 public void VerifyandClickonMyerpGTDDEmptyCyl1() {
								 Assert.assertTrue(ddemptycyl.isEnabled(),"ddemptycyl is enabled");
								 Reporter.log(" verifyMyerpddemptycyl", true);
								 ddemptycyl.click();
								 ddemptycyl.clear();
								 ddemptycyl.sendKeys("5");
								
						    }
							 public void VerifyandClickonMyerpGTDDESubmitBtn1() throws InterruptedException { 
								 
								 Assert.assertTrue(ddsubmitbtn.isEnabled(),"ddsubmitbtn is enabled");
								 Reporter.log(" verifyMyerpddsubmitbtn", true);
								 ddsubmitbtn.click();
								 Thread.sleep(3000);
								 if (isAlertPresent3(driver)) { System.out.println("alert is present");
								  
								  }else { System.out.println("alert is not present"); }
								  
								  } 
							public static boolean isAlertPresent3(WebDriver driver) throws
							InterruptedException { 
								try {
									Thread.sleep(2000);
									Alert al=driver.switchTo().alert();
									Thread.sleep(2000); 
									 al.accept(); 
								return true; }
								catch (UnhandledAlertException u)
								{ // TODO Auto-generated catch block
									u.printStackTrace();
									} return false;

								}
							
							
							public void VerifyMyerpGenralReportModule() throws InterruptedException {
								Thread.sleep(1000);
								 Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
								 Reporter.log("verifyMyerpgenralreport", true);
								 genralreport.click(); 
							}

							public void VerifyMyerpDailyComplaintReport() throws InterruptedException {
								Thread.sleep(1000);
								 Assert.assertTrue(dailycomplaintreport.isEnabled(),"dailycomplaintreport field is enabled");		 
								 Reporter.log("verifyMyerpdailycomplaintreport", true);
								 dailycomplaintreport.click(); 
							}

							public void VerifyMyerpSelectDate() {
								 Assert.assertTrue(selectdate.isEnabled(),"selectdate field is enabled");		 
								 Reporter.log("verifyMyerpselectdate", true);
								 selectdate.click(); 
								 selectdate.clear();
								 selectdate.sendKeys("30/03/2023");
							}

							public void verifyMyerpSelectGodown() throws InterruptedException {
								Select su = new Select(selectgodowen);
								Thread.sleep(1000);
								Assert.assertFalse(selectgodowen.isDisplayed(),"selectgodown is displayed");
								Assert.assertFalse(selectgodowen.isSelected());
								su.selectByVisibleText("VIRAR EAST");
							
							}
							public void VerifyandClickonMyerpGetDataBtn() throws InterruptedException {
								 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
								 Reporter.log("verifyMyerpgetdatabtn", true);
								 getdatabtn.click();
								 Thread.sleep(1000);
							}
							
					}