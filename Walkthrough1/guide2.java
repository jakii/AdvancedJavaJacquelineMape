import java.util.Scanner;

public class Guide2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = s.nextDouble();
        System.out.print("Enter width: ");
        double width = s.nextDouble();
        System.out.println("Area: " + (length * width));
        s.close();
    }
}
