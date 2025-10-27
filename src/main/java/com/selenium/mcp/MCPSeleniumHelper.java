package com.selenium.mcp;

public class MCPSeleniumHelper {
    public static void startBrowser(String browser) throws Exception {
        mcp_selenium_serv_start_browser(browser, null);
    }

    public static void navigate(String url) throws Exception {
        mcp_selenium_serv_navigate(url);
    }

    public static void clickElement(String by, String value) throws Exception {
        mcp_selenium_serv_click_element(by, value);
    }

    public static void sendKeys(String by, String value, String text) throws Exception {
        mcp_selenium_serv_send_keys(by, value, text);
    }

    public static void closeSession() throws Exception {
        mcp_selenium_serv_close_session();
    }

    // Declare the MCP Selenium server methods that we'll be using
    private static native void mcp_selenium_serv_start_browser(String browser, Object options) throws Exception;

    private static native void mcp_selenium_serv_navigate(String url) throws Exception;

    private static native void mcp_selenium_serv_click_element(String by, String value) throws Exception;

    private static native void mcp_selenium_serv_send_keys(String by, String value, String text) throws Exception;

    private static native void mcp_selenium_serv_close_session() throws Exception;
}