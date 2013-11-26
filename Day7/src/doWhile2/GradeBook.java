

package doWhile2;

import java.util.Scanner;

//node
public class GradeBook {
    
    
    public int user; //data
    public GradeBook nextGrade; //pointer ref
    //public GradeBook newGrade; //pointer ref
    
    
       
    //NODE. constructor takes data value and store it in data field
    public GradeBook () {
        
        this.start(user, nextGrade); 
    }


    
    public void start (int user, GradeBook nextGrade) {
        
        int invalid = 0;
        int fail = 0;
        int pass = 0;
        int merit = 0;
        int distinction = 0;
        String result = "";
        int stdCount = 0;
        //where the score is turned into a grade
        do {
            System.out.println("Enter a score: ");
            Scanner x = new Scanner(System.in);
            user = x.nextInt();
            stdCount++;
            
            if (user > 100 || user < -1) {
               // adding (user, nextGrade);
                result += "\nInput a mark: " + user;
                invalid++;
            }
            else if (user >=70) {
               // adding (user, nextGrade);
                distinction++;
                 result += "\nInput a mark: " + user;
            }
            else if(user >=60) {
               // adding (user, nextGrade);
                merit++;
                result += "\nInput a mark: " + user;
            }
            else if (user >= 50) {
                //adding (user, nextGrade);
                pass++;
                result += "\nInput a mark: " + user;
            }
            else if (user <= 49 && user != -1){
                //adding (user, nextGrade);
                result += "\nInput a mark: " + user;
                fail++;
            
            }

        } while (user != -1);
        System.out.println("" + result);
        System.out.println("No. Students: " + (stdCount-1));
        System.out.print("Invalid inputs: " + invalid + "  Fail: " + fail + "  Pass: " + pass + "  Merit: " + merit);
        System.out.println(" Distinction: " + distinction);
    }

}
