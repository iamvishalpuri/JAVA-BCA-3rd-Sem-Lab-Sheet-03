import java.util.Scanner;

public class Q19CreateDisplayJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jagged = new int[3][];

        // Create rows with different lengths.
        for (int i = 0; i < 3; i++) {
            int length = sc.nextInt();
            jagged[i] = new int[length];
            for (int j = 0; j < length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Display jagged array.
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
