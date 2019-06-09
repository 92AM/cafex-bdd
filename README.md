# cafex-bdd
Trying to learn the concepts of BDD. Implemented some BDD scenarios for the cafex java command-line application using Gherkin and Cucumber.

## Requirements
* Git
* Apache Maven 
* Java 8 or above
* Cucumber (https://cucumber.io/)
* Git clone `cafex` application (i.e. run `git clone https://github.com/92AM/cafex.git`) and then from project root run `mvn clean install` to make sure version `0.0.1` of the project is created in local `.m2` repository.

Note : please ensure that Cucumber and Gherkin plugins are installed in your IDE (I used IntelliJ) before building / running the application.

## Building the project
In order to build the project please ensure that you are in the project root directory (i.e. same level as pom.xml) and execute the below maven commands.

#### Maven clean and install build
`mvn clean install`

#### Maven clean and instal build with debug / error output on CLI
`mvn clean install -e -X`

#### Maven clean and test 
`mvn clean test`
