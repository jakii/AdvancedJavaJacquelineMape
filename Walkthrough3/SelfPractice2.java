import java.util.Arrays;
import java.util.LinkedHashSet;

public class SelfPractice2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] unique = new LinkedHashSet<>(Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)))
                      .stream().mapToInt(i -> i).toArray();
        System.out.println("Unique Array: " + Arrays.toString(unique));
    }
}
