/*
 *Reads two cooredinates of four points, the former two defining one rectangle and the latter two defining 
 *another one. The program must read the coordinates of a fith point and say wehether the point falls 
-inside one
-indide both
-outside both
 
*/

package rectangleq15;


public class RectangleQ15 {

    public static void main(String[] args) {
        
        //Point topRight = new Point(1,6);
        //Point bottomLeft = new Point(5,3);
        
        Rectangle aRectangle1 = new Rectangle(1,6,5,3);
        int rec1X1 = aRectangle1.cox1;
        int rec1Y1 = aRectangle1.coy1;
        int rec1X2 = aRectangle1.cox2;
        int rec1Y2 = aRectangle1.coy2;
        
        boolean result = aRectangle1.overlapChecker(7,7);
        System.out.println("result " + result);
/*
        Rectangle aRectangle2 = new Rectangle(3,1,7,5);
        int rec2X1 = aRectangle1.cox1;
        int rec2Y1 = aRectangle1.coy1;
        int rec2X2 = aRectangle1.cox2;
        int rec2Y2 = aRectangle1.coy2;
        
*/        
    }
    
}
