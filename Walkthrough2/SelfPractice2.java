import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter something (type 'exit' to stop): ");
            input = s.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Goodbye!");
        s.close();
    }
}
