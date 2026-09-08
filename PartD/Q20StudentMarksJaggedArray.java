import java.util.Scanner;

public class Q20StudentMarksJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] marks = new int[students][];

        // Each student can have different subject count.
        for (int i = 0; i < students; i++) {
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
