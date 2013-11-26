/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle;

public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point upLeft = new Point(2,3);
        Point downRight = new Point(1,5);
        
        
        upLeft.x=2;
        upLeft.y=3;
        downRight.x = 1;
        downRight.y = 5;
        
        
        double height = downRight.y - upLeft.x;
        double width = upLeft.y - downRight.x;
        
        double area = height * width; 
        double primeter = (height*2) + (width*2);
        
        System.out.println("Area is: " + area + "cm squared.");
        System.out.println("primeter is: " + primeter +"cm squared.");
    }
    
}
