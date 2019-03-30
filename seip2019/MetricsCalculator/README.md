## Design Pattern Assignment

Create a Java Application, by using Maven, that for a Java source code file
will create two implementations that calculate the following source code metrics:
* loc - lines of source code (Excluding comments and empty lines)
* noc - number of classes
* nom - number of methods
Implementations' details:
* The first source code analyzer should be implemented using Regular Expressions
* The second source code analyzer should be implemented using String Comparison
* The user will be able to choose between the two analyzers at runtime.
The two analyzers should participate in a Strategy and Factory patterns.
* Reading the source code and writing the csv file operations should be
performed by methods in a Utility class.
* The project should have a Facade class that provides public functions
for the main operations like readSourceCode, calculateMetrics and writeCSV.
* With the source code you should also deliver a Class Diagram.

The Java source code file and the type of analyzer should be given as
command-line arguments at runtime. No checks or tests are necessary.


## Class Diagram
![](seip2019/MetricsCalculator/resources/UML_Diagram.png)
## To Build:
Primary build is supported with **Maven**.
```
mvn package
```
Artifacts:
* ``` Software-Engineering-in-Practice/seip2019/MetricsCalculator/target/MetricsCalculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar ```
## Installation
To install there is a self-contained jar file.

If you would like to run the ```MetricsCalculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar ```, change the directory to ```Software-Engineering-in-Practice/seip2019/MetricsCalculator/target```, then execute:

```
java -jar MetricsCalculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar [sourceFile] [String or RegEx]
```
Where ```[sourceFile]``` is a .java file containing Java Code and ```[String or RegEx]``` is the indicator of whether to use String Comparison or Regular Expressions to calculate the desired Metrics.

## Requirements

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
* [Maven](https://maven.apache.org/)

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [Eclipse](https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-java-developers) - Integrated Development Environment

## Authors

* [**Konstantinos Babetas**](https://github.com/kbabetas) - Student at the Department of Management Science & Technology at the Athens University of Economics and Business

## Acknowledgments

* [Antonis Gkortzis](https://github.com/AntonisGkortzis) - Lab Coordinator at Software Engineering in Practice
