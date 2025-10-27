package com.aiTDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Login feature
 * Requirement ID: REQ-LOGIN-001
 */
public class LoginPage extends BasePage {
    // TODO: Replace locators when UI is ready
    private static final By USERNAME_INPUT = By.id("#TODO-username");
    private static final By PASSWORD_INPUT = By.id("#TODO-password");
    private static final By LOGIN_BUTTON = By.id("#TODO-login-button");
    private static final By ERROR_MESSAGE = By.id("#TODO-error-message");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        type(USERNAME_INPUT, username);
    }

    public void enterPassword(String password) {
        type(PASSWORD_INPUT, password);
    }

    public void clickLogin() {
        click(LOGIN_BUTTON);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public boolean isErrorMessageDisplayed() {
        return isDisplayed(ERROR_MESSAGE);
    }

    public String getErrorMessage() {
        return getText(ERROR_MESSAGE);
    }
}