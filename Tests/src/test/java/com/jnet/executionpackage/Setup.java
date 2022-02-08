package com.jnet.executionpackage;

/*
 * This the main execution class which extends the Base Class
 * The driver instance initiated in the base class will be assigned to the Browser Actions class,classes
 * present in the Test Scripts package. The execution will start at @BeforeSuite then will move
 * on to the @Test block and execute all the test cases that are called upon and finally executes
 * the @AfterSuite block.
 *
 * @createddate 02-10-2020
 * @authors Revanth Kumar K, Yashwanth K
 */


import java.util.concurrent.TimeUnit;

import com.jnet.Appconsole.Configuration.BasicSettings.*;

import com.jnet.Appconsole.Configuration.ProductMenu.AddCategoryList;
import com.jnet.Appconsole.Configuration.ProductMenu.newtest;
import com.jnet.CustomerPortal.Customer_PlaceOrder;
import com.jnet.CustomerPortal.GuestUser_PlaceOrder;

import com.jnet.globalclasses.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

// This is the Main class from where the execution gets started.

public class Setup extends BaseClass {

    WebDriver driver;
    BaseClass baseclass;


    GuestUser_PlaceOrder guestUser_placeOrder;
    Customer_PlaceOrder customer_placeOrder;

    General_Settings general_settings;
    Opening_Timings opening_timings;
    Contact_Information contact_information;
    Preparation_Timings preparation_timings;
    Functionality_Rules functionality_rules;
    AddCategoryList addCategoryList;
    newtest newtest;

    BrowserActions browserActions;


    @Parameters({"browser"})
    @BeforeSuite
    public void startBrowser(String browser) {
        Log4j.startLog("Execution Started");
        baseclass = new BaseClass();
        this.driver = launchBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        guestUser_placeOrder = new GuestUser_PlaceOrder(driver);
        customer_placeOrder = new Customer_PlaceOrder(driver);

        general_settings = new General_Settings(driver);
        opening_timings = new Opening_Timings(driver);
        contact_information = new Contact_Information(driver);
        preparation_timings = new Preparation_Timings(driver);
        functionality_rules = new Functionality_Rules(driver);
        addCategoryList = new AddCategoryList(driver);
        newtest = new newtest(driver);

        browserActions = new BrowserActions(driver);

        //Below methods will create folders in Test Case Execution Documents and copy the Base test case document in the created folders.
        browserActions.createLog4jFolderWithDateAndTime();

        browserActions.createExtentHTMLReportFolderWithDateAndTime();

        browserActions.copyOldLog4jFileToBackupFolder();
        browserActions.copyOldExtentHTMLReportToBackupFolder();

        ExcelClass.createTestCaseFolders();
        //  ExcelClass.createFolder();
        ExcelClass.copyTestCaseDocument();

    }

    //If you want to run either one of the below methods, add enabled = false content for the remaining methods.
    @Test(enabled = true)
    public void systemTesting() {
//
//        guestUser_placeOrder.GuestUser_PlaceOrder();
//        customer_placeOrder.Customer_PlaceOrder();

//        general_settings.General_Settings();
        opening_timings.Opening_Timings();
//        contact_information.Contact_Information();
//        preparation_timings.Preparation_Timings();
//        functionality_rules.Functionality_Rules();

//        addCategoryList.AddCategoryList();


//newtest.newtest();
    }

    @Test(enabled = false)
    public void regressionTesting() {

    }

    @AfterSuite(enabled = true)
    public void finalCalls() {
        Log4j.info("-----------Backup Log4j file---------");
        browserActions.copyOldLog4jFileToBackupFolder();
        Log4j.info("-----------Backup ExtentHTML Report file---------");
        browserActions.copyOldExtentHTMLReportToBackupFolder();
        Reports email = new Reports(driver);

        browserActions.copyFinalReports();

        ZipFolder.createZipWithFolderInternalElements(System.getProperty("user.dir") + "//FinalReports", System.getProperty("user.dir") + "//RestroZap_Automation_Report.zip");

        Log4j.info("-----------Sending the Email---------");
        //   email.mailGeneration("sateesh.kothapalli@jnettechnologies.com", "sateesh.kothapalli@jnettechnologies.com", "johnson.siddhenki@jnettechnologies.com", "RestroZap_Automation_Report.", "rkn76yN$2");
        Log4j.endLog("Execution ");
        driver.quit();
    }


}
