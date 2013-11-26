/**
 * Calculator with methods
 * add
 * subtract
 * multiply 
 * divide
 * modulus
 */

package DividingIntegers;

import java.util.Scanner;

public class Calculator {
    private int x = 0;
    private int y = 0;
    private int ans = 0;
    private double division = 0;

   
    //Constructor method so it is public! Must be accessable from outsidw of the Calculator method.
    public Calculator (int x , int y) {
        this.x = x;
        this.y = y;
        
        
        System.out.println("What would you like to do? +, - , / , %? ");
        
        Scanner a = new Scanner(System.in);
        String oporator = a.nextLine();
        
        if (oporator.equals("+")) {
            this.add(x, y);
        }
        else if (oporator.equals("-")) {
            this.minus(x ,y);
        }
        else if (oporator.equals("*")) {
            this.multiply(x , y);
        }
        else if (oporator.equals("/")) {
            this.divide(x , y);
        }else if (oporator.equals("%")) {
            this.modulus(x , y);
        }
        
    }
    
    private void add (int x , int y) {
        ans = x + y;
        System.out.println( x + " + " + y + " = " + ans );
    }
    
    private void minus (int x , int y) {
        ans = x - y;
        System.out.println( x + " - " + y + " = " + ans );
    }
    
    private void multiply (int x , int y) {
        ans = x * y;
        System.out.println( x + " X " + y + " = " + ans );
    }
    
    private void divide (int x , int y) {
        division = x / y;
        System.out.println( x + " / " + y + " = " + division );
    }
    private void modulus (int x , int y) {
        ans = x % y;
        System.out.println( x + " % " + y + " = " + ans);
    }
}
