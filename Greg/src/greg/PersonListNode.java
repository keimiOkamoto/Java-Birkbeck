/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greg;

public class PersonListNode {

   private Person thisPerson;
   private PersonListNode nextNode;
   private MyPersonList rootPointer;

    //This addPerson() method is different to the addPerson() method in the MyPersonList class. It is recursive. First it checks if
    //if the

    public void addPerson(Person p, MyPersonList rootOfList) {
        if (this.rootPointer == rootOfList) {
                      //System.out.println("In node containing " + this.thisPerson.getName() + ". It is currently the last node of the list. Adding new node to the end, pointing its rootPoint at the root of the list and adding person + " + p.getName());
            this.nextNode = new PersonListNode();
            this.nextNode.setThisPerson(p);
            this.nextNode.rootPointer = rootOfList;
            this.rootPointer = null;
            this.nextNode.nextNode = rootOfList.firstNode;
        } else {
           //System.out.println("In node containing person: " + this.thisPerson.getName());
            this.nextNode.addPerson(p, rootOfList);
        }
    }

    public Person getThisPerson() {
        return this.thisPerson;
    }

    public void setThisPerson(Person p) {
        this.thisPerson = p;
    }
    
    //Prints list out
    public Boolean getData (PersonListNode p, MyPersonList rootOfList) {
        
        if (rootOfList == p.rootPointer) {
            System.out.println("Item:  " + thisPerson.getName());
            return true;
        } else {
            System.out.println("Item:  " + thisPerson.getName());
            return p.nextNode.getData(p.nextNode, rootOfList);
        }
    }
    
    public Boolean deletePerson(String person, MyPersonList rootOfList) {
     //goes through the whole list
        if(this.rootPointer == rootOfList){
            return false;
        // if it's not the end one,  
        }else{
            //check if the name is equal to the one in queestion
            if(this.nextNode.thisPerson.getName().equals(person)){
                //Checks if it's the end of the list that is being deleted
                if(this.nextNode.rootPointer == rootOfList){
                    //if it is hte end, the previous one gets the head node
                    this.rootPointer = rootOfList;
                }
                // if it's a node in the middle that does the en
               this.nextNode = this.nextNode.nextNode;

               return true;

             //if name is not equal to the one in queestion, call the next one  
            }else{
                return this.nextNode.deletePerson(person, rootOfList);
            }
        }
    }
}
