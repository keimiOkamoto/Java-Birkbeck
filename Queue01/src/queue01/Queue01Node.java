/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue01;

/**
 *
 * @author keimiokamoto
 */
public class Queue01Node {
    
    private Queue01Node nextNode;
    private int num;
    private int count = 0;
   // Queue01Node tempNode;
    
    
    // Constructor
    public Queue01Node (int num) {
        this.num = num;
        this.nextNode = null;
    }
    
    public void setHead (Queue01Node head) {
       // head.nextNode = this;
    }
    
    
    // Adds an element to the start of the list
    public void insert(Queue01Node newNode) {
        
        if (count == 0) {
            //So the first Node in the list acts as a node that provides a ref point.
            //In the 
            System.out.println("first");
            this.nextNode = newNode;
            count++;
        }
        else {
           
            newNode.nextNode = this.nextNode;
            //tempNode.nextNode = newNode;
            count++;
        }
  
    }
    public boolean retrieve() {
    
    }
    
    public void size() {
        System.out.println("The number of nodes in this list is " + count + ".");
    
    }
}
