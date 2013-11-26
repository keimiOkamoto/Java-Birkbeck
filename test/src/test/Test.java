/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Scanner;

/**
 *
 * @author keimiokamoto
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    /*Read a list of grades between 0 and 100
and stop when user entera -1
the program should output at the end and only at the end
how many marks were there in total
eg input mark: 14 ...,
7 students: 2 Distinctions, 1 Pass, 4Fails (plus 1 invalid)
 */


    public static void main(String[]args){
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
        
        }
        else if (grade>=50){
        pass++;
        
        }
        else if (grade>=0){
        fail++;
        
        }
        else{
        invalid++;
        studentcount--;
        }
    }
    while(grade!=-1);
        
        System.out.println("Student count: "+ studentcount);
        System.out.println("Distinction: " + pass);
    }
}

    

