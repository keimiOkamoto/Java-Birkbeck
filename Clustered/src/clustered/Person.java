/**
 * Person Class. 
 */

package clustered;


public class Person {
    private String name;
    private int age;
    private Person next;
    private Person previous;
    private boolean sixtyfive = true;
    private boolean eighteens = false;
    // Constructor 
    public Person (String name, int age){
        this.name = name;
        this.age = age;
        this.next = null;
    }
    //Delets end nodes but will not delete the head.
    public Person delete(Person head) {
      
        if (this.next == null) {
            //if the end is over 65 it is cut off
            if (this.getAge() > 65 && sixtyfive) {
                this.previous.next = null;
                this.previous = null;
                return null;
            // if the end isn't over 65    
            } else if (this.getAge() <= 65) {
                // if the head is the one ovaear 65. Special case
                if (reverseCheck65() == false && sixtyfive) {
                    System.out.println("this should be 3" + this.getName());
                    sixtyfive = false;
                    eighteens = true;
                    return head;
                    
                } else if (!sixtyfive){
                    System.out.println("Going to test for 18's now..");
                    
                    if (delete18s() == false && eighteens) {
                        head.next.previous = null;
                        head.next = null;
                        return head;
                    } else if (delete18s() == true && !eighteens){
                        System.out.println("No priority needed!");
                            if (noPriority() == false){
                                head.next.previous = null;
                                head.next = null;
                                return head;
                            } else {
                                System.out.println("not head has been deleted");
                                return null;
                            }
                    }
                }
            }
        } else {
            return this.next.delete(head);
        }
        return null;
    }
    public boolean reverseCheck65() {
       
       if (this.previous == null) {
           //Sends the message to delete the head node.
           if (this.getAge() > 65) {
               sixtyfive = false;
               return false;
           } else {
               System.out.println("this means none are older than 65.");
               sixtyfive = false;
               eighteens = true;
               return true;
           }
       } else if (this.getAge() > 65) {
           System.out.println("this is " + this.getName());
           this.previous.next = this.next;
           this.next.previous = this.previous;
           this.next = null;
           this.previous = null;
           return true;
       } else {
           return this.previous.reverseCheck65();
       } 
    }
    
    
    public boolean delete18s(){
        if (this.next == null) {
           
            // if the end node is bigger than 18 it is taken off
            if (this.getAge() > 18){
                System.out.println("No 65+ or 18+!");
                this.previous.next = null;
                this.previous = null;
            } else {
                if ( reverseCheck18s() == false){
                    return false;
                } else {
                
                }
            }
            return true;
        } else {
            return this.next.delete18s();
        }
    }
    
    public boolean reverseCheck18s() {
       
        if (this.previous == null) {
            System.out.println("" + this.getName());
            //Sends the message to delete the head node.
            if (this.getAge() > 18) {
                eighteens = false;
                return false;
            } else {
                System.out.println("this means none are older than 18.");
                eighteens = false;
                return true;
            }
        } else if (this.getAge() > 18) {
            System.out.println("this is " + this.getName());
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.next = null;
            this.previous = null;
            return true;
        } else {
            return this.previous.reverseCheck18s();
        }
    }
    
    public boolean noPriority(){
        System.out.println("***NOo pr" + this.getName());
        if (this.next == null){
            if (this.previous == null){
                return false;
            } else {
                this.previous.next = null;
                this.previous = null;
                return true;
            }
        } else {
            return this.next.noPriority();
        }
    }
    
   

    //Gets p's next pointer ref
    public Person getNextPerson (Person p) {
      return this.next;
    }
    //Gets newPerson's next pointer to connect to the current
    public void setNext(Person currenthead){ 
        this.next = currenthead;
    }
    //Sets the head's previous to the new head
    public void setheadPrevious (Person newPerson) {
        this.previous = newPerson;
    }
    //Get's person's name
    public String getName () {
        return this.name;
    }    
    //Get's person's name
    public int getAge () {
        return this.age;
    }    
    public Person getHeadNext(){
        return this.next;
    }
    public Person getHeadPrevious(){
        return this.previous;
    }
    public Person setHeadNext(Person newP){
        return this.next = newP;
    }
    public boolean printQueue(Person head) {
        
        if (this.next == null) {
            System.out.println("" + this.getName() + " " + this.getAge());
            return true;
        } else {
            System.out.println("" + this.getName() + " " + this.getAge());
            return this.next.printQueue(head);
        }
    }
}
