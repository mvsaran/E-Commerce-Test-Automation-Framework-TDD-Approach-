#🤖 E-Commerce Test Automation Framework (AI-Augmented TDD)

## 🎯 Overview
This repository demonstrates an AI-Augmented Test-Driven Development (TDD) approach to building a Selenium test automation framework. By combining TDD principles with AI assistance, we create a robust test framework **before** application development begins.

## 🤖 AI-Augmented Development Process

### 1️⃣ Requirements Definition
We start with a structured `requirements.txt` file that follows this format:
```markdown
# 🧩 Project Title

## 🎯 Objective
Clear project goals and scope

## 🧱 Requirement → Test Mapping Convention
| Type | Format | Description |
|------|---------|-------------|
| Requirement ID | REQ-<FEATURE>-<NUMBER> | Unique ID per requirement |
| Test Case ID | TC-<FEATURE>-<NUMBER> | Test mapped to requirement |

## 🔍 Feature Details
### Requirement ID: REQ-FEATURE-001
Feature description

### Acceptance Criteria
- Criterion 1
- Criterion 2

### Test Case Mapping
| Test Case ID | Scenario | Requirement ID |
|-------------|----------|----------------|
| TC-FEATURE-001 | Scenario description | REQ-FEATURE-001 |
```

### 2️⃣ AI Agent Prompt Template
```markdown
Please analyze the following requirements.txt and generate a complete Selenium Java 
automation framework using:

1. Page Object Model (POM)
2. Test-Driven Development (TDD) principles
3. Requirements traceability
4. JUnit Jupiter
5. Maven project structure

Requirements:
[Insert requirements.txt content here]

Expected Deliverables:
1. Project structure with proper packaging
2. Page Objects with placeholder locators
3. Test classes mapped to requirements
4. Base classes and utilities
5. Test data management
6. Logging and reporting setup
```

### 3️⃣ AI-Generated Framework Benefits
- ✨ Consistent structure following best practices
- 📝 Complete requirements traceability
- 🧪 Test-first approach with placeholder implementations
- 🔄 Ready for iterative refinement

## 🏗️ Framework Architecture

### 📚 Tech Stack
- **Java**: Core programming language
- **Selenium 4.15.0**: Web automation
- **JUnit Jupiter 5.10.0**: Test framework
- **Maven**: Build and dependency management
- **SLF4J**: Logging framework

### 🗂️ Project Structure
```
selenium-mcp-tests/
├── src/
│   ├── main/java/
│   │   └── com/selenium/mcp/
│   │       ├── pages/         # Page Objects
│   │       └── utils/         # Utilities
│   └── test/
│       ├── java/
│       │   └── com/selenium/mcp/
│       │       └── tests/     # Test Classes
│       └── resources/
│           ├── test-data.properties
│           └── requirements.txt
└── pom.xml
```

## 🎨 Design Patterns

### 🏭 Page Object Model (POM)
- Each web page has a corresponding Page Object class
- Encapsulates page elements and actions
- Reduces code duplication
- Makes tests more maintainable

### 🧪 Test Structure
```java
@Test
@Disabled("Application not deployed - TDD Phase")
public void testValidLogin() {
    // TC-LOGIN-001: Verify login with valid credentials
    logTestCase("REQ-LOGIN-001", "TC-LOGIN-001");
    
    loginPage.login(
        TestDataProvider.getData("valid.username"),
        TestDataProvider.getData("valid.password")
    );
    
    assertTrue(driver.getCurrentUrl().contains("/dashboard"));
}
```

## 📋 Requirements Traceability

### 🔄 Mapping Convention
| Type | Format | Example |
|------|---------|---------|
| Requirement ID | `REQ-<FEATURE>-<NUMBER>` | `REQ-LOGIN-001` |
| Test Case ID | `TC-<FEATURE>-<NUMBER>` | `TC-LOGIN-001` |

