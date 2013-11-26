/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clustered;

public interface PersonQueue{
/**
 * Adds another person to the queue
 */
 void insert (Person p);
 
 /**
  * Removes a person from the queue in priority order, 65+ first then 18+, then the rest.
  */
 Person retrievePriority();

}

