/**
 * Static method converts array integers to a linked list. doesn't depend on
 * other variables. Can't touch other parts of the class. it is entirley
 * self-contained
 */
package fromlisttoarray;

public class ListUtilities {
    private ListUtilities next = this;
    private int num;
    private ListNode firstNode;
    
    // Static method which converts an array into a linked list.
    static ListUtilities arrayConvert(int [] array ) {  //ListUtilities is returned //Does it need to be public

        ListUtilities container = new ListUtilities(); // Top level
        container.firstNode = new ListNode(array [0]); // FirstNode now has a List node objectinside it. starting point.
        
        for (int i = 1; i < array.length; i++) { //Note starts at one!!
            ListNode newNode = new ListNode(array [i]); // new list node is made
            container.firstNode.add(newNode);
            
        }
        container.displayData();
        return container;
    }
    
    //Helper method
    public void displayData() {
        this.firstNode.dispayData2();
    }
    
    

}
