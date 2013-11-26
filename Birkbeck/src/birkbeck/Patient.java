/*Create the linked list and add several elements to it (around 10)
Go throught the list printing out each element
Delete a couple of elements from the list
Print the elements in the list again. Check that the deleted elements have been deleted.
Check that you can delete the first element too.

 */

package birkbeck;

/**
 *
 * @author keimiokamoto
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    
    public Patient (String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }
    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
        }else {
            this.nextPatient.addPatient(newPatient);
        }
    }
    
}
