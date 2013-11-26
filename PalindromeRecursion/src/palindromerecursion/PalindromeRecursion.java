/*

 */

package palindromerecursion;

import java.io.Console;

/**
 *
 * @author keimiokamoto
 */
import java.util.Scanner;
public class PalindromeRecursion {
 
        public boolean palindrome (String word, int countA, int countZ){
           
           if(word.charAt(countA) != word.charAt(countZ)){ //gurard condition
               return false;
           }
           if (countA==countZ || ((countZ)-countA) == 1 ){
               return true;
           }
           return palindrome(word, ++countA, --countZ); //post & pre increment & decrement
        }
        
    
    public static void main(String[] args) {
       
        
       Scanner x = new Scanner(System.in);
       String word = x.nextLine();
      
       //Console console = System.console(); //static method on the class system
       //String word = console.readLine();
       PalindromeRecursion aRecursion = new PalindromeRecursion ();//instance method, using it on a [articular instance
      // note
        boolean answer = aRecursion.palindrome (word, 0, word.length()-1); 
        System.out.println("The answer is " + answer);
    }
    
}
