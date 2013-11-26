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
public class Queues {
    private queue firstQ = null;
    private Queues rootOfList = this;
    
    public void setRootFirst(queue q){
        this.rootOfList.firstQ = q;
    }
    
    public void insert(queue q, Queues rootOfList){
        //check if all items have been retrieved but the firstQ object remains
        //the retrieve method sets the boolean to true and then nulls the firstQ
        if(firstQ != null && firstQ.getRootPointer() == null){
            firstQ = null;
        }
        //check if the first object is null, populate 
        if(firstQ == null){
            firstQ = q;
            firstQ.setRootPointer(rootOfList);
            System.out.println("Inserting request 1…");
        }else{
            //otherwise run the queue object's insert method
            firstQ.insert(q, rootOfList);
        }
    }
    
    public void retrieve(){
        //for sake of neatness when running the commands, retrieve() can be
        //run from the Queues object rather than Queues.firstQ.retrieve()
        
        //check if nothing has been added in which case print this fact
        if(firstQ == null){
            System.out.println("There are no requests in the queue");
        }else{
            firstQ.retrieve();
        }
    }
    
    public void size(){
        if(firstQ == null){
            System.out.println("There are no requests in the queue");
        }else{
            firstQ.size();
        }  
    }
    
    public static void main(String[] args) {
        //Create a new Queue
        Queues jam = new Queues();
        
        //Check the count works
        jam.size();
        
        //Insert first element and run size again
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
        
        //Test multiple commands, adding lots, deleting lots, deleting when nothing
        //is in the queue, resetting the firstQ...hopefully covering all bases
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
        jam.retrieve();
        jam.size();
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.size();
        jam.retrieve();
        jam.size();
        jam.retrieve();
        jam.size();
        jam.retrieve();
        jam.size();
        jam.retrieve();
        jam.size();
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.retrieve();
        jam.size();
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
        jam.retrieve();
        jam.retrieve();
        jam.size();
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.insert(new queue(), jam.rootOfList);
        jam.size();
    }
    
}
