package com.jnet.CustomerPortal;

import com.jnet.globalclasses.BrowserActions;
import com.jnet.globalclasses.ExcelClass;
import com.jnet.globalclasses.Log4j;
import com.jnet.globalclasses.Reports;


import com.jnet.objectrepository.CustomerPortal_Locators.CustomerPortal_Locators;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Customer_PlaceOrder extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public Customer_PlaceOrder(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    // public static String CWONumber;

    @Test(groups = "FunctionalTesting")
    public void Customer_PlaceOrder() {
        Log4j.startLog("Customer_PlaceOrder Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();
            // Launch the application
            getURL(prop.getProperty("CustomerPortal"));

            // Fetch the test data from "CustomerPortal_TestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("CustomerPortalTestData", "Customer");

            // Waiting for the element to perform action.
            waitforelementtobeclick(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, 5000);
            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, "OrderPlaceByCustomer", row, "RestroZap application home page is displayed.");

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_ICON, "OrderPlaceByCustomer", ++row, "Able to click on Sign-In Icon.");
            // To perform click action on "Sign-In" icon.
            clickElement(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_ICON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Sign-In button.");
            // To perform click action on "Sign-In" button.
            clickElement(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.SIGN_IN_USERNAME, "OrderPlaceByCustomer", ++row, "Able to enter username.");
            // To enter Username information.
            enterText(CustomerPortal_Locators.SIGN_IN_USERNAME, getexceldata.get("Username"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.SIGN_IN_PASSWORD, "OrderPlaceByGuset", ++row, "Able to enter password.");
            // To enter Password information.
            enterText(CustomerPortal_Locators.SIGN_IN_PASSWORD, getexceldata.get("Password"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.SIGN_IN_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Sign-In button.");
            // To perform click action on "Sign-In" button.
            clickElement(CustomerPortal_Locators.SIGN_IN_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Order Now button and displaying List of Menu items.");
            // To perform click action on "Order Now" button.
            clickElement(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON);


            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.MENU_LIST_LINK1, "OrderPlaceByCustomer", ++row, "Able to click on Menu Item link and displaying items.");
            // To perform click action on "Menu Item" button.
            clickElement(CustomerPortal_Locators.MENU_LIST_LINK1);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.MENU_LIST_ITEM1_ADD_TO_CART_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Add to Cart button and displaying Popup with item details.");
            // To perform click action on "Add to Cart" button.
            clickElement(CustomerPortal_Locators.MENU_LIST_ITEM1_ADD_TO_CART_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.ADD_TO_CART_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Add to Cart button and the item is adding to the Cart list.");
            // To perform click action on "Add to Cart" button.
            clickElement(CustomerPortal_Locators.ADD_TO_CART_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_CART_ICON, "OrderPlaceByCustomer", ++row, "Able to click on Cart Icon and displaying added items with Checkout button.");
            // To perform click action on "Cart" Icon.
            clickElement(CustomerPortal_Locators.HOMEPAGE_CART_ICON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_CART_CHECKOUT_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Checkout button and navigates to Checkout screen.");
            // To perform click action on "Checkout" button.
            clickElement(CustomerPortal_Locators.HOMEPAGE_CART_CHECKOUT_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_RADIO_OPTION, "OrderPlaceByCustomer", ++row, "Able to select Pickup radio option.");
            // To perform click action on "PickUp" radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_RADIO_OPTION);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN, "OrderPlaceByCustomer", ++row, "Able to click on Pickup dropdown list.");
            // To perform click action on "PickUp Time" dropdown list.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_ASAP_VALUE, "OrderPlaceByCustomer", ++row, "Able to select the Pickup time from dropdown list.");
            // To  select "PickUp Time" value from dropdown list.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_ASAP_VALUE);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_RADIO_OPTION, "OrderPlaceByCustomer", ++row, "Able to select the Card payment type radio option.");
            // To perform click action on "Card" Payment Type radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_RADIO_OPTION);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_NAME_ON_CARD_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Name on Card information.");
            // To enter Name on Card information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_NAME_ON_CARD_TEXT_BOX, getexceldata.get("Name"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_NUMBER_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Card Number information.");
            // To enter Card Number information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_NUMBER_TEXT_BOX, getexceldata.get("CardNumber"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_EXPIRY_DATE_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Card Expiry date information.");
            // To enter Card Expiry Date information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_EXPIRY_DATE_TEXT_BOX, getexceldata.get("CardExpiryDate"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_CVV_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Card CVV Number information.");
            // To enter Card CVV information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_CVV_TEXT_BOX, getexceldata.get("CardCVV"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_ZIPCODE_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Billing Zipcode information.");
            // To enter Billing Zipcode information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_ZIPCODE_TEXT_BOX, getexceldata.get("BillingZipCode"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_ADD_TIP_BUTTON, "OrderPlaceByCustomer", ++row, "Able to add Tip.");
            // To perform click action on "Add Tip" Type radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_ADD_TIP_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_SPECIAL_INSTRUCTIONS_TEXT_BOX, "OrderPlaceByCustomer", ++row, "Able to enter Special Instructions information.");
            // To enter Special Instructions information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_SPECIAL_INSTRUCTIONS_TEXT_BOX, getexceldata.get("SpecialInstructions"));

            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PLACE_YOUR_ORDER_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Place Your Order button.");
            // To perform click action on "Place Your Order" button.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PLACE_YOUR_ORDER_BUTTON);
            Thread.sleep(10000);
            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_ICON, "OrderPlaceByCustomer", ++row, "Able to click on Sign-In Icon.");
            // To perform click action on "Sign-In" icon.
            clickElement(CustomerPortal_Locators.HOMEPAGE_SIGN_IN_ICON);
            Thread.sleep(10000);
            // Step to validate and update test step status on "OrderPlaceByCustomer" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.SIGN_OUT_BUTTON, "OrderPlaceByCustomer", ++row, "Able to click on Sign-Out button.");
            // To perform click action on "Sign-Out" button.
            clickElement(CustomerPortal_Locators.SIGN_OUT_BUTTON);

            reports.addPassTestStep("Order place by customer user account functionality.", "Verify Order place by customer user account functionality.", "Order place by customer user account functionality is Success.", testcasename());

        } catch (Exception exception1) {
            exception1.printStackTrace();
        Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("Order place by customer user account functionality.", "Verify Order place by customer user account functionality.", "Order place by customer user account functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
           Log4j.fatal(exception2.getMessage());
            }
        }
    }
}
