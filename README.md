# ReadingFiles

- Up until this point, the way our programs have gotten input data is from user input or hard-coding values.  
- Reading and processing files in Java is not a simple task, even though it is a very common method to obtain input data for programs.  Java does not present an elegant solution to reading files like other programming languages do (like Python).  

## Set up
- import `java.util.io;` to use a `File` object.  
- import `java.util.Scanner;` to scan the `File` object. 

```
import java.util.io;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    
            //create String to hold filename
        String filename = 'example.txt';
        
            //Create a Scanner object that takes a parameter of a new File
        File file = new File(filename); 
        Scanner input = new Scanner(file); 
        
        /*
        Note: you can also do the above lines in one statement
        Scanner input = new Scanner(new File('example.txt')); 
        */
        
        //Use Scanner and it's methods to read the file's contents.          
        
        

    }

}
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
There are two approaches:  Token-based and Line-based 

1. Token-based processing  
Processing input token by token (one word or one number at a time)  

There are 3 token-based reading method for the Scanner class:  
`nextInt()`  for a reading an int value  
`nextDouble()` for  reading a double value  
`next()` for reading the next token as a String.  

There are also 3 methods that "look ahead" and tell us if we have more data to process:  
`hasNextInt()` tests whether there is another int value to read  
`hasNextDouble()` tests whether there is another double value  
`hasNext()` tests whether there is another String  

Using a while-loop with the 'look ahead' method allows to the program to stop when the end of the file as been reached.  

### Token-Based Examples
Repl.it Link to Example:  [Token-Based File Processing](https://repl.it/@collinholmquist/Token-Based-Processing#Main.java) 


2. Line-based processing  
Some files have information that is line-based.  That is, each line of the file represents a different case.  The approach for line-based is to use a Scanner to capture an entire line, then scan that line token by token.  

Here is the idea in psuedo-code:  

```
while input.hasNextLine()       - while there is still another line in the file  
    line = input.nextLine()     - capture line of text  
    
    while line.hasNext()        - while the line still has tokens left to process
        value = line.next()     - capture the token(s) and do something with it  
```

### Line-Based Examples  
Repl.it Link to Example:  [Line-Based File Processing](https://repl.it/@collinholmquist/Line-Based-Processing#Main.java)


