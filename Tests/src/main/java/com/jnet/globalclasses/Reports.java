package com.jnet.globalclasses;
/**
 * Contains methods to Store the results of testcases along with screenshots in Extent Reports.
 * And having methods to send Email with Body along with Extent Report as Attachment.
 *
 * @authors Revanth Kumar K, Yashwanth K
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Reports extends BrowserActions {

    WebDriver driver;
    ExtentHtmlReporterSingleton extentHtmlReporterSingleton = new ExtentHtmlReporterSingleton();
    Properties propertiesCode = propertiesCode();


    public Reports(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static String getTimeStamp() {
        String pattern = "yyyyMMddHHmmss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }

    public ExtentReports addTestStep() {
        ExtentHtmlReporter htmlreporter = ExtentHtmlReporterSingleton.getExtentHtmlReporter();
        ExtentReports extentreports = ExtentReportsSingleton.getExtentReports();
        extentreports.attachReporter(htmlreporter);
        return extentreports;
    }

    //Method used to take screenshots
    public String getSceenShot(String testcasename) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dr = new File("");
        String screenShotName = dr.getAbsolutePath() + "\\" + "Screenshots" + "\\" + testcasename + ".png";
        FileHandler.copy(src, new File(screenShotName));
        return screenShotName;
    }

    //This method will Record the passed execution into ExtentReport
    public void addPassTestStep(String testCaseName, String testDescription, String actualResults, String screenShotName) throws IOException, InterruptedException {

        Log4j.info("Recording the passed execution into ExtentReport");
        ExtentReports extentReports = addTestStep();
        ExtentTest extentReportsTest = extentReports.createTest(testCaseName, testDescription);
        extentReportsTest.pass(actualResults, MediaEntityBuilder.createScreenCaptureFromPath(getSceenShot(screenShotName), testCaseName).build());
        extentReports.flush();
    }

    //This method will Record the Failed Execution into ExtentReport
    public void addFailTestStep(String testCaseName, String testDescription, String actualResults, String screenShotName) throws IOException {
        Log4j.info("Recording the Failed Execution into ExtentReport");
        ExtentReports extentReports = addTestStep();
        ExtentTest extentReportsTest = extentReports.createTest(testCaseName, testDescription);
        extentReportsTest.fail(actualResults, MediaEntityBuilder.createScreenCaptureFromPath(getSceenShot(screenShotName)).build());
        extentReports.flush();
    }

    //Method used to Generate Email after completion of Execution
    public void mailGeneration(final String sendfrom, String sendto, String sendcc, String Subject, final String Password) {

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "mail.jnettechnologies.com");

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "25");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sendfrom, Password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendfrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sendto));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(sendcc));
            message.setSubject(Subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attached RestroZap_Automation_Report.");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//            DataSource source = new FileDataSource(extentHtmlReporterSingleton.pathLocation);
            DataSource source = new FileDataSource(extentHtmlReporterSingleton.emailablePath);
            messageBodyPart2.setDataHandler(new DataHandler(source));
//            messageBodyPart2.setFileName(extentHtmlReporterSingleton.pathLocation);
            messageBodyPart2.setFileName("RestroZap_Automation_Report.zip");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(messageBodyPart2);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("EmailSent");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
