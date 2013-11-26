

package bubblesort;

/**
 *
 * @author keimiokamoto
 */
public class BubbleSort {


    public static void main(String[] args) {
        int [] num = {5,3,10};
        ListUtilities.convertArrayToList(num);
        ListUtilities.bubbleSortList(ListUtilities.convertArrayToList(num));
        System.out.println("" );
                
    }
    
}
