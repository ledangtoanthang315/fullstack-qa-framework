1. FullStack QA Automation Framework

This repository contains a complete FullStack QA Automation framework that supports:

- Web UI Testing (Java + Selenium + TestNG)
- Mobile App Testing (Appium for iOS)
- Environment Config Management (Dev/QA/Staging)
- Reporting with Allure
- CI/CD Integration Ready (Jenkins compatible)

2. Project Structure

fullstack-qa-framework/
├── pom.xml
├── testng.xml
├── Jenkinsfile
├── README.md
├── src/
│   ├── main/java/
│   │   ├── config/
│   │   │   └── EnvConfig.java
│   │   └── drivers/
│   │       └── DriverFactory.java
│   └── test/java/
│       ├── base/
│       │   └── BaseTest.java
│       ├── web/
│       │   ├── pages/
│       │   │   ├── LoginPage.java
│       │   │   ├── DashboardPage.java
│       │   │   ├── CreateChallengePage.java
│       │   │   └── MyChallengesPage.java
│       │   └── tests/
│       │       └── WebE2ETest.java
│       ├── mobile/
│       │   ├── pages/
│       │   │   ├── MobileLoginPage.java
│       │   │   ├── PortfolioPage.java
│       │   │   └── LogoutPage.java
│       │   └── tests/
│       │       └── MobileE2ETest.java
│       └── resources/config/
│           ├── dev.properties
│           ├── qa.properties
│           └── staging.properties

### Getting Started

3. Prerequisites

- Java 11+
- Maven
- Node.js + Appium (for mobile tests)
- Allure CLI (`brew install allure`)
- IDE: IntelliJ IDEA or VS Code

4. Clone the project

git clone https://github.com/ledangtoanthang315/fullstack-qa-framework.git
cd fullstack-qa-framework

5. Web UI Test Flow (CTFLearner)
Scenario:
    a. Login to https://ctflearn.com
    b. Create a Challenge
    c. Verify it's listed under "My Challenge"
    d. Logout

Run: mvn clean test -Denv=qa

6. Mobile Test Flow (iOS App)
Scenario:
    a. Launch mobile app
    b. Login with email/password
    c. View Portfolio
    d. Logout

Run: mvn clean test -Dtest=MobileLoginTest
- Update the .app path in MobileLoginTest.java

7. Allure Reporting
- Generate and open report: mvn clean test
allure serve target/allure-results

8. Jenkins Integration
- Add Maven build step: mvn clean test -Denv=qa 
- Publish Allure Reports with plugin: Allure Jenkins Plugin