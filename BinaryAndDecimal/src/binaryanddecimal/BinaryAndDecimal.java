/*
 *method 1 -
    takes from the user a binary number with digits 01 and returns a decimal number

  method 2 -
    takes a decimal number and converts it to binary
 */

package binaryanddecimal;

import java.util.Scanner;

public class BinaryAndDecimal {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        NumberConverter number = new NumberConverter();
        
        System.out.println("Decimal or Binary which do you want to convert to?");
        String input = x.nextLine();
        
        if(input.equals("decimal")){
            
            System.out.println("Enter a number you would like to conver to a DECIMAL: ");
            input = x.nextLine();
            number.convertToDecimal(input);
        
        }else if(input.equals("binary")){
            System.out.println("Enter a number you would like to conver to a BINARY: ");
            input = x.nextLine();
            number.convertToBinary(input);
        }

    }
    
}
