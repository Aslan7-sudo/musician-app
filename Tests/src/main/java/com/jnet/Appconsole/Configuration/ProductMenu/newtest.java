package com.jnet.Appconsole.Configuration.ProductMenu;

import com.jnet.globalclasses.BrowserActions;
import com.jnet.globalclasses.ExcelClass;
import com.jnet.globalclasses.Log4j;
import com.jnet.globalclasses.Reports;

import com.jnet.objectrepository.AppConsole_Locators.BasicSettings;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class newtest extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public newtest(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @DataProvider
    public static Object[][] ReadVarient() throws IOException {
        File dr = new File("");

        final String location = dr.getAbsolutePath() + "\\" + "Resources" + "\\" + "test.xlsx";

        FileInputStream fileInputStream = new FileInputStream(location);

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet worksheet = workbook.getSheet("test");
        HSSFRow Row = worksheet.getRow(0);
        int RowNum = worksheet.getPhysicalNumberOfRows();
        int ColNum = Row.getLastCellNum();

        Object Data[][] = new Object[RowNum - 1][ColNum];

        for (int i = 0; i <= RowNum - 1; i++) {

            HSSFRow row = worksheet.getRow(i + 1);
            for (int j = 0; j <= ColNum; j++) {

                if (row == null)
                    Data[i][j] = "";
                else {
                    HSSFCell cell = row.getCell(j);
                    if (cell == null)
                        Data[i][j] = "";
                    else {
                        HSSFDataFormatter formatter = new HSSFDataFormatter();
                        String value = formatter.formatCellValue(cell);
                        Data[i][j] = value;

                    }
                }
            }

        }
        return Data;
    }
    @Test(groups = "FunctionalTesting")
    public void newtest() {
        Log4j.startLog("AddCategoryList Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();

            // Launch the application
            getURL(prop.getProperty("AppConsole"));


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
    @Test(groups = "FunctionalTesting",dataProvider = "ReadVarient")
    public void newtest1(String uname,String pwd) {
        Log4j.startLog("AddCategoryList Class");
        Reports reports = new Reports(driver);

        try {


            // Waiting for the element to perform action.
            waitforelementtobeclick(BasicSettings.LOGIN, 5000);
            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.LOGIN, "Contact_Info", row, "RestroZap AppConsole application home page is displayed.");

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.USERNAME, "Contact_Info", ++row, "Able to enter username.");
            // To enter "Username".
            enterText(BasicSettings.USERNAME, uname);

            // Step to validate and update test step status on "Contact_Info" excel sheet.
            setStatusToTestSteps(BasicSettings.PASSWORD, "Contact_Info", ++row, "Able to enter Password.");
            // To enter "Password".
            enterText(BasicSettings.PASSWORD, pwd);

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

