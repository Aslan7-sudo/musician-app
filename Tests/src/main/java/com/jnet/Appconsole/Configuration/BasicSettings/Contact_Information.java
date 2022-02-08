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

public class Contact_Information extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public Contact_Information(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void Contact_Information() {
        Log4j.startLog("Contact_Information Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));

            // Fetch the test data from "AdminPortalTestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("AdminPortalTestData", "BasicSettings");

            // Waiting for the element to perform action.
            waitforelementtobeclick(BasicSettings.LOGIN, 5000);
            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Contact_Info", row, "RestroZap AppConsole application home page is displayed.");

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.USERNAME, "Contact_Info", ++row, "Able to enter username.");
            // To enter "Username".
            enterText(BasicSettings.USERNAME, prop.getProperty("Username"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.PASSWORD, "Contact_Info", ++row, "Able to enter Password.");
            // To enter "Password".
            enterText(BasicSettings.PASSWORD, prop.getProperty("Password"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Contact_Info", ++row, "Able to click on Login button.");
            // To click on "Login" button.
            clickElement(BasicSettings.LOGIN);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CONFIGURATION_MENU_LINK, "Contact_Info", ++row, "Able to click on Configuration menu link.");
            // To click on "Configuration" menu link.
            clickElement(BasicSettings.CONFIGURATION_MENU_LINK);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.BASIC_SETTINGS_MENU_LINK, "Contact_Info", ++row, "Able to click on Basic Settings link.");
            // To click on "Basic Settings" menu link.
            clickElement(BasicSettings.BASIC_SETTINGS_MENU_LINK);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CONTACT_INFO_LINK, "Contact_Info", ++row, "Able to click on contact information tab.");
            // To click on "Contact Information" Tab.
            clickElement(BasicSettings.CONTACT_INFO_LINK);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.ADDRESS_LINE1, "Contact_Info", ++row, "Able to enter address line1.");
            // To enter "Address Line1" information.
            enterText(BasicSettings.ADDRESS_LINE1, getexceldata.get("ADDRESS_LINE1"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.ADDRESS_LINE2, "Contact_Info", ++row, "Able to enter address line2.");
            // To enter "Address Line2" information.
            enterText(BasicSettings.ADDRESS_LINE2, getexceldata.get("ADDRESS_LINE2"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CITY_TOWN, "Contact_Info", ++row, "Able to enter City/Town Information.");
            // To enter "City/Town" information.
            enterText(BasicSettings.CITY_TOWN, getexceldata.get("CITY_TOWN"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.STATE_CODE, "Contact_Info", ++row, "Able to enter state code.");
            // To enter "State Code" information.
            enterText(BasicSettings.STATE_CODE, getexceldata.get("STATE_CODE"));


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.STATE_NAME, "Contact_Info", ++row, "Able to enter state name.");
            // To enter "State Name" information.
            enterText(BasicSettings.STATE_NAME, getexceldata.get("STATE_NAME"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.COUNTRY, "Contact_Info", ++row, "Able to enter country information.");
            // To enter "country" information.
            enterText(BasicSettings.COUNTRY, getexceldata.get("COUNTRY"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.ZIP_POSTAL_CODE, "Contact_Info", ++row, "Able to enter Zip/Postal Code Information.");
            // To enter "Zip/Postal Code" information.
            enterText(BasicSettings.ZIP_POSTAL_CODE, getexceldata.get("ZIP_POSTAL_CODE"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.PHONE_NUMBER, "Contact_Info", ++row, "Able to enter phone number information.");
            // To enter "Phone Number" information.
            enterText(BasicSettings.PHONE_NUMBER, getexceldata.get("PHONE_NUMBER"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.EMAIL, "Contact_Info", ++row, "Able to enter email information.");
            // To enter "Email" information.
            enterText(BasicSettings.EMAIL, getexceldata.get("EMAIL"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.LOCATION_URL, "Contact_Info", ++row, "Able to enter location url information.");
            // To enter "Location Url" information.
            enterText(BasicSettings.LOCATION_URL, prop.getProperty("lOCATION_URL"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.FACEBOOK, "Contact_Info", ++row, "Able to enter facebook information.");
            // To enter "facebook" information.
            enterText(BasicSettings.FACEBOOK, prop.getProperty("FACEBOOK"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.INSTAGRAM, "Contact_Info", ++row, "Able to enter instagram information.");
            // To enter "instagram" information.
            enterText(BasicSettings.INSTAGRAM, prop.getProperty("INSTAGRAM"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.TWITTER, "Contact_Info", ++row, "Able to enter twitter information.");
            // To enter "twitter" information.
            enterText(BasicSettings.TWITTER, prop.getProperty("TWITTER"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.GOOGLEPLUS, "Contact_Info", ++row, "Able to enter google plus information.");
            // To enter "google plus" information.
            enterText(BasicSettings.GOOGLEPLUS, prop.getProperty("GOOGLEPLUS"));

            Thread.sleep(2000);
            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.SAVE_BUTTON, "Contact_Info", ++row, "Able to click on Save Button.");
            // To click on "Save" Tab.
            clickElement(BasicSettings.SAVE_BUTTON);
            Thread.sleep(5000);
            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.OK_BUTTON, "Contact_Info", ++row, "Able to click on YES button.");
            // To click on "Ok" button.
            clickElement(BasicSettings.OK_BUTTON);

            Thread.sleep(5000);
            reports.addPassTestStep("Contact_Info functionality.", "Verify Contact_Info functionality.", "Contact_Info functionality is Success.", testcasename());

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.USER_ICON, "Contact_Info", ++row, "Able to click on user icon.");
            // To click on "User" Icon.
            clickElement(BasicSettings.USER_ICON);

            Thread.sleep(3000);
            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGOUT_MENU_OPTION, "Contact_Info", ++row, "Able to click on logout button.");
            // To click on "LOGOUT" button.
            clickElement(BasicSettings.LOGOUT_MENU_OPTION);

        } catch (Exception exception1) {
            exception1.printStackTrace();
            Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("Contact_Info functionality.", "Verify Contact_Info functionality.", "Contact_Info functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
                Log4j.fatal(exception2.getMessage());
            }
        }
    }
}

