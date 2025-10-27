package com.aiTDD.tests;

import com.aiTDD.pages.CartPage;
import com.aiTDD.pages.CheckoutPage;
import com.aiTDD.utils.TestDataProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Checkout feature
 * Requirements covered: REQ-CHECKOUT-001
 */
public class CheckoutTest extends BaseTest {
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @BeforeEach
    public void setupTest() {
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        String url = TestDataProvider.getData("base.url") + "/cart";
        driver.get(url);
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testValidCheckout() {
        // TC-CHECKOUT-001: Verify checkout with valid details
        logTestCase("REQ-CHECKOUT-001", "TC-CHECKOUT-001");

        // Add a product to cart first
        cartPage.addProductToCart("product1");
        cartPage.proceedToCheckout();

        // Fill checkout form
        checkoutPage.enterName(TestDataProvider.getData("checkout.name"));
        checkoutPage.enterEmail(TestDataProvider.getData("checkout.email"));
        checkoutPage.enterAddress(TestDataProvider.getData("checkout.address"));
        checkoutPage.submitCheckout();

        assertTrue(checkoutPage.isConfirmationDisplayed());
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testEmptyCartCheckout() {
        // TC-CHECKOUT-002: Verify error for empty cart checkout
        logTestCase("REQ-CHECKOUT-001", "TC-CHECKOUT-002");

        cartPage.proceedToCheckout();
        assertTrue(checkoutPage.isEmptyCartErrorDisplayed());
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testConfirmationMessage() {
        // TC-CHECKOUT-003: Verify confirmation message appears
        logTestCase("REQ-CHECKOUT-001", "TC-CHECKOUT-003");

        // Add a product and checkout
        cartPage.addProductToCart("product1");
        cartPage.proceedToCheckout();

        checkoutPage.enterName(TestDataProvider.getData("checkout.name"));
        checkoutPage.enterEmail(TestDataProvider.getData("checkout.email"));
        checkoutPage.enterAddress(TestDataProvider.getData("checkout.address"));
        checkoutPage.submitCheckout();

        String confirmationMessage = checkoutPage.getConfirmationMessage();
        assertNotNull(confirmationMessage);
        assertTrue(confirmationMessage.contains("Thank you for your order"));
    }
}