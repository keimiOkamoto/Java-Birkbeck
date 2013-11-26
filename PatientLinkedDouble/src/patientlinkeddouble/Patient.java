/**
 * Patient class for doubly linked-list.
 */

package patientlinkeddouble;

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;
    private static int pCount = 1;
   
    //constructor
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;

    }
    
    
    // Counts number of patients
    public void patientCount () {
        System.out.println("Patient count: " + pCount);
    }
    
    // Adding another patient to to the end of the list.
    public void addPatient(Patient newPatient) {
        //  If this is the last patient in the list 
        if (this.nextPatient == null) {
            
            this.nextPatient = newPatient;
            newPatient.previousPatient = this;
            pCount++;

        } else {
            
            this.nextPatient.addPatient(newPatient);
        }
    }
    
    
  
    //Returns true if the patient was found and removed, false otherwise
    public boolean deletePatient(Patient patient) {
        // patient to remove was not found (Does not exist)
        if (this.nextPatient == null) {
            return false;
        } 
        else if (this.nextPatient.name.equals(patient.name)) {

            this.nextPatient = nextPatient.nextPatient; 
            pCount--;
                
            if (nextPatient == null) {
                } 
                else {
                    nextPatient.previousPatient = this;
                }
                return true;
        }
        else {
            return this.nextPatient.deletePatient(patient);
        }
    }
    
    // Prints data out.
    public boolean getData(Patient newpatient) {
        
        if ( newpatient.nextPatient == null ) { 
            
            return getDataReverse(newpatient);
            
        }else{
            System.out.println("" + newpatient.name + " " + newpatient.age +" " + newpatient.illness);
            return this.getData(newpatient.nextPatient);            
        }
    }
    
    // Prints data in reverse.
    public boolean getDataReverse(Patient aPatient) {
        
        if (aPatient == null) {
             
              return false;
        }
        else{
            System.out.println(aPatient.name + " " + aPatient.age +" " + aPatient.illness);
            return this.getDataReverse(aPatient.previousPatient);
        }
    }

}
