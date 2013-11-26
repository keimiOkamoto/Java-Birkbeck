/**
 * A circular list is a dynamic list in which there is a beginning but there is no end: 
 * the last element is pointing back to the first element. Circular lists can be singly- or doubly-linked. 
 * In this exercise, you must create a singly-linked circular list using the “hospital and patients” example 
 * as a starting point.
 * 
 * 1. Create the circular list and add several elements to it (around 10 is fine).
 * 2. Traverse it forwards for one complete loop. While you go around the list, print out the 
 * content of each element.
 * How do you know that you have reached the end of the list when you never find a null pointer?
 * 3. Delete a couple of elements from the list.
 * 4. Traverse it again printing out the content of each element.
 * 5. Add a new element to the list. Try to delete an element that is NOT in the list.
 * 6. Traverse it again printing out the content of each element.
 */

package circularlinkedlist;


public class CircularLinkedList {
    Patient patientListStart = null; //first
    CircularLinkedList rootOfList = this; //pointer to it's self
 
    
    public static void main(String[] args) {
  
        CircularLinkedList hm = new CircularLinkedList();
        hm.launch();
        
        Patient aPat1 = new Patient("Mary", 66, "Meningitis"); 
        hm.patientListStart.addPatient(aPat1, null);
        /*
        Patient aPat2 = new Patient("Superman" , 32 , "Bad hair");
        hm.patientListStart.addPatient(aPat2);
     
        Patient aPat3 = new Patient("Shaun" , 5 , "Massive Elbow");
        hm.patientListStart.addPatient(aPat3);
         /* 
        Patient aPat4 = new Patient("Hulk" , 20 , "Sore knuckle");
        hm.patientListStart.addPatient(aPat4);
        
        Patient aPat5 = new Patient("Micky Mouse" , 99 , "Cheese fever");
        hm.patientListStart.addPatient(aPat5);
        
        Patient aPat6 = new Patient("Thor" , 45 , "Memory loss");
        hm.patientListStart.addPatient(aPat6);
        
        Patient aPat7 = new Patient("Cat Woman" , 24 , "Broken tail");
        hm.patientListStart.addPatient(aPat7);
        
        Patient aPat8 = new Patient("Spiderman" , 27 , "Anti-spider poisoning"); 
        hm.patientListStart.addPatient(aPat8);
     */
        
       // hm.patientListStart.deletePatient(aPat1);
        //hm.patientListStart.deletePatient(aPat2);
         //hm.patientListStart.deletePatient(aPat2);
         
        
         
        // hm.patientListStart.deletePatient(aPat2);
        // hm.patientListStart.getData(hm.patientListStart);
         
        // hm.patientListStart.deletePatient(aPat5);
     //    hm.patientListStart.getData(hm.patientListStart);
         
       //  hm.patientListStart.deletePatient(aPat5);
        // hm.patientListStart.getData(hm.patientListStart);
        
        //hm.patientListStart.getData(hm.patientListStart);
    
        hm.patientListStart.patientCount();
      
    }
   
     public void launch () {
       
         Patient firstPatient = new Patient("John", 33, "Tuberculosis"); 
         this.patientListStart = firstPatient;
         
         
    }
    
}
