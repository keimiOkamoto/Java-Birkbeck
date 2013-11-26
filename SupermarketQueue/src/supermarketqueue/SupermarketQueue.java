/**
 * Use the interface PersonQueue that represents a queue of people waiting at the supermarket and then implement
 * it. You can use the deﬁnition and the implementations of StringStack as a guide. You can reuse any version of
 * class Person from past days. For example, depending on your implementation, you may want to use a version of
 * Person with or without internal pointers.
 * 
 * public interface PersonQueue {
/**
* Adds another person to the queue.

* void insert(Person person);
/**
* Removes a person from the queue.

Person retrieve();
}
* 
Then create a class Supermarket that has two methods: addPerson(Person) and servePerson(). These
methods must call the appropriate methods of PersonQueue.
*/

package supermarketqueue;

public class SupermarketQueue {

    PersonQueue first = null;
    
    public static void main(String[] args) {

        Supermarket aSupermarketContainer = new Supermarket();
        aSupermarketContainer.insert(new Person ("Spiderman" , 24));
        aSupermarketContainer.insert(new Person ("Thor" , 54));
        aSupermarketContainer.insert(new Person ("Hulk" , 18));
        aSupermarketContainer.insert(new Person ("Captain Ameria" , 3));
        aSupermarketContainer.insert(new Person ("Silver surfer" , 89));
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.insert(new Person ("Super Ted" , 89));
        //aSupermarketContainer.insert(new Person ("Deadpool" , 89));
        //aSupermarketContainer.insert(new Person ("Wolverine" , 89));
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        //aSupermarketContainer.retrieve(); // Removes the elememnt at end of the list
        
       
    }
    
}
