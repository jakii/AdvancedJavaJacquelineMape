import java.util.Arrays;

public class Guide2 {
    public static void main(String[] args) {
        int[] numbers = {85, 90, 78, 92, 88};
        System.out.println("Minimum: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("Maximum: " + Arrays.stream(numbers).max().getAsInt());
    }
}
