/*
 * Name: Jose Rodriguez-Zuniga
 * CS 2336.004
 * Instructor: Mehra N. Borazjany
 *
 * Class ParkingSpots Descripion:
 *
 * In this class I have my getter and setter that grab an update my String variables vehSize and veh. I also have an
 * isEmpty method that checks if my vehicle is empty
 */
package cs2336.pkg004_csproject_joserodriguezzuniga;

public class ParkingSpots {
    
    public String vehSize, veh;
    
    // Constructor
    public ParkingSpots(){
    }
    // Overloading Constructor
    public ParkingSpots(String vehicleSize){
        this.vehSize = vehicleSize;
    }
    // Getters
    public String getSize(){
        return vehSize;
    }
    public String getVehicle(){                 
        return veh;
    }
    // Setters
    public void setSize(String size){
        this.vehSize = size;
    }
    public void setVehicle(String vehicle){
        this.veh = vehicle;
    }
    // isEmpty method check is the vehicle is empty
    public boolean isEmpty(){
        if(veh == " "){
            return true;
        }
        else{
            return false;
        }
    }
}
