## Description

This is my Query Optimization algorithm calculator. It is based upon the lecture QueryOptimization at TUM(see https://db.in.tum.de/teaching/ws2021/queryopt/).  
All code written is entirely made by me, with the help of lecture slides.   
There are two small codesections inside the input folder,  
where I consulted online ressources for help(Reading a file in java, Reading Console in Java),  
the links to the original source code are inside the files. 

If you plan to use this at TUM, I applaud you to read the student code of conduct:  
  - https://www.in.tum.de/en/current-students/administrative-matters/student-code-of-conduct/

## Configuration

First you need to change the values in `src/inputfiles` to fit the querygraph/precedencegraph you want.  
There are examples in the input files, how to use them, and what algorithms use the specified files.  
All other configurations like cost functions, cross products, etc. are automatically asked by the Console.  
There might be cases, where the program asks you to decide between 2 edges/relations if they have the same value,  
or if you choose the semi-join Cost Function, then the program asks you to evaluate the log, because I didn't get to implement log for BigDecimal.  

## Folder Structure

- `src`: the folder to maintain sources
  - `algorithms`: the folder contains all implemented algorithms
  - `datastructure`: the folder contains necessary classes like edges,querygraphs,relations...
  - `helper`: the folder contains help functionality like cost functions and comparators
  - `input`: the folder contains class that provide functionality to read files/console
  - `inputfiles`: the folder contains .txt files as input for the algorithms with examples
- `lib`: the folder to maintain dependencies

## BigDecimal

The java.math class BigDecimal is used in this programm, because the software needs to handle large decimal number. But some numbers can't be represented accuratly, e.g. 1/3, so the software rounds to 100 decimal values.
