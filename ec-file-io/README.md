# Java File I/O Examples
Author: HBF  
Date: 2020-09-07 (update) 

## Basic Concepts of Java Stream I/O

Data I/O is about how to store data in files and transfer data to another computer/device through network. The format can be either text or binary (stream). The text format stores data as sequence of characters, it requires some conversions when doing I/O. The binary format stores data as sequence of bytes as they are in memory. The text data format is readable. The binary format is not readable, but data can be directly loaded from file to memory without conversion, so it is more efficient for object I/O. 

Java has class and method for text and binary file I/O. It uses the term stream instead of binary. In general, a serializable object is capable of streaming. Many commonly used data types are serializable, such as String, Integer, Double, array, map, arraylist. User can define serializable class by implementing the serializable interface. 

## About this project 

This Ant project give examples of file I/O:

1. text file I/O
2. stream data (byte array) I/O
3. String object stream I/O
4. Array object stream I/O
5. Array list object stream I/O
6. Map object stream I/O
7. User defined serializable object stream I/O

## What to do

1. Check FileIO.java for file I/O examples.
2. Check Person.java for user defined serializable object class.
3. Run FileIO.java as java application, check the generated files in the project root directory.
4. Open a cmd console, use ant command: 

```
ant run  
and clean
```

You can refer to this example for stream I/O in latter labs and assignments. 
