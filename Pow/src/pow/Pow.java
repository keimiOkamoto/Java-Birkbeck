/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pow;

/**
 *
 * @author keimiokamoto
 */
public class Pow {
    
    public static int powers (int base, int exponent){
        //int numPass;
        
        if (exponent == 1){
            return base;
        }
        else{
             
             return powers (base, exponent-1) * base; 
        }
       
    
    }
    public static void main(String[] args) {
       
        Pow aPower = new Pow();
        System.out.println("  " + aPower.powers(5,8));
    }
    
}
