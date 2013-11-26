/*
 *distance to point - calculates distance to another point**

*distace to origin. calculates distance your point to origin
*move to double (double x double y) changes co ordinates to move to the new x and y
*move to point changes coordinates to move to a new point entered
*clone() returns a copy of the current point with the same coortinates
*oposite() returns copy of current point witht the coordinates multiplied by -1
 */

package moreonpoints;

import java.io.Console;
import java.util.Scanner;
public class Point {
    
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
 
    
    
    Point (double a, double b){
        this.x = a;
        this.y = b;
        System.out.println("x" + x);
        System.out.println("y" + y);
    }
    
    //Calculates distance to another point
    public void distanceTo (Point p1){
        int distance=0;
        int commaPos = 0;
        
        System.out.println("Enter another point you want to calculate the distace to. ");
        String distanceToPoint = in.nextLine();
        System.out.println("You entered " + distanceToPoint + "\nCalculating distance...");
        
        char letter;
        for (int i = 0; i < distanceToPoint.length(); i++) {
            letter = distanceToPoint.charAt(i);
            
            if(letter ==','){
                commaPos =i;
            } 
        }
        
        String firstCo = distanceToPoint.substring(0,commaPos);
        double coX = Integer.parseInt(firstCo);
        String endCo = distanceToPoint.substring(commaPos+1, distanceToPoint.length());
        double coY = Integer.parseInt(endCo);
        System.out.println("Expect 2 int coordinates entered " + coX + "," + coY);
        
        double a = 0;
        double b = 0;
        double ans = 0;   
        
        a = x - coX;
        b = coY - y;
        
        ans = (a * a) + (b * b);
        double ans1 = Math.sqrt(ans);
        System.out.println("Distance is: " + ans1);
        
    }
    
    public void distanceToorigin (Point p1) {
        
        int distance=0;
        int commaPos = 0;
        
        System.out.println("Enter another point you want to calculate the distace to. ");
        String distanceToPoint = in.nextLine();
        System.out.println("You entered " + distanceToPoint + "\nCalculating distance...");
        
        char letter;
        for (int i = 0; i < distanceToPoint.length(); i++) {
            letter = distanceToPoint.charAt(i);
            
            if(letter ==','){
                commaPos = i;
            } 
        }
        
        String firstCo = distanceToPoint.substring(0,commaPos);
        double coX = Integer.parseInt(firstCo);
        String endCo = distanceToPoint.substring(commaPos+1, distanceToPoint.length());
        double coY = Integer.parseInt(endCo);
        System.out.println("Expect 2 int coordinates entered " + coX + "," + coY);
        
    
    }
}
