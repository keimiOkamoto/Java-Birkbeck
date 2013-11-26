/*
 * Calculator with methods
 * add
 * subtract
 * multiply 
 * divide
 * modulus
 */


package DividingIntegers;


import java.util.Scanner;

public class Dividing_Integers {
    
    public static void main (String[]args) {
    
        Scanner x = new Scanner(System.in);
     
        System.out.println("Enter two numbers: ");
           int input1 = x.nextInt();
           int input2 = x.nextInt();
        Calculator aCalculator = new Calculator (input1, input2);
    
    
    }
    
   
}
