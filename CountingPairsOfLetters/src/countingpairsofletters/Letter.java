/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countingpairsofletters;


public class Letter {
    
    private String paragraph;
    private String myWord;
    
    
    public Letter(String x){
        this.paragraph = x;
    
    }
    
    public int wordChecker (String myWord){
        int count=0;
        int found=0;
        int ticker = 0;
        char x;
        char y;
        
        
        for (int i = 0; i < paragraph.length(); i++) {
            
            x = paragraph.charAt(i);
            y = myWord.charAt(ticker);
            //System.out.println("paragraph: " + x);
            //System.out.println( "Myword is:     "+y);
            
            if (x == y){
                count++;
                ticker++;
                //System.out.println("count: " + count);
                
                if (count == myWord.length()){
                    found++;
                    ticker=0;
                
                }
            }
            else{
                ticker=0;
                count =0;
                
            }
       
        }
        
        
        return found; 
        
}
}