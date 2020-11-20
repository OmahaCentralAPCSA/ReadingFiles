import java.io.*;
import java.util.Scanner;

public class Alice {

    public static void main(String [] args) throws FileNotFoundException {
    
        //Word count for Alice in Wonderland
        Scanner input = new Scanner(new File("AliceInWonderland.txt"));

        int count = 0; 

        while(input.hasNext()){
            String currentWord = input.next(); 
            count++; 
        }

        System.out.println("Alice In Wonderland has " + count + " words");
    }
}
