/*
EVERYTHING HERE IS ON RECURSION
 */

package textbook;



public class TextBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TextBook d = new TextBook();
        //d.myTest(8);
       // System.out.println(fact(3));
       // d.recur(6);
        d.mcCarthy91(91);
        
    }
    /*
     public static int fact(int n){
        if (n <= 1){
            System.out.println("one! " + n);
            return n;
        }
        else{
            System.out.println("**n= " + n);
            
            System.out.println("result is     " +  n*fact(n-1));
            return n*fact(n-1);
            
        }
    } 
    */
     /*
    void myTest (int n) {
        if ( n <= 0) {
            return ;
        }
        System.out.println("n equals" + n);
        myTest (n-2); //b
        myTest(n-3); //does it go back here? A
        
        System.out.println("\t    N equals " + n);
   
    }
    */
    /*
     void recur (int y) {
         
         if (y < 0)
        
             return ;
          
         {
             System.out.println("Y= " + y );
             recur (y - 3);
             System.out.println("end y= " + y);
           
         }
     }
     */
    
    public int mcCarthy91 (int n) { 
        if (n > 100) {
            System.out.println("top minus ten:  " + n);
            return n-10;
           
        } else {
            System.out.println("    bottom minus ten:  " + n);
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
}
