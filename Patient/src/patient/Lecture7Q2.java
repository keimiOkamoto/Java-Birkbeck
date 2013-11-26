/*Read a list of grades between 0 and 100
and stop when user entera -1
the program should output at the end and only at the end
how many marks were there in total
eg input mark: 14 ...,
7 students: 2 Distinctions, 1 Pass, 4Fails (plus 1 invalid)
 */

package patient;

import java.util.Scanner;
public class Lecture7Q2 {
   // public static void main(String[]args){
    Scanner x = new Scanner(System.in);
    
    int studentcount=0;
    int distinction=0;
    int pass=0;
    int fail=0;
    int invalid=0;
    
    
    System.out.println("Enter a grade: ");
    int grade = x.nextInt();    
        
    
    do {
        studentcount++;
        if (grade>=70){
        distinction++;
        System.out.println("Grade: "+ grade);
        }
        else if (grade>=50){
        pass++;
        System.out.println("Grade: "+ grade);
        }
        else if (grade>0){
        fail++;
        System.out.println("Grade: "+ grade);
        }
        else{
        invalid++;
        }
    }
    while(grade!=-1);
        
        System.out.println("Student count: "+ studentcount);
        System.out.println("Distinction: " + distinction);
    }
}
