/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gregcircle;

public class QueueNode {

    public Student student = null;
    public QueueNode nextNode = null;
    public QueueNode firstElementPointer = null;
    
    

    public void addStudent(Student student, QueueNode firstElement) {
        if (this.nextNode == null) {
            this.nextNode = new QueueNode();
            this.nextNode.student = student;
            this.firstElementPointer = null;
            this.nextNode.firstElementPointer = firstElement;
        } else {
            nextNode.addStudent(student, firstElement);
        }
    }
    // Gregs next solution
    public Student deleteStudentByName (String name, QueueNode firstElement) {
        Student student = null;
        if (this.firstElementPointer != null) {
            if (name.equals(this.firstElementPointer.student.getName())) {
                student = this.firstElementPointer.student;
                this.nextNode = firstElementPointer.nextNode;
                this.firstElementPointer = nextNode;
                this.nextNode = null;
                return student;
            } else {
                return student;
            }
        } else if (name.equals(this.nextNode.student.getName())) {
            student = this.nextNode.student;
            if (this.nextNode.firstElementPointer == firstElement) { //if at the end of the list
                this.firstElementPointer = firstElement;
                this.nextNode = null;
            } else {
                this.nextNode = this.nextNode.nextNode;
            }
            return student;
        } else {
            return this.nextNode.deleteStudentByName(name, firstElement);
        }
    }
    
    
    /*
    //My solution......Deletes a student. Takes in a name as it's parameter, if name isn't found it returns false.
    public boolean deleteStudentByName(String name, QueueNode firstElement){
        
        // If next node is null it's at the end of the list and the name wasn't found.
        if (this.nextNode == null) { 
            return false;
        //If the name entered matches the node * Excludig first one. *    
        } else if (this.nextNode.student.getName().equals(name)){  
            // If the end Node is being deleted.
            if (this.nextNode.firstElementPointer == firstElement){ 
                this.nextNode.firstElementPointer = null;
                this.nextNode = null;
                this.firstElementPointer = firstElement;
                return true;
            //Any other node is being deleted.    
            } else {
                this.nextNode = this.nextNode.nextNode;
            
                /*(this.nextNode.student.getName().equals(name) ){ 
                this.firstElementPointer = this.nextNode;
                this.nextNode = this.nextNode.nextNode;
                this.firstElementPointer.nextNode = null;
                this.firstElementPointer = null;
                return true;
                */
            /*    
            // If the first node is being deleted.    
            } else if(firstElement.student.getName().equals(name)) { 
                firstElement.nextNode = this.nextNode.nextNode;
                this.nextNode = null;
                return true;
            }
        } else {
            //calls the next node and searches for the name 
            return this.nextNode.deleteStudentByName(name, firstElement); 

        }
        return true;
    } 
    */
    
    public Student getStudentByName(String name) {
        if (name.equals(this.student.getName())) {
            return this.student;
        } else {
            return nextNode.getStudentByName(name);
        }
    }
    
    //Prints the names of the students in the list.
    public boolean printData () { 
        if (this.nextNode == null ){
            System.out.println("" + this.student.getName());
            return false;
        }else {
            System.out.println("" + this.student.getName());
            return this.nextNode.printData();
        }
    }
}
