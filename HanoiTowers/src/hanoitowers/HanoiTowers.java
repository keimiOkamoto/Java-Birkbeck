/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hanoitowers;

/**
 *
 * @author keimiokamoto
 */
public class HanoiTowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HanoiTowers tool = new HanoiTowers();
        System.out.println("compare: " + hanCal(5));   
    }
    
     void printNumbers(int n){
            
            System.out.println(" n :" + n);
            
            if (n <=0){
                return;
            }
            printNumbers(n-2);
            printNumbers(n-3);
            System.out.println(n);
        }
        
        
        public static int hanCal(int disksNum) {
            if (disksNum == 0) {
                return 0;
            }
            System.out.println("I do not know how many moves I need for " + disksNum + " disks. Trying with " + (disksNum-1) + "...");
            int resultForMinusOneDisk = hanCal(disksNum-1);
            int result = resultForMinusOneDisk + resultForMinusOneDisk + 1;
            System.out.println("Now I know that for " + (disksNum-1) + " disks I need " + resultForMinusOneDisk + " moves.");
            System.out.println("Therefore, for " + (disksNum) +  " disks I need " + result + " moves.");            
            return result;
            
        }
    
}
