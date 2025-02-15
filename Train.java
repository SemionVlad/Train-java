/**
 * The Train class calculates the distance traveled by two trains based on their 
 * speeds and travel times. The program takes user input for the speed and time
 * of each train, calculates their respective distances, and determines the
 * absolute distance between them.
 *
 * Input: Four integers representing:
 *        - Speed of train 1 (in kilometers per hour)
 *        - Time of train 1 (in minutes, converted to hours by dividing by 10)
 *        - Speed of train 2 (in kilometers per hour)
 *        - Time of train 2 (in minutes, converted to hours by dividing by 10)
 *
 * Output: The distance between the trains in kilometers
 *
 * Note: The time inputs are divided by 10 to convert from minutes to hours
 *       The final distance is calculated as the absolute difference between
 *       the distances traveled by each train
 *
 * @version 2023B
 * @author - Shimon_Esterkin(SemionVlad).
 */
import java.util.Scanner;

public class Train {
    /**
     * The main method handles the program execution flow, including input collection,
     * calculations, and output display.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter 4 integers ");
        
        // Get input for first train
        System.out.println("Please enter the speed of train 1 (km/h):");
        int v1 = scan.nextInt();  // Speed of train 1 in km/h
        
        System.out.println("Please enter the time of train 1 (m):");
        int t1 = scan.nextInt();  // Time for train 1 in minutes
        t1 = t1 / 10;  // Convert time to hours
        
        // Calculate distance for train 1
        int d1 = t1 * v1;  // Distance = speed * time
        
        // Get input for second train
        System.out.println("Please enter the speed of train 2 (km/h):");
        int v2 = scan.nextInt();  // Speed of train 2 in km/h
        
        System.out.println("Please enter the time of train 2: (h)");
        int t2 = scan.nextInt();  // Time for train 2 in minutes
        t2 = t2 / 10;  // Convert time to hours
        
        // Calculate distance for train 2
        int d2 = t2 * v2;  // Distance = speed * time
        
        // Calculate absolute distance between trains
        int dT = Math.abs(d1 - d2);
        
        // Display result
        System.out.println("The distance between the trains is " + d1 + " km");
        
        // Close scanner to prevent resource leak
        scan.close();
    }
}