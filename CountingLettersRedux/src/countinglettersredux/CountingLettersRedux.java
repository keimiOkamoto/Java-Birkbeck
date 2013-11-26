/*
* reads text from user then enters a loop of 
 */

package countinglettersredux;

import java.util.Scanner;

public class CountingLettersRedux {

    public static void main(String[] args) {
        
        Scanner y = new Scanner (System.in);
        String storage ="";
        Letter aLetter = new Letter ("It was a dark and stormy night");
        boolean copy = false;
        
        
       while(copy==false){
            
            System.out.println("Which letter would you like to check for? ");
            String input = y.nextLine();
            int x = aLetter.letterChecker(input);
            boolean same = aLetter.duplicateChecker(input);
            
            
            if (same ==true){
               copy = true;
            } 
            else{
                System.out.println("Found the letter:  "  + x + " times!");  
                System.out.println("------------------------------------");
            }
       
        
        
        }
    } 
}
