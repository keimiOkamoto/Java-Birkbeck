/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;


public class ListNode {
    int num;
    private ListNode next;
    private ListNode temp;
    private boolean first = false;
    
    // Constructor
    public ListNode (int num) {
        this.num = num;
        this.next = null;
        this.temp = null;
    }
    
    public void bubbleSortNodes(ListUtilities li) {
        
        if (this.next == null){
          //then its at the end of the list
        } else if (this.num > this.next.num) {
            this.next.temp = this.next.next;
            this.next.next = this;
            this.next = this.next.next;
            
            if (first) {
                first = false;
                //this.next.next = this;
                this.first = true;
                li.setFirstNode(this);
            }

        } else {
            this.next.bubbleSortNodes(li);
        }
    }
    
    
    public void setFirst(){
    this.first = true;
    }
    
    
    public void addNode(ListNode newNode){
        if (this.next == null) {
            this.next = newNode;
            
        }
        else{
            this.next.addNode(newNode);
        }
    }
    
    public boolean displayNode() {
        if (this.next == null){
            System.out.println(this.num);
            return false;
        }
        else {
            System.out.println(this.num);
            return this.next.displayNode();
        }
    }
    

}
