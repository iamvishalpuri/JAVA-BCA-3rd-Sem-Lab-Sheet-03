import java.util.Scanner;

public class Q6CopyArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] destination = new int[n];

        for (int i = 0; i < n; i++) {
            source[i] = sc.nextInt();
        }

        // Copy source to destination.
        for (int i = 0; i < n; i++) {
            destination[i] = source[i];
        }

        for (int value : destination) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
