## API Testing Open Weather Scenario 

API Test Framework Example in Java language using Java libraries; 
RestAssured (for API Service) and Cucumber (for BDD styled), along with Maven as a build tool.

## 1. Overview 

* This API test framework uses Java as a main language with 'RestAssured' and 'Cucumber' libraries 

* Test will run according to feature files - which are stored under 
./src/test/java/featureFiles folder. 

* All the dependencies are added over in pom.xml file

* Outputs (Json, XML and html files) will be produced under ./target/cucumber-reports folder.

## 2. How to setup

Pull (clone) source code from Github

Set up your project as cucumber project

## 3. How to run tests and generate reports

Run the TestRunner class file which is under src/test/java 
Once finished, there will be reports in ./target/cucumber-reports/* folder. 

## 4. Where to find reports

* JSON file: ./target/cucumber-reports/Cucumber.json
* XML file: ./target/cucumber-reports/Cucumber.xml
* HTML file: ./target/cucumber-reports/html/index.html
