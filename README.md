# Appium-Mobile-Testing

# Overview

This project focuses on automated smoke testing of a mobile application using Appium. Smoke testing ensures that the application's core functionalities work correctly before proceeding with further testing. The automation framework is built using Java, TestNG/Cucumber, and Maven, enabling efficient execution and reporting of test results.

# Tech Stack

Automation Tool: Appium
Programming Language: Java (JDK 8)
Test Framework: TestNG / Cucumber
Build Tool: Maven
Reporting: Extent Reports / Allure Reports
Platforms Tested: Android / iOS
Devices: Real devices & Emulators

# Project Milestones

1 Project Setup & Environment Configuration
Installed Appium, configured Android/iOS drivers.
Set up Maven, TestNG/Cucumber framework.

2 Test Case Design & Implementation
Created test scripts for critical functionalities.
Used locators like ID, XPath, UIAutomator for element identification.

3 Test Execution & Debugging
Executed tests on real devices & emulators.
Debugged failures and optimized scripts.

4 Test Integration & Reporting
Integrated test framework with reporting tools.
Analyzed test reports for build verification.

5 Final Review & Documentation
Ensured smoke tests validate core app stability.
Documented test scenarios and execution results.

# Project Structure

📂 Appium-Smoke-Testing  
 ┣ 📂 src/test/java  
 ┃ ┣ 📂 tests/       # Test scripts  
 ┃ ┣ 📂 pages/       # Page Object Model (POM) files  
 ┃ ┗ 📂 utils/       # Utility functions & helpers  
 ┣ 📂 src/test/resources  
 ┃ ┗ 📜 testng.xml   # TestNG configuration file  
 ┣ 📂 reports/       # Test execution reports  
 ┣ 📜 pom.xml        # Maven dependencies  
 ┣ 📜 README.md      # Project Documentation  

# Installation & Setup

Prerequisites
--Install Java 8
--Install Maven
--Install Appium & Node.js
--Set up Android SDK & Emulator / Real device

# Clone Repository

git clone https://github.com/yourusername/Appium-Smoke-Testing.git  
cd Appium-Smoke-Testing  


# Run Tests

Using Maven
mvn clean test  

Using TestNG
mvn test -Dtest=TestClassName  

# Reporting

TestNG Reports: Available in test-output/ folder
Extent Reports: Generated in reports/ folder

# Contributors

👤 [Abusufiyan Akkalkotkar]

GitHub: @github.com/abusufiyanakkalkotkar
LinkedIn: linkedin.com/in/abusufiyanakkalkotkar

# License

This project is licensed under the MIT License - see the LICENSE file for details.

