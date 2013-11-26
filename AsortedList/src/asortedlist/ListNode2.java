/**
 * 
 * List node obj that hols a number.
 */

package asortedlist;


public class ListNode2 {
 
private int num;
private ListNode2 next;
private boolean first = false;

// Constructor 

public ListNode2(int num) {
    this.num = num;
    this.next = null;
}

/* 
public void addNode(ListNode2 newNode) {
    if (this.next == null) { // this = firstNode the first time round
        this.next = newNode;
    }
    else {
        this.next.addNode(newNode);
    }
} 
*/

    public void addSortNode(ListNode2 newNode, ListUtilities2 lu) {

        if (this.next == null) {
            if (this.num > newNode.num) {
                if (first) {
                    first = false;
                    newNode.next = this;
                    newNode.first = true;
                    lu.setFirstNode(newNode);
                }
            } else {
                this.next = newNode;
            }
        } else {
            if (this.next.num > newNode.num && this.num <= newNode.num) {
                newNode.next = this.next;
                this.next = newNode;
            } else if (this.num > newNode.num) {
                if (first) {
                    first = false;
                    newNode.next = this;
                    //newNode.first = true;
                    //lu.setFirstNode(newNode);
                }
        } else {
                this.next.addSortNode(newNode, lu);
            }
        }
    }

public boolean displayNode() {
    if (this.next == null) {
        System.out.println(this.num);
        return false;
    }
    else {
        System.out.println(this.num);
        return this.next.displayNode();
    }

}

public void setFirst(){
    this.first = true;
}


}
