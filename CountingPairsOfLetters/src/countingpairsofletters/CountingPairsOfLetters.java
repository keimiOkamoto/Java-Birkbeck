/*
 *takes in a string and counts every time the string is there in a paragraph. 
 */

package countingpairsofletters;

/**
 *
 * @author keimiokamoto
 */
public class CountingPairsOfLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Letter aLetter = new Letter ("Hello bat man, said superman, would you like a magazine? manager, moon and sun! ");
        int x = aLetter.wordChecker("man");
      
        System.out.println("Found the word:  "  + x + "times!");
       
    }
    
}
