/*
 *a sentence is entered.
it is checked if the letter is a " " "," "." "!" (punctuation mark)
if it is skip it and copare the next one.
if they are the same then it is a palindrome.
 */

package palindromeredux;


public class Palindrome {
    
    private String paragraph;
    
    public Palindrome () {
      
    }
    
    public boolean palindromeChecker (String paragraph) {
    
        char paliBegin;
        char paliEnd;
        int count = 0;
        int posKeep =0;
        String paragraphLower = paragraph.toLowerCase();
        int length = paragraphLower.length()-1;
        boolean run = true;
        boolean relaxedPali = false;
        System.out.println("Expect paragraph in lower case = " +  paragraphLower );
        
        while(run){
            paliBegin = paragraphLower.charAt(count);
            paliEnd = paragraphLower.charAt(length);
            System.out.print("Expect paliBegin:" + paliBegin +"  ");
            System.out.println("Expect paliEnd:" + paliEnd);
            
            boolean b1 = Character.isLetter(paliBegin);
            boolean b2 = Character.isLetter(paliEnd);
            
            
            //first check if both characters are valid characters.
                if (b1 == true && b2 == true) {
                    System.out.println("BOTH ARE LETTERS");
                    
                    if (paliBegin == paliEnd) {
                        count ++;
                        length -= 1;
                        posKeep++;
                        System.out.println("IDENTICAL: " + paliBegin + " " + paliEnd);
                        System.out.println("count =" + count + " " + "length " + length);
                            
                        if(posKeep == length/2 && relaxedPali == true){
                                System.out.println("You sentence is a relaxed palindrome!");
                                return true;
                        }else if (posKeep == length/2 && relaxedPali == false){
                                System.out.println("You sentence is a palindrome!");
                                return true;
                        }
                        
                    } else {
                        System.out.println("NO it is not!");
                        run=false;
                        
                    }
                } else if (b1 == false) {
                    count++;
                    relaxedPali = true;
                    
                } else if (b2 == false) {
                    length -= 1;
                    relaxedPali = true;
                }
        }
        return false;
    }
}
