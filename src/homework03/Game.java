package homework03;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void playBarchobaWIthNumbers() {
        final int maxRoundNumber = 10;

        Random random = new Random();
        int computerNumber = random.nextInt(50) + 1;
        Scanner reader = new Scanner(System.in);
        int userNumber;
        int roundNumber = 0;

        while (roundNumber < maxRoundNumber) {
            System.out.println("Tippelj a számra (még " + (maxRoundNumber - (roundNumber)) + " lehetőséged van):");
            userNumber = reader.nextInt();

            if (userNumber > 50 || userNumber < 1) {
                System.out.println("A számnak 1 és 50 közöttinek kell lennie!");
                break;
            }

            if (userNumber < computerNumber) {
                System.out.println("A szám nagyobb.");
            }
            else if (userNumber > computerNumber) {
                System.out.println("A szám kisebb");
            }
            else {
                System.out.println("Eltaláltad a számot! Nyertél!");
                return;
            }
            roundNumber++;
        }

        System.out.println("Nem nyertél. A szám " + computerNumber + " volt.");
    }
}
