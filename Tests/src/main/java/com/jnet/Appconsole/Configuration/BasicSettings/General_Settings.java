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

public class General_Settings extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public General_Settings(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void General_Settings () {
        Log4j.startLog("General Settings Class");
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
            setStatusToTestSteps(BasicSettings.GENERAL_LINK, "General_Settings", ++row, "Able to click on General Tab.");
            // To click on "General" Tab.
            clickElement(BasicSettings.GENERAL_LINK);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.RESTAURANT_NAME, "General_Settings", ++row, "Able to enter Restaurant Name.");
            // To enter "Restaurant Name" information.
            enterText(BasicSettings.RESTAURANT_NAME, getexceldata.get("Restaurant Name"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.ADMIN_EMAIL, "General_Settings", ++row, "Able to enter Admin Email.");
            // To enter "Admin Email" information.
            enterText(BasicSettings.ADMIN_EMAIL, getexceldata.get("Admin Email"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.COUNTRY_CODE, "General_Settings", ++row, "Able to enter Country Code.");
            // To enter "Country Code".
            enterText(BasicSettings.COUNTRY_CODE, getexceldata.get("Country Code"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.ADMIN_PHONE, "General_Settings", ++row, "Able to enter Admin Phone.");
            // To enter "Admin Phone".
            enterText(BasicSettings.ADMIN_PHONE, getexceldata.get("Admin Phone"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.PAYMENT_GATEWAY_ERRORS_EMAIL, "General_Settings", ++row, "Able to enter Payment Gateway Errors Email.");
            // To enter "Payment Gateway Errors Email" information.
            enterText(BasicSettings.PAYMENT_GATEWAY_ERRORS_EMAIL, getexceldata.get("Payment Gateway Errors Email"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.DISPLAY_USER_ICON_IN_ONLINE_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON.");
            // To click on "User Icon in Online" toggle button.
    //        toogleButton(BasicSettings.DISPLAY_USER_ICON_IN_ONLINE_TOGGLE_BAR,"");

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.DISPLAY_CART_ICON_IN_ONLINE_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON.");
            // To click on "Cart Icon in Online" toggle button.
          //  toogleButton(BasicSettings.DISPLAY_CART_ICON_IN_ONLINE_TOGGLE_BAR,"");

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.TAX_PERCENTAGE, "General_Settings", ++row, "Able to enter tax percentage.");
            // To enter "Tax Percentage" information.
            enterText(BasicSettings.TAX_PERCENTAGE, getexceldata.get("Tax%"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.ADDITIONAL_TAX_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON.");
            // To click on "Additional Tax" toggle button.
          //  toogleButton(BasicSettings.ADDITIONAL_TAX_TOGGLE_BAR,"","");

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.ADDITIONAL_TAX_LABEL, "General_Settings", ++row, "Able to enter Additional Tax Label.");
            // To enter "Additional Tax Label" information.
            enterText(BasicSettings.ADDITIONAL_TAX_LABEL, getexceldata.get("Additional Tax Label"));

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.ADDITIONAL_TAX_FEE, "General_Settings", ++row, "Able to enter Additional tax fee.");
            // To enter "Additional Tax Fee" information.
            enterText(BasicSettings.ADDITIONAL_TAX_FEE, getexceldata.get("Additional Tax Fee"));

            pageScrollWithJavaScript(BasicSettings.TAX_TYPE_FLAT);
            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.TAX_TYPE_FLAT, "General_Settings", ++row, "Able to select Tax Type.");
            // To select on "Tax Type" radio option.
            isSelectedToBeClickElement(BasicSettings.TAX_TYPE_FLAT);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.HOME_PAGE_PROMOTIONS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON.");
            // To click on "Home Page Promotions" toggle button.
       //     toogleButton(BasicSettings.HOME_PAGE_PROMOTIONS_TOGGLE_BAR,"");

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.START_DATE, "General_Settings", ++row, "Able to enter Start Date.");
            // To enter "Start Date with Time" information.
            enterText(BasicSettings.START_DATE, DateWithTime());
            keysTab(BasicSettings.START_DATE);

            // Step to validate and update test step status on "General_Settings" excel sheet.
            setStatusToTestSteps(BasicSettings.END_DATE, "General_Settings", ++row, "Able to enter End Date.");
            keysBackSpace(BasicSettings.END_DATE);
            Thread.sleep(1000);
            // To enter "End Date with Time" information.
            enterText(BasicSettings.END_DATE, getexceldata.get("End Date"));
            Thread.sleep(2000);
            keysTab(BasicSettings.END_DATE);
            Thread.sleep(2000);
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
