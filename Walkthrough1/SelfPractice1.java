import java.util.Scanner;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your age: ");
        int age = s.nextInt();


        System.out.println("Hello, I am " + name + "! and I'm  " + age + " years old.");
        s.close();
    }
}
