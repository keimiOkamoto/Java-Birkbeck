/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;


public class ListUtilities {
    ListNode first;
    
    public static ListUtilities bubbleSortList (ListUtilities li) {
        li.first.setFirst();
        li.first.bubbleSortNodes(li);
        li.displayHelp();
       
        return li;
        
        
        /*
        if(li.first.next == null) { //if there is only 1
            System.out.println("hiho");
            
           
        }else { 
            while(li.first != null){
                System.out.println("first: " + li.first.num);
                if(li.first.num > li.first.next.num){ //swap
                    //System.out.println("first should be 5  :" + li.first.num);
                    //System.out.println("second should be 3 :" + li.first.next.num);
                    li.first.next.next = li.first; 
                    li.first = li.first.next;

                    System.out.println("first should be 3  :" + li.first.num);
                    System.out.println("second should be 5 :" + li.first.next.num);
                    li.setNewFirst();
                    System.out.println("new should be 5 " + li.first.num);
                    System.out.println("new should be 15 " + li.first.next.num);
                    
                } else {
                    li.setNewFirst();
                }
            } 
        */
        
    }
    
public void setFirstNode(ListNode newNode) {
    this.first = newNode;
}

    
    
    public static ListUtilities convertArrayToList(int [] array){
        
        ListUtilities container = new ListUtilities();
        container.first = new ListNode(array[0]);
        
        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode(array [i]);
            container.first.addNode(newNode);
        }
        //container.displayHelp();
        return container;
    }
    
   
    
    public void displayHelp(){
        this.first.displayNode();
    }
}
