/**
 * A static method that takes in a large number, a hash code created then 
 * takes the modulus of 1000 and creates a shorter version. 
 */

package simplemap2;


public class HashUtilities {
    
   
    //Take any integer and returns an integer between 0-1000
    public static int shortHash( int largeHash ){
        largeHash %= 1000;
        System.out.println("Hash code is " + largeHash);
        return largeHash;
    }
}
