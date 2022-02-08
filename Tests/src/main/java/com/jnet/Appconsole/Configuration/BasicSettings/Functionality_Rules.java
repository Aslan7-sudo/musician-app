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

public class Functionality_Rules extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public Functionality_Rules(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void Functionality_Rules() {
        Log4j.startLog("Functionality_Rules Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));

            // Fetch the test data from "AdminPortalTestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("AdminPortalTestData", "BasicSettings");

            // Waiting for the element to perform action.
            waitforelementtobeclick(BasicSettings.LOGIN, 5000);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "General_Settings", row, "RestroZap AppConsole application home page is displayed.");

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.USERNAME, "General_Settings", ++row, "Able to enter username.");
            // To enter "Username".
            enterText(BasicSettings.USERNAME, prop.getProperty("Username"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.PASSWORD, "General_Settings", ++row, "Able to enter Password.");
            // To enter "Password".
            enterText(BasicSettings.PASSWORD, prop.getProperty("Password"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "General_Settings", ++row, "Able to click on Login button.");
            // To click on "Login" button.
            clickElement(BasicSettings.LOGIN);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.CONFIGURATION_MENU_LINK, "General_Settings", ++row, "Able to click on Configuration menu link.");
            // To click on "Configuration" menu link.
            clickElement(BasicSettings.CONFIGURATION_MENU_LINK);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.BASIC_SETTINGS_MENU_LINK, "General_Settings", ++row, "Able to click on Basic Settings link.");
            // To click on "Basic Settings" menu link.
            clickElement(BasicSettings.BASIC_SETTINGS_MENU_LINK);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.FUNCTIONALITY_RULES_LINK, "General_Settings", ++row, "Able to click on Functionality Rules Tab.");
            // To click on "Functionality Rules" Tab.
            clickElement(BasicSettings.FUNCTIONALITY_RULES_LINK);
            Thread.sleep(5000);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            pageScrollWithJavaScript(BasicSettings.STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR);
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR_CURRENT_STATUS,BasicSettings.STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR, prop.getProperty("STOP_ACCEPTING_ORDERS_TEMPORARILY"));

            Thread.sleep(10000);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.SAVE_BUTTON, "General_Settings", ++row, "Able to click on Save Button.");
            // To click on "Save" Tab.
            clickElement(BasicSettings.SAVE_BUTTON);
            Thread.sleep(5000);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.OK_BUTTON, "General_Settings", ++row, "Able to click on YES button.");
            // To click on "Ok" button.
            clickElement(BasicSettings.OK_BUTTON);

            Thread.sleep(5000);
            reports.addPassTestStep("General Settings functionality.", "Verify General Settings functionality.", "General Settings functionality is Success.", testcasename());

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.USER_ICON, "General_Settings", ++row, "Able to click on user icon.");
            // To click on "User" Icon.
            clickElement(BasicSettings.USER_ICON);

            Thread.sleep(3000);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGOUT_MENU_OPTION, "General_Settings", ++row, "Able to click on logout button.");
            // To click on "LOGOUT" button.
            clickElement(BasicSettings.LOGOUT_MENU_OPTION);

        } catch (Exception exception1) {
            exception1.printStackTrace();
          Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("General Settings functionality.", "Verify General Settings functionality.", "General Settings functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
            Log4j.fatal(exception2.getMessage());
            }
        }
    }
}
