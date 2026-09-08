import java.util.Arrays;
import java.util.Scanner;

public class Q29SortEachRowInJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];

        // Read rows with independent lengths.
        for (int i = 0; i < rows; i++) {
            int length = sc.nextInt();
            jagged[i] = new int[length];
            for (int j = 0; j < length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Sort each row separately.
        for (int i = 0; i < rows; i++) {
            Arrays.sort(jagged[i]);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
