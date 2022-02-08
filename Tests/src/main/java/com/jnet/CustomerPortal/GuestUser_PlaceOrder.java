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

public class GuestUser_PlaceOrder extends BrowserActions {

    private static int row = 1;
    WebDriver driver;


    public GuestUser_PlaceOrder(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    // public static String CWONumber;

    @Test(groups = "FunctionalTesting")
    public void GuestUser_PlaceOrder() {
        Log4j.startLog("GuestUser_PlaceOrder Class");
        Reports reports = new Reports(driver);

        try {
            Properties prop = propertiesCode();
            // Launch the application
            getURL(prop.getProperty("CustomerPortal"));

            // Fetch the test data from "CustomerPortal_TestData" excel sheet.
            Map<String, String> getexceldata = ExcelClass.readDataFromExcel("CustomerPortalTestData", "Guest");

            // Waiting for the element to perform action.
            waitforelementtobeclick(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, 5000);
            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, "OrderPlaceByGuset", row, "RestroZap application home page is displayed.");

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON, "OrderPlaceByGuset", ++row, "Able to click on Order Now button and displaying List of Menu items.");
            // To perform click action on "Order Now" button.
            clickElement(CustomerPortal_Locators.HOMEPAGE_ORDER_NOW_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.MENU_LIST_LINK1, "OrderPlaceByGuset", ++row, "Able to click on Menu Item link and displaying items.");
            // To perform click action on "Menu Item" button.
            clickElement(CustomerPortal_Locators.MENU_LIST_LINK1);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.MENU_LIST_ITEM1_ADD_TO_CART_BUTTON, "OrderPlaceByGuset", ++row, "Able to click on Add to Cart button and displaying Popup with item details.");
            // To perform click action on "Add to Cart" button.
            clickElement(CustomerPortal_Locators.MENU_LIST_ITEM1_ADD_TO_CART_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.ADD_TO_CART_BUTTON, "OrderPlaceByGuset", ++row, "Able to click on Add to Cart button and the item is adding to the Cart list.");
            // To perform click action on "Add to Cart" button.
            clickElement(CustomerPortal_Locators.ADD_TO_CART_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_CART_ICON, "OrderPlaceByGuset", ++row, "Able to click on Cart Icon and displaying added items with Checkout button.");
            // To perform click action on "Cart" Icon.
            clickElement(CustomerPortal_Locators.HOMEPAGE_CART_ICON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.HOMEPAGE_CART_CHECKOUT_BUTTON, "OrderPlaceByGuset", ++row, "Able to click on Checkout button and navigates to Checkout screen.");
            // To perform click action on "Checkout" button.
            clickElement(CustomerPortal_Locators.HOMEPAGE_CART_CHECKOUT_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_NAME_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Customer name.");
            // To enter Customer name information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_NAME_TEXT_BOX, getexceldata.get("Name"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_EMAIL_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Email Address.");
            // To enter Email Address information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_EMAIL_TEXT_BOX, getexceldata.get("Email"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_MOBILE_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Mobile Number.");
            // To enter Mobile Number information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_MOBILE_TEXT_BOX, getexceldata.get("Mobile"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_RADIO_OPTION, "OrderPlaceByGuset", ++row, "Able to select Pickup radio option.");
            // To perform click action on "PickUp" radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_RADIO_OPTION);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN, "OrderPlaceByGuset", ++row, "Able to click on Pickup dropdown list.");
            // To perform click action on "PickUp Time" dropdown list.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_ASAP_VALUE, "OrderPlaceByGuset", ++row, "Able to select the Pickup time from dropdown list.");
            // To  select "PickUp Time" value from dropdown list.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_ASAP_VALUE);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_RADIO_OPTION, "OrderPlaceByGuset", ++row, "Able to select the Card payment type radio option.");
            // To perform click action on "Card" Payment Type radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_RADIO_OPTION);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_NAME_ON_CARD_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Name on Card information.");
            // To enter Name on Card information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_NAME_ON_CARD_TEXT_BOX, getexceldata.get("Name"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_NUMBER_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Card Number information.");
            // To enter Card Number information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_NUMBER_TEXT_BOX, getexceldata.get("CardNumber"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_EXPIRY_DATE_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Card Expiry date information.");
            // To enter Card Expiry Date information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_EXPIRY_DATE_TEXT_BOX, getexceldata.get("CardExpiryDate"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_CVV_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Card CVV Number information.");
            // To enter Card CVV information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_CVV_TEXT_BOX, getexceldata.get("CardCVV"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_ZIPCODE_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Billing Zipcode information.");
            // To enter Billing Zipcode information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_CARD_PAYMENT_CARD_ZIPCODE_TEXT_BOX, getexceldata.get("BillingZipCode"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_ADD_TIP_BUTTON, "OrderPlaceByGuset", ++row, "Able to add Tip.");
            // To perform click action on "Add Tip" Type radio option.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_ADD_TIP_BUTTON);

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_SPECIAL_INSTRUCTIONS_TEXT_BOX, "OrderPlaceByGuset", ++row, "Able to enter Special Instructions information.");
            // To enter Special Instructions information.
            enterText(CustomerPortal_Locators.CHECKOUT_PAGE_SPECIAL_INSTRUCTIONS_TEXT_BOX, getexceldata.get("SpecialInstructions"));

            // Step to validate and update test step status on "OrderPlaceByGuset" excel sheet.
            setStatusToTestSteps(CustomerPortal_Locators.CHECKOUT_PAGE_PLACE_YOUR_ORDER_BUTTON, "OrderPlaceByGuset", ++row, "Able to click on Place Your Order button.");
            // To perform click action on "Place Your Order" button.
            clickElement(CustomerPortal_Locators.CHECKOUT_PAGE_PLACE_YOUR_ORDER_BUTTON);
            Thread.sleep(10000);
            reports.addPassTestStep("Order place by guest user account functionality.", "Verify Order place by guest user account functionality.", "Order place by guest user account functionality is Success.", testcasename());
            Thread.sleep(10000);
        } catch (Exception exception1) {
            exception1.printStackTrace();
       Log4j.fatal(exception1.getMessage());
            try {
                reports.addFailTestStep("Order place by guest user account functionality.", "Verify Order place by guest user account functionality.", "Order place by guest user account functionality is failed.", testcasename());

            } catch (IOException exception2) {
                exception2.printStackTrace();
             Log4j.fatal(exception2.getMessage());
            }
        }
    }
}