### 📊 Coverage Matrix
| Feature | Requirement ID | Test Case ID | Status |
|---------|---------------|---------------|---------|
| Login | REQ-LOGIN-001 | TC-LOGIN-001 | ⏸️ Ready |
| | | TC-LOGIN-002 | ⏸️ Ready |
| | | TC-LOGIN-003 | ⏸️ Ready |
| Cart | REQ-CART-001 | TC-CART-001 | ⏸️ Ready |
| | | TC-CART-002 | ⏸️ Ready |
| | | TC-CART-003 | ⏸️ Ready |
| Checkout | REQ-CHECKOUT-001 | TC-CHECKOUT-001 | ⏸️ Ready |
| | | TC-CHECKOUT-002 | ⏸️ Ready |
| | | TC-CHECKOUT-003 | ⏸️ Ready |

## 🔄 TDD Workflow

### 1️⃣ Phase 1: Framework Setup (✅ Completed)
- ✅ Project structure creation
- ✅ Maven dependencies
- ✅ Base test configuration
- ✅ Logging setup
- ✅ Test data management

### 2️⃣ Phase 2: Test Design (✅ Completed)
- ✅ Page Objects with placeholder locators
- ✅ Test cases with requirement mapping
- ✅ Test data properties
- ✅ Documentation

### 3️⃣ Phase 3: Implementation Ready (⏳ Waiting)
- ⏸️ Tests disabled with `@Disabled` annotation
- 📝 Placeholder locators in Page Objects
- 🔄 Ready for actual UI implementation

### 4️⃣ Phase 4: Activation (🔜 Future)
1. Update `base.url` in properties
2. Replace placeholder locators
3. Remove `@Disabled` annotations
4. Run test suite

## 🛠️ Page Objects Ready

### 🔐 LoginPage
```java
public class LoginPage extends BasePage {
    // TODO: Replace with actual locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-btn");
    private By errorMessage = By.className("error-msg");
    
    // Methods implemented, waiting for actual locators
}
```

### 🛒 CartPage
```java
public class CartPage extends BasePage {
    // TODO: Replace with actual locators
    private By cartCounter = By.id("cart-count");
    private By checkoutButton = By.id("checkout-btn");
    
    // Methods implemented, waiting for actual locators
}
```

## 🚦 Test Execution

### 🔄 Current Status
```bash
mvn test
```
```
Tests run: 9, Failures: 0, Errors: 0, Skipped: 9
```
All tests are properly disabled, waiting for UI implementation.

## 📈 Benefits of AI-Augmented TDD

### 🎯 Pre-Development Benefits
1. **Requirements Clarity**: Tests document exact behavioral requirements
2. **Design Insights**: Page Objects reveal needed UI elements
3. **Coverage Planning**: Complete test coverage matrix before development
4. **Rapid Framework Generation**: AI creates consistent structure
5. **Best Practices Built-in**: AI follows industry standards

### ⚡ Development Benefits
1. **Quick Integration**: Just update locators and enable tests
2. **Parallel Work**: Frontend team can work with clear UI requirements
3. **Quality Gates**: Tests ready for immediate validation
4. **Consistent Structure**: AI ensures framework consistency
5. **Time Savings**: Rapid generation of boilerplate code

### 📊 Post-Development Benefits
1. **Complete Coverage**: No forgotten requirements
2. **Maintainable Tests**: Well-structured from the start
3. **Clear Documentation**: Requirements-to-test traceability

##  Implementation Workflow

### 1️⃣ Create Requirements File
1. Create `requirements.txt` following the template
2. Define features, requirements, and test cases
3. Include acceptance criteria for each feature
4. Map test cases to requirements

### 2️⃣ Generate Framework with AI
1. Use the AI agent prompt template
2. Review and validate generated structure
3. Verify requirement-to-test mapping
4. Check placeholder implementations

### 3️⃣ Refine and Prepare
1. Add missing utilities if needed
2. Review test data properties
3. Validate logging configuration
4. Document any special setup needs

### 4️⃣ Development Integration
1. Share framework with development team
2. Get UI element ID conventions
3. Update Page Objects with actual locators
4. Enable tests feature by feature
5. Add test reports and CI/CD integration

## 🤝 Contributing
1. Fork the repository
2. Create a feature branch
3. Submit a pull request with clear requirements mapping
4. Include updates to requirements.txt if adding features

## 📝 License
MIT License

---
## 👨‍💻 Author

### Saran Kumar M
- 🌐 GitHub: [@mvsaran](https://github.com/mvsaran)


