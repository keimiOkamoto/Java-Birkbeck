/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

public class Animal {

    public static void main(String[] args) {
     Ani aAni = new Ani();
    aAni.name = "Lawrence";
    aAni.spec = "Rat";
    int x = 5;
    }
    
public class Ani {
    
    String name;
    String spec;
    int age;
}

void aniName (Ani animal, int number) {
    number = number + 13;
    animal.name = "panther";
    animal.spec = "feline";
    
    animal=null;
    System.out.println("number is: " + number );
    System.out.println("Animal is: " + animal);
}
    
   
    

}
