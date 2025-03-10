import java.util.Arrays;
import java.util.stream.IntStream;

public class SelfPractice1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}, arr2 = {4, 5, 6};
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println("Merged: " + Arrays.toString(merged));
    }
}
