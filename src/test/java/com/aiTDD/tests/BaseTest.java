package com.aiTDD.tests;

import com.aiTDD.utils.ConfigReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for all test classes
 */
public class BaseTest {
    protected WebDriver driver;
    protected static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeEach
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Log test start
        String testName = this.getClass().getSimpleName();
        logger.info("Starting test: {}", testName);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Helper method to log requirement and test case IDs
     */
    protected void logTestCase(String reqId, String testCaseId) {
        logger.info("Executing test case: {} for requirement: {}", testCaseId, reqId);
    }
}