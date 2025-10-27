package com.aiTDD.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Provider class for test data and configuration
 */
public class TestDataProvider {
    private static final Logger logger = LoggerFactory.getLogger(TestDataProvider.class);
    private static final Properties properties = new Properties();
    private static final String CONFIG_PATH = "src/test/resources/config.properties";

    static {
        try {
            FileInputStream fis = new FileInputStream(CONFIG_PATH);
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            logger.error("Failed to load config.properties", e);
        }
    }

    public static String getData(String key) {
        return properties.getProperty(key);
    }
}