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
    public int depth(IntegerTreeNode root) {
        if (root == null) {
            return -1;
        } else {
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            
            if (leftDepth > rightDepth) {
                return leftDepth + 1;
            } else {
                return rightDepth + 1;
            }
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
    

    
}