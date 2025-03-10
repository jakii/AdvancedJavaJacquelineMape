import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), A[][] = new int[r][c];
        for (int i = 0; i < r * c; i++) A[i / c][i % c] = sc.nextInt();
        for (int j = 0; j < c; j++, System.out.println()) 
            for (int i = 0; i < r; i++) System.out.print(A[i][j] + " ");
        sc.close();
    }
}
