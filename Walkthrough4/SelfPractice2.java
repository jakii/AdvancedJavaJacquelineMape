import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        String[] arr = new String[sc.nextInt()];
        sc.nextLine(); 

        System.out.println("Enter strings:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextLine();

        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }

        System.out.println("Sorted:");
        for (String s : arr) System.out.println(s);
    }
}
