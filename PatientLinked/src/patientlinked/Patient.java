/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patientlinked;

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    //private static int pCount = 1; 
    //private Patient newPatient;
    
    //constructor
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        //pCount++;


    }

    // this is a member method of class Patient 
    public void addPatient(Patient newPatient) {
        
        if (this.nextPatient == null) {
           
            // this means this is the last patient in the list 
            this.nextPatient = newPatient;

        } else {
            
            this.nextPatient.addPatient(newPatient);
        }
    }

    //prints patient data
    public boolean getData(Patient newpatient) {
        
        if (newpatient == null) {
            
              return false;
        }else{
            System.out.println("" + newpatient.name + " " + newpatient.age +" " + newpatient.illness);
            return this.getData(newpatient.nextPatient);
          
        }
        
    }
    
    public void patientCount () {
    
          System.out.println("Patient count: "  );
    }
    
// this is a member method of class Patient
// returns true if the patient was found and removed, false otherwise

    public boolean deletePatient(Patient patient) {
        if (this.nextPatient == null) {
            // patient to remove was not found
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            // We found it! It is the next one!
            // Now link this patient to the one after the next 
            this.nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

}
