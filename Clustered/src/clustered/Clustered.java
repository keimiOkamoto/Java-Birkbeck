/**
 * Priority queue.
 * A queue is made, when the retrieve method is called it must check if the person is over 65,
 * After there are no more 65+ people in the queue, 18+ people get to leaver the queue. 
 * 
 */

package clustered;


public class Clustered {

   
    public static void main(String[] args) {
        Airport aAirport = new Airport();
        //aAirport.insert(new Person ("Spiderman", 14));
        //aAirport.insert(new Person ("Thor", 19));
        //aAirport.insert(new Person ("Hulk", 3));
        //aAirport.insert(new Person ("Captain Ameria", 16));
        aAirport.insert(new Person ("p1", 74));
        aAirport.insert(new Person ("p2", 90));
        aAirport.insert(new Person ("p3", 2));
        aAirport.insert(new Person ("p4", 26));
        aAirport.insert(new Person ("p5", 64));
        aAirport.insert(new Person ("p6", 10));
        aAirport.insert(new Person ("p7", 3));
        aAirport.insert(new Person ("p8", 90));
        
        
        
        aAirport.retrievePriority();
        aAirport.retrievePriority();
        aAirport.retrievePriority();
        aAirport.retrievePriority();
        
        aAirport.retrievePriority();
        //aAirport.retrievePriority();
        
        
       
     
        //aAirport.retrievePriority();
        
        //aAirport.retrievePriority();
        System.out.println("..................");
        //aAirport.retrievePriorityAge65plus();
        //aAirport.retrievePriorityAge65plus();
        //aAirport.retrievePriorityAge65plus();
      
        //System.out.println("prining...");
        aAirport.print();
        
        //aAirport.insert(new Person ("Silver surfer", 9));
       // aAirport.retrievePriorityAge65plus(); // Removes the elememnt at end of the list
        //aAirport.retrievePriority(); // Removes the elememnt at end of the list
        //aAirport.retrievePriority(); // Removes the elememnt at end of the list
        //aAirport.retrievePriority(); // Removes the elememnt at end of the list
        //aAirport.retrievePriority(); // Removes the elememnt at end of the list
        //aAirport.retrievePriority(); // Removes the elememnt at end of the list
        //aAirport.insert(new Person ("Super Ted" , 89));
        //aAirport.insert(new Person ("Deadpool" , 89));
        //aAirport.insert(new Person ("Wolverine" , 89));
       
    }
    
}
