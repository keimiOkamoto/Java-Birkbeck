/**
 * supermarket obj implements the PersonQueue
 * add, remove people in a queue structure.
 * 
 */

package supermarketqueue;


public class Supermarket implements PersonQueue {
    
    private Person head = null;
    private Person endPointer = null;

   // Adds the person at the head
    public void insert (Person newPerson) {
         // First Person is added.
        if (head == null) {
            head = newPerson;
        } else {
            newPerson.setNext(head);
            head = newPerson;
        }
        
        System.out.println(this.head.getName() + ", has entered the queue.");
    }

    // Removes the person at the end of the list. So if end equals null
    public Person retrieve(){
       // If the list is empty
        if (head == null) { 
            System.out.println("Nothing in the queues to retrieve. \nPlease add some people to the queue.");
            return null;
        //Calls the deleteEnd method which deletes the end node except for the last two
        } else if(head.getNextPerson(head) != null){
            head.deleteEnd(head);
        //    
        } else if (head != null) {
            System.out.println("DELETED " + head.getName() + " has been DELETED");
            head = null;    
        }
        return null;
    } 
    
    
}
