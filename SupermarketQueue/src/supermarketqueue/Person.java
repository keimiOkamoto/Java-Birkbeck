/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarketqueue;


public class Person {
    private String name;
    private int age = 0;
    private Person next;
    
    // Constructor 
    public Person (String name, int age){
        this.name = name;
        this.age = age;
        this.next = null;
    }
    //Delets end nodes except the head and the one next to
    public Person deleteEnd(Person head) {
        if(this.next.next == null){
            Person p = this.next;
            System.out.println("DELETED " + p.name + " has been DELETED");
            this.next = null;
            return p;
        } else {
            return this.next.deleteEnd(head);
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
    //Get's person's name
    public String getName () {
        return this.name;
    }    
}
