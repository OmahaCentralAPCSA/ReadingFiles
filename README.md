# :books: ReadingFiles

- Up until this point, the way our programs have gotten input data is from user input or hard-coding values.  
- Reading and processing files in Java is not a simple task, even though it is a very common method to obtain input data for programs.  Java does not present an elegant solution to reading files like other programming languages do (like Python).  

## :wrench: Set up
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
If we tried to run something similar to what we have above, Java would return an error saying:  
    *"unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown"*

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

2. Line-based processing  
Some files have information that is line-based.  That is, each line of the file represents a different case.  The approach for line-based is to use a Scanner to capture an entire line, then scan that line token by token. 

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

Here is the idea in psuedo-code:  
```
while input.hasNext()
    value = input.next() 
```
Note: You can sub in `hasNextInt()` or `hasNextDouble()`


### Line-Based Examples  
Repl.it Link to Example:  [Line-Based File Processing](https://repl.it/@collinholmquist/Line-Based-Processing#Main.java)  

Here is the idea in psuedo-code:  

```
while input.hasNextLine()       - while there is still another line in the file  
    line = input.nextLine()     - capture line of text  
    
    while line.hasNext()        - while the line still has tokens left to process
        value = line.next()     - capture the token(s) and do something with it  
```


# :running: File Reading Exercises -> Complete 2 of the 3. 

1.  Write a program to count the number of words in `AliceInWonderland.txt`.  

    The program should then print out the total number of words. Your program shoud also find longest word in the book.  If there is a tie between the words, then choose the last one.  
    
    
2.  Write a program that reads an input file `names.txt` with names on each line separated by spaces.  Some names appear multiple times in a row on the same line, but the same names always        are next to each.  For each line, print the most commonly occuring name.  If there is a tie, use the first name that had that many occurrences; if all names are unique, print the first name on the line.  

    Example:  
    ```
    Benson Eric Eric Kim Kim Kim Jenny Nancy Nancy Paul Paul
    Ethan Jamie Jamie Alyssa Alyssa Helene Helene Jessica Jessica

    //the input above, your program should print: 
    Most common: Kim
    Most common: Jamie

    ```

3.  Write a program that reads an input file `scores.txt` that contains the scores from Nebraska football games.  Each result will be its own line and values will be separated by spaces.

    The text file will be formatted like such:   

    Nebraska Score - Opponent Score - Opponent Name
    
    ```
    49 10 Western Kentucky
    38 17 Idaho
    56 21 Washington
    ...
    
    ```
    Your program should then print out the season record.
    ```
    Season Record: 10 - 4
    ```

