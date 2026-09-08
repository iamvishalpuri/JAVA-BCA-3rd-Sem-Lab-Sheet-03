import java.util.Scanner;

public class Q17MaximumIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max = Integer.MIN_VALUE;

        // Find maximum while reading values.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    int value = sc.nextInt();
                    if (value > max) {
                        max = value;
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
