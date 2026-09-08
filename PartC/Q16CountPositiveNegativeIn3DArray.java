import java.util.Scanner;

public class Q16CountPositiveNegativeIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int positive = 0;
        int negative = 0;

        // Count positive and negative values.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    int value = sc.nextInt();
                    if (value > 0) {
                        positive++;
                    } else if (value < 0) {
                        negative++;
                    }
                }
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        sc.close();
    }
}
