package com.aiTDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Cart feature
 * Requirement ID: REQ-CART-001
 */
public class CartPage extends BasePage {
    // TODO: Replace locators when UI is ready
    private static final By ADD_TO_CART_BUTTON = By.cssSelector("#TODO-add-to-cart");
    private static final By CART_COUNTER = By.id("#TODO-cart-counter");
    private static final By CART_ITEMS = By.cssSelector("#TODO-cart-items");
    private static final By CHECKOUT_BUTTON = By.id("#TODO-checkout-button");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(String productId) {
        // TODO: Implement product selection logic
        click(ADD_TO_CART_BUTTON);
    }

    public int getCartCount() {
        String count = getText(CART_COUNTER);
        return Integer.parseInt(count);
    }

    public boolean isProductInCart(String productName) {
        // TODO: Implement product verification logic
        return isDisplayed(CART_ITEMS);
    }

    public void proceedToCheckout() {
        click(CHECKOUT_BUTTON);
    }
}