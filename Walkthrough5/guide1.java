public class Guide1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
