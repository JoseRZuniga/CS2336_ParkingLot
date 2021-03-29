/*
 * Name: Jose Rodriguez-Zuniga
 * CS 2336.004
 * Instructor: Mehra N. Borazjany
 *
 * Class  CSProject_JoseRodriguezZuniga_CS2336004 Descripion:
 * This is my main class where I print out the lot. 
 */
package cs2336.pkg004_csproject_joserodriguezzuniga;
import java.util.Scanner;

public class CSProject_JoseRodriguezZuniga_CS2336004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        ParkingLot Lot = new ParkingLot();      // Create new ParkingLot 
        
        String vehicle = "";                    // Create empty vehicle string
        int a = 0;
        
        Scanner input = new Scanner(System.in);
        
        // do-while loop that stops when the user inputs 3 
        do{
            // Print out the menu
            System.out.println("Parking Lot Menu: ");
            System.out.println("1: Type 1 to park your vehicle in the lot: ");
            System.out.println("2: Type 2 to remove vehicle from lot: ");
            System.out.println("3: Type in 3 to end program.");

            a = input.nextInt();

            switch(a){
                // First case is for parking the user given car in the lot
                case 1:
                    System.out.println("Enter the desired vehicle to be parked (B for Bus, M for Motorcycle, and C for Car): ");
                    vehicle = input.next();
                    Lot.parkVehicle(vehicle);           // Calls the parkVehicle method and gets a boolean
                    Lot.displayLot();                   // Calls the diplayLot method and prints out the lot
                    System.out.println();
                    break;
                // Second case is for removing the user given car in the lot
                case 2:
                    System.out.println("Enter the desired vehicle to be removed (B for Bus, M for Motorcycle, and C for Car): ");
                    vehicle = input.next();
                    // Lot.removeVehicle(vehicle);
                    Lot.displayLot();
                    System.out.println();
                    break;
                // Third case is to finish the program
                case 3:
                    System.out.println("Program has finished");
                    System.exit(0);
                    break;
                // If user input any other number than those above, it will give error
                default:
                    System.out.println("Not Valid input. Try Again.");
            }
        }while (a != 3);
    }
    
}
