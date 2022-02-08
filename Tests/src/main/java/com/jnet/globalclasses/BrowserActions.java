package com.jnet.globalclasses;

/**
 * Contains methods to perform all types of browser actions.
 * This class is extended to all classes present int the test scripts package.
 * For this class the driver instance is passed from the classes present in the Test Scripts Package.
 *
 * @createddate 02-10-2020
 * @authors Revanth Kumar K, Yashwanth K
 */


import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserActions extends DatabseConnection {

    static String dateAndTime;
    WebDriver driver;
    Actions action;


    public BrowserActions(WebDriver driver) {

        this.driver = driver;
    }

    //This method will be used to store the Actual Results and Test Status into the Excel
    public static void setDataToExcel(String testDataExcel, String SheetName, int RowNumber, int CellNumber, String CellValue) {
        ExcelClass.testDataStoring(testDataExcel, SheetName, RowNumber, CellNumber, CellValue);
        Log4j.info("Updated PASS Status to the test steps in Excel");
    }



    //This Method is used to get the data from the Config Properties
    public Properties propertiesCode() {

        File file = new File("");
        final String configFileLocation = file.getAbsolutePath() + "\\config.properties";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(configFileLocation);
        } catch (FileNotFoundException fileNotFoundException) {
            Log4j.info("Properties file was not present in the above mentioned Location.");
        }
        Properties properties = new Properties();
        try {
            properties.load(fileInputStream);
        } catch (
                IOException i) {
            Log4j.info("Unable to Load the properties File.");
        }
        return properties;
    }

    //This method will return the WebDriver Instance
    public WebDriver getWebDriver() {
        return driver;
    }

    // This method will return the Actions Class Instance
    public Actions getActions() {
        action = new Actions(driver);
        return action;
    }

    //This method will be used to upload file into the Application
    public void uploadFile(By element, String data) {

        Log4j.info("Element found and uploading data into the Element : " + element);

        // Step to enter data to the field.
        driver.findElement(element).sendKeys(data);
    }

    //This method will be used to click on the Element
    public void clickElement(By element) throws InterruptedException {

        if (driver.findElement(element).isDisplayed()) {

            WebElement webElement = driver.findElement(element);
            // Step to click on field.
            webElement.click();
            Log4j.info("Element found and performed action on : " + element);
        } else {
            Log4j.info("Waiting for the element : " + element);
//            WebDriverWait wait = new WebDriverWait(driver, 20);
//            WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable((element)));
            Thread.sleep(5000);
            WebElement webElement = driver.findElement(element);
            // Step to click on field.
            webElement.click();
            Log4j.info("Element found and performed action on : " + element);
        }

    }

    //This method will be used to enter text into the Application
    public void enterText(By element, String data) throws InterruptedException {
        if (driver.findElement(element).isDisplayed()) {
            // Step to clear existing field value.
            WebElement webElement = driver.findElement(element);
            // Step to clear existing field value.
            webElement.clear();
            // Step to move cursor to starting position of text fields.
            webElement.sendKeys(Keys.BACK_SPACE);
            // Step to enter data to the field.
            webElement.sendKeys(data);
            Log4j.info("Element found and entered data to : " + element);
        } else {
            Log4j.info("Waiting for the element : " + element);

            Thread.sleep(5000);
            // Step to clear existing field value.
            WebElement webElement = driver.findElement(element);
            // Step to clear existing field value.
            webElement.clear();
            // Step to move cursor to starting position of text fields.
            webElement.sendKeys(Keys.BACK_SPACE);
            // Step to enter data to the field.
            webElement.sendKeys(data);
            Log4j.info("Element found and entered data to : " + element);

        }
    }

    //This method will be used to click on the Element
    public void isSelectedToBeClickElement(By element) {
        System.out.println("in to isSelectedToBeClickElement: " + element);
        if (driver.findElement(element).isDisplayed()) {
            WebElement checkbox = driver.findElement(element);
            System.out.println("element found: " + element);
            if (!checkbox.isSelected()) {
                System.out.println("element not check mode : " + element);
                Log4j.info("Element found and performing click action on : " + element);
                checkbox.click();
            }

        }
    }

    //This method will be used to doubleclick on the Element
    public void doubleClick(By element) {
        if (driver.findElement(element).isDisplayed()) {
            Log4j.info("Element found and performing double click action on : " + element);
            Actions action = new Actions(driver);
            WebElement link = driver.findElement(element);
            action.doubleClick(link).perform();
        } else {
            Log4j.info("Waiting for the element to be perform double click action on : " + element);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            if (driver.findElement(element).isDisplayed()) {
                Log4j.info("Element found and performing double click action on : " + element);
                Actions action = new Actions(driver);
                WebElement link = driver.findElement(element);
                action.doubleClick(link).perform();
            } else {
                Log4j.info("No such element exist ! " + element);
            }
        }
    }

    //This method will be used to navigate to the URL
    public void getURL(String url) {
        Log4j.info("Launching the browser and Opening URL : " + url);

        driver.get(url);
        driver.navigate().refresh();
    }

    //Explicit Wait Method
    public void waitforelementtobeclick(By element, int time) {
        Log4j.info("Waiting for the specified Element : " + element);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Log4j.info("Element Found to perform action.");
    }

    //This method will Create a Log4j Backup & ExtentHTMLReport Folder with Date And Time
    public void createLog4jFolderWithDateAndTime() {
        File file = new File("");
        dateAndTime = getDateWithTime();
        File file1 = new File(file.getAbsolutePath() + "\\" + "Log4jBackup" + "\\" + dateAndTime);
        file1.mkdir();
    }

    //This method will Create a Log4j Backup & ExtentHTMLReport Folder with Date And Time
    public void createExtentHTMLReportFolderWithDateAndTime() {
        File file = new File("");
        dateAndTime = getDateWithTime();
        File file1 = new File(file.getAbsolutePath() + "\\" + "ExtentHTMLReportBackup" + "\\" + dateAndTime);
        file1.mkdir();

    }

    //This method will copy Old Log4j File To Backup Folder
    public void copyOldLog4jFileToBackupFolder() {
        File file = new File("");
        File Source = new File(file.getAbsolutePath() + "\\" + "Log4j" + "\\" + "log4j-application.log");
        File dest = new File(file.getAbsolutePath() + "\\" + "Log4jBackup" + "\\" + dateAndTime + "\\" + "log4j-application.log");
        try {
            FileUtils.copyFile(Source, dest);
        } catch (IOException ioException) {
            Log4j.info("Unable to Copy the Log file.");
            ioException.printStackTrace();
        }
    }

    //This method will copy Old ExtentHTMLReport File To Backup Folder
    public void copyOldExtentHTMLReportToBackupFolder() {
        File file = new File("");
        File Source = new File(file.getAbsolutePath() + "\\" + "ExtentHTMLReport" + "\\" + "RestroZap_Automation_Report.html");
        File dest = new File(file.getAbsolutePath() + "\\" + "ExtentHTMLReportBackup" + "\\" + dateAndTime + "\\" + "RestroZap_Automation_Report.html");
        try {
            FileUtils.copyFile(Source, dest);
        } catch (IOException ioException) {
            Log4j.info("Unable to Copy the ExtentHTMLReport file.");
            ioException.printStackTrace();
        }
    }

    //This method will copy Old ExtentHTMLReport File To Backup Folder
    public void copyFinalReports() {
        File file = new File("");
        File SourceExtentHTMLReport = new File(System.getProperty("user.dir") + "//ExtentHTMLReport//");
        File SourceLog4j = new File(System.getProperty("user.dir") + "//Log4j//");
        File SourceScreenshots = new File(System.getProperty("user.dir") + "//Screenshots//");
        File SourceTestCaseExecutionDocuments = new File(System.getProperty("user.dir") + "//TestCaseExecutionDocuments//");

        File dest = new File(System.getProperty("user.dir") + "//FinalReports//");

        try {
            FileUtils.deleteDirectory(dest);
            System.out.println("Files deleted successfully.");
            FileUtils.copyDirectory(SourceExtentHTMLReport, dest);
            FileUtils.copyDirectory(SourceLog4j, dest);
            FileUtils.copyDirectory(SourceScreenshots, dest);
            FileUtils.copyDirectory(SourceTestCaseExecutionDocuments, dest);
        } catch (IOException ioException) {
            Log4j.info("Unable to Copy the ExtentHTMLReport file.");
            ioException.printStackTrace();
        }
    }

    //This method will return Date and Time
    public String getDateWithTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
    }

    //This method will return Date and Time
    public String DateWithTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyyHHmm");
        return sdf.format(new Date());
    }

    //This method will be used to handle the drop-downs
    public void dropdown(By element, String data) {
        Log4j.info("selecting the value from dropdown : " + element);
        Select webelement = new Select(driver.findElement(element));
        webelement.selectByVisibleText(data);
    }

    //This method used to get Text from the Application
    public String getText(By element) {
        if (driver.findElement(element).isDisplayed()) {
            WebElement webElement = driver.findElement(element);
            String text = webElement.getText().toString().toLowerCase();
            return text;

        } else {

            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable((element)));
            String text = webElement.getText().toString().toLowerCase();
            return text;

        }
    }

    //This method will be used to store the Actual Results and Test Status into the Excel
    public void setStatusToTestSteps(By locator, String stringToBeAsserted, String sheetName, int rowNumber, String
            ActualResults) {
        if (getText(locator).equalsIgnoreCase(stringToBeAsserted)) {
            ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults);
            ExcelClass.testStatusStoring(sheetName, rowNumber, "PASS");
            Log4j.info("Updated PASS Status to the test steps in Excel");
        } else {
            ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults + " is Failed");
            ExcelClass.testStatusStoring(sheetName, rowNumber, "FAIL");
            Log4j.info("Updated FAIL Status to the test steps in Excel");
        }
    }

    /*Overloaded the above method to accept the data without Assertion */
    public void setStatusToTestSteps(By locator, String sheetName, int rowNumber, String ActualResults) throws InterruptedException {
        if (driver.findElement(locator).isDisplayed()) {
            ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults);
            ExcelClass.testStatusStoring(sheetName, rowNumber, "PASS");
            Log4j.info("Updated PASS Status to the test steps in Excel");
        } else {
            Log4j.info("Waiting for the element to be perform click action on : " + locator);
            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable((locator)));
            if (driver.findElement(locator).isDisplayed()) {
                ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults);
                ExcelClass.testStatusStoring(sheetName, rowNumber, "PASS");
                Log4j.info("Updated PASS Status to the test steps in Excel");
            } else {
                ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults + " is Failed");
                ExcelClass.testStatusStoring(sheetName, rowNumber, "FAIL");
                Log4j.info("Updated FAIL Status to the test steps in Excel");
            }
        }
    }

    /*Overloaded the above method to accept the data without Assertion */
    public void setStatusToTestStepsToUpload(By locator, String sheetName, int rowNumber, String ActualResults) throws InterruptedException {

        ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults);
        ExcelClass.testStatusStoring(sheetName, rowNumber, "PASS");
        Log4j.info("Updated PASS Status to the test steps in Excel");

    }

    /*Overloaded the above method to accept the data without Assertion */
    public void setStatusToTestSteps(String appValue, String dbValue, String sheetName, int rowNumber, String
            ActualResults) {
        if (appValue.equalsIgnoreCase(dbValue)) {
            ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults);
            ExcelClass.testStatusStoring(sheetName, rowNumber, "PASS");
            Log4j.info("Updated PASS Status to the test steps in Excel");
        } else {
            ExcelClass.testActualResultsStoring(sheetName, rowNumber, ActualResults + " is Failed");
            ExcelClass.testStatusStoring(sheetName, rowNumber, "FAIL");
            Log4j.info("Updated FAIL Status to the test steps in Excel");
        }
    }

    //This method will Method used to create a WebElement Instance
    public WebElement getWebElement(By Locator) {
        return driver.findElement(Locator);
        //return driver.findElement(Locator).getAttribute("Value");
    }

    public void toogleButton(By CurrentStatusOfElement, By Locator, String ExpectedStatusOfElement) {
        boolean value = driver.findElement(CurrentStatusOfElement).isSelected();
        // If the toggle button default status is "ON".
        if (value != false) {
            // If the toggle button required to "OFF".
            if (Objects.equals(ExpectedStatusOfElement, "N")) {
                Log4j.info("Current mode of toggle button is ON & clicking on it to OFF.");
                driver.findElement(Locator).click();
            } else {
                Log4j.info("Current mode of toggle button is already with ON.");
            }
        }
        // If the toggle button default status is "OFF".
        else {
            // If the toggle button required to "ON".
            if (Objects.equals(ExpectedStatusOfElement, "Y")) {
                Log4j.info("Current mode of toggle button is OFF & clicking on it to ON.");
                driver.findElement(Locator).click();
            } else {
                Log4j.info("Current mode of toggle button is already with OFF.");
            }
        }
    }

    //This method will return the current class name.
    public String testcasename() {
        return this.getClass().getSimpleName().toString();

    }

    public JavascriptExecutor getJavaScriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    //getText from the SnackBar Confirmation dialogue box.
    public String getTextFromSnackBarAlertsWithJavaScript(By Element) {
        return (String) getJavaScriptExecutor().executeScript("return arguments[0].innerHTML;", getWebElement(Element));
    }

    //This method will remove the HTML tags from the SnackBar Alert
    public String getIDFromTheSnackBarAlert(String Message) {
        String withoutdoublequotes = Message.replace("\"", "");
        String[] x = withoutdoublequotes.split("&");
        String withoutHTMLCode = x[0];
        String[] workordernumber = withoutHTMLCode.split("#");
        return workordernumber[1].trim();
    }

    //This method will be used to click on Tab Key.
    public void keysTab(By element) {
        Log4j.info("Clicking the Tab Key " + "from " + element);
        driver.findElement(element).sendKeys(Keys.TAB);
    }

    //This method will be used to click on BackSpace Key.
    public void keysBackSpace(By element) {
        Log4j.info("Clicking the Tab Key " + "on " + element);
        driver.findElement(element).sendKeys(Keys.BACK_SPACE);
    }


    public String pageScrollWithJavaScript(By Element) {

        return (String) getJavaScriptExecutor().executeScript("return arguments[0].scrollIntoView();", getWebElement(Element));

    }

    public String pageScrollWithJavaScriptTop() {


        return (String) getJavaScriptExecutor().executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

}
