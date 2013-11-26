/*
fibonacci numbers
0 1 1 2 3 5 8 13 21 34 55--FIBONACCI NUMBERS
0 1 2 3 4 5 6 7  8  9  10 --TERMS n

*find the n'th term
 */

package fibonacci;

/**
 *
 * @author keimiokamoto
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci aFibonacci = new Fibonacci();
        //aFibonacci.fibonacciTermCalculator(5);
        System.out.println("result: " + aFibonacci.fibonacciTermCalculator(6));
    }
    
    //Enter the term you want to calculate
    public int fibonacciTermCalculator (int n){
       
        if ( n == 1 || n== 2) {
            return 1;
        }else { 
            System.out.println("n " + n );
            return fibonacciTermCalculator(n-1) + fibonacciTermCalculator(n-2) ;
        }
      
        
    }
}
/**
* gets simpler
* a method working in it's self then breaks out once its done and reaches for the next one
* 

n = 5

5
4
3
2
1

0+1 +1 +2 +3 +5

*/