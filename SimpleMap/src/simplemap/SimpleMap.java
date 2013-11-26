/**
 * An example code that uses an array to create a HashMap. 
 */

package simplemap;

import java.util.Arrays;

public class SimpleMap {
    
    String[] theArray;
    int arraySize;
    int itemInArray = 0;

public static void main(String[] args) {
        
        SimpleMap aMap = new SimpleMap(30);
        
        //String [] elementsToAdd1 = {"1","10","6","36","42","5","21","9"};
        String [] elementsToAdd2 = {"100","510","4326","365","42","5","21","9"};
        //String [] elementsToAdd3 = {"Ali","Ben","Carl","Derek","Eric","Frank","Gina","Hatty"};
        
        aMap.hashFunction2(elementsToAdd2, aMap.theArray);
       // aMap.displayMap();
        aMap.findKey("100");
        /*
        //An array list of names to be addes is made
        String name1 = "Ali";        
        
        NameList aListOfNames = new NameList();
        aListOfNames.put(name1.hashCode(), name1);
        aListOfNames.get(name1.hashCode());
        */
        
        
    }
//Constructor, it makes the array the value of the int size parameter.
SimpleMap(int size){
    arraySize = size;
    theArray = new String[size];
    Arrays.fill(theArray,"-1");
}

public void hashFunction1(String[] stringForArray, String[] theArray){
    
    for (int i = 0; i < stringForArray.length; i++) {
        String newElementVal = stringForArray[i];
        theArray[Integer.parseInt(newElementVal)] = newElementVal;
    }
}

public void hashFunction2(String[] stringForArray, String[] theArray ) {
   for (int i = 0; i < stringForArray.length; i++) {
        String newElementVal = stringForArray[i];
        int arrayIndex = Integer.parseInt(newElementVal) %29;
        System.out.println("Modulus index= " + arrayIndex + " for value " + newElementVal);
        
        while (theArray[arrayIndex] != "-1"){
            ++arrayIndex;
            System.out.println("Collision Try " + arrayIndex + " instead.");
            
            arrayIndex %= arraySize;
        }
        theArray[arrayIndex] = newElementVal;
    } 
}

public String findKey(String key){
    int arrayIndexHash = Integer.parseInt(key) % 29;
    
    while (theArray[arrayIndexHash] != "-1") {
        if (theArray[arrayIndexHash] == key) {
            // The key is found
            System.out.println(key + " was found in index " + arrayIndexHash);
            return theArray[arrayIndexHash];
        }
        ++arrayIndexHash;
        
        arrayIndexHash %= arraySize;
    }
    return null;
}


/*
public void displayMap() {
    int increment = 0;
    
    for (int i = 0; i < 3; i++) {
        increment += 10;
        
        for (int j = 0; j < 71; j++) {
            System.out.println("-");
            System.out.println();
            
            for (int k = increment - 10; k < increment; k++) {
                System.out.format("| %3s " + " ", k);
            }
            System.out.println("|");
            for (int k = 0; k < 71; k++) {
                System.out.println("-");
                System.out.println();
                
                for (int l = increment - 10; l < increment; l++) {
                    if (theArray[l].equals("-1")){
                        System.out.println("|       ");
                    } else {
                        System.out.println(String.format("| %3 " + " ", theArray[l]));
                    }
                }
                System.out.println("|");
                
                for (int l = 0; l < 71; l++) {
                    System.out.println("-");
                    System.out.println();
                }
            }
        }
    }
}
*/    
}
