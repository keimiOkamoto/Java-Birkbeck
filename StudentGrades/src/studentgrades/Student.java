/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentgrades;

/**
 *
 * @author keimiokamoto
 */
public class Student {
    private int studentCount=0;
    private int distinction=0;
    private int pass=0;
    private int fail=0;
    private int invalid=0;
    public Student next; // pointer
    private int grade;
    
   
    public void Grade (int grade, Student next){
        
        this.grade = grade;
        this.next = null;
    }
}
