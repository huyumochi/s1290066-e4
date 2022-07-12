import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int num, headsNum = 0, tailsNum = 0;
        String name;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] coin = { "Heads", "Tails" };

        System.out.print("Who are you?\n> ");
        name = sc.nextLine();
        System.out.printf("Hello, %s!\n", name);

        System.out.println("Tossing a coin...");
        for (int i = 1; i < 4; i++) {
            num = rand.nextInt(2);
            if (num == 0)
                headsNum++;
            else
                tailsNum++;
            System.out.printf("Round %d: %s\n", i, coin[num]);
        }

        System.out.printf("Heads: %d, Tails: %d\n", headsNum, tailsNum);

        if (headsNum > tailsNum)
            System.out.println("You won!");
        else
            System.out.println("You lost");
    }
}