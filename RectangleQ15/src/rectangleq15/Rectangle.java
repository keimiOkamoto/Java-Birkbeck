/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleq15;

/**
 *
 * @author keimiokamoto
 */
public class Rectangle {
    int cox1;
    int coy1;
    int cox2;
    int coy2;
    boolean checker = false;
    
    public Rectangle (int x1,int y1, int x2, int y2){
        cox1 = x1;
        coy1 = y1;
        cox2 = x2;
        coy2 = y2;
    }
    
    public boolean overlapChecker(int x, int y){
        /*System.out.println("cox1 "+ cox1);
        System.out.println("cox1 "+ coy1);
        System.out.println("cox1 "+ cox2);
        System.out.println("cox1 "+ coy2);
        System.out.println("cox1 "+ x);
        System.out.println("cox1 "+ y); */
        if (x >= cox1 && x <= cox2) { 
            //System.out.println("Ive gone through");
            if(y <=coy1 && y>= coy2) {
                System.out.println("Its inside!");
                return checker = true;
            }
            else{
                System.out.println("It's outside!");
                return checker = false;
            }
        }
        else {
            System.out.println("It's outside!");
            return checker = false;
        }

    }
    
    
   // public int getx1 (){
   //     return cox1;
   // }
    
}
