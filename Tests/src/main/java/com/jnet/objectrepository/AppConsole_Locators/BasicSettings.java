package com.jnet.objectrepository.AppConsole_Locators;

import org.openqa.selenium.By;

public class BasicSettings {
    public static By USERNAME = By.id("userName");
    public static By PASSWORD = By.id("password");
    public static By LOGIN = By.xpath("/html/body/main/div[1]/div/div/div/div/div/form/div/div[4]/input");
    public static By CONFIGURATION_MENU_LINK = By.id("configurationDropdown");
    public static By BASIC_SETTINGS_MENU_LINK = By.xpath("/html/body/navbar/ul/li[5]/ul/li[2]/a/span");
    public static By PRODUCT_MENU_LINK = By.xpath("/html/body/navbar/ul/li[5]/ul/li[6]/a/span");
    public static By ADD_CATEGORY = By.xpath("/html/body/main/section/div[1]/div/div/div[1]/div[1]/div[2]/button");

    public static By MENU_DETAILS_TAB = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/ul/li[1]/button");
    public static By CATEGORY_NAME=By.id("Name");
    public static By CATEGORY_DISPLAY_INDEX=By.id("DisplayIndex");
    public static By CATEGORY_DESCRIPTION=By.id("Description");

    public static By IS_FOOD_AT_WORK_MENU_GROUP_CURRENT_STATUS = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[1]/div/div[5]/label/input");
    public static By IS_FOOD_AT_WORK_MENU_GROUP_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[1]/div/div[5]/label/span");
    public static By IS_GENERAL_MENU_GROUP_CURRENT_STATUS= By.id("chkIsGeneralGroup");
    public static By IS_GENERAL_MENU_GROUP_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[1]/div/div[6]/label/span");
    public static By IS_FREE_SAMPLE_GROUP_CURRENT_STATUS = By.id("chkIsFreeSampleGroup");
    public static By IS_FREE_SAMPLE_GROUP_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[1]/div/div[7]/label/span");
    public static By IS_ACTIVE_CURRENT_STATUS = By.id("chkIsMenuGroupActive");
    public static By IS_ACTIVE_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[1]/div/div[8]/label/span");

    public static By CUSTOM_FIELDS_TAB=By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/ul/li[1]/button");
    public static By AVAILABLE_TIMINGS_TAB=By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/ul/li[3]/button");

    public static By SUNDAY_AVAILABLE_TIMINGS_CURRENT_STATUS = By.id("group-1");
    public static By SUNDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[1]/td[3]/label/span");
    public static By SUNDAY_START_TIME = By.id("startTime-1");
    public static By SUNDAY_END_TIME = By.id("endTime-1");

    public static By MONDAY_AVAILABLE_TIMINGS_CURRENT_STATUS = By.id("group-2");
    public static By MONDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[2]/td[3]/label/span");
    public static By MONDAY_START_TIME = By.id("startTime-2");
    public static By MONDAY_END_TIME = By.id("endTime-2");

    public static By TUESDAY_AVAILABLE_TIMINGS_CURRENT_STATUS =  By.id("group-3");
    public static By TUESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[3]/td[3]/label/span");
    public static By TUESDAY_START_TIME = By.id("startTime-3");
    public static By TUESDAY_END_TIME = By.id("endTime-3");

    public static By WEDNESDAY_AVAILABLE_TIMINGS_CURRENT_STATUS =  By.id("group-4");
    public static By WEDNESDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[4]/td[3]/label/span");
    public static By WEDNESDAY_START_TIME = By.id("startTime-4");
    public static By WEDNESDAY_END_TIME = By.id("endTime-4");

    public static By THURSDAY_AVAILABLE_TIMINGS_CURRENT_STATUS =  By.id("group-5");
    public static By THURSDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[5]/td[3]/label/span");
    public static By THURSDAY_START_TIME = By.id("startTime-5");
    public static By THURSDAY_END_TIME = By.id("endTime-5");

