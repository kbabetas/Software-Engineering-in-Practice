## Maven Assignment
```
Create a Java Application, by using Maven, that reads a file with students' grades and generates its histogram.
The grades file should be given as a command-line argument at runtime. No checks or tests are necessary.
```
## To Build:
Primary build is supported with **Maven**.
```
mvn package
```
Artifacts:
* ``` Software-Engineering-in-Practice/seip2019/gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar ```
## Installation
To install there is a self-contained jar file.

If you would like to run the ```gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar ```, change the directory to ```Software-Engineering-in-Practice/seip2019/gradeshistogram/target```, then execute:

```
java -jar gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar textfile.txt
```
Where ```textfile.txt``` is a txt file containing integer grades, from 0-10. This is a template of a [```grades.txt```](https://drive.google.com/file/d/1I1zGwuwf8KgQyWnoz0358WczAZvtSuHT/view) so that you can run the code.

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
