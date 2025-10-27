package com.aiTDD.tests;

import com.aiTDD.pages.CartPage;
import com.aiTDD.utils.TestDataProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Cart feature
 * Requirements covered: REQ-CART-001
 */
public class CartTest extends BaseTest {
    private CartPage cartPage;

    @BeforeEach
    public void setupTest() {
        cartPage = new CartPage(driver);
        String url = TestDataProvider.getData("base.url") + "/products";
        driver.get(url);
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testAddSingleProduct() {
        // TC-CART-001: Verify adding a single product
        logTestCase("REQ-CART-001", "TC-CART-001");

        int initialCount = cartPage.getCartCount();
        cartPage.addProductToCart("product1");

        assertEquals(initialCount + 1, cartPage.getCartCount());
        assertTrue(cartPage.isProductInCart(TestDataProvider.getData("product.name")));
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testAddMultipleProducts() {
        // TC-CART-002: Verify adding multiple products
        logTestCase("REQ-CART-001", "TC-CART-002");

        int initialCount = cartPage.getCartCount();
        cartPage.addProductToCart("product1");
        cartPage.addProductToCart("product2");

        assertEquals(initialCount + 2, cartPage.getCartCount());
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testCartCounter() {
        // TC-CART-003: Verify cart counter increments correctly
        logTestCase("REQ-CART-001", "TC-CART-003");

        int initialCount = cartPage.getCartCount();
        cartPage.addProductToCart("product1");
        assertEquals(initialCount + 1, cartPage.getCartCount());

        cartPage.addProductToCart("product2");
        assertEquals(initialCount + 2, cartPage.getCartCount());
    }
}