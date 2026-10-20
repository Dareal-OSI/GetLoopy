import java.util.Random;
import java.util.Scanner;

/**
 * Lab 7: Get Loopy - Task 8 Die Roller
 * Rolls 3 dice until all three match (a triple), then offers to play again.
 */
public class DieRollar
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain)
        {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            do
            {
                rollCount++;
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple " + die1 + "s after " + rollCount + " rolls!");

            String answer = "";
            boolean valid = false;
            while (!valid)
            {
                System.out.print("Roll again? [Y/N]: ");
                answer = in.nextLine().trim();
                if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N"))
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Please enter Y or N.");
                }
            }
            playAgain = answer.equalsIgnoreCase("Y");
            System.out.println();
        }
        System.out.println("Thanks for playing!");
    }
}