    public static By FRIDAY_AVAILABLE_TIMINGS_CURRENT_STATUS =  By.id("group-6");
    public static By FRIDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[6]/td[3]/label/span");
    public static By FRIDAY_START_TIME = By.id("startTime-6");
    public static By FRIDAY_END_TIME = By.id("endTime-6");

    public static By SATURDAY_AVAILABLE_TIMINGS_CURRENT_STATUS =  By.id("group-7");
    public static By SATURDAY_AVAILABLE_TIMINGS_TOGGLE_BAR = By.xpath("/html/body/main/section/div[2]/div/div/div[2]/form/div/div[3]/div/div/div/table/tbody/tr[7]/td[3]/label/span");
    public static By SATURDAY_START_TIME = By.id("startTime-7");
    public static By SATURDAY_END_TIME = By.id("endTime-7");

    public static By GENERAL_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[1]/div");

    public static By FUNCTIONALITY_RULES_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[2]");
    public static By RECEIVED_ORDERS_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[3]");
    public static By CONTACT_INFO_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[4]");
    public static By OPENING_TIMINGS_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[5]");
    public static By PREPARATION_TIMINGS_LINK = By.xpath("/html/body/main/section/form/div/div[1]/ul/li[6]");

    public static By RESTAURANT_NAME = By.id("shopName");
    public static By ADMIN_EMAIL = By.id("emailAddress");
    public static By COUNTRY_CODE = By.id("dialInCode");
    public static By ADMIN_PHONE = By.id("phoneNumber");
    public static By PAYMENT_GATEWAY_ERRORS_EMAIL = By.id("communicationEmail");

    public static By DISPLAY_USER_ICON_IN_ONLINE_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[1]/div[2]/div[7]/label/span");
    public static By DISPLAY_CART_ICON_IN_ONLINE_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[1]/div[2]/div[8]/label/span");

    public static By TAX_PERCENTAGE = By.id("tax");
    public static By ADDITIONAL_TAX_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[1]/div[2]/div[12]/label/span");
    public static By ADDITIONAL_TAX_LABEL = By.id("labelForAdditionalTax");
    public static By ADDITIONAL_TAX_FEE = By.id("additionalTaxFee");
    public static By TAX_TYPE_PERCENTAGE = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/input");
    public static By TAX_TYPE_FLAT = By.id("flat");
    public static By HOME_PAGE_PROMOTIONS_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[1]/div[2]/div[15]/label/span");

    public static By START_DATE = By.id("General.PromotionStartDate");
    public static By END_DATE = By.id("General.PromotionEndDate");

    public static By SUNDAY_OT1_START_TIME = By.name("1.S1");
    public static By SUNDAY_OT1_END_TIME = By.name("1.E1");
    public static By SUNDAY_OT2_START_TIME = By.name("1.S2");
    public static By SUNDAY_OT2_END_TIME = By.name("1.E2");

    public static By MONDAY_OT1_START_TIME = By.name("2.S1");
    public static By MONDAY_OT1_END_TIME = By.name("2.E1");
    public static By MONDAY_OT2_START_TIME = By.name("2.S2");
    public static By MONDAY_OT2_END_TIME = By.name("2.E2");

    public static By TUESDAY_OT1_START_TIME = By.name("3.S1");
    public static By TUESDAY_OT1_END_TIME = By.name("3.E1");
    public static By TUESDAY_OT2_START_TIME = By.name("3.S2");
    public static By TUESDAY_OT2_END_TIME = By.name("3.E2");

    public static By WEDNESDAY_OT1_START_TIME = By.name("4.S1");
    public static By WEDNESDAY_OT1_END_TIME = By.name("4.E1");
    public static By WEDNESDAY_OT2_START_TIME = By.name("4.S2");
    public static By WEDNESDAY_OT2_END_TIME = By.name("4.E2");

    public static By THURSDAY_OT1_START_TIME = By.name("5.S1");
    public static By THURSDAY_OT1_END_TIME = By.name("5.E1");
    public static By THURSDAY_OT2_START_TIME = By.name("5.S2");
    public static By THURSDAY_OT2_END_TIME = By.name("5.E2");

