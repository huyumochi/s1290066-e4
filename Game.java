import java.util.Random;

public class Game {
    public static void main(String[] args) {
        int num, headsNum = 0, tailsNum = 0;
        Random rand = new Random();
        String[] coin = { "Heads", "Tails" };

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
    }
}