# Build Java Project by Apache MAVEN
Author: HBF  
Date: 2020-09-07 (update) 

## About this project

This project is to demonstrate project build by Maven. A Maven project is defined by a POM file. It is an XML file that contains information about the project and configuration detail 
used by Maven to build the project. 
 
1. Open and read the pom.xml
2. Right click pom.xml -> Run As -> Maven Build (the second), and fill in the box of goals for the Maven command, e.g. clean package, then click the run button.  
3. Right click pom.xml -> Run As -> Maven Build (the first) using the default option.
4. Run Maven by command. Open cmd console, cd to the project root directory containing the pom.xml file. Use command format: mvn  (list of target), for example:

```
mvn clean
mvn clean package
mvn test
```
 
5. Run Maven command: mvn package,  to create ec-junit-log-mvn.jar in the target folder. cd to target, and type command

```
java -jar ec-junit-log-mvn.jar
```
   
## Apache Log4J

Apache [Log4J](https://logging.apache.org/log4j/2.x/) is a logging tool. 

1. check and run Log4j2Example0.java for a simple example of Log4J.
2. check and run Log4j2Example1.java, it uses different logging levels. There are six levels.   

```
FATAL	100
ERROR	200
WARN	300
INFO	400
DEBUG	500
TRACE	600
```

3. Check and run Log4j2Example2.java, it uses specific configuration file.
4. Check and run Log4j2Example3.java for a more customized configuration by program.


