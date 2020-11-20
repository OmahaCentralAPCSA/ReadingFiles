import java.io.*;
import java.util.Scanner;

public class Names {

    public static void main(String[] arg) throws FileNotFoundException {

        Scanner input = new Scanner(new File("names.txt"));

        while(input.hasNextLine()){
            String line = input.nextLine();

            Scanner lineScan = new Scanner(line);

            String previous = "";
            String commonName = "";
            int count = 1; 
            int maxCount = 0; 

            while(lineScan.hasNext()){
                String current = lineScan.next(); 

                  //if current names matches the previous name
                if(current.equals(previous)){
                    count++; 
                } else {
                    //reset to 1, if the current != previous
                    count = 1; 
                }

                    //determine the highest count.  that is the most frequent name
                    //assign current to most frequent name
                if(count > maxCount){
                    maxCount = count; 
                    commonName = current; 
                }
                //make previous the current value before moving onto the next name
                previous = current; 
                
            }

            System.out.println(commonName);
        }
        

    }
}