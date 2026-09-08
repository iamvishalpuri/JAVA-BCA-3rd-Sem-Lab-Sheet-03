import java.util.Scanner;

public class Q30CheckSparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int zeroCount = 0;
        int total = rows * cols;

        // Count zero entries.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = sc.nextInt();
                if (value == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > total / 2) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }
        sc.close();
    }
}
