Selenium Automation Testing of DemoBlaze Website

Objective

The purpose of this project is to automate the testing of the DemoBlaze e-commerce website using Selenium WebDriver. The project ensures the website's core functionalities such as login, category filtering, adding products to the cart, and form submissions work seamlessly.

Overview

This project is designed to:

Automate the testing of the DemoBlaze website.

Validate the website’s functionality, usability, and responsiveness.

Ensure the quality of the user experience.

Tools and Technologies used:

Selenium WebDriver
Java
TestNG
Maven
Eclipse IDE
Cucumber (for BDD)

Project Structure

The project follows a modular and organized structure:

DemoBlazeProject
├── src/test/java
│   ├── pageObject
│   │   ├── Contact.java
│   │   ├── Homepage.java
│   │   ├── ImageAlignment.java
│   │   ├── LoginPage.java
│   │   └── Logout.java
|   |   |__Product.java
|   |   | __SignUp.java
|   |   | __TitleValidation.java
│   ├── stepDefinitions
│   │    ├── ImageAlignment.java
│   │    ├── LoginStep.java
|   |    └── LogoutStep.java
|   |    ├── ProductStep.java
│   |    |__ContactStep.java
│   │    |__signupStep.java
│   │    |__TitleValidationStep.java
│   │   
│   │  
│   ├── testrunner
│   │   └── MyRunner.java
│
├── src/test/resources
│   ├── Feature
│   │   ├── alignment.feature
│   │   ├── Login.feature
│   │   ├── logout.feature
│   │   └── product.feature
|       | __signup.feature
│       | __test.feature
├── pom.xml
├── README.md
└── Documents
    ├── Test Plan.pdf
    ├── Test Scenario.pdf
    └── TestCaseDocument.pdf
    ├── Bug Report.pdf
    ├── Test Summary.pdf
    └── MindMap

Explanation of Key Files

Page Objects: Contain reusable methods and locators for each page.

Step Definitions: Implement steps written in the feature files.

Feature Files: Define BDD scenarios for testing specific functionalities.

ConfigReader: Handles configurations like base URL and browser type.

TestRunner: Executes the test cases using Cucumber and generates reports.

Features and Functionalities

The following features are tested:

Login: Validation of user login and logout functionality.

Category Filtering: Ensuring products displayed match the selected category (Phones, Laptops, Monitors).

Cart Functionality: Adding and verifying products in the cart.

Contact Form: Submitting the "Contact Us" form with valid inputs.

Homepage Verification: Checking text readability, image alignment, and title.

Setup and Prerequisites

Install Java (JDK 8 or above).

Install Eclipse IDE.

Install Maven.

Clone the project repository.

Run mvn clean install to set up dependencies.

How to Run Tests

Open the project in Eclipse.

Navigate to the runner/TestRunner.java file.

Right-click and select "Run as > JUnit Test".

View test results in the console or generated reports.

Test Cases Covered

Verify product is added to cart

Display only Laptops in the Laptop category

Display only Phones in the Phones category

Submit the Contact Us form with valid inputs

Verify images are aligned correctly on the homepage

Login with valid credentials

Verify logout after login validation

Add Samsung Galaxy S6 to the cart

Verify the Sign-Up process

Verify text visibility and readability

Verify the website title





