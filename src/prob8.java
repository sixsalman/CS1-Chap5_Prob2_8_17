import java.util.Scanner; //util package's Scanner class is imported

/**
 *  Author: Salman
 *
 *  This programs asks for distance in meters, converts and outputs
 *  the corresponding value in desired unit
 */
public class prob8 {

    /**
     *  Main handles the driver code for the program. Inputs are taken,
     *  processed and outputted in this method.
     * @param args is not used
     */
    public static void  main (String[] args){

        double meters;

        Scanner kbd = new Scanner(System.in); // Scanner named kbd is created

        //asks and validates meters input
        do {
            System.out.print("Enter a distance in meters: ");
            meters = kbd.nextDouble();

            if(meters<0){
                System.out.println("Negative numbers not acceptable");
            }
        } while(meters < 0);

        while(true){

            //asks for conversion choice
            System.out.print("1. Convert to kilometers\n" +
                    "2. Convert to inches\n" +
                    "3. Convert to feet\n" +
                    "4. Quit the program\n\n" +
                    "Enter your choice: ");

            //converts accordingly, rejects invalid entries and exits too
            switch (kbd.nextInt()){
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    kbd.close(); //closes Scanner kbd
                    System.exit(0); // exits program
                default:
                    System.out.println("Invalid Entry");
            }

        }



    }

    /**
     * converts meters to kilometers and prints the result
     * @param meters holds the value entered by user in meters
     */
    public static void showKilometers (double meters){
        System.out.printf("%.1f meters is %.1f kilometers.\n\n", meters, (meters*0.001));
    }

    /**
     * converts meters to inches and prints the result
     * @param meters holds the value entered by user in meters
     */
    public static void showInches (double meters){
        System.out.printf("%.1f meters is %.1f inches.\n\n", meters, (meters*39.37));
    }

    /**
     * converts meters to feet and prints the result
     * @param meters holds the value entered by user in meters
     */
    public static void showFeet (double meters){
        System.out.printf("%.1f meters is %.1f feet.\n\n", meters, (meters*3.281));
    }

}
