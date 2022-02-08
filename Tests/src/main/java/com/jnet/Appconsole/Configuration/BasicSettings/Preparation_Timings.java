package com.jnet.Appconsole.Configuration.BasicSettings;

import com.jnet.globalclasses.BrowserActions;
import com.jnet.globalclasses.ExcelClass;
import com.jnet.globalclasses.Log4j;
import com.jnet.globalclasses.Reports;

import com.jnet.objectrepository.AppConsole_Locators.BasicSettings;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Preparation_Timings extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public Preparation_Timings(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void Preparation_Timings() {
        Log4j.startLog("Preparation Timings Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));

            // Fetch the test data from "AdminPortalTestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("AdminPortalTestData", "BasicSettings");

            // Waiting for the element to perform action.
            waitforelementtobeclick(BasicSettings.LOGIN, 5000);
            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Preparation_Timings", row, "RestroZap AppConsole application home page is displayed.");

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.USERNAME, "Preparation_Timings", ++row, "Able to enter username.");
            // To enter "Username".
            enterText(BasicSettings.USERNAME, prop.getProperty("Username"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.PASSWORD, "Preparation_Timings", ++row, "Able to enter Password.");
            // To enter "Password".
            enterText(BasicSettings.PASSWORD, prop.getProperty("Password"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Preparation_Timings", ++row, "Able to click on Login button.");
            // To click on "Login" button.
            clickElement(BasicSettings.LOGIN);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.CONFIGURATION_MENU_LINK, "Preparation_Timings", ++row, "Able to click on Configuration menu link.");
            // To click on "Configuration" menu link.
            clickElement(BasicSettings.CONFIGURATION_MENU_LINK);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.BASIC_SETTINGS_MENU_LINK, "Preparation_Timings", ++row, "Able to click on Basic Settings link.");
            // To click on "Basic Settings" menu link.
            clickElement(BasicSettings.BASIC_SETTINGS_MENU_LINK);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.PREPARATION_TIMINGS_LINK, "Preparation_Timings", ++row, "Able to click on Preparation Timings Tab.");
            // To click on "Preparation Timings" Tab.
            clickElement(BasicSettings.PREPARATION_TIMINGS_LINK);


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_GRID, "Preparation_Timings", ++row, "Able to click on Monday Grid.");
            // To click on "Monday Grid" link.
//            clickElement(BasicSettings.MONDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Monday Slab1 name.");
            // To enter "Monday Slab1" name.
            enterText(BasicSettings.MONDAY_SLAB1_NAME, getexceldata.get("MONDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab1-Minimum amount.");
            // To enter "Monday Slab1-Minimum Amount".
            enterText(BasicSettings.MONDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab1-Maximum amount.");
            // To enter "Monday Slab1-Maximum Amount".
            enterText(BasicSettings.MONDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Monday Slab1-Delivery Time.");
            // To enter "Monday Slab1-Delivery Time".
            enterText(BasicSettings.MONDAY_SLAB1_DELIVERY_TIME, getexceldata.get("MONDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Monday Slab2 name.");
            // To enter "Monday Slab2" name.
            enterText(BasicSettings.MONDAY_SLAB2_NAME, getexceldata.get("MONDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab2-Minimum amount.");
            // To enter "Monday Slab2-Minimum Amount".
            enterText(BasicSettings.MONDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab2-Maximum amount.");
            // To enter "Monday Slab2-Maximum Amount".
            enterText(BasicSettings.MONDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Monday Slab2-Delivery Time.");
            // To enter "Monday Slab2-Delivery Time".
            enterText(BasicSettings.MONDAY_SLAB2_DELIVERY_TIME, getexceldata.get("MONDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Monday Slab3 name.");
            // To enter "Monday Slab3" name.
            enterText(BasicSettings.MONDAY_SLAB3_NAME, getexceldata.get("MONDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab3-Minimum amount.");
            // To enter "Monday Slab3-Minimum Amount".
            enterText(BasicSettings.MONDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab3-Maximum amount.");
            // To enter "Monday Slab3-Maximum Amount".
            enterText(BasicSettings.MONDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Monday Slab3-Delivery Time.");
            // To enter "Monday Slab3-Delivery Time".
            enterText(BasicSettings.MONDAY_SLAB3_DELIVERY_TIME, getexceldata.get("MONDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Monday Slab4 name.");
            // To enter "Monday Slab4" name.
            enterText(BasicSettings.MONDAY_SLAB4_NAME, getexceldata.get("MONDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab4-Minimum amount.");
            // To enter "Monday Slab4-Minimum Amount".
            enterText(BasicSettings.MONDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Monday Slab4-Maximum amount.");
            // To enter "Monday Slab4-Maximum Amount".
            enterText(BasicSettings.MONDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("MONDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Monday Slab4-Delivery Time.");
            // To enter "Monday Slab4-Delivery Time".
            enterText(BasicSettings.MONDAY_SLAB4_DELIVERY_TIME, getexceldata.get("MONDAY_SLAB4_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_GRID, "Preparation_Timings", ++row, "Able to click on Tuesday  Grid.");
            pageScrollWithJavaScript(BasicSettings.TUESDAY_GRID);
            // To click on "Tuesday  Grid" link.
            clickElement(BasicSettings.TUESDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab1 name.");
            // To enter "Tuesday  Slab1" name.
            enterText(BasicSettings.TUESDAY_SLAB1_NAME, getexceldata.get("TUESDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab1-Minimum amount.");
            // To enter "Tuesday  Slab1-Minimum Amount".
            enterText(BasicSettings.TUESDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab1-Maximum amount.");
            // To enter "Tuesday  Slab1-Maximum Amount".
            enterText(BasicSettings.TUESDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab1-Delivery Time.");
            // To enter "Tuesday  Slab1-Delivery Time".
            enterText(BasicSettings.TUESDAY_SLAB1_DELIVERY_TIME, getexceldata.get("TUESDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab2 name.");
            // To enter "Tuesday  Slab2" name.
            enterText(BasicSettings.TUESDAY_SLAB2_NAME, getexceldata.get("TUESDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab2-Minimum amount.");
            // To enter "Tuesday  Slab2-Minimum Amount".
            enterText(BasicSettings.TUESDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab2-Maximum amount.");
            // To enter "Tuesday  Slab2-Maximum Amount".
            enterText(BasicSettings.TUESDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab2-Delivery Time.");
            // To enter "Tuesday  Slab2-Delivery Time".
            enterText(BasicSettings.TUESDAY_SLAB2_DELIVERY_TIME, getexceldata.get("TUESDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab3 name.");
            // To enter "Tuesday  Slab3" name.
            enterText(BasicSettings.TUESDAY_SLAB3_NAME, getexceldata.get("TUESDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab3-Minimum amount.");
            // To enter "Tuesday  Slab3-Minimum Amount".
            enterText(BasicSettings.TUESDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab3-Maximum amount.");
            // To enter "Tuesday  Slab3-Maximum Amount".
            enterText(BasicSettings.TUESDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab3-Delivery Time.");
            // To enter "Tuesday  Slab3-Delivery Time".
            enterText(BasicSettings.TUESDAY_SLAB3_DELIVERY_TIME, getexceldata.get("TUESDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab4 name.");
            // To enter "Tuesday  Slab4" name.
            enterText(BasicSettings.TUESDAY_SLAB4_NAME, getexceldata.get("TUESDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab4-Minimum amount.");
            // To enter "Tuesday  Slab4-Minimum Amount".
            enterText(BasicSettings.TUESDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Tuesday Slab4-Maximum amount.");
            // To enter "Tuesday  Slab4-Maximum Amount".
            enterText(BasicSettings.TUESDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("TUESDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Tuesday Slab4-Delivery Time.");
            // To enter "Tuesday  Slab4-Delivery Time".
            enterText(BasicSettings.TUESDAY_SLAB4_DELIVERY_TIME, getexceldata.get("TUESDAY_SLAB4_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_GRID, "Preparation_Timings", ++row, "Able to click on Wednesday  Grid.");
            pageScrollWithJavaScript(BasicSettings.WEDNESDAY_GRID);
            // To click on "Wednesday  Grid" link.
            clickElement(BasicSettings.WEDNESDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab1 name.");
            // To enter "Wednesday  Slab1" name.
            enterText(BasicSettings.WEDNESDAY_SLAB1_NAME, getexceldata.get("WEDNESDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab1-Minimum amount.");
            // To enter "Wednesday  Slab1-Minimum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab1-Maximum amount.");
            // To enter "Wednesday  Slab1-Maximum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab1-Delivery Time.");
            // To enter "Wednesday  Slab1-Delivery Time".
            enterText(BasicSettings.WEDNESDAY_SLAB1_DELIVERY_TIME, getexceldata.get("WEDNESDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab2 name.");
            // To enter "Wednesday  Slab2" name.
            enterText(BasicSettings.WEDNESDAY_SLAB2_NAME, getexceldata.get("WEDNESDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab2-Minimum amount.");
            // To enter "Wednesday  Slab2-Minimum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab2-Maximum amount.");
            // To enter "Wednesday  Slab2-Maximum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab2-Delivery Time.");
            // To enter "Wednesday  Slab2-Delivery Time".
            enterText(BasicSettings.WEDNESDAY_SLAB2_DELIVERY_TIME, getexceldata.get("WEDNESDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab3 name.");
            // To enter "Wednesday  Slab3" name.
            enterText(BasicSettings.WEDNESDAY_SLAB3_NAME, getexceldata.get("WEDNESDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab3-Minimum amount.");
            // To enter "Wednesday  Slab3-Minimum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab3-Maximum amount.");
            // To enter "Wednesday  Slab3-Maximum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab3-Delivery Time.");
            // To enter "Wednesday  Slab3-Delivery Time".
            enterText(BasicSettings.WEDNESDAY_SLAB3_DELIVERY_TIME, getexceldata.get("WEDNESDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab4 name.");
            // To enter "Wednesday  Slab4" name.
            enterText(BasicSettings.WEDNESDAY_SLAB4_NAME, getexceldata.get("WEDNESDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab4-Minimum amount.");
            // To enter "Wednesday  Slab4-Minimum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Wednesday Slab4-Maximum amount.");
            // To enter "Wednesday  Slab4-Maximum Amount".
            enterText(BasicSettings.WEDNESDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("WEDNESDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Wednesday Slab4-Delivery Time.");
            // To enter "Wednesday  Slab4-Delivery Time".
            enterText(BasicSettings.WEDNESDAY_SLAB4_DELIVERY_TIME, getexceldata.get("WEDNESDAY_SLAB4_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_GRID, "Preparation_Timings", ++row, "Able to click on Thursday  Grid.");
            pageScrollWithJavaScript(BasicSettings.THURSDAY_GRID);
            // To click on "Thursday  Grid" link.
            clickElement(BasicSettings.THURSDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Thursday Slab1 name.");
            // To enter "Thursday  Slab1" name.
            enterText(BasicSettings.THURSDAY_SLAB1_NAME, getexceldata.get("THURSDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab1-Minimum amount.");
            // To enter "Thursday  Slab1-Minimum Amount".
            enterText(BasicSettings.THURSDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab1-Maximum amount.");
            // To enter "Thursday  Slab1-Maximum Amount".
            enterText(BasicSettings.THURSDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Thursday Slab1-Delivery Time.");
            // To enter "Thursday  Slab1-Delivery Time".
            enterText(BasicSettings.THURSDAY_SLAB1_DELIVERY_TIME, getexceldata.get("THURSDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Thursday Slab2 name.");
            // To enter "Thursday  Slab2" name.
            enterText(BasicSettings.THURSDAY_SLAB2_NAME, getexceldata.get("THURSDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab2-Minimum amount.");
            // To enter "Thursday  Slab2-Minimum Amount".
            enterText(BasicSettings.THURSDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab2-Maximum amount.");
            // To enter "Thursday  Slab2-Maximum Amount".
            enterText(BasicSettings.THURSDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Thursday Slab2-Delivery Time.");
            // To enter "Thursday  Slab2-Delivery Time".
            enterText(BasicSettings.THURSDAY_SLAB2_DELIVERY_TIME, getexceldata.get("THURSDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Thursday Slab3 name.");
            // To enter "Thursday  Slab3" name.
            enterText(BasicSettings.THURSDAY_SLAB3_NAME, getexceldata.get("THURSDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab3-Minimum amount.");
            // To enter "Thursday  Slab3-Minimum Amount".
            enterText(BasicSettings.THURSDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab3-Maximum amount.");
            // To enter "Thursday  Slab3-Maximum Amount".
            enterText(BasicSettings.THURSDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Thursday Slab3-Delivery Time.");
            // To enter "Thursday  Slab3-Delivery Time".
            enterText(BasicSettings.THURSDAY_SLAB3_DELIVERY_TIME, getexceldata.get("THURSDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Thursday Slab4 name.");
            // To enter "Thursday  Slab4" name.
            enterText(BasicSettings.THURSDAY_SLAB4_NAME, getexceldata.get("THURSDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab4-Minimum amount.");
            // To enter "Thursday  Slab4-Minimum Amount".
            enterText(BasicSettings.THURSDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Thursday Slab4-Maximum amount.");
            // To enter "Thursday  Slab4-Maximum Amount".
            enterText(BasicSettings.THURSDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("THURSDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Thursday Slab4-Delivery Time.");
            // To enter "Thursday  Slab4-Delivery Time".
            enterText(BasicSettings.THURSDAY_SLAB4_DELIVERY_TIME, getexceldata.get("THURSDAY_SLAB4_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_GRID, "Preparation_Timings", ++row, "Able to click on Friday  Grid.");
            pageScrollWithJavaScript(BasicSettings.FRIDAY_GRID);
            // To click on "Friday  Grid" link.
            clickElement(BasicSettings.FRIDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Friday Slab1 name.");
            // To enter "Friday  Slab1" name.
            enterText(BasicSettings.FRIDAY_SLAB1_NAME, getexceldata.get("FRIDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab1-Minimum amount.");
            // To enter "Friday  Slab1-Minimum Amount".
            enterText(BasicSettings.FRIDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab1-Maximum amount.");
            // To enter "Friday  Slab1-Maximum Amount".
            enterText(BasicSettings.FRIDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Friday Slab1-Delivery Time.");
            // To enter "Friday  Slab1-Delivery Time".
            enterText(BasicSettings.FRIDAY_SLAB1_DELIVERY_TIME, getexceldata.get("FRIDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Friday Slab2 name.");
            // To enter "Friday  Slab2" name.
            enterText(BasicSettings.FRIDAY_SLAB2_NAME, getexceldata.get("FRIDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab2-Minimum amount.");
            // To enter "Friday  Slab2-Minimum Amount".
            enterText(BasicSettings.FRIDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab2-Maximum amount.");
            // To enter "Friday  Slab2-Maximum Amount".
            enterText(BasicSettings.FRIDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Friday Slab2-Delivery Time.");
            // To enter "Friday  Slab2-Delivery Time".
            enterText(BasicSettings.FRIDAY_SLAB2_DELIVERY_TIME, getexceldata.get("FRIDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Friday Slab3 name.");
            // To enter "Friday  Slab3" name.
            enterText(BasicSettings.FRIDAY_SLAB3_NAME, getexceldata.get("FRIDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab3-Minimum amount.");
            // To enter "Friday  Slab3-Minimum Amount".
            enterText(BasicSettings.FRIDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab3-Maximum amount.");
            // To enter "Friday  Slab3-Maximum Amount".
            enterText(BasicSettings.FRIDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Friday Slab3-Delivery Time.");
            // To enter "Friday  Slab3-Delivery Time".
            enterText(BasicSettings.FRIDAY_SLAB3_DELIVERY_TIME, getexceldata.get("FRIDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Friday Slab4 name.");
            // To enter "Friday  Slab4" name.
            enterText(BasicSettings.FRIDAY_SLAB4_NAME, getexceldata.get("FRIDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab4-Minimum amount.");
            // To enter "Friday  Slab4-Minimum Amount".
            enterText(BasicSettings.FRIDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Friday Slab4-Maximum amount.");
            // To enter "Friday  Slab4-Maximum Amount".
            enterText(BasicSettings.FRIDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("FRIDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Friday Slab4-Delivery Time.");
            // To enter "Friday  Slab4-Delivery Time".
            enterText(BasicSettings.FRIDAY_SLAB4_DELIVERY_TIME, getexceldata.get("FRIDAY_SLAB4_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_GRID, "Preparation_Timings", ++row, "Able to click on Saturday  Grid.");
            pageScrollWithJavaScript(BasicSettings.SATURDAY_GRID);
            // To click on "Saturday  Grid" link.
            clickElement(BasicSettings.SATURDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Saturday Slab1 name.");
            // To enter "Saturday  Slab1" name.
            enterText(BasicSettings.SATURDAY_SLAB1_NAME, getexceldata.get("SATURDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab1-Minimum amount.");
            // To enter "Saturday  Slab1-Minimum Amount".
            enterText(BasicSettings.SATURDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab1-Maximum amount.");
            // To enter "Saturday  Slab1-Maximum Amount".
            enterText(BasicSettings.SATURDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Saturday Slab1-Delivery Time.");
            // To enter "Saturday  Slab1-Delivery Time".
            enterText(BasicSettings.SATURDAY_SLAB1_DELIVERY_TIME, getexceldata.get("SATURDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Saturday Slab2 name.");
            // To enter "Saturday  Slab2" name.
            enterText(BasicSettings.SATURDAY_SLAB2_NAME, getexceldata.get("SATURDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab2-Minimum amount.");
            // To enter "Saturday  Slab2-Minimum Amount".
            enterText(BasicSettings.SATURDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab2-Maximum amount.");
            // To enter "Saturday  Slab2-Maximum Amount".
            enterText(BasicSettings.SATURDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Saturday Slab2-Delivery Time.");
            // To enter "Saturday  Slab2-Delivery Time".
            enterText(BasicSettings.SATURDAY_SLAB2_DELIVERY_TIME, getexceldata.get("SATURDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Saturday Slab3 name.");
            // To enter "Saturday  Slab3" name.
            enterText(BasicSettings.SATURDAY_SLAB3_NAME, getexceldata.get("SATURDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab3-Minimum amount.");
            // To enter "Saturday  Slab3-Minimum Amount".
            enterText(BasicSettings.SATURDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab3-Maximum amount.");
            // To enter "Saturday  Slab3-Maximum Amount".
            enterText(BasicSettings.SATURDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Saturday Slab3-Delivery Time.");
            // To enter "Saturday  Slab3-Delivery Time".
            enterText(BasicSettings.SATURDAY_SLAB3_DELIVERY_TIME, getexceldata.get("SATURDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Saturday Slab4 name.");
            // To enter "Saturday  Slab4" name.
            enterText(BasicSettings.SATURDAY_SLAB4_NAME, getexceldata.get("SATURDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab4-Minimum amount.");
            // To enter "Saturday  Slab4-Minimum Amount".
            enterText(BasicSettings.SATURDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Saturday Slab4-Maximum amount.");
            // To enter "Saturday  Slab4-Maximum Amount".
            enterText(BasicSettings.SATURDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("SATURDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Saturday Slab4-Delivery Time.");
            // To enter "Saturday  Slab4-Delivery Time".
            enterText(BasicSettings.SATURDAY_SLAB4_DELIVERY_TIME, getexceldata.get("SATURDAY_SLAB4_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_GRID, "Preparation_Timings", ++row, "Able to click on Sunday  Grid.");
            pageScrollWithJavaScript(BasicSettings.SUNDAY_GRID);
            // To click on "Sunday  Grid" link.
            clickElement(BasicSettings.SUNDAY_GRID);

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB1_NAME, "Preparation_Timings", ++row, "Able to enter Sunday Slab1 name.");
            // To enter "Sunday  Slab1" name.
            enterText(BasicSettings.SUNDAY_SLAB1_NAME, getexceldata.get("SUNDAY_SLAB1_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB1_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab1-Minimum amount.");
            // To enter "Sunday  Slab1-Minimum Amount".
            enterText(BasicSettings.SUNDAY_SLAB1_MINIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB1_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB1_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab1-Maximum amount.");
            // To enter "Sunday  Slab1-Maximum Amount".
            enterText(BasicSettings.SUNDAY_SLAB1_MAXIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB1_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB1_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Sunday Slab1-Delivery Time.");
            // To enter "Sunday  Slab1-Delivery Time".
            enterText(BasicSettings.SUNDAY_SLAB1_DELIVERY_TIME, getexceldata.get("SUNDAY_SLAB1_DELIVERY_TIME"));


            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB2_NAME, "Preparation_Timings", ++row, "Able to enter Sunday Slab2 name.");
            // To enter "Sunday  Slab2" name.
            enterText(BasicSettings.SUNDAY_SLAB2_NAME, getexceldata.get("SUNDAY_SLAB2_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB2_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab2-Minimum amount.");
            // To enter "Sunday  Slab2-Minimum Amount".
            enterText(BasicSettings.SUNDAY_SLAB2_MINIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB2_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB2_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab2-Maximum amount.");
            // To enter "Sunday  Slab2-Maximum Amount".
            enterText(BasicSettings.SUNDAY_SLAB2_MAXIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB2_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB2_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Sunday Slab2-Delivery Time.");
            // To enter "Sunday  Slab2-Delivery Time".
            enterText(BasicSettings.SUNDAY_SLAB2_DELIVERY_TIME, getexceldata.get("SUNDAY_SLAB2_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB3_NAME, "Preparation_Timings", ++row, "Able to enter Sunday Slab3 name.");
            // To enter "Sunday  Slab3" name.
            enterText(BasicSettings.SUNDAY_SLAB3_NAME, getexceldata.get("SUNDAY_SLAB3_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB3_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab3-Minimum amount.");
            // To enter "Sunday  Slab3-Minimum Amount".
            enterText(BasicSettings.SUNDAY_SLAB3_MINIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB3_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB3_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab3-Maximum amount.");
            // To enter "Sunday  Slab3-Maximum Amount".
            enterText(BasicSettings.SUNDAY_SLAB3_MAXIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB3_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB3_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Sunday Slab3-Delivery Time.");
            // To enter "Sunday  Slab3-Delivery Time".
            enterText(BasicSettings.SUNDAY_SLAB3_DELIVERY_TIME, getexceldata.get("SUNDAY_SLAB3_DELIVERY_TIME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB4_NAME, "Preparation_Timings", ++row, "Able to enter Sunday Slab4 name.");
            // To enter "Sunday  Slab4" name.
            enterText(BasicSettings.SUNDAY_SLAB4_NAME, getexceldata.get("SUNDAY_SLAB4_NAME"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB4_MINIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab4-Minimum amount.");
            // To enter "Sunday  Slab4-Minimum Amount".
            enterText(BasicSettings.SUNDAY_SLAB4_MINIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB4_MINIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB4_MAXIMUM_AMOUNT, "Preparation_Timings", ++row, "Able to enter Sunday Slab4-Maximum amount.");
            // To enter "Sunday  Slab4-Maximum Amount".
            enterText(BasicSettings.SUNDAY_SLAB4_MAXIMUM_AMOUNT, getexceldata.get("SUNDAY_SLAB4_MAXIMUM_AMOUNT"));

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_SLAB4_DELIVERY_TIME, "Preparation_Timings", ++row, "Able to enter Sunday Slab4-Delivery Time.");
            // To enter "Sunday  Slab4-Delivery Time".
            enterText(BasicSettings.SUNDAY_SLAB4_DELIVERY_TIME, getexceldata.get("SUNDAY_SLAB4_DELIVERY_TIME"));


            Thread.sleep(2000);
            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SAVE_BUTTON, "Preparation_Timings", ++row, "Able to click on Save Button.");
            // To click on "Save" Tab.
            clickElement(BasicSettings.SAVE_BUTTON);
            Thread.sleep(5000);
            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.OK_BUTTON, "Preparation_Timings", ++row, "Able to click on YES button.");
            // To click on "Ok" button.
            clickElement(BasicSettings.OK_BUTTON);

            Thread.sleep(5000);
            reports.addPassTestStep("Preparation_Timings functionality.", "Verify Preparation_Timings functionality.", "Preparation_Timings functionality is Success.", testcasename());

            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.USER_ICON, "Preparation_Timings", ++row, "Able to click on user icon.");
            // To click on "User" Icon.
            clickElement(BasicSettings.USER_ICON);

            Thread.sleep(3000);
            // Step to validate and update test step status on "Preparation_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGOUT_MENU_OPTION, "Preparation_Timings", ++row, "Able to click on logout button.");
            // To click on "LOGOUT" button.
            clickElement(BasicSettings.LOGOUT_MENU_OPTION);

        } catch (Exception exception1) {
            exception1.printStackTrace();
          Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("Preparation_Timings functionality.", "Verify Preparation_Timings functionality.", "Preparation_Timings functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
            Log4j.fatal(exception2.getMessage());
            }
        }
    }
}

