/**
 * An inter
 */

package integerbinarytree;


public interface TreeNode {
    
    // Adds a node
    void add(int number);
    
    // Retruns true if the number you are searching for is in the list. (int n)
    boolean contains(int n);
    
    // Retruns maximum number in the list, as in the biggest.
    int getMax();
    
    // Retruns minimum number in the list, as in the biggest.
    int getMin();
}
