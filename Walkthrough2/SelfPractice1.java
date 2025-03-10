import java.util.Scanner;
import java.util.Random;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = new Random().nextInt(20) + 1, guess;

        System.out.println("Guess a number (1-20):");

        while ((guess = s.nextInt()) != target)
            System.out.println(guess > target ? "Too high!" : "Too low!");

        System.out.println("You got it!");
        s.close();
    }
}
