import java.util.Random;
import java.util.Scanner;

public class numberGussinggame {
    public static int Min = 1;
    public static int Max = 100;
    public static int Attempts = 5;
    public static int Rounds = 3;

    public static void main(String[] args) {
        Random radom_Number = new Random();
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Number Gussing Game \n");
        System.out.println("Total Number of Rounds : 3 ");
        System.out.println("No of Attempts for each rounds are 6 \n");

        for (int i = 1; i <= Rounds; i++) {
            int number = radom_Number.nextInt(Max) + Min;
            int current_attempts = 0;
            System.out.printf("\n Current Round: %d: Guess the Number between %d and %d in %d attempts.\n",
                    i, Min, Max, Attempts);

            /* %d is i,Min, Max,Attempts */

            /* Enter your number */
            while (current_attempts < Attempts) {
                System.out.println("Enter your Guess: ");
                int Guess_number = sc.nextInt();
                current_attempts = current_attempts + 1;

                /* Equal to */
                if (Guess_number == number) {
                    int score = Attempts - current_attempts;
                    totalScore += score;
                    System.out.printf(
                            "Congratulations! You Successfully guessed the number.\n Attempts: %d.\n Round Score:%d\n ",
                            current_attempts, score);
                    break;

                    /* Greater than */
                } else if (Guess_number < number) {
                    System.out.printf("The number is greater than that %d. Attempts left = %d\n", Guess_number,
                            Attempts - current_attempts);

                    /* Less than */
                } else if (Guess_number > number) {
                    System.out.printf("The number is less than %d.\n Attempts left = %d\n", Guess_number,
                            Attempts - current_attempts);
                }
            }
            if (current_attempts == Attempts) {
                System.out.printf("You lost in the Round = %d. Attempts = 0", i);
                System.out.printf(" The Random number is %d \n", number);
            }

        }
        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        sc.close();
    }
}