import java.util.Scanner;

public class Guide1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();
        System.out.println(number + (number % 2 == 0 ? " is even." : " is odd."));

        s.close();
    }
}
