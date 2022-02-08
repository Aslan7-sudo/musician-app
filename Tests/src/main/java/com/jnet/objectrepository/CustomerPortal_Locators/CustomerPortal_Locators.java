package com.jnet.objectrepository.CustomerPortal_Locators;

import org.openqa.selenium.By;

public class CustomerPortal_Locators {

    // Home screen locators
    public static By HOMEPAGE_ORDER_NOW_BUTTON = By.xpath("/html/body/div[1]/div[2]/div/div/div/a");


    public static By HOMEPAGE_SIGN_IN_ICON = By.id("navbarDropdownMenuLink-55");
    public static By HOMEPAGE_SIGN_IN_BUTTON = By.id("loginCaller");
    public static By SIGN_IN_USERNAME = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div[1]/form/div[2]/div/div[1]/input");
    public static By SIGN_IN_PASSWORD = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div[1]/form/div[2]/div/div[2]/input");
    public static By SIGN_IN_BUTTON = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div[4]/button[2]");

    public static By HOMEPAGE_MENU_ICON = By.xpath("/html/body/nav/a[1]/span[1]");
    public static By HOMEPAGE_HOME_BUTTON = By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[1]/a");
    public static By HOMEPAGE_MENU_BUTTON = By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a");
    public static By HOMEPAGE_ABOUT_US_BUTTON = By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[3]/a");
    public static By HOMEPAGE_CONTACT_US_BUTTON = By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[4]/a");
    public static By HOMEPAGE_BOOKING_BUTTON = By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[5]/a");

    public static By MENU_LIST_LINK1 = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[2]/ul/li[1]/a");
    public static By MENU_LIST_LINK2 = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[2]/ul/li[2]/a");
    public static By MENU_LIST_LINK3 = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[2]/ul/li[3]/a");

    public static By MENU_LIST_ITEM1_ADD_TO_CART_BUTTON = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[7]/div/div/div[1]/div/div/div[3]/button");
    public static By MENU_LIST_ITEM2_ADD_TO_CART_BUTTON = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[7]/div/div/div[2]/div/div/div[3]/button");

    public static By ADD_TO_CART_BUTTON = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[7]/div/div/div[1]/div/div/div[4]/div/div/div[3]/button");

    public static By HOMEPAGE_CART_ICON = By.id("menu-toggle");
    public static By HOMEPAGE_CART_CHECKOUT_BUTTON = By.id("btnCartPanelCheckout");

    public static By CHECKOUT_PAGE_NAME_TEXT_BOX = By.id("CustomerName");
    public static By CHECKOUT_PAGE_EMAIL_TEXT_BOX = By.id("Email");
    public static By CHECKOUT_PAGE_MOBILE_TEXT_BOX = By.id("Phone");

    public static By CHECKOUT_PAGE_PICKUP_RADIO_OPTION = By.id("in-delivery-type-6");
    public static By CHECKOUT_PAGE_DINE_IN_RADIO_OPTION = By.id("in-delivery-type-8");
    public static By CHECKOUT_PAGE_DELIVERY_RADIO_OPTION = By.id("in-delivery-type-7");

    public static By CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN = By.id("in-delivery-type");
    public static By CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_ASAP_VALUE = By.xpath("/html/body/div[1]/form/div/div[1]/div[1]/div[2]/div[6]/div[1]/select/option[1]");
    public static By CHECKOUT_PAGE_PICKUP_TIME_DROPDOWN_TODAY_VALUE = By.xpath("/html/body/div[1]/form/div/div[1]/div[1]/div[2]/div[6]/div[1]/select/option[2]");

    public static By CHECKOUT_PAGE_CARD_PAYMENT_RADIO_OPTION = By.id("card");
    public static By CHECKOUT_PAGE_CASH_PAYMENT_RADIO_OPTION = By.id("cash");

    public static By CHECKOUT_PAGE_CARD_PAYMENT_NAME_ON_CARD_TEXT_BOX = By.id("inputNameOnCard");
    public static By CHECKOUT_PAGE_CARD_PAYMENT_CARD_NUMBER_TEXT_BOX = By.id("CardDetails_CardNumber");
    public static By CHECKOUT_PAGE_CARD_PAYMENT_CARD_EXPIRY_DATE_TEXT_BOX = By.id("CardDetails_ExpiryDate");
    public static By CHECKOUT_PAGE_CARD_PAYMENT_CARD_CVV_TEXT_BOX = By.id("CardDetails_CVV");
    public static By CHECKOUT_PAGE_CARD_PAYMENT_CARD_ZIPCODE_TEXT_BOX = By.id("CardDetails_ZipCode");

    public static By CHECKOUT_PAGE_ADD_TIP_BUTTON = By.xpath("/html/body/div[1]/form/div/div[1]/div[1]/div[2]/div[11]/label[1]");
    public static By CHECKOUT_PAGE_NO_TIP_BUTTON = By.id("option4");

    public static By CHECKOUT_PAGE_SPECIAL_INSTRUCTIONS_TEXT_BOX = By.id("OrderNotes");

    public static By CHECKOUT_PAGE_PLACE_YOUR_ORDER_BUTTON = By.xpath("/html/body/div[1]/form/div/div[1]/div[1]/div[2]/div[16]/button");

    public static By SIGN_OUT_BUTTON = By.xpath("/html/body/nav/ul/li/div/ul/li[5]/a");

}
