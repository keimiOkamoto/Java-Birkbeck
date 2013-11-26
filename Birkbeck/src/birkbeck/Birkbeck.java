/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package birkbeck;

/**
 *
 * @author keimiokamoto
 */
public class Birkbeck {

    public static void main(String[] args) {
        
        Rectangle aRectangle = new Rectangle();
        String coordinate_1 = aRectangle.pointupleft;
        System.out.println(coordinate_1);
        
        for (int i = 0; i < coordinate_1.length(); i++) {
            char c = coordinate_1.charAt(i);
            
            if(c==','){
                String co1_x = coordinate_1.substring(0,i);
                int coordinate1_x = Integer.parseInt(co1_x);
                System.out.println(coordinate1_x);
                
                String co1_y = coordinate_1.substring(i+1,coordinate_1.length());
                int coordinate1_y = Integer.parseInt(co1_y);
                System.out.println(coordinate1_y);
            }
        }
        
        String coordinate_2 = aRectangle.pointdownright;
        System.out.println(coordinate_2);
        
        for (int i = 0; i < coordinate_2.length(); i++) {
            char c = coordinate_2.charAt(i);
            
            if(c==','){
                String co1_x = coordinate_2.substring(0,i);
                int coordinate1_x = Integer.parseInt(co1_x);
                System.out.println(coordinate1_x);
                
                String co1_y = coordinate_2.substring(i+1,coordinate_2.length());
                int coordinate1_y = Integer.parseInt(co1_y);
                System.out.println(coordinate1_y);
            }
        }
        
    }
    
}
