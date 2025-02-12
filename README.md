Selenium Automation Testing of DemoBlaze Website
![logo](https://github.com/user-attachments/assets/f3f7ec3f-33a1-456a-8633-1a85789e383c)

Objective
Automate the testing of the DemoBlaze e-commerce website.

Validate core functionalities like login, category filtering, cart operations, and form submissions.

Ensure smooth user experience, usability, and responsiveness.

Tools & Technologies Used

Selenium WebDriver – For browser automation.

Java – Primary programming language.
TestNG – For test execution and reporting.
Maven – For dependency management.
Eclipse IDE – Development environment.
Cucumber – BDD framework for writing feature files.
Project Structure
pgsql
CopyEdit
DemoBlazeProject  
├── src/test/java  
│   ├── pageObject  
│   │   ├── Contact.java  
│   │   ├── Homepage.java  
│   │   ├── ImageAlignment.java  
│   │   ├── LoginPage.java  
│   │   ├── Logout.java  
│   │   ├── Product.java  
│   │   ├── SignUp.java  
│   │   ├── TitleValidation.java  
│   ├── stepDefinitions  
│   │   ├── ImageAlignment.java  
│   │   ├── LoginStep.java  
│   │   ├── LogoutStep.java  
│   │   ├── ProductStep.java  
│   │   ├── ContactStep.java  
│   │   ├── SignUpStep.java  
│   │   ├── TitleValidationStep.java  
│   ├── testrunner  
│   │   ├── MyRunner.java  
├── src/test/resources  
│   ├── Feature  
│   │   ├── alignment.feature  
│   │   ├── Login.feature  
│   │   ├── logout.feature  
│   │   ├── product.feature  
│   │   ├── signup.feature  
│   │   ├── test.feature  
├── pom.xml  
├── README.md  
└── Documents  
    ├── Test Plan.pdf  
    ├── Test Scenario.pdf  
    ├── Test Case Document.pdf  
    ├── Bug Report.pdf  
    ├── Test Summary.pdf  
    ├── MindMap  

Explanation of Key Files
Page Objects: Contain reusable methods and locators for each webpage.

Step Definitions: Implement steps written in feature files.

Feature Files: Define BDD scenarios for testing functionalities.

ConfigReader: Manages configurations like base URL and browser type.

MyRunner: Executes test cases using Cucumber and generates reports.

Features & Functionalities Tested

✔ Login – Validate login and logout functionalities.

✔ Category Filtering – Ensure only relevant products appear (Laptops).

✔ Contact Form – Test form submission with valid inputs.

✔ Homepage Verification – Check text readability, image alignment, and title.

Setup & Prerequisites

Install Java (JDK 8 or above).

Install Eclipse IDE.

Create a Maven Project.

How to Run Tests

Open the project in Eclipse.

Navigate to runner/TestRunner.java.

Right-click and select "Run as > JUnit Test".

View test results in the console or generated reports.

Test Cases Covered

✅ Verify product is added to the cart.

✅ Display only Laptops in the Laptop category.

✅ Display only Phones in the Phones category.

✅ Submit the "Contact Us" form with valid inputs.

✅ Verify images are correctly aligned on the homepage.

✅ Login with valid credentials.

✅ Verify logout after login validation.

✅ Add Samsung Galaxy S6 to the cart.

✅ Verify the Sign-Up process.

✅ Verify text visibility and readability.

✅ Verify website title accuracy.


