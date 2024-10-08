import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args)
    {
        Random gen =  new Random();

        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieTotal = 0;
        int dieRoll = 0;
        boolean isPlaying = true;
        String playAgain = "";

        do {

            System.out.printf("Roll\tDie1\tDie2\tDie3\tSum\n", die1, die2, die3, dieTotal);
            System.out.println("-----------------------------------");
            die1 = -2;
            die2 = -1;
            die3 = 0;
            while (!(die1 == die2 && die2 == die3)) {
                die1 = gen.nextInt(6) + 1; //0-5+1 is 1-6
                die2 = gen.nextInt(6) + 1; //0-5+1 is 1-6
                die3 = gen.nextInt(6) + 1; //0-5+1 is 1-6

                dieTotal = die1 + die2 + die3;
                dieRoll++;

                System.out.printf("%3d\t\t%3d\t\t%3d\t\t%3d\t\t%3d\n", dieRoll, die1, die2, die3, dieTotal);
                }
            System.out.println("Would you like to roll again (Y/N)?");

            playAgain = in.nextLine();
            if(playAgain.equalsIgnoreCase("N"))
            {
                isPlaying = false;

            }
        }
        while(isPlaying == true);

    }
}
