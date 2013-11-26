
package myqueues;


public class QueueNode {

    private Student newStudent;
    private QueueNode nextNode;
    private int count = 1;
 
    // constructor
    public QueueNode (Student newS) {
        this.newStudent = newS;
        this.nextNode = null;
    
    }
    
    // Adds a person at the start of the list. 
    public void insert(QueueNode newNode, QueueNode aux, QueueNode head) {
       
       // Need code that checks for the end, While (aux.next != head)?
      if (aux == head) {
        
            
            System.out.println("Student " + newNode.newStudent.getName() + " has been added");
            newNode.nextNode = this.nextNode;
            this.nextNode = newNode; 
            head = this;
            head.nextNode = newNode;
            count ++;
         
            System.out.println("Head of list is " + head.newStudent.getName() + " head.next " + head.nextNode.newStudent.getName());
            System.out.println(head.newStudent.getName() + " is now the head of the list.");
            System.out.println("There are now " + count + " people in the ist.");
            System.out.println("------------------------------------");
            
                     
      } else {
        
          this.nextNode.insert(newNode, aux, head);
      }
    }
    
    
    public void retrieve(int id) {
      // Dindn't finish writing this as i notices some mistakes in the "insert" method. 
      count--;
    }
    
    public void size() {
         System.out.println("There are " + count + " people in the list.");
    }

}