    public static By FRIDAY_OT1_START_TIME = By.name("6.S1");
    public static By FRIDAY_OT1_END_TIME = By.name("6.E1");
    public static By FRIDAY_OT2_START_TIME = By.name("6.S2");
    public static By FRIDAY_OT2_END_TIME = By.name("6.E2");

    public static By SATURDAY_OT1_START_TIME = By.name("7.S1");
    public static By SATURDAY_OT1_END_TIME = By.name("7.E1");
    public static By SATURDAY_OT2_START_TIME = By.name("7.S2");
    public static By SATURDAY_OT2_END_TIME = By.name("7.E2");

    public static By ADDRESS_LINE1 = By.id("addressLine1");
    public static By ADDRESS_LINE2 = By.id("addressLine2");
    public static By CITY_TOWN = By.id("city");
    public static By STATE_CODE = By.id("stateCode");
    public static By STATE_NAME = By.id("stateName");
    public static By COUNTRY = By.id("country");
    public static By ZIP_POSTAL_CODE = By.name("StoreContactInfo.ZIPCode");
    public static By PHONE_NUMBER = By.id("contactPhoneNumber");
    public static By EMAIL = By.id("contactEmail");
    public static By LOCATION_URL = By.id("locationMapURL");
    public static By FACEBOOK = By.id("facebook");
    public static By INSTAGRAM = By.id("instagram");
    public static By TWITTER = By.id("twitter");
    public static By GOOGLEPLUS = By.id("googlePlus");


    public static By MONDAY_GRID = By.id("headingMonday");
    public static By MONDAY_SLAB1_NAME = By.id("DeliveryTimings_Monday_0__Name");
    public static By MONDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Monday_0__MinimummAmount");
    public static By MONDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Monday_0__MaximumAmount");
    public static By MONDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Monday_0__DeliveryTime");
    public static By MONDAY_SLAB2_NAME = By.id("DeliveryTimings_Monday_1__Name");
    public static By MONDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Monday_1__MinimummAmount");
    public static By MONDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Monday_1__MaximumAmount");
    public static By MONDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Monday_1__DeliveryTime");
    public static By MONDAY_SLAB3_NAME = By.id("DeliveryTimings_Monday_2__Name");
    public static By MONDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Monday_2__MinimummAmount");
    public static By MONDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Monday_2__MaximumAmount");
    public static By MONDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Monday_2__DeliveryTime");
    public static By MONDAY_SLAB4_NAME = By.id("DeliveryTimings_Monday_3__Name");
    public static By MONDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Monday_3__MinimummAmount");
    public static By MONDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Monday_3__MaximumAmount");
    public static By MONDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Monday_3__DeliveryTime");

    public static By TUESDAY_GRID = By.id("headingTuesday");

    public static By TUESDAY_SLAB1_NAME = By.id("DeliveryTimings_Tuesday_0__Name");
    public static By TUESDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_0__MinimummAmount");
    public static By TUESDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_0__MaximumAmount");
    public static By TUESDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Tuesday_0__DeliveryTime");
    public static By TUESDAY_SLAB2_NAME = By.id("DeliveryTimings_Tuesday_1__Name");
    public static By TUESDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_1__MinimummAmount");
    public static By TUESDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_1__MaximumAmount");
    public static By TUESDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Tuesday_1__DeliveryTime");
    public static By TUESDAY_SLAB3_NAME = By.id("DeliveryTimings_Tuesday_2__Name");
    public static By TUESDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_2__MinimummAmount");
    public static By TUESDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_2__MaximumAmount");
    public static By TUESDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Tuesday_2__DeliveryTime");
    public static By TUESDAY_SLAB4_NAME = By.id("DeliveryTimings_Tuesday_3__Name");
    public static By TUESDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_3__MinimummAmount");
    public static By TUESDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Tuesday_3__MaximumAmount");
    public static By TUESDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Tuesday_3__DeliveryTime");

