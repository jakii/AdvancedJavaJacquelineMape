import java.util.*;

public class SelPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt(), arr[] = new int[n];

        System.out.println("Elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        System.out.print("Search: ");
        int target = sc.nextInt();
        int index = Arrays.binarySearch(arr, target);

        System.out.println(index >= 0 ? "Found at " + index : "Not found.");
    }
}
