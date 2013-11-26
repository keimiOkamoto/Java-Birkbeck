/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplemap;

/**
 *
 * @author keimiokamoto
 */
public class NameList implements Map {
    public Node first = null;
    public String name;
    public int key = 0;
    

        //Ads the String to an empty key if it is already taken nothing is done.
    public void put (int key, String name){
        key %= 1000;
        System.out.println("Key is " + key + " for " + name);
        
        //new array is made to store the name and key
        if (this == null){
            System.out.println("first null");
            first = new Node ();
            first.name = name;
            first.key = key;
        } else {
            Node newNode = new Node();
            newNode.name = name;
            newNode.key = key;
            newNode.next = this;
        }
        
        
    }
    
    //Returns a name associated with that key
    public String get (int key){
        int index = key %= 1000;
        System.out.println("trying to find key..  " + key);
        
        if (key != index){
            System.out.println("noMatch");
        }else {
            System.out.println("Key was found in  " + index);
        }
       
    return this.name;
    }
    
    //Removes name by key
    public void remove (int key){
    
    }
    
    //Returns true if there are no workers in the map false 
    public boolean isEpty(){
    return false;
    }
}
