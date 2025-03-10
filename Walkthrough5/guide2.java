import java.util.Scanner;

public class Guide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] A = new int[r][c], B = new int[r][c], sum = new int[r][c];

        System.out.println("Enter first matrix:"); fillMatrix(sc, A);
        System.out.println("Enter second matrix:"); fillMatrix(sc, B);

        System.out.println("Sum of Matrices:");
        for (int i = 0; i < r; i++, System.out.println())
            for (int j = 0; j < c; j++)
                System.out.print((sum[i][j] = A[i][j] + B[i][j]) + " ");
        sc.close();
    }

    private static void fillMatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) 
            for (int j = 0; j < matrix[0].length; j++) 
                matrix[i][j] = sc.nextInt();
    }
}