    public static By WEDNESDAY_GRID = By.id("headingWednesday");
    public static By WEDNESDAY_SLAB1_NAME = By.id("DeliveryTimings_Wednesday_0__Name");
    public static By WEDNESDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_0__MinimummAmount");
    public static By WEDNESDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_0__MaximumAmount");
    public static By WEDNESDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Wednesday_0__DeliveryTime");
    public static By WEDNESDAY_SLAB2_NAME = By.id("DeliveryTimings_Wednesday_1__Name");
    public static By WEDNESDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_1__MinimummAmount");
    public static By WEDNESDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_1__MaximumAmount");
    public static By WEDNESDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Wednesday_1__DeliveryTime");
    public static By WEDNESDAY_SLAB3_NAME = By.id("DeliveryTimings_Wednesday_2__Name");
    public static By WEDNESDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_2__MinimummAmount");
    public static By WEDNESDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_2__MaximumAmount");
    public static By WEDNESDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Wednesday_2__DeliveryTime");
    public static By WEDNESDAY_SLAB4_NAME = By.id("DeliveryTimings_Wednesday_3__Name");
    public static By WEDNESDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_3__MinimummAmount");
    public static By WEDNESDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Wednesday_3__MaximumAmount");
    public static By WEDNESDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Wednesday_3__DeliveryTime");


    public static By THURSDAY_GRID = By.id("headingThursday");
    public static By THURSDAY_SLAB1_NAME = By.id("DeliveryTimings_Thursday_0__Name");
    public static By THURSDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_0__MinimummAmount");
    public static By THURSDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_0__MaximumAmount");
    public static By THURSDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Thursday_0__DeliveryTime");
    public static By THURSDAY_SLAB2_NAME  = By.id("DeliveryTimings_Thursday_1__Name");
    public static By THURSDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_1__MinimummAmount");
    public static By THURSDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_1__MaximumAmount");
    public static By THURSDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Thursday_1__DeliveryTime");
    public static By THURSDAY_SLAB3_NAME  = By.id("DeliveryTimings_Thursday_2__Name");
    public static By THURSDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_2__MinimummAmount");
    public static By THURSDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_2__MaximumAmount");
    public static By THURSDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Thursday_2__DeliveryTime");
    public static By THURSDAY_SLAB4_NAME  = By.id("DeliveryTimings_Thursday_3__Name");
    public static By THURSDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_3__MinimummAmount");
    public static By THURSDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Thursday_3__MaximumAmount");
    public static By THURSDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Thursday_3__DeliveryTime");


    public static By FRIDAY_GRID = By.id("headingFriday");
    public static By FRIDAY_SLAB1_NAME  = By.id("DeliveryTimings_Friday_0__Name");
    public static By FRIDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Friday_0__MinimummAmount");
    public static By FRIDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Friday_0__MaximumAmount");
    public static By FRIDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Friday_0__DeliveryTime");
    public static By FRIDAY_SLAB2_NAME  = By.id("DeliveryTimings_Friday_1__Name");
    public static By FRIDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Friday_1__MinimummAmount");
    public static By FRIDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Friday_1__MaximumAmount");
    public static By FRIDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Friday_1__DeliveryTime");
    public static By FRIDAY_SLAB3_NAME  = By.id("DeliveryTimings_Friday_2__Name");
    public static By FRIDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Friday_2__MinimummAmount");
    public static By FRIDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Friday_2__MaximumAmount");
    public static By FRIDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Friday_2__DeliveryTime");
    public static By FRIDAY_SLAB4_NAME  = By.id("DeliveryTimings_Friday_3__Name");
    public static By FRIDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Friday_3__MinimummAmount");
    public static By FRIDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Friday_3__MaximumAmount");
    public static By FRIDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Friday_3__DeliveryTime");

