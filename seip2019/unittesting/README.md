## Unit Testing & Continuous Integration Assignment

Create a set of test cases for the IntegerOperations class, the FileIO class
and the ArrayOperations class all of which can be found [here](https://drive.google.com/drive/folders/14E19OUxEeO0RIxxszwD1h0tbXpnqtr5d).
Connect your repository with Travis in order to provide a continuous
integration/build environment for your set of modules and create a code
coverage report.


## To Build:

In order to build the project execute the following Maven command:
```
mvn clean install
```
This command will also generate a report of the code coverage produced
by JaCoCo. The report will be located in the following path:
```
target/site/jacoco
```
## Test project
To simply run the unit tests of the project, execute
the following Maven command:
```
mvn test
```
***Important:*** Note that only classes with a ```Test``` suffix located
in the ```src/test``` will be executed and reported as Tests.

## Continuous Integration
This projects utilizes TravisCI services in other to test and build the
application upon each ```git-push``` in the remote repository.
There are multiple build environments in which the application will be tested and
build. You can check these options under the ```jdk``` tag in the ```.travis.yml``` file.

After each build, the badge is updated with the corresponding build status,
 ```green``` for passes and ```red``` for failures.

### Code Coverage
Code coverage reports provided by CodeCov is available on the repository page in
the CodeCov website. The analysis is executed after each successfully TravisCI build.

## Requirements

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
* [Maven](https://maven.apache.org/)

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [Eclipse](https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-java-developers) - Integrated Development Environment
* [TravisCI](https://travis-ci.com/) - Continuous Integration Tool
* [CodeCov](https://codecov.io/) - Code Coverage Tool

## Authors

* [**Konstantinos Babetas**](https://github.com/kbabetas) - Student at the Department of Management Science & Technology at the Athens University of Economics and Business

## Acknowledgments

* [Antonis Gkortzis](https://github.com/AntonisGkortzis) - Lab Coordinator at Software Engineering in Practice
