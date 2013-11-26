/**
 * Student object
 * Stores name and id of a student
 */

package myqueues;


public class Student {
    String name;
    int id;
  
    // Constructor
    public Student (String name, int id) {
        this.name = name;
        this.id = id;
        
    }
    
    // Method to get name
    public String getName() {
        return this.name;
    }
    // Method to get ID
    public int getId() {
        return this.id;
    }
    
    // Method to get name
    public void setNameId(String name, int id) {
       this.name = name;
       this.id = id;
    }
}
