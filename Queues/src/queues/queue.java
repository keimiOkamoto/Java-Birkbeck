/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queues;

/**
 *
 * @author lawrencechin
 */
public class queue {
    private int qNumber;
    private queue nxtQueue;
    private Queues rootPointer;
    private static int count = 0;
    
    public queue(){
        count++;
        this.qNumber = 1;
        this.nxtQueue = null;
    }
    
    public void size(){
        if(count != 1){
            System.out.println("There are "+count+" requests in the queue");
        }else{
            System.out.println("There is "+count+" request in the queue");
        }
    }
    
    public Queues getRootPointer(){
        return this.rootPointer;
    }
    
    public void setRootPointer(Queues q){
        this.rootPointer = q;
    }
    
    public boolean insert(queue q, Queues rootOfList){
        if(this.rootPointer == rootOfList){
            //we want the FIRST item in queue, we then replace the first item
            //with a new item at the head of the queue
            
            //reset the rootpointer to the new queue element being inserted
            //link the new element to the previous first element
            
            this.rootPointer = null;
            q.rootPointer = rootOfList;
            q.nxtQueue = this;
            q.qNumber = this.qNumber +1;
            
            //set the firstQ to the new item after linking the previous
            //using nxtQueue
            rootOfList.setRootFirst(q);
            
            System.out.println("Inserting request "+q.qNumber+"…");
            return false;
        }else{
            //if working correctly, the new item is always at the start
            //of the list, no recursive call needs to be made
            return false;
        }
    }
    
    public boolean retrieve(){
        if(this.nxtQueue == null){
            //special check for the first element avoiding null pointer error
            if(count == 0){
                this.size();
                this.rootPointer = null;
                return false;
            }else{
                count--;
                System.out.println("Retrieving request "+this.qNumber+"…");
                return this.retrieve();
            } 
        }
        if(this.nxtQueue.nxtQueue == null){
            //look two steps ahead for last element, to be deleted
            System.out.println("Retrieving request "+this.nxtQueue.qNumber+"…");
            
            //unlink the last element in list
            this.nxtQueue = null;
            //deincrement count for both the overall size and for new elements
            count--;
            return true;
        }else{
            //run the next queue item 
            return this.nxtQueue.retrieve();
        }
    }
}
