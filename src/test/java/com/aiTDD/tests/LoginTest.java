package com.aiTDD.tests;

import com.aiTDD.pages.LoginPage;
import com.aiTDD.utils.TestDataProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Login feature
 * Requirements covered: REQ-LOGIN-001
 */
public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeEach
    public void setupTest() {
        loginPage = new LoginPage(driver);
        String url = TestDataProvider.getData("base.url") + "/login";
        driver.get(url);
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testValidLogin() {
        // TC-LOGIN-001: Verify login with valid credentials
        logTestCase("REQ-LOGIN-001", "TC-LOGIN-001");

        loginPage.login(
                TestDataProvider.getData("valid.username"),
                TestDataProvider.getData("valid.password"));

        // TODO: Add dashboard verification
        assertTrue(driver.getCurrentUrl().contains("/dashboard"));
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testInvalidLogin() {
        // TC-LOGIN-002: Verify login with invalid credentials
        logTestCase("REQ-LOGIN-001", "TC-LOGIN-002");

        loginPage.login(
                TestDataProvider.getData("invalid.username"),
                TestDataProvider.getData("invalid.password"));

        assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Test
    @Disabled("Application not deployed - TDD Phase")
    public void testLoginErrorMessage() {
        // TC-LOGIN-003: Verify error message appears on failed login
        logTestCase("REQ-LOGIN-001", "TC-LOGIN-003");

        loginPage.login(
                TestDataProvider.getData("invalid.username"),
                TestDataProvider.getData("invalid.password"));

        String errorMessage = loginPage.getErrorMessage();
        assertNotNull(errorMessage);
        assertFalse(errorMessage.isEmpty());
    }
}