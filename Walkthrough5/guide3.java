import java.util.Scanner;

public class Guide3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols of A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows & cols of B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) { System.out.println("Invalid matrix sizes!"); return; }

        int[][] A = new int[r1][c1], B = new int[r2][c2], C = new int[r1][c2];

        System.out.println("Enter A:"); fill(sc, A);
        System.out.println("Enter B:"); fill(sc, B);

        System.out.println("Product:");
        for (int i = 0; i < r1; i++, System.out.println())
            for (int j = 0; j < c2; j++, System.out.print(C[i][j] + " "))
                for (int k = 0; k < c1; k++) C[i][j] += A[i][k] * B[k][j];

        sc.close();
    }

    private static void fill(Scanner sc, int[][] M) {
        for (int i = 0; i < M.length; i++) 
            for (int j = 0; j < M[0].length; j++) 
                M[i][j] = sc.nextInt();
    }
}
