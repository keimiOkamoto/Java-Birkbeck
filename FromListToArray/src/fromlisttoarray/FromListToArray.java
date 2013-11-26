/**
 * --From array to list--
 * Create a static method that takes an array of integers and returns a linked 
 * list of integers in the same order as the original array. 
 * 
 * You can put this method in a class called ListUtilities so that you can easily use it for the 
 * following exercises. 
 * 
 * Initialising an array with 15-20 elements is very easy with curly-brackets-notation, 
 * so it is common to create an array and then convert it into a dynamic 
 * structure automatically.
 */

package fromlisttoarray;

/**
 *
 * @author keimiokamoto
 */
public class FromListToArray {

    
    public static void main(String[] args) {
       
        int [] num  = {78,56,10,7,3,200};
        ListUtilities.arrayConvert(num);
        

    }
    
}
