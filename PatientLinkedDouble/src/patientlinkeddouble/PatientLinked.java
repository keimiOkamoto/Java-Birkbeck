/**
 * 1. Create the doubly-linked list and add several elements to it (around 10 is fine). 
 * 2. Traverse it forwards and backwards printing out the content of each element.
 * 3. Delete a couple of elements from the list.
 * 4. Traverse it forwards and backwards printing out the content of each element.
 * 5. Add a new element to the list. Try to delete an element that is NOT in the list. 
 * 6. Traverse it forwards and backwards printing out the content of each element.
 */

package patientlinkeddouble;

/**
 *
 * @author keimiokamoto
 */
public class PatientLinked {
    //empty linked list
    private Patient patientListStart = null;
    private int numberOfPatients = 0;
    
    
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
     
        
       // hm.patientListStart.deletePatient(aPat1);
        //hm.patientListStart.deletePatient(aPat2);
         //hm.patientListStart.deletePatient(aPat2);
         
        
         
         hm.patientListStart.deletePatient(aPat2);
         hm.patientListStart.getData(hm.patientListStart);
         
         hm.patientListStart.deletePatient(aPat5);
         hm.patientListStart.getData(hm.patientListStart);
         
         hm.patientListStart.deletePatient(aPat5);
         hm.patientListStart.getData(hm.patientListStart);
        
         //hm.patientListStart.getData(hm.patientListStart);
    
       // hm.patientListStart.patientCount();
       // hm.patientListStart.getPrevious(aPat8);
    }
   
     public void launch () {
       // System.out.println("hkjhdka");
         Patient firstPatient = new Patient("John", 33, "Tuberculosis"); 
         this.patientListStart = firstPatient;
         
         

        /* 
         
         
         
         Patient yetAnotherPatient2 = new Patient("Hulk" , 20 , "Sore knuckle"); 
         patientListStart.addPatient(yetAnotherPatient2);
         */
         //patientListStart.getData(firstPatient);
    }
    
}