/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treesassets;


public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;
    
    // constructor
    public TreeNode(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
}
