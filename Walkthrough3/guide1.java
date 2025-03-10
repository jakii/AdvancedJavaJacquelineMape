public class Guide1 {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        int sum = 0;
        for (int grade : grades) sum += grade;
        double average = (double) sum / grades.length;
        System.out.println("Average: " + average);
    }
}
