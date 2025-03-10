import java.util.Scanner;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt(), A[][] = new int[n][n], sym = 1;

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
                if (i > j && A[i][j] != A[j][i]) sym = 0;
            }

        System.out.println(sym == 1 ? "Symmetric" : "Not Symmetric");
        sc.close();
    }
}
