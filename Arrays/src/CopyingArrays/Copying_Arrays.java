/**
 * array copier
 * method copy two arrays 
 * fist array copied "src"
 * to the second "dst"
 * First list of arrays must be copied into other array. 
 * 
 * if second is smaller then only be filled as much as it can be
 * if second is larger it will be filled with zero
 * same size
 * 

 *
 */

package CopyingArrays;


public class Copying_Arrays {
    
    public static void main (String[]args){
        
        int [] src = {1,1,1,1,1};
        int [] dst = {2,2,2,2,2,2,2,2,2};
        
        ArrayCopier aArrayCopier = new ArrayCopier(src,dst);
    
    }
    
}
