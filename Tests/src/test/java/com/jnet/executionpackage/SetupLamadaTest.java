package com.jnet.executionpackage;

/**
 * This the main execution class which extends the Base Class
 * The driver instance initiated in the base class will be assigned to the Browser Actions class,classes
 * present in the Test Scripts package. The execution will start at @BeforeTest then will move
 * on to the @Test block and execute all the test cases that are called upon and finally executes
 * the @AfterTest block.
 *  @createddate 02-10-2020
 *  @authors Revanth Kumar K, Yashwanth K
 */

import com.jnet.globalclasses.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


// This is the Main class from where the execution gets started.

public class SetupLamadaTest extends BaseClass {

	WebDriver driver;
	//Logger log = Logger.getLogger(Setup.class);
	BaseClass baseclass;

	BrowserActions a = new BrowserActions(driver);


	@Parameters({"browser","version","platform"})
	@BeforeTest
	public void StartBrowser(String browser, String version, String platform){
		Log4j.startLog("StartBrowser Class Started");
		baseclass = new BaseClass();
		this.driver = LamadaTestCapabilities(browser, version,  platform);

		a.createLog4jFolderWithDateAndTime();
		a.createExtentHTMLReportFolderWithDateAndTime();
		ExcelClass.createFolder();
		ExcelClass.copyTestCaseDocument();


	}
	
	@Test
	public void StartExecution(){

		Log4j.endLog("Setup Class is");

		
	}

	@AfterTest
	public void finalCalls(){

		a.copyOldLog4jFileToBackupFolder();
		Reports email = new Reports(driver);
		Log4j.info("-----------Sending the Email---------");
		//email.mailGeneration("sateesh.kothapalli@jnettechnologies.com","sateesh.kothapalli@jnettechnologies.com", "Test Results","rkn76yN$2");
		Log4j.endLog("Execution Ended");
		driver.quit();
	}



}
