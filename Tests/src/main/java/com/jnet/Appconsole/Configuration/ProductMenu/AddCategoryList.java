package com.jnet.Appconsole.Configuration.ProductMenu;

import com.jnet.globalclasses.BrowserActions;
import com.jnet.globalclasses.ExcelClass;
import com.jnet.globalclasses.Log4j;
import com.jnet.globalclasses.Reports;

import com.jnet.objectrepository.AppConsole_Locators.BasicSettings;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AddCategoryList extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public AddCategoryList(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @Test(groups = "FunctionalTesting")
    public void AddCategoryList() {
        Log4j.startLog("AddCategoryList Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));

            // Fetch the test data from "AdminPortalTestData" excel sheet.
            List<Map<String, String>>getexceldata  = ExcelClass.readDataFromExcelWithMultipleRows("AdminPortalTestData", "AddCategoryList");


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
            setStatusToTestSteps(BasicSettings.PRODUCT_MENU_LINK, "Contact_Info", ++row, "Able to click on Product Menu link.");
            // To click on "Product Menu" menu link.
            clickElement(BasicSettings.PRODUCT_MENU_LINK);


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.ADD_CATEGORY, "Contact_Info", ++row, "Able to click on Add Category.");
            // To click on "Add Category" button.
            clickElement(BasicSettings.ADD_CATEGORY);

            Thread.sleep(5000);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.MENU_DETAILS_TAB, "Contact_Info", ++row, "Able to click on Add Category.");
            // To click on "Add Category" button.
            clickElement(BasicSettings.MENU_DETAILS_TAB);
            Thread.sleep(2000);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CATEGORY_NAME, "Contact_Info", ++row, "Able to enter Password.");
            // To enter "Password".
         //   enterText(BasicSettings.CATEGORY_NAME, getexceldata.get("Category_Item_Name"));
            enterText(BasicSettings.CATEGORY_NAME, getexceldata.get(Integer.parseInt("Category_Item_Name")).toString());

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CATEGORY_DISPLAY_INDEX, "Contact_Info", ++row, "Able to enter Password.");
            // To enter "Password".
           // enterText(BasicSettings.CATEGORY_DISPLAY_INDEX, getexceldata.get("Display_Index"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.CATEGORY_DESCRIPTION, "Contact_Info", ++row, "Able to enter Password.");
            // To enter "Password".
         //   enterText(BasicSettings.CATEGORY_DESCRIPTION, getexceldata.get("Display_Description"));


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.IS_FOOD_AT_WORK_MENU_GROUP_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.IS_FOOD_AT_WORK_MENU_GROUP_CURRENT_STATUS, BasicSettings.IS_FOOD_AT_WORK_MENU_GROUP_TOGGLE_BAR, prop.getProperty("IS_FOOD_AT_WORK_MENU_GROUP"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.IS_GENERAL_MENU_GROUP_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.IS_GENERAL_MENU_GROUP_CURRENT_STATUS, BasicSettings.IS_GENERAL_MENU_GROUP_TOGGLE_BAR, prop.getProperty("IS_GENERAL_MENU_GROUP"));


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.IS_FREE_SAMPLE_GROUP_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.IS_FREE_SAMPLE_GROUP_CURRENT_STATUS, BasicSettings.IS_FREE_SAMPLE_GROUP_TOGGLE_BAR, prop.getProperty("IS_FREE_SAMPLE_GROUP"));

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.IS_ACTIVE_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.IS_ACTIVE_CURRENT_STATUS, BasicSettings.IS_ACTIVE_TOGGLE_BAR, prop.getProperty("IS_ACTIVE"));


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.AVAILABLE_TIMINGS_TAB, "Contact_Info", ++row, "Able to click on Add Category.");
            // To click on "Add Category" button.
            clickElement(BasicSettings.AVAILABLE_TIMINGS_TAB);
            Thread.sleep(5000);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.SUNDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.SUNDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.SUNDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("SUNDAY_AVAILABLE_TIMINGS"));

            if (prop.getProperty("SUNDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.SUNDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.SUNDAY_START_TIME, prop.getProperty("SUNDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.SUNDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.SUNDAY_END_TIME, prop.getProperty("SUNDAY_END_TIME"));

            }

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.MONDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.MONDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.MONDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("MONDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("MONDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.MONDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.MONDAY_START_TIME, prop.getProperty("MONDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.MONDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.MONDAY_END_TIME, prop.getProperty("MONDAY_END_TIME"));

            }


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.TUESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.TUESDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.TUESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("TUESDAY_AVAILABLE_TIMINGS"));
            System.out.println("sdsd: " + prop.getProperty("TUESDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("TUESDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.TUESDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.TUESDAY_START_TIME, prop.getProperty("TUESDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.TUESDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.TUESDAY_END_TIME, prop.getProperty("TUESDAY_END_TIME"));

            }


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.WEDNESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.WEDNESDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.WEDNESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("WEDNESDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("WEDNESDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.WEDNESDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.WEDNESDAY_START_TIME, prop.getProperty("WEDNESDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.WEDNESDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.WEDNESDAY_END_TIME, prop.getProperty("WEDNESDAY_END_TIME"));

            }


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.THURSDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.THURSDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.THURSDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("THURSDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("THURSDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.THURSDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.THURSDAY_START_TIME, prop.getProperty("THURSDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.THURSDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.THURSDAY_END_TIME, prop.getProperty("THURSDAY_END_TIME"));

            }


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.FRIDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.FRIDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.FRIDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("FRIDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("FRIDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.FRIDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.FRIDAY_START_TIME, prop.getProperty("FRIDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.FRIDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.FRIDAY_END_TIME, prop.getProperty("FRIDAY_END_TIME"));

            }


            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.SATURDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, "General_Settings", ++row, "Able to click on toggle button to ON/OFF.");
            // To click on "Dine-In" toggle button.
            toogleButton(BasicSettings.SATURDAY_AVAILABLE_TIMINGS_CURRENT_STATUS, BasicSettings.SATURDAY_AVAILABLE_TIMINGS_TOGGLE_BAR, prop.getProperty("SATURDAY_AVAILABLE_TIMINGS"));
            if (prop.getProperty("SATURDAY_AVAILABLE_TIMINGS").equals("Y")) {

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.SATURDAY_START_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.SATURDAY_START_TIME, prop.getProperty("SATURDAY_START_TIME"));

                // Step to validate and update test step status on "Contact_Info" excel sheet.
                setStatusToTestSteps(BasicSettings.SATURDAY_END_TIME, "Contact_Info", ++row, "Able to enter Password.");
                // To enter "Password".
                enterText(BasicSettings.SATURDAY_END_TIME, prop.getProperty("SATURDAY_END_TIME"));

            }


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

