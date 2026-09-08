import java.util.Scanner;

public class Q15SumOf3DArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[][][] arr = new int[x][y][z];
        int sum = 0;

        // Read and sum all values.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = sc.nextInt();
                    sum += arr[i][j][k];
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
