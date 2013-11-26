/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patientlinked;

/**
 *
 * @author keimiokamoto
 */
public class PatientLinked {
    //empty linked list
    private Patient patientListStart = null;
    //private int numberOfPatients = 0;
    
    
    public static void main(String[] args) {
        PatientLinked hm = new PatientLinked();
        hm.launch();
        
        
        Patient aPat1 = new Patient("Mary", 66, "Meningitis"); 
        hm.patientListStart.addPatient(aPat1);

        Patient aPat2 = new Patient("Superman" , 32 , "Bad hair");
        hm.patientListStart.addPatient(aPat2);
        
        Patient aPat3 = new Patient("Shaun" , 5 , "Massive Elbow");
        hm.patientListStart.addPatient(aPat3);
        
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
        
        
        hm.patientListStart.deletePatient(aPat8);
        hm.patientListStart.deletePatient(aPat3);
        
        hm.patientListStart.getData(hm.patientListStart);
        hm.patientListStart.patientCount();
    }
   
     public void launch () {
         Patient firstPatient = new Patient("John", 33, "Tuberculosis"); 
         this.patientListStart = firstPatient;
    
    }
    
}