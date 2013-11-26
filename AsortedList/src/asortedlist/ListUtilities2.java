/**
 * Make an array then convert it into a list the method must be static.
 * 
 * take in one array at the time.
 * Once an array element is taken in it is stored in a node
 * the node is then linked with the next, then the next, and so on, to form a linked list
 * 
 */

package asortedlist;


public class ListUtilities2 {
    
public ListNode2 firstNode;

    
public static ListUtilities2 arrayConvertToList ( int [] array) {
        
        ListUtilities2 container = new ListUtilities2();
        container.firstNode = new ListNode2(array [0]);
        container.firstNode.setFirst();
        
        for (int i = 1; i < array.length; i++) {
            ListNode2 newNode = new ListNode2(array [i]);
            container.firstNode.addSortNode(newNode, container); 
        }
        
        container.displayNode2();
        return container;
}

public void displayNode2(){
    this.firstNode.displayNode();
}

public void setFirstNode(ListNode2 newNode) {
    this.firstNode = newNode;
}

}
