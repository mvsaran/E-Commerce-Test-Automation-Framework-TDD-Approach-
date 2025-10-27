package com.aiTDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Checkout feature
 * Requirement ID: REQ-CHECKOUT-001
 */
public class CheckoutPage extends BasePage {
    // TODO: Replace locators when UI is ready
    private static final By NAME_INPUT = By.id("#TODO-name");
    private static final By EMAIL_INPUT = By.id("#TODO-email");
    private static final By ADDRESS_INPUT = By.id("#TODO-address");
    private static final By SUBMIT_BUTTON = By.id("#TODO-submit");
    private static final By CONFIRMATION_MESSAGE = By.id("#TODO-confirmation");
    private static final By EMPTY_CART_ERROR = By.id("#TODO-empty-cart-error");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        type(NAME_INPUT, name);
    }

    public void enterEmail(String email) {
        type(EMAIL_INPUT, email);
    }

    public void enterAddress(String address) {
        type(ADDRESS_INPUT, address);
    }

    public void submitCheckout() {
        click(SUBMIT_BUTTON);
    }

    public boolean isConfirmationDisplayed() {
        return isDisplayed(CONFIRMATION_MESSAGE);
    }

    public boolean isEmptyCartErrorDisplayed() {
        return isDisplayed(EMPTY_CART_ERROR);
    }

    public String getConfirmationMessage() {
        return getText(CONFIRMATION_MESSAGE);
    }
}