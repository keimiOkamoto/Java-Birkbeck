/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integerbinarytree;

public class IntegerTreeNode implements TreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;
    
    
    // Constructor
    public IntegerTreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    
    // Adds a node
    public void add(int newNumber) {
        
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
                
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }
    
    // Retruns true if the node you are searching for is in the list.
    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }
   
    // Retruns maximum number in the list, as in the biggest.
    public int getMax(){
      
        if (this.right == null){
            return this.value;
        } else {
            return this.right.getMax();
        }
    }
    
    // Retruns minimum number in the list, as in the biggest.
    public int getMin(){
        
        if (this.left == null){
                return this.value;
            } else {
                return this.left.getMin();
            }
    }
    
    //Traverss throught the list REVISE
    public String toString(){
       boolean right = false;
       if (this.left ) {
       }
      
    }
        
   /* Add a method depth() that returns the number of levels in a tree. By convention, 
      a tree with only one node (i.e. the root) has a depth of zero. 
      Hint: the depths of the treesin Figure 1 are 0, 1, 2, and 3.
      Hint: the depth of a tree is one more than the deepest of its subtreees.
   
       public int depth (){
           
       }
       */
        /*
    
     if (this.left != null){
            System.out.print("L["+this.left.value); 
            
            if (this.right != null) {
                System.out.print("R[" + this.right.value);
            } else {
                System.out.print("[]");
            }
            
            this.left.toString();
            if (this.right != null){
                return this.right.toString();
            }
            return null;   
            
        } else if (this.right !=null) {
          System.out.print("R[" + this.right.value);
          
          if (this.left != null) {
                System.out.print("L[" + this.left.value);
            } else {
                System.out.print("[]");
            }
            return this.right.toString();
          
        } else {
            System.out.print("[]");
            return null;
    
    
    ____________
    if (this.left != null ) {
            System.out.print("L["+ this.value);
            return this.left.toString();
            
        } else {
            System.out.print("L[]" );
            
            if (this.right != null){
                System.out.println("R[" + this.value);
                return this.right.toString();
            } else {
                System.out.println("R[]");
            }
            return null;
        }
        
    }*/
}