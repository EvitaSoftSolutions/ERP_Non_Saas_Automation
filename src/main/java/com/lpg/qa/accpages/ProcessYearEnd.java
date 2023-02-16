package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ProcessYearEnd {
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//*[@id=\"tblGeneralMasters_paginate\"]/ul/li[3]/a")private WebElement pagenav;
	@FindBy(xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[3]/td[2]/a")private WebElement processyearendform;
	@FindBy(xpath="//select[@id='ddlYear']")private WebElement selectyear;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement closeyear;
	


//initialization
	public ProcessYearEnd(WebDriver driver) {
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
	public void verifyMyerPageNav() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pagenav.isEnabled(),"pagenav find is enable");
		Reporter.log("verifyMyerpagenav",true);
		pagenav.click();
		
	}
	
	public void verifyMyerpProcessYearEndForm() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(processyearendform.isEnabled(),"processyearendform is enable");
		Reporter.log("verifyMyerpprocessyearendform",true);
		processyearendform.click();
	}
	
	public void verifyMyerpSelecctYear() throws InterruptedException {
		Thread.sleep(500);
		Select sc= new Select(selectyear);
		Assert.assertTrue(selectyear.isEnabled(),"selectyear is enable");
		Assert.assertTrue(selectyear.isDisplayed(),"selectyear is displayed");
		Assert.assertFalse(selectyear.isSelected());
	    sc.selectByVisibleText("2018");
	} 
		
	public void verifyMyerpCloseyear() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(closeyear.isEnabled(),"closeyear is enable");
		Reporter.log("verifyMyerpcloseyear",true);
		closeyear.click();
		
	}
	public void verifyMyerpClearBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	
	
}
