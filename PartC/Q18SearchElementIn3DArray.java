import java.util.Scanner;

public class Q18SearchElementIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[][][] arr = new int[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int target = sc.nextInt();
        boolean found = false;

        // Search and print all matching positions.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (arr[i][j][k] == target) {
                        System.out.println("Found at (" + i + ", " + j + ", " + k + ")");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
