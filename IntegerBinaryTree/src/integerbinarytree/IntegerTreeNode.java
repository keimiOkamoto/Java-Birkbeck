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
    
    
    
    // Finds the depth of the tree
    public int depth() {
        
        int l=0;
        int r=0;
        
        if (left == null) {
            return 0;
        } else {

            l += 1;
            left.depth();
        }
        
        if (right == null) {
            return 0;
        } else {
            left.depth();
            r += 1;
        }
        if (l > r) {
            System.out.println("ffs");
            return l;
        } else {
            System.out.println("right is bigger");
            return r;
        }
        
    }
    
    
    //Travers throught the tree and prints out.
    public String toString() {
        String result = " ";
        result += value;
        
        if (left == null){
            result += " L[] ";
        } else {
            result += left; //left.toString(); 
        } 
        if (right == null) {
            result += " R[] ";
        } else {
            result += right; //right.toString();
        }
        return result;
    }
    
    /*
     if (left == null && leftCheck) {
            return 0;
        } else {
            int l = left.depth() + 1;
            return l;
        }
        if (right == null) {
            return 0;
        } else {
            int r = right.depth() + 1;
            return r;
        }
    */
    
}