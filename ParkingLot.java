/*
 * Name: Jose Rodriguez-Zuniga
 * CS 2336.004
 * Instructor: Mehra N. Borazjany
 *
 * Class Parking Lot Descripion:
 * 
 * In this class I have all the given constants to make the lot. I make an ArrayList that will create the lot. The buildParkingLot
 * get the parameters from the contructor and then procceed to add a new Levels in the for loop. In the parkVehicle method
 * it recieves the vehicle in string from and then calls on the parkVehicle method in the Levels class which return a boolean
 * Finally in the displayLot Method runs I use for loop which prints out the lot level and also displays the type of spots by 
 * calling the displayParkingSpots method in the ParkingSpots class
 */
package cs2336.pkg004_csproject_joserodriguezzuniga;

import java.util.ArrayList;     // Import java.util.ArrayList so I can use it

public class ParkingLot {
    // Given Constants from PDF
    private static final int NUM_OF_LEVELS = 5;
    private static final int SPOTS_PER_ROW = 10;
    private static final int SPOTS_PER_LEVEL = 30;
    // Private Data Fiels (Reduce Access)
    // Make and ArrayList using the Levels class
    private ArrayList<Levels> a = new ArrayList<>();

    // Constructor
    public ParkingLot() {
        // Calls on the buildParkingMethod with constants
        buildParkingLot(NUM_OF_LEVELS, SPOTS_PER_ROW, SPOTS_PER_LEVEL);
    }
    
    // buildParkingLot Method get 3 int parameters the number of floors, spots per row and spots in total. Then uses a for 
    // loop that adds a new level to the Array List a.
    public void buildParkingLot(int floors, int spots, int spotsPerRow) {
        for(int i = 0; i < floors; i++) {
            a.add(new Levels(spotsPerRow, spots));
        }
    }
    
    // parkVehicle Method get a string and runs it through a for loop, which then calls on parkVehicle in the Levels class,
    // which then returns a boolean
    public boolean parkVehicle(String veh) {
        for(int i = 0; i < a.size(); i++) {
            if (a.get(i).parkVehicle(veh)) {
                return true;
            }
        }
        return false;
    }
//    public boolean removeVehicle(Vehicle a){

//    }
    
    // displayLot Method runs a for loop which prints out the lot level and also displays the type of spots by calling the
    // displayParkingSpots in the ParkingSpots class
    public void displayLot(){
        for(int i = 0; i < a.size(); i++) {
            System.out.println("Level " + i + " :");
            a.get(i).displayParkingSpots();
        }
    }
}
