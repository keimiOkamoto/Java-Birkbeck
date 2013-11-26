/*
 * Write a program  
 */

package rectangleq14;


public class RectangleQ14 {


    public static void main(String[] args) {
        
        //Rectangle is made with two coordinates
        Point topLeft = new Point(1,6); 
        int x1 = topLeft.getPointX();
        int y1 = topLeft.getPointY();
        System.out.print("x1: " + topLeft.getPointX());
        System.out.println("\t y1: " + topLeft.getPointY());
        
        Point bottomRight = new Point(5,3); 
        int x2 =bottomRight.getPointX();
        int y2 = bottomRight.getPointY();
        System.out.print("x2: " + bottomRight.getPointX());
        System.out.println("\t y2: " + bottomRight.getPointY());
        
        
        //Testing point 
        Point inOtOutPoint = new Point(6,8); 
        int xtest =inOtOutPoint.getPointX();
        int ytest = inOtOutPoint.getPointY();
        System.out.print("xtest: " + inOtOutPoint.getPointX());
        System.out.println("\t ytest: " + inOtOutPoint.getPointY());
        
        
        //Test if a point is inside or outside the rectangle.
        if (xtest >= x1 && xtest <= x2) { 
            if(ytest >=y2 && ytest<= y1) {
                System.out.println("Its inside!");
            }
            else{
                System.out.println("It's outside!");
            }
        }
        else {
            System.out.println("It's outside!");
        }
        
        
        
    }
    
}
