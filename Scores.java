import java.io.*;
import java.util.*; 

public class Scores {

    public static void main(String [] args) throws FileNotFoundException{

        Scanner input = new Scanner(new File("scores.txt"));

         int wins = 0;
            int loss = 0; 
            int gameNum = 1; 

        while(input.hasNextLine()){
            String line = input.nextLine();

            Scanner lineScan = new Scanner(line);


            while(lineScan.hasNext()){

                //capture home score 
                int homeScore = lineScan.nextInt(); 
                //capture opponent score 
                int oppScore = lineScan.nextInt(); 

                String opp = lineScan.nextLine(); 
                //System.out.println(opp);

                System.out.print("Game " + gameNum + ": ");
                //determine win/loss
                if(homeScore > oppScore) {
                    wins++; 
                    System.out.println(" Win");
                } else {
                    loss++; 
                    System.out.println(" Loss"); 
                }

                gameNum++; 
            }

            
        }

        System.out.println();
            System.out.println("Season Record " + wins + "-" + loss);

    }

}