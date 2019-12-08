import java.util.*; //whole of utility package is imported

/**
 *  Author: Salman
 *
 *  This program is a guessing game.
 */
public class Prob17 {

    /**
     *  Main handles the driver code for the program. Inputs are taken,
     *  processed and outputted in this method.
     * @param args is not used
     */
    public static void main (String[] args){

        Scanner kbd = new Scanner(System.in); // Scanner kbd created
        Random rand = new Random(); // Random rand created

        int gen;
        int user;

        do {
            gen = genRand(rand);
            user = askUser(kbd);
            if(user==4){
                continue;
            }
            disp(gen);
            decWinner(gen, user);
        }while(user!=4);
        kbd.close(); // Scanner closed

    }

    /**
     * Generates a random number
     * @param rand is an instance of the class Random
     * @return it returns a random number between 1 and 3
     */
    public static int genRand (Random rand){
        return rand.nextInt(3) + 1;
    }

    /**
     * Gets input from user
     * @param kbd is an instance of the Scanner class
     * @return it returns user's input
     */
    public static int askUser(Scanner kbd){
        System.out.print("Enter 1 for rock, 2 for paper, 3 for scissors or 4 to exit: "); //asks user for choice
        return kbd.nextInt();
    }

    /**
     *Interprets and displays computer's choice
     * @param gen is the generated random number
     */
    public static void disp(int gen){
        switch (gen){
            case 1:
                System.out.println("Computer's choice: Rock");
                break;
            case 2:
                System.out.println("Computer's choice: Paper");
                break;
            case 3:
                System.out.println("Computer's choice: Scissors");
        }
    }

    /**
     * Declares a Winner
     * @param gen is the generated random number
     * @param user is number chosen by user
     */
    public static void decWinner (int gen, int user){
        if (gen==user){
            System.out.println("You won");
        } else{
            System.out.println("Computer won");
        }
    }

}
