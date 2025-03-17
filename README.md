# Selenium Automation Testing of DemoBlaze Website

![logo](https://github.com/user-attachments/assets/c77cd571-1832-4939-8cd9-d0c6ec90db86)

# Objective
Automate the testing of the DemoBlaze e-commerce website Validate core functionalities like login, category filtering, cart operations, and form submissions.
Ensure smooth user experience, usability, and responsiveness.(https://www.demoblaze.com/cart.html)

##  **Testing Approach**
This project follows a **structured manual testing** approach, including:

###  **1. Functional Testing**
- Ensuring each feature works as expected.
- Validating system behaviors under different conditions.

###  **2. UI/UX Testing**
- Checking design consistency and responsiveness.
- Ensuring proper alignment and usability.

###  **3. Boundary Value Analysis**
- Testing input fields with minimum and maximum values.
- Ensuring correct error messages are displayed.

###  **4. Error Handling Testing**
- Checking how the system responds to invalid inputs.
- Verifying failure scenarios like incorrect login credentials or failed payments.

---

# Documents Drive Link
https://drive.google.com/drive/folders/1d7hipse_b7Z8zQaJhgxWcLE7-grXjbbh?usp=sharing

##  **Test Documents**
The following **test Documents** document the manual testing process:

###  **1. Test Plan**
- **Objectives:** Define the testing purpose and goals.
- **Scope:** Specify tested modules and exclusions.
- **Testing Approach:** Describe testing methods used.
- **Test Environment:** Outline system requirements.
- **Test Deliverables:** List testing reports.
- **Risks & Mitigation:** Identify potential risks and solutions.

###  **2. Test Scenario**
- **Test Scenario ID**
- **Module**
- **Test Scenario Description**
  
###  **2. Test Cases**
Each module has structured test cases, including:
- **Test Case ID**
- **Test Case Description**
- **Pre-Conditions** 
- **Test Steps**
- **Test Data**
- **Expected & Actual Results**
- **Status (Pass/Fail)**

###  **3. Bug Report**
- **Bug ID**
- **Description**
- **Steps to Reproduce**



###  **5. Test Summary Report**
- **Summary of Test Execution**
- **Pass/Fail**


##  **Agile Methodology in Testing**
This testing process follows an **Agile Methodology** to ensure continuous and iterative testing:

 **Sprint-based Testing** – Dividing testing activities into multiple sprints.  
 **Daily Stand-up Meetings** – Discussing test progress, blockers, and solutions.  
 **Collaboration with Developers** – Continuous integration with the development team.  
 **Frequent Builds & Releases** – Ensuring testing is performed on updated builds.  
 **Exploratory Testing** – Conducting ad-hoc testing to uncover hidden defects.  

---

# Tools & Technologies Used
~~~
Selenium WebDriver – For browser automation.
Java – Primary programming language.
TestNG – For test execution and reporting.
Maven – For dependency management.
Eclipse IDE – Development environment.
Cucumber – BDD framework for writing feature files.
~~~

# Project Structure
~~~
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
~~~
    
# Explanation of Key Files

Page Objects: Contain reusable methods and locators for each webpage.

Step Definitions: Implement steps written in feature files.

Feature Files: Define BDD scenarios for testing functionalities.

ConfigReader: Manages configurations like base URL and browser type.

MyRunner: Executes test cases using Cucumber and generates reports.

# Features & Functionalities Tested

. Login – Validate login and logout functionalities.

. Category Filtering – Ensure only relevant products appear (Laptops).

. Contact Form – Test form submission with valid inputs.

. Homepage Verification – Check text readability, image alignment, and title.

# Setup & Prerequisites

. Install Java (JDK 8 or above).

. Install Eclipse IDE.

. Create a Maven Project.

# How to Run Tests

Open the project in Eclipse.

Navigate to runner/TestRunner.java.

Right-click and select "Run as > JUnit Test".

View test results in the console or generated reports.

# Test Cases Covered

. Verify product is added to the cart.

. Display only Laptops in the Laptop category.

. Display only Phones in the Phones category.

. Submit the "Contact Us" form with valid inputs.

. Verify images are correctly aligned on the homepage.


. Login with valid credentials.

. Verify logout after login validation.

. Add Samsung Galaxy S6 to the cart.

. Verify the Sign-Up process.

. Verify text visibility and readability.

. Verify website title accuracy.

