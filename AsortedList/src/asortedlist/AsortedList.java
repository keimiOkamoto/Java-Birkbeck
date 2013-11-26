/**
 * Create a linked list of integers that is automatically sorted.
 * Everytime you add an element, make sure you introduce it at the right place in the queue so that the queue is
 * always sorted from lower to higher numbers.
 * Create the list, insert several numbers into it (around 15 is fine) and then go through the list printing the value
 * of each element. Check that the elements are correctly sorted.
 * 
 * 
 * Make an array of integer numbers then convert it into a list the method must be static.
 * 
 */

package asortedlist;

/**
 *
 * @author keimiokamoto
 */
public class AsortedList {

   public static void main (String[]arg){
    
       int [] num = {2,15,200,200,23,77,77,55,71,67,4,11,14,20,76,59,61,1000,1,2,4};
       ListUtilities2.arrayConvertToList(num);
   
   }
}
