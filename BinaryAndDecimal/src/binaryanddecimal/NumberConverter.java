/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binaryanddecimal;


public class NumberConverter {
    private int count=-1;
    private int value=2;
    private int total;
    private int tick=0;
    private String binResult="";
    private int num;
    
    public NumberConverter () {
        
    }
    
    public void convertToDecimal (String x) {
        
        for (int i = 0; i <x.length() ; i++) {
            count++;
        }
     
        while (count>-1){
            if(x.substring(tick,tick+1).equals("1")) {
               
                for (int j = 0; j < count-1; j++) {
                    value *= 2;
                }
            } else {
                
                value=0;
            }
        
        total += value;
        count--;
        tick++;
        value = 2;
        
    }
    if(x.substring(x.length()-1).equals("1")){
        System.out.println(x + " converted to decimal is " + (total-1));
    }
    else{
        System.out.println(x + " converted to decimal is " + total);
    }
    }
    
    public void convertToBinary (String y){
        int x = Integer.parseInt(y);
        
        num = x;
     
        while (x!=0){
            
            if(x%2==1) {
               
               binResult +="1";
               x = x/2;
             
            
            } else {
                
                binResult +="0";
                x = x/2;
            }
  
    }
    System.out.println(num + " converted to binary is " + binResult);
    }
}
