/**
 * Interface for maps
 */

package simplemap;

public interface Map {
        //Ads the String to an empty key if it is already taken nothing is done.
    void put (int key, String name);
    
    //Returns a name associated with that key
    String get (int key);
    
    //Removes name by key
    void remove (int key);
    
    //Returns true if there are no workers in the map false 
    boolean isEpty();
}
