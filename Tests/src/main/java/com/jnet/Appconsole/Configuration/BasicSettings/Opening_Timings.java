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

public class Opening_Timings extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public Opening_Timings(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void Opening_Timings() {
        Log4j.startLog("Opening Timings Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));

            // Fetch the test data from "AdminPortalTestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("AdminPortalTestData", "BasicSettings");

            // Waiting for the element to perform action.
            waitforelementtobeclick(BasicSettings.LOGIN, 5000);
            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Opening_Timings", row, "RestroZap AppConsole application home page is displayed.");

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.USERNAME, "Opening_Timings", ++row, "Able to enter username.");
            // To enter "Username".
            enterText(BasicSettings.USERNAME, prop.getProperty("Username"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.PASSWORD, "Opening_Timings", ++row, "Able to enter Password.");
            // To enter "Password".
            enterText(BasicSettings.PASSWORD, prop.getProperty("Password"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Opening_Timings", ++row, "Able to click on Login button.");
            // To click on "Login" button.
            clickElement(BasicSettings.LOGIN);

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.CONFIGURATION_MENU_LINK, "Opening_Timings", ++row, "Able to click on Configuration menu link.");
            // To click on "Configuration" menu link.
            clickElement(BasicSettings.CONFIGURATION_MENU_LINK);

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.BASIC_SETTINGS_MENU_LINK, "Opening_Timings", ++row, "Able to click on Basic Settings link.");
            // To click on "Basic Settings" menu link.
            clickElement(BasicSettings.BASIC_SETTINGS_MENU_LINK);

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.OPENING_TIMINGS_LINK, "Opening_Timings", ++row, "Able to click on Opening Timings Tab.");
            // To click on "General" Tab.
            clickElement(BasicSettings.OPENING_TIMINGS_LINK);

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.SUNDAY_OT1_START_TIME, getexceldata.get("SUNDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.SUNDAY_OT1_END_TIME, getexceldata.get("SUNDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.SUNDAY_OT2_START_TIME, getexceldata.get("SUNDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.SUNDAY_OT2_END_TIME, getexceldata.get("SUNDAY_OT2_END_TIME"));


            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.MONDAY_OT1_START_TIME, getexceldata.get("MONDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.MONDAY_OT1_END_TIME, getexceldata.get("MONDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.MONDAY_OT2_START_TIME, getexceldata.get("MONDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.MONDAY_OT2_END_TIME, getexceldata.get("MONDAY_OT2_END_TIME"));



            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.TUESDAY_OT1_START_TIME, getexceldata.get("TUESDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.TUESDAY_OT1_END_TIME, getexceldata.get("TUESDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.TUESDAY_OT2_START_TIME, getexceldata.get("TUESDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.TUESDAY_OT2_END_TIME, getexceldata.get("TUESDAY_OT2_END_TIME"));



            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.WEDNESDAY_OT1_START_TIME, getexceldata.get("WEDNESDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.WEDNESDAY_OT1_END_TIME, getexceldata.get("WEDNESDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.WEDNESDAY_OT2_START_TIME, getexceldata.get("WEDNESDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.WEDNESDAY_OT2_END_TIME, getexceldata.get("WEDNESDAY_OT2_END_TIME"));




            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.THURSDAY_OT1_START_TIME, getexceldata.get("THURSDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.THURSDAY_OT1_END_TIME, getexceldata.get("THURSDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.THURSDAY_OT2_START_TIME, getexceldata.get("THURSDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.THURSDAY_OT2_END_TIME, getexceldata.get("THURSDAY_OT2_END_TIME"));



            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.FRIDAY_OT1_START_TIME, getexceldata.get("FRIDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.FRIDAY_OT1_END_TIME, getexceldata.get("FRIDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.FRIDAY_OT2_START_TIME, getexceldata.get("FRIDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.FRIDAY_OT2_END_TIME, getexceldata.get("FRIDAY_OT2_END_TIME"));




            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_OT1_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_Start Time.");
            // To enter "Opening Times-1_Start Time" information.
            enterText(BasicSettings.SATURDAY_OT1_START_TIME, getexceldata.get("SATURDAY_OT1_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_OT1_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-1_End Time.");
            // To enter "Opening Times-1_End Time" information.
            enterText(BasicSettings.SATURDAY_OT1_END_TIME, getexceldata.get("SATURDAY_OT1_END_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_OT2_START_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_Start Time.");
            // To enter "Opening Times-2_Start Time" information.
            enterText(BasicSettings.SATURDAY_OT2_START_TIME, getexceldata.get("SATURDAY_OT2_START_TIME"));

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_OT2_END_TIME, "Opening_Timings", ++row, "Able to enter Opening Times-2_End Time.");
            // To enter "Opening Times-2_End Time" information.
            enterText(BasicSettings.SATURDAY_OT2_END_TIME, getexceldata.get("SATURDAY_OT2_END_TIME"));


            Thread.sleep(2000);
            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.SAVE_BUTTON, "Opening_Timings", ++row, "Able to click on Save Button.");
            // To click on "Save" Tab.
            clickElement(BasicSettings.SAVE_BUTTON);
            Thread.sleep(5000);
            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.OK_BUTTON, "Opening_Timings", ++row, "Able to click on YES button.");
            // To click on "Ok" button.
            clickElement(BasicSettings.OK_BUTTON);

            Thread.sleep(5000);
            reports.addPassTestStep("Opening_Timings functionality.", "Verify Opening_Timings functionality.", "Opening_Timings functionality is Success.", testcasename());

            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.USER_ICON, "Opening_Timings", ++row, "Able to click on user icon.");
            // To click on "User" Icon.
            clickElement(BasicSettings.USER_ICON);

            Thread.sleep(3000);
            // Step to validate and update test step status on "Opening_Timings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGOUT_MENU_OPTION, "Opening_Timings", ++row, "Able to click on logout button.");
            // To click on "LOGOUT" button.
            clickElement(BasicSettings.LOGOUT_MENU_OPTION);

        } catch (Exception exception1) {
            exception1.printStackTrace();
          Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("Opening_Timings functionality.", "Verify Opening_Timings functionality.", "Opening_Timings functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
            Log4j.fatal(exception2.getMessage());
            }
        }
    }
}

