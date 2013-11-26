/*
5! = 5 x 4 x 3 x 2 x 1
 */

package factorials;

/**
 *
 * @author keimiokamoto
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factorials aFactorial = new Factorials();
        //.factNum(5);
        System.out.println(" result " + aFactorial.factNum(5));
    }
    
    public int factNum (int n) {
        
        if (n == 0) {
            return 1;
        }
        else {
            System.out.println("n " + n);
            return factNum(n - 1) * n;
        }
    
    }
}
