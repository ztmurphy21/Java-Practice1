
package galtolit;

import java.util.Scanner;

/**
 *
 * @author Zachary Murphy
 */
public class Galtolit {

   
    public static void main(String[] args) {
        
        Scanner reader = new Scanner (System.in);
        double gallons, liters;
        
        System.out.println("Enter gallons to conert to liters:");
        gallons = reader.nextDouble();
        
        liters = gallons * 3.7854;
        
        System.out.println(gallons + "gallons is " + liters + " liters.");
    }
    
}
