
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplemap2;

import java.util.Scanner;

public class Person implements Map {
    private String name;
    private Person next;
    private int key;
    
    public Person (String name,int key){
        this.key = key;
        this.name = name;
        this.next = null;
    }
    
    //Makes a linked list with x number of nodes.
    public void makeList(Person head, int numberOfPeopleNodes){
        
        head.next = new Person(null, 0);

        for (int i = 1; i < numberOfPeopleNodes; i++) {
            Person newPerson = new Person(null, 0);
            newPerson.next = this.next;
            head.next = newPerson;
        }
        System.out.println("There are a maximum of " + numberOfPeopleNodes + " people nodes to work with.");
    }
    
    
    //Ads the String to an empty key if it is already taken nothing is done.
    public void put(int key, String name) {

        Scanner x = new Scanner(System.in);
        if (this.next.name != null) {
            this.next.put(key, name);

        } else if (this.next.name == null) {
            System.out.println("Enter name..");
            //Adds a name
            String str = x.nextLine();
            this.next.name = str;
            //Adds Key
            int hash = str.hashCode();
            int reducedhash = HashUtilities.shortHash(hash);
            this.next.key = reducedhash;
        }
    }
    
    //Returns a name associated with that key
    public String get(int key) {

        if (this.next == null) {
            System.out.println("Not in the list.");
        } else if (this.next.key == key) {
            System.out.println("Match! Retrieving name and key...");
            System.out.println("Key selected: " + this.next.key + ". \nThe name returned is: " + this.next.name);
            return this.name;
        } else {
            this.next.get(key);
        }
        return null;
    }

    //Removes name by key
    public void remove(int key) {
        
        if (this.next == null) {
            System.out.println("Not in the list.");
        } else if (this.next.key == key) {
            System.out.println("Removing name and key...");
            System.out.println("Key Removed: " + this.next.key + ". \nName Removed: " + this.next.name);
            this.next.name = null;
            this.next.key = 0;
            

        } else {
            this.next.remove(key);
        }
    }
    

    //Returns true if there are no workers in the map false 
    public boolean isEmpty() {
        
        if (this.next == null) {
            return true;
        } else if (this.next.name != null) {
            return false;
        } else {
            return this.next.isEmpty();
        }
    }
    
    public void showMap(Person head){
    
        if (this.next.next == null){
            System.out.println("Key:" + this.next.key + " Name: " + this.next.name);
        } else {
            System.out.println("Key:" + this.next.key + " Name: " + this.next.name);
            this.next.showMap(head);
        }
    }
}
