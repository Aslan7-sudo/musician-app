package com.jnet.globalclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * This is Base Class Extended by the Classes Present in Execution Package to Launch Browsers and
 * pass the driver instance initiated in this class to other classes.
 * Contains methods to launch browser based upon the parameter in Lambada test Platform and in Local System.
 *
 * @createddate 02-15-2020
 * @authors Revanth Kumar K, Yashwanth K
 */

public class BaseClass {


    private String username = "sateesh.kothapalli";
    private String accesskey = "ilX3r1tJ37cgZQsL1xQUlRDXDflpGKlSSqOoIlF5prG4ubH9g8";

    private String gridURL = "@hub.lambdatest.com/wd/hub";
    private WebDriver driver;
    //private ChromeOptions option;

    public WebDriver LamadaTestCapabilities(String browser, String version, String platform) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("version", version);
        capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        try {
            this.driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return driver;


    }

    public WebDriver launchBrowser(String browser) {

        switch (browser) {
            case "chrome":
                Log4j.info("Launching Chrome Browser");
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                break;

            case "mozilla":
                Log4j.info("Launching Firefox Browser");
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
                break;

            case "ie":
                Log4j.info("Launching IE Browser");
                WebDriverManager.iedriver().setup();
                this.driver = new InternetExplorerDriver();
                break;

            case "headless":
                Log4j.info("Launching Headless Browser");
                WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();
                option.setHeadless(true);
                this.driver = new ChromeDriver(option);
                break;

            default:
             Log4j.fatal(browser+" is not a valid browser name.");
            Log4j.fatal("Required to provide chrome, mozilla, ie or headless...");
        }


        return driver;
    }


}