    public static By SATURDAY_GRID = By.id("headingSaturday");
    public static By SATURDAY_SLAB1_NAME  = By.id("DeliveryTimings_Saturday_0__Name");
    public static By SATURDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_0__MinimummAmount");
    public static By SATURDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_0__MaximumAmount");
    public static By SATURDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Saturday_0__DeliveryTime");
    public static By SATURDAY_SLAB2_NAME  = By.id("DeliveryTimings_Saturday_1__Name");
    public static By SATURDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_1__MinimummAmount");
    public static By SATURDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_1__MaximumAmount");
    public static By SATURDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Saturday_1__DeliveryTime");
    public static By SATURDAY_SLAB3_NAME  = By.id("DeliveryTimings_Saturday_2__Name");
    public static By SATURDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_2__MinimummAmount");
    public static By SATURDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_2__MaximumAmount");
    public static By SATURDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Saturday_2__DeliveryTime");
    public static By SATURDAY_SLAB4_NAME  = By.id("DeliveryTimings_Saturday_3__Name");
    public static By SATURDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_3__MinimummAmount");
    public static By SATURDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Saturday_3__MaximumAmount");
    public static By SATURDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Saturday_3__DeliveryTime");

    public static By SUNDAY_GRID = By.id("headingSunday");
    public static By SUNDAY_SLAB1_NAME  = By.id("DeliveryTimings_Sunday_0__Name");
    public static By SUNDAY_SLAB1_MINIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_0__MinimummAmount");
    public static By SUNDAY_SLAB1_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_0__MaximumAmount");
    public static By SUNDAY_SLAB1_DELIVERY_TIME = By.id("DeliveryTimings_Sunday_0__DeliveryTime");
    public static By SUNDAY_SLAB2_NAME  = By.id("DeliveryTimings_Sunday_1__Name");
    public static By SUNDAY_SLAB2_MINIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_1__MinimummAmount");
    public static By SUNDAY_SLAB2_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_1__MaximumAmount");
    public static By SUNDAY_SLAB2_DELIVERY_TIME = By.id("DeliveryTimings_Sunday_1__DeliveryTime");
    public static By SUNDAY_SLAB3_NAME  = By.id("DeliveryTimings_Sunday_2__Name");
    public static By SUNDAY_SLAB3_MINIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_2__MinimummAmount");
    public static By SUNDAY_SLAB3_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_2__MaximumAmount");
    public static By SUNDAY_SLAB3_DELIVERY_TIME = By.id("DeliveryTimings_Sunday_2__DeliveryTime");
    public static By SUNDAY_SLAB4_NAME  = By.id("DeliveryTimings_Sunday_3__Name");
    public static By SUNDAY_SLAB4_MINIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_3__MinimummAmount");
    public static By SUNDAY_SLAB4_MAXIMUM_AMOUNT = By.id("DeliveryTimings_Sunday_3__MaximumAmount");
    public static By SUNDAY_SLAB4_DELIVERY_TIME = By.id("DeliveryTimings_Sunday_3__DeliveryTime");

    public static By DINE_IN_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[2]/label/span");
    public static By ALLOW_LAST_MINUTE_ORDERS_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[3]/label/span");
    public static By DISPLAY_SPECIAL_INSTRUCTIONS_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[4]/label/span");
    public static By COUPONS_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[5]/label/span");
    public static By DISCOUNT_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[6]/label/span");
    public static By TIP_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[7]/label/span");
    public static By FOOD_AT_WORK_MENU_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[8]/label/span");
    public static By FUTURE_ORDERS_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[9]/label/span");

    public static By STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR_CURRENT_STATUS = By.id("chkStopAccept");
    public static By STOP_ACCEPTING_ORDERS_TEMPORARILY_TOGGLE_BAR = By.xpath("/html/body/main/section/form/div/div[2]/div[1]/div[2]/div[2]/div[11]/label/span");



    public static By SAVE_BUTTON = By.xpath("/html/body/main/section/form/div/div[2]/div[2]/div/button");
    public static By OK_BUTTON = By.xpath("/html/body/div[6]/div[7]/button");
    public static By CANCEL_BUTTON = By.xpath("/html/body/div[6]/div[7]/div/button");
    public static By USER_ICON = By.id("changePasswordDropdown");
    public static By LOGOUT_MENU_OPTION = By.xpath("//a[contains(text(),'Logout')]");
}
