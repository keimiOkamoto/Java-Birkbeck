/**
 * This program makes a binary tree with. from here add, get minimum integer value and 
 * maximum integer value and find out if it contains anything. 
 */

package integerbinarytree;


public class IntegerBinaryTree {

    
    public static void main(String[] args) {
        IntegerTreeNode root = new IntegerTreeNode(6);
        root.add(5);
        root.add(9);
        root.add(3);
        root.add(8);
        root.add(11);
        root.add(12);
        System.out.println("The maximum is " + root.getMax());
        System.out.println("The minimum is " + root.getMin());
        System.out.println("It is " + root.contains(4) );
        root.toString();
        
        System.out.println(root);
        
    }
    
}
