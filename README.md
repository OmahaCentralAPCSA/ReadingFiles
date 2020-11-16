# ReadingFiles

- Up until this point, the way our programs have gotten input data is from user input or hard-coding values.  
- Reading and processing files in Java is not a simple task, even though it is a very common method to obtain input data for programs.  Java does not present an elegant solution to reading files like other programming languages do (like Python).  

## Set up
- import `java.util.io;` to use a `File` object.  
- import `java.util.Scanner;` to scan the `File` object. 

```

```
## Exceptions and using `throws`  
To put simply:  
An exception is an error that prevent a program from continuing normal execution.  In this case, the compiler is worried that it might not be able to find whatever file we want to scan.  Thus we need to provide a special phrase in your method header that basically is saying "I am taking the risk that the file might not be found".  We are okay doing that since, we will have the file(s) in our program directory.  

```
public static void main(String [] args) throws FileNotFoundException {
    //code to read in file.  
}
```

## Approaches to File Reading and Processing
