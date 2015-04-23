/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallonstoliters;

/**
 *
 * @author Nisha
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons; // holds number of galllons
        double liters; // holds conversion to liters
        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; //convert to liters
        
        //outputs the conversion to the screen
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
