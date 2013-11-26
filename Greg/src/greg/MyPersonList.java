/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greg;
public class MyPersonList {

    private PersonListNode firstNode;
    private MyPersonList rootOfList = this;

    //The addPerson() method in this root list class will assign a new PersonListNode to the root variable if it is null (ie. when the         
    //list is empty).
    //Otherwise it will call the addPerson() method of the PersonListNode that is already assigned to its root variable (the first             
    //element of the list. If the root variable is null, it points the rootPointer variable of the new (and therefore first)                             
    //PersonListNode to the MyPersonList. This is our marker.

    public void addPerson(Person p) {
        
        if (firstNode == null) {
            firstNode = new PersonListNode();
            firstNode.thisPerson = p;
            firstNode.rootPointer = this;
        } else {
            firstNode.addPerson(p, rootOfList);
        }
    }

     public static void main(String[] args) {

        MyPersonList myPersonList = new MyPersonList();
        myPersonList.addPerson(new Person("Person One"));
        myPersonList.addPerson(new Person("Person Two"));
       
        myPersonList.addPerson(new Person("Person Three"));
        
         /*
        myPersonList.addPerson(new Person("Person Four"));
        myPersonList.addPerson(new Person("Person Five"));
        myPersonList.addPerson(new Person("Person Six"));
        myPersonList.addPerson(new Person("Person Seven"));
        myPersonList.firstNode.getData(myPersonList.firstNode , myPersonList.rootOfList);
        myPersonList.firstNode.deletePerson("Person Two", myPersonList.rootOfList);
        myPersonList.firstNode.getData(myPersonList.firstNode , myPersonList.rootOfList);
        */
 
    }
}


