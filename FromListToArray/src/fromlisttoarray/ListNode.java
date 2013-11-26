/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fromlisttoarray;


public class ListNode {
    
    private int number;
    private ListNode next;
    
    // Constructor
    public ListNode (int number) {
        this.number = number;
        this.next = null;
    }
    // Adds a the newNode to the end of the list, and 
    public void add (ListNode newNode) {
        // this is firstNode
        if (this.next == null) {
            this.next = newNode;
        } 
        else {
            this.next.add(newNode);
        }
    }
    
    public boolean dispayData2 () {
        
        if (this.next == null) { //always the firstNode
            System.out.println(this.number);
            return false;
        }
        else {
            
            System.out.println(this.number);
            return this.next.dispayData2();
        }
    }
    
    
}


