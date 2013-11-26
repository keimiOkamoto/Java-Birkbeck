/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class HospitalManager { //list of patients
    private Patient patientListStart = null; //starting pointer of the list 'head of the list'
    private int numberOfPatients = 0;
    
    public static void main(String[] args) {

        HospitalManager hm = new HospitalManager();
        
        Patient aPatient1 = new Patient("Super Mario" , 42 , "common flu");
        hm.addPatient(hm.getStartOfList(), aPatient1);
        /*Patient aPatient2 = new Patient("Batman" , 28 , "Bat flu");
        Patient aPatient3 = new Patient("Superman" , 32 , "Bad hair");
        Patient aPatient4 = new Patient("Hulk" , 20 , "Sore knuckle");
        Patient aPatient5 = new Patient("Micky Mouse" , 99 , "Cheese fever");
        Patient aPatient6 = new Patient("Thor" , 45 , "Memory loss");
        Patient aPatient7 = new Patient("Cat Woman" , 24 , "Broken tail");
        Patient aPatient8 = new Patient("Spiderman" , 27 , "Anti-spider poisoning");
        //*/
            

    }
    public HospitalManager() {
        this.patientListStart = null; // the list at the launch will be empty
        this.numberOfPatients = 0; // the number of patients at the launch would be 0.
    }
    
    public Patient getStartOfList(){
        return this.patientListStart;
    }
   

    public void addPatient(Patient Pointer, Patient newPatient){
        if(this.patientListStart == null)
        {
            this.patientListStart = newPatient;
            return;
        }
        else
        {   
            if(Pointer.getNextPatient() == null)  
            {
                Pointer.setNextPatient(newPatient);
            }
            else
            {
                addPatient(Pointer.getNextPatient(), newPatient);
            }
        }
    }

    /*public void deletePatient() {
        System.out.println("Pateint " + name + " has been deleted");
        member--;
    }*/


}
