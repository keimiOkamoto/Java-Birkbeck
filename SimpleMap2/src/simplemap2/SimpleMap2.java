/**
 * 
 */

package simplemap2;

import java.util.Scanner;
public class SimpleMap2 {

    Person head;
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        Person head = new Person(null,0);
        head.makeList(head, 5);
        /*
        String str = x.nextLine();
        int hash = str.hashCode();
        int reducedhash = HashUtilities.shortHash(hash);
        head.put(reducedhash, str);
        */
        
        head.put(0, null);
        head.put(0, null);
        head.put(0, null);
       
        System.out.println("__________________");
       
        
        head.showMap(head);
        head.remove(840);
        head.remove(230);
        head.get(230);
        System.out.println("__________________");
        head.showMap(head);
        System.out.println("It's "+head.isEmpty() + " that the map is empty!");
        head.put(0, null);
        head.put(0, null);
        head.put(0, null);
        head.showMap(head);
        System.out.println("It's "+head.isEmpty() + " that the map is empty!");
        System.out.println("");
    }
    
}
