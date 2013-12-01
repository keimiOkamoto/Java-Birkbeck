/**
 * Make a tree
 */

package treesassets;

public class TreeIntSet implements IntSet {
    TreeIntSet left = null;
    TreeIntSet right = null;
    int value = 0;
    
    //Constructor
    public TreeIntSet(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    } 
    
    // adds a new int to the set; if it is there already, nothing happens.
    public void add(int number) {
        // First check if the 'int number' exists in the tree.
        // if it does do nothing, if it doesnt add it to the aproapreate place.
        boolean matchFound = false;

        if (value == number) {
            System.out.println("Match! It wont be added.");
            matchFound = true;
        }
        if (!matchFound) {
            if (value > number) {
                if (left == null) {
                    TreeIntSet newNode = new TreeIntSet(number);
                    left = newNode;
                    System.out.println("Added");
                } else {
                    left.add(number);
                }
            } else {
                if (right == null) {
                    TreeIntSet newNode = new TreeIntSet(number);
                    right = newNode;
                    System.out.println("Added");
                } else {
                    right.add(number);
                }
            }
        }
    }
    //returns true if the number is in the set, false otherwise.
    public boolean contains(int number){
        return false;
    }
    
    //returns the same values as the former method, but for every element that is checked prints its value on screen.
    public int containsVerbose(int number) {
        return 0;
    }
    
    //returns a string with the values of the elements in the set separated by commas.
    public String toString(){
        return null;
    } 
}
