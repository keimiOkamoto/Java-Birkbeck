/*
--A paragraph is entered
--User enters a letter 'a' 
--the program outputs how many a's there are in the pragraph.
--Keep iputting but to stop enter the same letter twice.
 */

package countinglettersredux;

public class Letter {
    
    private String paragraph;
    private String storage = " ";
    
    public Letter (String x){
         this.paragraph = x;
    }
    
    
    public int letterChecker (String myletter){
        int count=0;
        char x;
        char y;
        String store = "";
        boolean copy =false;
        
           
           for (int j = 0; j < paragraph.length(); j++) {
            
                    x = paragraph.charAt(j);
                    y = myletter.charAt(0);

                    if (x == y){
                        count++;
                    }
                    else{
                    
                    }
                }
           
            return count; 
           
           }
 
  public boolean duplicateChecker (String myletter){
            
            
            for (int i = 0; i < storage.length(); i++) {
               char s = storage.charAt(i);
               char ml = myletter.charAt(0);
              
               if (s == ml) {
                    System.out.println("**Repeated character! Exiting the program!** ");
                    return true;
               }
               else{
                    
               }
            }
               storage += myletter;
               
             //  System.out.println("Found the letter:  "  + count + " times!");    
               return false;
  }  
}
          
      