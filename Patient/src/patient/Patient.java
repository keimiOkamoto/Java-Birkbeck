
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*Create the linked list and add several elements to it (around 10) **
Go throught the list printing out each element **
Delete a couple of elements from the list **
Print the elements in the list again. Check that the deleted elements have been deleted.
Check that you can delete the first element too.

 */


public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;
    
    
    public Patient (String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;
    }
    
    public Patient getNextPatient()
    {
        return this.nextPatient;
    }
    
    public void setNextPatient(Patient p)
    {
        this.nextPatient = p;
    }
    
    public Patient getPreviousPatient()
    {
        return this.previousPatient;
    }
    
    public void setPreviousPatient(Patient p)
    {
        this.previousPatient = p;
    }
    
    public void disply()
    {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Illness: " + this.illness);
    }
    

    
    /*public void firstPatient() {
        if (firstP == false) {
            System.out.println("Patient name is " + name);
            member++;
            System.out.println("Member no.:  " + member);
            firstP = true;
            }else {
           
            }
    }*/
    
 
    

    
}

