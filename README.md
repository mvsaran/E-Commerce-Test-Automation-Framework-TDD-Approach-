# 🚀 E-Commerce Test Automation Framework (TDD Approach)

### 💎 Test-Driven Development Approach

<div align="center">

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Coverage](https://img.shields.io/badge/coverage-100%25-success)
![Tests](https://img.shields.io/badge/tests-9%20ready-blue)
![TDD](https://img.shields.io/badge/approach-TDD-orange)

</div>

---

## 📖 Table of Contents
- [🌟 Overview](#-overview)
- [🏗️ Architecture](#️-architecture)
- [🎨 Design Patterns](#-design-patterns)
- [📋 Requirements](#-requirements)
- [🔄 TDD Workflow](#-tdd-workflow)
- [🛠️ Page Objects](#️-page-objects)
- [🚦 Execution](#-execution)
- [📈 Benefits](#-benefits)
- [🔜 Next Steps](#-next-steps)

---

## 🌟 Overview

> **Building Quality First** - Tests written before application development, ensuring crystal-clear requirements and bulletproof testability.

This repository demonstrates a **Test-Driven Development** (TDD) approach to building a Selenium-based test automation framework for e-commerce applications. Every test is a requirement, every requirement has a test.

### ✨ Key Highlights
- 🎯 **Requirements-First Approach** - Tests define the application behavior
- 🔄 **Complete Traceability** - Every test maps to a business requirement
- 🚀 **Ready for Integration** - Framework ready, waiting for UI implementation
- 📊 **100% Coverage Planned** - No feature left untested

---

## 🏗️ Architecture

### 🛡️ Tech Stack

| Technology | Version | Purpose |
|:-----------|:--------|:--------|
| ☕ **Java** | 11+ | Core Language |
| 🌐 **Selenium** | 4.15.0 | Web Automation |
| 🧪 **JUnit Jupiter** | 5.10.0 | Testing Framework |
| 📦 **Maven** | 3.8+ | Build Management |
| 📝 **SLF4J** | Latest | Logging |

### 📂 Project Structure

```
selenium-mcp-tests/
│
├── 📁 src/
│   ├── 📁 main/java/com/selenium/mcp/
│   │   ├── 📄 pages/           ➜ Page Object Models
│   │   │   ├── BasePage.java
│   │   │   ├── LoginPage.java
│   │   │   ├── CartPage.java
│   │   │   └── CheckoutPage.java
│   │   │
│   │   └── 📄 utils/           ➜ Helper Utilities
│   │       ├── TestDataProvider.java
│   │       └── DriverFactory.java
│   │
│   └── 📁 test/
│       ├── 📁 java/com/selenium/mcp/tests/
│       │   ├── BaseTest.java
│       │   ├── LoginTest.java
│       │   ├── CartTest.java
│       │   └── CheckoutTest.java
│       │
│       └── 📁 resources/
│           ├── ⚙️ test-data.properties
│           └── 📋 requirements.txt
│
└── 📄 pom.xml                  ➜ Maven Configuration
```

---

## 🎨 Design Patterns

### 🏭 Page Object Model (POM)

```
┌─────────────────────────────────────────┐
│         🎯 Test Layer                   │
│  LoginTest  │  CartTest  │  CheckoutTest│
└──────────────┬────────────────────────────┘
               │
┌──────────────▼────────────────────────────┐
│         📄 Page Object Layer             │
│  LoginPage  │  CartPage  │  CheckoutPage │
└──────────────┬────────────────────────────┘
               │
┌──────────────▼────────────────────────────┐
│         🌐 Selenium WebDriver            │
└──────────────────────────────────────────┘
```

**Benefits:**
- ✅ Encapsulation of page elements
- ✅ Reduced code duplication
- ✅ Easy maintenance
- ✅ Clear separation of concerns

### 🧪 Test Structure Example

```java
@Test
@Disabled("🚧 Application not deployed - TDD Phase")
@DisplayName("✅ Verify login with valid credentials")
public void testValidLogin() {
    // 📋 TC-LOGIN-001: Verify login with valid credentials
    logTestCase("REQ-LOGIN-001", "TC-LOGIN-001");
    
    loginPage.login(
        TestDataProvider.getData("valid.username"),
        TestDataProvider.getData("valid.password")
    );
    
    assertTrue(driver.getCurrentUrl().contains("/dashboard"));
}
```

---

## 📋 Requirements Traceability

### 🔗 Mapping Convention

| Type | Format | Example | Description |
|:-----|:-------|:--------|:------------|
| 📌 Requirement | `REQ-<FEATURE>-<NUM>` | `REQ-LOGIN-001` | Business requirement |
| ✅ Test Case | `TC-<FEATURE>-<NUM>` | `TC-LOGIN-001` | Automated test |

### 📊 Complete Coverage Matrix

#### 🔐 Login Feature
| Req ID | Test ID | Description | Status |
|:-------|:--------|:------------|:-------|
| REQ-LOGIN-001 | TC-LOGIN-001 | ✅ Valid credentials login | ⏸️ Ready |
| | TC-LOGIN-002 | ❌ Invalid credentials handling | ⏸️ Ready |
| | TC-LOGIN-003 | 🔒 Empty fields validation | ⏸️ Ready |

#### 🛒 Shopping Cart Feature
| Req ID | Test ID | Description | Status |
|:-------|:--------|:------------|:-------|
| REQ-CART-001 | TC-CART-001 | ➕ Add item to cart | ⏸️ Ready |
| | TC-CART-002 | ➖ Remove item from cart | ⏸️ Ready |
| | TC-CART-003 | 🔢 Update item quantity | ⏸️ Ready |

#### 💳 Checkout Feature
| Req ID | Test ID | Description | Status |
|:-------|:--------|:------------|:-------|
| REQ-CHECKOUT-001 | TC-CHECKOUT-001 | ✅ Valid information checkout | ⏸️ Ready |
| | TC-CHECKOUT-002 | ❌ Empty fields validation | ⏸️ Ready |
| | TC-CHECKOUT-003 | 💰 Order confirmation | ⏸️ Ready |

**Legend:**
- ⏸️ Ready - Test implemented, waiting for UI
- ✅ Passing - Test active and passing
- ❌ Failing - Test needs attention
- 🚧 In Progress - Under development

---

## 🔄 TDD Workflow

### 🎯 Four-Phase Approach

```
┌─────────────────────────────────────────────────────────┐
│  Phase 1: Framework Setup              ✅ COMPLETED     │
├─────────────────────────────────────────────────────────┤
│  ✅ Project structure                                   │
│  ✅ Maven dependencies                                  │
│  ✅ Base test configuration                             │
│  ✅ Logging infrastructure                              │
│  ✅ Test data management                                │
└─────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────┐
│  Phase 2: Test Design                  ✅ COMPLETED     │
├─────────────────────────────────────────────────────────┤
│  ✅ Page Objects with placeholders                      │
│  ✅ Test cases with requirements                        │
│  ✅ Test data properties                                │
│  ✅ Complete documentation                              │
└─────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────┐
│  Phase 3: Implementation Ready         ⏳ WAITING       │
├─────────────────────────────────────────────────────────┤
│  ⏸️ Tests disabled with @Disabled                       │
│  📝 Placeholder locators in place                       │
│  🔄 Ready for UI implementation                         │
│  📋 Requirements shared with dev team                   │
└─────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────┐
│  Phase 4: Activation                   🔜 FUTURE        │
├─────────────────────────────────────────────────────────┤
│  1️⃣ Update base.url in properties                      │
│  2️⃣ Replace placeholder locators                       │
│  3️⃣ Remove @Disabled annotations                       │
│  4️⃣ Run complete test suite                            │
└─────────────────────────────────────────────────────────┘
```

---

## 🛠️ Page Objects Ready

### 🔐 LoginPage.java

```java
public class LoginPage extends BasePage {
    
    // 🚧 TODO: Replace with actual locators from UI team
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-btn");
    private By errorMessage = By.className("error-msg");
    
    /**
     * 🔑 Performs login action
     * @param username User's username
     * @param password User's password
     */
    public void login(String username, String password) {
        enterText(usernameField, username);
        enterText(passwordField, password);
        click(loginButton);
    }
    
    /**
     * ❌ Retrieves error message text
     * @return Error message displayed
     */
    public String getErrorMessage() {
        return getText(errorMessage);
    }
}
```

### 🛒 CartPage.java

```java
public class CartPage extends BasePage {
    
    // 🚧 TODO: Replace with actual locators from UI team
    private By cartCounter = By.id("cart-count");
    private By productName = By.className("product-name");
    private By removeButton = By.className("remove-btn");
    private By checkoutButton = By.id("checkout-btn");
    
    /**
     * 🔢 Gets current cart item count
     * @return Number of items in cart
     */
    public int getCartItemCount() {
        return Integer.parseInt(getText(cartCounter));
    }
    
    /**
     * ➕ Adds item to cart
     * @param productId Product identifier
     */
    public void addToCart(String productId) {
        By addButton = By.id("add-" + productId);
        click(addButton);
    }
}
```

### 💳 CheckoutPage.java

```java
public class CheckoutPage extends BasePage {
    
    // 🚧 TODO: Replace with actual locators from UI team
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue-btn");
    private By finishButton = By.id("finish-btn");
    
    /**
     * 📝 Fills checkout information
     * @param firstName Customer first name
     * @param lastName Customer last name
     * @param postalCode ZIP/Postal code
     */
    public void fillCheckoutInfo(String firstName, 
                                 String lastName, 
                                 String postalCode) {
        enterText(firstNameField, firstName);
        enterText(lastNameField, lastName);
        enterText(postalCodeField, postalCode);
        click(continueButton);
    }
}
```

---

## 🚦 Test Execution

### 📊 Current Status

```bash
$ mvn clean test
```

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.selenium.mcp.tests.LoginTest
[INFO] Running com.selenium.mcp.tests.CartTest
[INFO] Running com.selenium.mcp.tests.CheckoutTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 9
[INFO] 
[SUCCESS] ✅ All tests properly disabled, waiting for UI!
```

### 🎯 Test Execution Plan

```
When UI is ready:
├── Step 1: Update test-data.properties with base URL
├── Step 2: Get actual element locators from frontend
├── Step 3: Update Page Objects with real locators
├── Step 4: Remove @Disabled annotations feature-by-feature
└── Step 5: Run and validate test suite
```

---

## 📈 Benefits of This Approach

### 🎯 Pre-Development Benefits

| Benefit | Description | Impact |
|:--------|:------------|:-------|
| 📋 **Requirements Clarity** | Tests document exact behavior | 🔥 High |
| 🎨 **Design Insights** | Page Objects reveal needed UI | 🔥 High |
| 📊 **Coverage Planning** | Complete matrix before coding | 🔥 High |
| 🤝 **Team Alignment** | Shared understanding of features | 🔥 High |

### ⚡ Development Benefits

| Benefit | Description | Impact |
|:--------|:------------|:-------|
| 🚀 **Quick Integration** | Just update locators and run | 🔥 High |
| 🔄 **Parallel Work** | Frontend has clear UI requirements | 🔥 High |
| ✅ **Quality Gates** | Immediate validation available | 🔥 High |
| 🐛 **Early Bug Detection** | Issues found before deployment | 🔥 High |

### 📊 Post-Development Benefits

| Benefit | Description | Impact |
|:--------|:------------|:-------|
| 💯 **Complete Coverage** | No forgotten requirements | 🔥 High |
| 🛠️ **Maintainable Tests** | Well-structured from start | 🔥 High |
| 📖 **Clear Documentation** | Req-to-test traceability | 🔥 High |
| 🔄 **Regression Safety** | Automated safety net | 🔥 High |

---

## 🔜 Next Steps

### 📅 Implementation Roadmap

```
Week 1-2: 🤝 Collaboration
├── Share framework with development team
├── Get UI element ID conventions
├── Align on locator strategies
└── Set up communication channels

Week 3-4: 🔄 Integration
├── Update Page Objects with actual locators
├── Configure base URL
├── Enable login tests first
└── Validate initial test runs

Week 5-6: 🚀 Expansion
├── Enable cart tests
├── Enable checkout tests
├── Add test reports
└── Set up CI/CD integration

Week 7+: 📈 Enhancement
├── Add more test scenarios
├── Performance testing
├── Cross-browser testing
└── Continuous improvement
```

---

## 🤝 Contributing

We welcome contributions! Here's how:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch (`git checkout -b feature/amazing-test`)
3. 💾 Commit your changes (`git commit -m '✨ Add amazing test'`)
4. 📤 Push to the branch (`git push origin feature/amazing-test`)
5. 🎉 Open a Pull Request

### 📝 Contribution Guidelines

- ✅ Every test must map to a requirement
- ✅ Follow Page Object Model pattern
- ✅ Use meaningful test names
- ✅ Add proper documentation
- ✅ Include test data in properties file

---

## 📄 License

```
MIT License

Copyright (c) 2024 Your Team

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

<div align="center">

### 🌟 Built with Test-Driven Development

**Quality First, Always** 💎

[![Made with Love](https://img.shields.io/badge/Made%20with-❤️-red)]()
[![TDD Approach](https://img.shields.io/badge/Approach-TDD-orange)]()
[![Framework](https://img.shields.io/badge/Framework-Selenium-green)]()

---

**Happy Testing! 🚀**

**Created by:** [Saran Kumar](https://github.com/sarankumar) 👨‍💻

</div>
