/*
k
 */

package pi;

import java.util.Scanner;

public class Pi {


    public static void main(String[] args) {
      
        Scanner x = new Scanner(System.in);
        int terms = 1000500000;
                //x.nextInt();
        double k = 1;
        double result = 0;
        
        
        for (int i = 0; i < terms; i++) {
            
            result = result + (4 / k) - (4 / (k+2));
            k = k + 4;
        }
        System.out.println("result: " + result);
        System.out.println("Pi: \t" + Math.PI);
        
    }
    
}
