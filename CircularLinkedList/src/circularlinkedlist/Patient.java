/**
 * Patient class
 * Circular linked list exercise.
 */

package circularlinkedlist;

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private static int pCount = 1;
    CircularLinkedList rootPointer;
    
    //constructor
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.rootPointer = null;
    }
    
    // Counts number of patients
    public void patientCount () {
    
          System.out.println("Patient count: " + pCount);
    }
    
    
    //Adds patient to the list. Checks for 
    public boolean addPatient(Patient newPatient, CircularLinkedList rootOfList ) {
        
        if (pCount == 1) {
            System.out.println("Pcount is one ");
            rootOfList.patientListStart = this;
            this.rootPointer = rootOfList;
            pCount++;
            return true;
        } else {
            System.out.println("" + this.name);
            // Checking for the end of the list
            if (this.rootPointer == rootOfList ) {
                System.out.println("trough");
                // If it is then the new pateint is added
                this.nextPatient = newPatient;
                this.rootPointer = null;

                newPatient.rootPointer = rootOfList;
                newPatient.nextPatient = rootOfList.patientListStart;
                return true;

            } else {
                System.out.println("else");
                return this.nextPatient.addPatient(newPatient, rootOfList);

            }
        
        }
    }
    
    
    /**
     * Returns true if the patient was found and removed, false otherwise
     */
    
    /*
    public boolean deletePatient(Patient patient) {
        
        if (this.nextPatient == this.nextPatient) {
            // patient to remove was not found
            return false;
        } 
        else if (this.nextPatient.name.equals(patient.name)) {
            // We found it! It is the next one!
            // Now link this patient to the one after the next 
            
            /**
             * If the patient at the end of the list is being deleted, the pointers are
             * re-organized.
             */
         /*  
                this.nextPatient = nextPatient.nextPatient; // if not the end 
                pCount--;
            
              if (nextPatient == null) {

              }else {
                    nextPatient.previousPatient = this;
              }
                return true;
        }
        else {
            return this.nextPatient.deletePatient(patient);
        }
    }
    */
    /*
    public boolean getData(Patient aPatient, CircularLinkedList rootOfList ) {
        
        if (this.rootPointer == rootOfList) {
            
            return false;
            
        }else{
          
            System.out.println("" + aPatient.name + " " + aPatient.age +" " + aPatient.illness);
            return this.getData(aPatient.nextPatient);            
        }

    }
 
    /*        
     // Prints patient in reverse.
    
    public boolean getDataReverse(Patient aPatient) {
        
        if (aPatient == null) { //If the patient does not exist
             
              return false;
        }
        else{
            System.out.println(aPatient.name + " " + aPatient.age +" " + aPatient.illness);
            return this.getDataReverse(aPatient.previousPatient);
        }

    }
    */
/*
    public boolean getPrevious (Patient aPatient) {
        if (this.previousPatient != null) {
            System.out.println("yup");
            return false;
        }else {
            System.out.println("Back--- " + aPatient.name + " " + aPatient.age +" " + aPatient.illness );
            return this.getPrevious (aPatient.previousPatient);
        }
    }
    */

}
