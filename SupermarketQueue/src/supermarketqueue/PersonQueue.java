/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermarketqueue;

public interface PersonQueue{
/**
 * Adds another person to the queue
 */
 void insert (Person p);
 
 /**
  * Removes a person from the queue
  */
 Person retrieve();
 
 
}

