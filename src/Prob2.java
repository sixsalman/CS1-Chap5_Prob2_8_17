import java.util.Scanner; //util package's Scanner class is imported

/**
 *  Author: Salman
 *
 *  This program asks for wholesale price and markup percentage and outputs retail price
 */
public class Prob2 {

    /**
     *  Main handles the driver code for the program. Inputs are taken,
     *  processed and outputted in this method.
     * @param args is not used
     */
    public static void main (String[] args){

        Scanner kbd = new Scanner(System.in); // Scanner named kbd is created
        System.out.print("Enter wholesale cost: "); // asks wholesale price
        double cost = kbd.nextDouble();

        System.out.print("Enter markup percentage: "); //asks markup percentage
        double markup = kbd.nextDouble();

        System.out.printf("Retail price is: %.2f", (calculateRetail(cost, markup))); // prints retail price

        kbd.close(); // closes scanner kbd
    }

    /**
     * Calculates retail price
     * @param cost contains wholesale cost
     * @param markup contains markup percentage
     * @return it returns retail price
     */
    public static double calculateRetail (double cost, double markup){

        return (cost + (cost*(markup/100))); //returns calculation

    }

}
