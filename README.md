# How to run the Automated Test Suite,

>Prerequisite
1. Java environment
2. Maven

**Note: Configure important properties that are required during test execution in data.properties file**
1. Go to ISCatalogue_Automation\src\main\java\resources\data.properties 
2. Configure url, login credentials, etc in data.properties file


**How to maintain and execute testcases using testng.xml**
1. To easily maintain testcases for each pages (Home, Catalohue, Customer Evidence, Campaigns, Resources) create separate testsuite xml files.
2. Final testng.xml file is a suite of suites. In this file we can configure name of the above created individual suite files.
3. Once test execution starts all suites configured in testng.xml file will get executed in sequence.

**Project is ready to run. Execute following commands and monitor the automatic web-driver test execution**
*	Open Command prompt. Go to project path. For example: C:\Users\User-Name\ISCatalogue_Automation>
*	Run mvn clean
*	Run mvn compile
*	Run mvn test -Dbrowser=edge	 **Change browser name in command as per intended browser test execution**


**After completing automated test execution,**
*	You can find the generated html test execution report at ISCatalogue_Automation\reports\ISCatalogue_TestExecutionReport.html
*	You can find screenshots taken for failed testcases at ISCatalogue_Automation\reports\ location
*	You can find the generated test execution logs at ISCatalogue_Automation\logs\ location

