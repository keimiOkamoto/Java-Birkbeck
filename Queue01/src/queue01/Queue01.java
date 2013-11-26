/**
 * insert(...) inserts an element at the beginning of the queue. 
 * retrieve(...) remove an element from the end of the queue. 
 * size() returns the current size of the queue.
 */

package queue01;


public class Queue01 {

    Queue01Node listStart = null ;
   // Queue01Node head;
    
    public static void main(String[] args) {
        
        Queue01 queue = new Queue01();
        queue.launch();
        
        Queue01Node node1 = new Queue01Node(1);
        queue.listStart.insert(node1);
        
        //Queue01Node node2 = new Queue01Node(2);
        //queue.listStart.insert(node2);
        
        //Queue01Node node3 = new Queue01Node(2);
        //queue.listStart.insert(node3);
        
        queue.listStart.size();
        System.out.println("hi");
    }
    
    public void launch () {
        
        Queue01Node firstNode = new Queue01Node(0);
        this.listStart = firstNode;
        //head = firstNode;
        //head.setHead(head);
    }
    
}
