package com.jnet.globalclasses;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * Contains methods to store the Extent Reports in Jnet shared Path with the namein format of YYYYMMDDHHMMSS.html.
 *
 * @createddate 02-26-2020
 * @authors Revanth Kumar K, Yashwanth K
 */

public class ExtentHtmlReporterSingleton {

    static String pathLocation;
    static String emailablePath;
    static String dateAndTime;
    private static ExtentHtmlReporter extentHtmlReporterSingleton;

    static {

        File dr = new File("");
        dateAndTime = getDateWithTime();

        pathLocation = dr.getAbsolutePath() + "\\" + "ExtentHTMLReport" + "\\" + "RestroZap_Automation_Report.html";
        emailablePath = dr.getAbsolutePath() + "\\" + "RestroZap_Automation_Report.zip";
        extentHtmlReporterSingleton = new ExtentHtmlReporter(pathLocation);
    }

    public static String getDate() {
        String pattern = "yyyyMMddHHmmss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String date = dateFormat.format(new Date());
        return date;
    }

    //This method will return Date and Time
    public static String getDateWithTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
    }

    public static ExtentHtmlReporter getExtentHtmlReporter() {
        return extentHtmlReporterSingleton;
    }

}
