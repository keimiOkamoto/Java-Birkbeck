/**
 * A circular list that adds from the start of the list and deletes from the end.
 * 
 */

package myqueues;

public class MyQueues {

    private QueueNode listStart = null;
    private QueueNode head = null; // pointer
    //private QueueNode aux; // pointer

    public static void main(String[] args) {
    
        MyQueues q1 = new MyQueues();
        q1.launch();
       
        QueueNode s2 = new QueueNode(new Student ("Superman", 2)); 
        q1.listStart.insert(s2, null,null);
        
        QueueNode s3 = new QueueNode(new Student ("Spiderman", 3)); 
        q1.listStart.insert(s3, null,null);
        
        QueueNode s4 = new QueueNode(new Student ("Thor", 4)); 
        q1.listStart.insert(s4, null,null);
       
        q1.listStart.size();

        
    }
    
  
    
   public void launch () {
         QueueNode firststudent = new QueueNode(new Student ("John," ,0)); 
         this.listStart = firststudent;
         head = firststudent;//.getNextNode();
         //listStart.getFirstNext();
         //aux = firststudent.getAux();
         //aux = listStart.getNextNode();
         
    
   }
}
