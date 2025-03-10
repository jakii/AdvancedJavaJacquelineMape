import java.util.Arrays;
import java.util.Scanner;

public class Guide3 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt(), left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) { System.out.println("Found at index: " + mid); return; }
            if (arr[mid] < target) left = mid + 1; else right = mid - 1;
        }

        System.out.println("Not found.");
    }
}
