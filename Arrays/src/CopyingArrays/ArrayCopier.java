/**
 * 
 */

package CopyingArrays;



public class ArrayCopier {
    
    
    
    
    public ArrayCopier (int[]src, int[]dst) {
        
        int count = 0;
        
        if (src.length == dst.length) {
            for (int i = 0; i < dst.length; i++) {
                dst[i] = src[i];
                System.out.println(dst[i]);
            }
            System.out.println("EQUAL. Src array copied into Dst arrat");
        
        }
        else if (src.length > dst.length) {
            for (int i = 0; i < src.length; i++) {
                dst[i] = src[i];
                System.out.println(dst[i]);
                count++; 
                if(count == dst.length){
                    System.out.println("Src is bigger, dst can not take anymore!");
                    break;
                }
            }
           
        }
        else {
            for (int i = 0; i < src.length; i++) {
               
               
                dst[i] = src[i];
                System.out.println("" + dst[i]);
                count++;
            }
            count = dst.length - count; 
            for (int i = 0; i < count; i++) {
                System.out.println(0);
                
            }      
       }
        
    }    
}

/*
   for (int j = 0; j < y.length; j++) {
                y[i] = num1;
                yCount++;
                System.out.println("Y = " + y[i]);
            
                if (xCount == yCount) {
                    System.out.println("same amount of numbers");
                    break;
                }

            }

*/