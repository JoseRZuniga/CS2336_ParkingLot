/*
 * Name: Jose Rodriguez-Zuniga
 * CS 2336.004
 * Instructor: Mehra N. Borazjany
 *
 * Class Levels Descripion:
 * In this class I created an array list that will add to the lot so that it fits the correct format. The Levels overloading
 * constructor get the amount of spots and the spots per row. In the parkVehicle method I have the vehicle and I use the 
 * switch method to call on the ArrayList and check if its empty and calls the setVehicle method from the ParkingSpots class.
 * The other two method just display the  correct format of the lot in the project pdf and that in the lot the 30 spots are 
 * evenly distributed by 10 in every row
 */
package cs2336.pkg004_csproject_joserodriguezzuniga;

import java.util.ArrayList;     // Import java.util.ArrayList so I can use it

public class Levels {
    // Private Data Fiels (Reduce Access)
    private int numOfSpots, numOfSpotsPerRows;
    // Make and ArrayList using the ParkingSpot class
    private  ArrayList<ParkingSpots> a = new ArrayList<>();
    
    // Constructor
    public Levels(){
    }
        
    // Overloading Constructor
    public Levels(int rowSpots, int spts){
        this.numOfSpotsPerRows = rowSpots;
        this.numOfSpots = spts;
        this.displayParkingSpots();
    }
    
    // In the parkVehicle method I have the vehicle and I use the switch method to call on the ArrayList and check if its 
    // empty and also call the setVehicle method from the ParkingSpots class 
    public boolean parkVehicle(String veh){
        switch(veh){
            case "M":
                for(int i = 0; i < a.size(); i++){
                    if(a.get(i).isEmpty()){
                        a.get(i).setVehicle(veh);
                        return true;
                    }
                }
                break;
            case "C":
                for(int i = 0; i < a.size(); i++){
                    if(a.get(i).isEmpty() && a.get(i).getSize() != "m"){
                        a.get(i).setVehicle(veh);
                        return true;
                    }
                }
                break;
            case "B":
                for(int i = 0; i < a.size() - 4; i++){
                    for(int j = 0; j < i; j++){
                        if(a.get(i + j).isEmpty() && a.get(i + j).getSize() == "l"){
                            a.get(i + j).setVehicle(veh);
                        }
                        return true;
                    }
                }
                break;
        }
        return false;
    }
    
    // displayParkingSpots method formats the lot in the correct way given in the project pdf, where 20% of the spots are
    // Large and anthor 20% are motorcycle while the remaining is Compact. Then calls on the ParkingSpots constructor and
    // sets the vehicle Size
    public void displayParkingSpots(){
        for(int i = 0; i < numOfSpots; i++){
            if(i < (numOfSpots / 5)){
                a.add(new ParkingSpots("l"));
            }
            if(i > (numOfSpots / 1.25)){
                a.add(new ParkingSpots("m"));
            } 
            else{
                a.add(new ParkingSpots("c"))
;            }
        }
    }
    
    // displayParkingRows makes sure that in the lot the 30 spots are evenly distributed by 10 in every row. This checks 
    // if they are empty and prints is out
    public void displayParkingRows(){
        for(int i = 0; i < a.size(); i++){
            if(i == 10 && i == 20){
                System.out.print(" ");
            }
            if(a.get(i).isEmpty()){
                System.out.print(a.get(i).getSize());
            }
            else{
                System.out.print(a.get(i).getVehicle());
            }
        }
    }
}
