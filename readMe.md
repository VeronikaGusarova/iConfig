# iConfig - Readme
This readme file is targeted for QA Automation engineers who is working on 
iConfig project and contains information about acceptance tests.

### Table of contents


### Required Software and Tools
* Java Version: Oracle Java 1.8.0_31 and higher (Execute **_java -version_** in command line after installation)
* Apache Maven Version: 3.2.3 and higher (Execute **_mvn -version_** in command line after installation)
* Git Client: 1.9.5 or higher (Execute **_git --version_** in command line after installation)
* Integrated Development Environment: Any version IntelliJ Idea or Eclipse
* Lombok plugin for IDE

### Conventions followed in this guide
* **{ACCEPTANCE_SRC}** refers to top or root directory of this project

### Important
* Build the following repos:
<TODO> replace https://TESTREPO

### Run acceptance tests

* Make sure that htps://TESTREPO is built and installed into your local Maven repo
* Open a terminal or command prompt
* Set environment variable **NG_ENV** as one of the following: **dev**, **qa**
* Go to **{ACCEPTANCE_SRC}**
* Execute **mvn clean install -Dmaven.test.skip=true**
* Go to **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests**
* Execute:
    * Run in single thread mode: **mvn clean install**, by default tests execute in Chrome browser. 
    * If you want execute tests in other browsers please execute **mvn clean install -P<browser name>**, where <browser name> could be: **chrome**, **firefox**. Example: **mvn clean install -Pfirefox**
    * Run in multi thread mode: **not supported right now**
* Cucumber html report is available at **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests/target/cucumber-html-report/index.html**
* Allure Cucumber html report is available at **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests/target/site/allure-maven-plugin/index.html**
* Testing logs: **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests/target/logback/**


### Log of acceptance tests execution
Log of acceptance tests execution stored in the directory **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests/target/logback/**


### Run specific acceptance tests by tags, feature file or scenario
* Make sure that ttps://TESTREPO is built and installed into your local Maven repo
* Open a terminal or command prompt
* Set environment variable **NG_ENV** as one of the following: **dev**, **qa**
* Go to **{ACCEPTANCE_SRC}**
* Execute **mvn clean install -Dmaven.test.skip=true**
* Go to **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests**
* Execute:
    * To run a specific feature file, execute **mvn clean install -Dcucumber.options="classpath:gui/Login.feature**
    * To run a specific scenario in a feature file by line number, execute **mvn clean install -Dcucumber.options="classpath:gui/AccountCreation.feature:5"**
    * To run a specific tag, execute **mvn clean install -Dcucumber.options='--tags @TestCaseId("AEMO-687")'**
* Allure Cucumber html report is available at **{ACCEPTANCE_SRC}/acceptance-tests/cucumber-acceptance-tests/target/site/allure-maven-plugin/index.html**