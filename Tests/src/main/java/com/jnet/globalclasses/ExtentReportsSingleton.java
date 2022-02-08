package com.jnet.globalclasses;

/**
 * Contains methods to implement singleton design pattern for Extent Reports Instance and this class will Initiate
 * a single Instance for all test case executions so that the results of each test test case will get consolidated
 * in single extent report.
 *
 * @authors Revanth Kumar K, Yashwanth K, Srinivas Chirra
 */

import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsSingleton {

	private static ExtentReports extentReportsSingleton;

	static {
		extentReportsSingleton = new ExtentReports();
	}

	public static ExtentReports getExtentReports() {
		if (extentReportsSingleton == null)
			extentReportsSingleton = new ExtentReports();
		return extentReportsSingleton;
	}
}
