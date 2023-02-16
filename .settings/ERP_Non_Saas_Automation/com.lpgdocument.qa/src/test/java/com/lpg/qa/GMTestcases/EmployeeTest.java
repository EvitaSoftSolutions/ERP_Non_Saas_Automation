package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Employee;


	public class EmployeeTest  extends LpgTestBase{

			WebDriver driver;
			   
			@BeforeClass
			public void setup() {
				driver=intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}
			
				
				
				@Test
				public void EmployeePageTest() throws InterruptedException {
					Employee e=new Employee(LpgTestBase.driver); 
					/*
					 * e.verifyMyerpagancycode(); e.verifyMyerpUserid(); e.verifyMyerpPassword();
					 * e.VerifyandClickonMyerpLoginBtn();
					 */
					e.setup(driver);
					e.VerifyMyerpMasterModule();
					e.VerifyMyerpGenralMasterModule();
					e.VerifyMyerpEmployeeForm();
					e.VerifyMyerpEmployeeFirstName();
					e.VerifyMyerpEmployeeLastName();
					e.ESelectCompany();
					e.setEmpPageGender("female");
					e.ESelectDesignation();
					e.VerifyMyerpEmployeeActiveCHK();
					e.VerifyMyerpEmployeeClearBtn();
					e.VerifyMyerpEmployeeClearBtn();
					e.VerifyMyerpEmployeeFirstName1();
					e.VerifyMyerpEmployeeLastName1();
					e.ESelectCompany1();
					e.setEmpPageGender1("male");
					e.ESelectDesignation1();
					e.VerifyMyerpEmployeeActiveCHK1();
					e.VerifyMyerpEmployeeSubmitBtn();
					e.VerifyMyerpEmployeeSubmitOKBtn();
					e.VerifyandClickonPSearchbar1();
					e.VerifyMyerpEmployeeEditBtn();
					e.VerifyMyerpEmployeeYesUpdateItBtn();
					e.VerifyMyerpEmployeeFirstName2();
					e.VerifyMyerpEmployeeLastName2();
					e.ESelectDesignation2();
					e.VerifyMyerpEmployeeUpdateBtn();
					e.VerifyMyerpEmployeeUpdateOKBtn();
					e.VerifyandClickonPSearchbar2();
					e.VerifyMyerpEmployeeExportBtn();
					
					
					
					
				   } 
			}





