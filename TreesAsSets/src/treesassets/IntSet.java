/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treesassets;

public interface IntSet {
    // adds a new int to the set; if it is there already, nothing happens.
    void add(int number); 
    
    //returns true if the number is in the set, false otherwise.
    boolean contains(int number); 
    
    //returns the same values as the former method, but for every element that is checked prints its value on screen.
    int containsVerbose(int number);
    
    //returns a string with the values of the elements in the set separated by commas.
    String toString(); 
}
