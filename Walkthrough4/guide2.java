import java.util.Scanner;

public class Guide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 1, 4, 2, 8};

        System.out.print("Enter element to search: ");
        int target = sc.nextInt(), index = -1;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) { index = i; break; }

        System.out.println(index != -1 ? "Element found at index: " + index : "Element not found.");
        sc.close();
    }
}
